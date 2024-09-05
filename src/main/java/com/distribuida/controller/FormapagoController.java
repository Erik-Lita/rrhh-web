package com.distribuida.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.lang.Nullable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.distribuida.dao.FormapagoDAO;
import com.distribuida.entities.Formapago;

@Controller
@RequestMapping("/formapago")
public class FormapagoController {

    @Autowired
    private FormapagoDAO formapagoDAO;
    
    @GetMapping("/findAll")
    public String findAll(ModelMap modelMap) {
        List<Formapago> formasPago = formapagoDAO.findAll();
        modelMap.addAttribute("formasPago", formasPago);
        return "formapago-listar"; 
    }
    
    @GetMapping("/findOne")
    public String findOne(@RequestParam("id_forma_pago") @Nullable Integer id_forma_pago,
                          @RequestParam("opcion") @Nullable Integer opcion,
                          ModelMap modelMap) {
        if (id_forma_pago != null) {
            Formapago formapago = formapagoDAO.findOne(id_forma_pago);
            modelMap.addAttribute("formapago", formapago);
        }
        
        if (opcion == 1) {
            return "formapago-add";  
        } else {
            return "formapago-del"; 
        }
    }
    
    @PostMapping("/add")
    public String add(@RequestParam("id_forma_pago") @Nullable Integer id_forma_pago,
                      @RequestParam("forma_pago") @Nullable String forma_pago,
                      @RequestParam("descripcion") @Nullable String descripcion,
                      ModelMap modelMap) {
        
        Formapago formapago;
        if (id_forma_pago == null) {
            formapago = new Formapago(0, forma_pago, descripcion);
            formapagoDAO.add(formapago); 
        } else {
            formapago = new Formapago(id_forma_pago, forma_pago, descripcion);
            formapagoDAO.up(formapago);  
        }
        
        return "redirect:/formapago/findAll"; 
    }
    
    @GetMapping("/del")
    public String del(@RequestParam("id_forma_pago") @Nullable Integer id_forma_pago) {
        formapagoDAO.del(id_forma_pago);  
        return "redirect:/formapago/findAll";  
    }
}
