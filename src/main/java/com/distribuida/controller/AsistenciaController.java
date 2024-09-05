package com.distribuida.controller;

import java.sql.Date;
import java.time.LocalTime;
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

import com.distribuida.dao.AsistenciaDAO;
import com.distribuida.entities.Asistencia;

@Controller
@RequestMapping("/asistencia")
public class AsistenciaController {

    @Autowired
    @Qualifier("asistenciaDAOImpl")
    private AsistenciaDAO asistenciaDAO;

    @GetMapping("/findAll")
    public String findAll(ModelMap modelMap) {
        List<Asistencia> asistencias = asistenciaDAO.findAll(); 
        modelMap.addAttribute("asistencias", asistencias); 
        return "asistencias-listar"; 
    }

    @GetMapping("/findOne")
    public String findOne(@RequestParam("id_asistencia") @Nullable Integer idAsistencia,
                          @RequestParam("opcion") @Nullable Integer opcion,
                          ModelMap modelMap) {
       
            if (idAsistencia != null) {
                Asistencia asistencia = asistenciaDAO.findOne(idAsistencia);
                modelMap.addAttribute("asistencia", asistencia);
            }
            if (opcion == 1) {
                return "asistencias-add";
            } else {
                return "asistencias-del";
            }
        
    }

    @PostMapping("/add")
    public String add(@RequestParam("id_asistencia") @Nullable Integer id_asistencia,
                      @RequestParam("id_empleado") @Nullable Integer id_empleado,
                      @RequestParam("fecha_asistencia") @Nullable Date fecha_asistencia,
                      @RequestParam("anio") @Nullable Integer anio,
                      @RequestParam("mes") @Nullable Integer mes,
                      @RequestParam("dia") @Nullable Integer dia,
                      @RequestParam("hora_entrada_trabajo") @Nullable String hora_entrada_trabajo,
                      @RequestParam("hora_salida_trabajo") @Nullable String hora_salida_trabajo,
                      @RequestParam("total_horas_trabajo") @Nullable Integer total_horas_trabajo,
                      @RequestParam("total_horas_extra") @Nullable Integer total_horas_extra,
                      @RequestParam("registro_atraso") @Nullable String registro_atraso,
                      @RequestParam("total_horas_atraso") @Nullable Integer total_horas_atraso,
                      @RequestParam("registro_falta") @Nullable String registro_falta,
                      @RequestParam("registro_vacacion") @Nullable String registro_vacacion,
                      @RequestParam("total_horas_trabajo_mes") @Nullable Integer total_horas_trabajo_mes,
                      Model model) {

        LocalTime entrada = hora_entrada_trabajo != null ? LocalTime.parse(hora_entrada_trabajo) : null;
        LocalTime salida = hora_salida_trabajo != null ? LocalTime.parse(hora_salida_trabajo) : null;

        Asistencia asistencia;
        if (id_asistencia == null) {
            asistencia = new Asistencia(0, id_empleado, fecha_asistencia, anio, mes, dia, entrada, salida, total_horas_trabajo, total_horas_extra, registro_atraso, total_horas_atraso, registro_falta, registro_vacacion, total_horas_trabajo_mes);
            asistenciaDAO.add(asistencia);
        } else {
            asistencia = new Asistencia(id_asistencia, id_empleado, fecha_asistencia, anio, mes, dia, entrada, salida, total_horas_trabajo, total_horas_extra, registro_atraso, total_horas_atraso, registro_falta, registro_vacacion, total_horas_trabajo_mes);
            asistenciaDAO.up(asistencia);
        }

        return "redirect:/asistencia/findAll";
    }

    @GetMapping("/del")
    public String del(@RequestParam("id_asistencia") @Nullable Integer id_asistencia) {
        asistenciaDAO.del(id_asistencia);
        return "redirect:/asistencia/findAll";
    }
}
