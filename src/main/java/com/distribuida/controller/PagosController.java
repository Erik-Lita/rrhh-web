package com.distribuida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.dao.PagosDAO;
import com.distribuida.dao.FormapagoDAO;
import com.distribuida.entities.Pagos;

@Controller
@RequestMapping("/pagos")
public class PagosController {

    @Autowired
    @Qualifier("pagosDAOImpl")
    private PagosDAO pagosDAO;

    @Autowired
    private FormapagoDAO formapagoDAO;

    @GetMapping("/findAll")
    public String findAll(ModelMap modelMap) {
            List<Pagos> pagos = pagosDAO.findAll();
            modelMap.addAttribute("pagos", pagos);
            return "pagos-listar";
    }

    @GetMapping("/findOne")
    public String findOne(@RequestParam("id_pago") @Nullable Integer idPago,
                          @RequestParam("opcion") @Nullable Integer opcion,
                          ModelMap modelMap) {
        
            if (idPago != null) {
                Pagos pago = pagosDAO.findOne(idPago);
                modelMap.addAttribute("pago", pago);
            }

            modelMap.addAttribute("formaspago", formapagoDAO.findAll());
            
            if (opcion == 1) {
                return "pagos-add"; 
            } else {
                return "pagos-del"; 
            }
        
    }

    @PostMapping("/add")
    public String add(@RequestParam("id_pago") @Nullable Integer id_pago,
                      @RequestParam("id_empleado") @Nullable Integer id_empleado,
                      @RequestParam("id_forma_pago") @Nullable Integer id_forma_pago,
                      @RequestParam("aplica_iva") @Nullable String aplica_iva,
                      @RequestParam("monto_pago") @Nullable Double monto_pago,
                      @RequestParam("monto_iva") @Nullable Double monto_iva,
                      @RequestParam("monto_descuento") @Nullable Double monto_descuento,
                      @RequestParam("monto_extras") @Nullable Double monto_extras,
                      @RequestParam("monto_pago_total") @Nullable Double monto_pago_total,
                      Model model) {
       
            Pagos pagos;
            if (id_pago == null ) {
                pagos = new Pagos(0, id_empleado, id_forma_pago, aplica_iva, monto_pago, monto_iva, monto_descuento, monto_extras, monto_pago_total);
                pagosDAO.add(pagos);
            } else {
                pagos = new Pagos(id_pago, id_empleado, id_forma_pago, aplica_iva, monto_pago, monto_iva, monto_descuento, monto_extras, monto_pago_total);
                pagosDAO.up(pagos);
            }
            
            return "redirect:/pagos/findAll";
        
    }

	@GetMapping ("/del")
	public String del(@RequestParam("id_pago") @Nullable Integer id_pago) {
		 pagosDAO.del(id_pago);
		return "redirect:/pagos/findAll";
	}}






