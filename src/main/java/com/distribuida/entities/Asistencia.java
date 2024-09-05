package com.distribuida.entities;

import java.sql.Date;
import java.time.LocalTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "asistencia")
public class Asistencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asistencia") 
    private int id_asistencia; 
    @Column(name = "id_empleado")
    private int id_empleado;
    @Column(name = "fecha_asistencia")
    private Date fecha_asistencia;
    @Column(name = "anio")
    private int anio;
    @Column(name = "mes")
    private int mes;
    @Column(name = "dia")
    private int dia;
    @Column(name = "hora_entrada_trabajo")
    private LocalTime hora_entrada_trabajo;
    @Column(name = "hora_salida_trabajo")
    private LocalTime hora_salida_trabajo;
    @Column(name = "total_horas_trabajo")
    private int total_horas_trabajo;
    @Column(name = "total_horas_extra")
    private int total_horas_extra;
    @Column(name = "registro_atraso")
    private String registro_atraso;
    @Column(name = "total_horas_atraso")
    private int total_horas_atraso;
    @Column(name = "registro_falta")
    private String registro_falta;
    @Column(name = "registro_vacacion")
    private String registro_vacacion;
    @Column(name = "total_horas_trabajo_mes")
    private int total_horas_trabajo_mes;

    // Constructor por defecto
    public Asistencia() {}

    // Constructor con parámetros
    public Asistencia(int id_asistencia, int id_empleado, Date fecha_asistencia, int anio, int mes, int dia,
                      LocalTime hora_entrada_trabajo, LocalTime hora_salida_trabajo, int total_horas_trabajo,
                      int total_horas_extra, String registro_atraso, int total_horas_atraso, String registro_falta,
                      String registro_vacacion, int total_horas_trabajo_mes) {

        this.id_asistencia = id_asistencia; // Cambiado de "id_asistencias" a "id_asistencia"
        this.id_empleado = id_empleado;
        this.fecha_asistencia = fecha_asistencia;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
        this.hora_entrada_trabajo = hora_entrada_trabajo;
        this.hora_salida_trabajo = hora_salida_trabajo;
        this.total_horas_trabajo = total_horas_trabajo;
        this.total_horas_extra = total_horas_extra;
        this.registro_atraso = registro_atraso;
        this.total_horas_atraso = total_horas_atraso;
        this.registro_falta = registro_falta;
        this.registro_vacacion = registro_vacacion;
        this.total_horas_trabajo_mes = total_horas_trabajo_mes;
    }

	public int getId_asistencia() {
		return id_asistencia;
	}

	public void setId_asistencia(int id_asistencia) {
		this.id_asistencia = id_asistencia;
	}

	public int getId_empleado() {
		return id_empleado;
	}

	public void setId_empleado(int id_empleado) {
		this.id_empleado = id_empleado;
	}

	public Date getFecha_asistencia() {
		return fecha_asistencia;
	}

	public void setFecha_asistencia(Date fecha_asistencia) {
		this.fecha_asistencia = fecha_asistencia;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public LocalTime getHora_entrada_trabajo() {
		return hora_entrada_trabajo;
	}

	public void setHora_entrada_trabajo(LocalTime hora_entrada_trabajo) {
		this.hora_entrada_trabajo = hora_entrada_trabajo;
	}

	public LocalTime getHora_salida_trabajo() {
		return hora_salida_trabajo;
	}

	public void setHora_salida_trabajo(LocalTime hora_salida_trabajo) {
		this.hora_salida_trabajo = hora_salida_trabajo;
	}

	public int getTotal_horas_trabajo() {
		return total_horas_trabajo;
	}

	public void setTotal_horas_trabajo(int total_horas_trabajo) {
		this.total_horas_trabajo = total_horas_trabajo;
	}

	public int getTotal_horas_extra() {
		return total_horas_extra;
	}

	public void setTotal_horas_extra(int total_horas_extra) {
		this.total_horas_extra = total_horas_extra;
	}

	public String getRegistro_atraso() {
		return registro_atraso;
	}

	public void setRegistro_atraso(String registro_atraso) {
		this.registro_atraso = registro_atraso;
	}

	public int getTotal_horas_atraso() {
		return total_horas_atraso;
	}

	public void setTotal_horas_atraso(int total_horas_atraso) {
		this.total_horas_atraso = total_horas_atraso;
	}

	public String getRegistro_falta() {
		return registro_falta;
	}

	public void setRegistro_falta(String registro_falta) {
		this.registro_falta = registro_falta;
	}

	public String getRegistro_vacacion() {
		return registro_vacacion;
	}

	public void setRegistro_vacacion(String registro_vacacion) {
		this.registro_vacacion = registro_vacacion;
	}

	public int getTotal_horas_trabajo_mes() {
		return total_horas_trabajo_mes;
	}

	public void setTotal_horas_trabajo_mes(int total_horas_trabajo_mes) {
		this.total_horas_trabajo_mes = total_horas_trabajo_mes;
	}

	@Override
	public String toString() {
		return "Asistencia [id_asistencia=" + id_asistencia + ", id_empleado=" + id_empleado + ", fecha_asistencia="
				+ fecha_asistencia + ", anio=" + anio + ", mes=" + mes + ", dia=" + dia + ", hora_entrada_trabajo="
				+ hora_entrada_trabajo + ", hora_salida_trabajo=" + hora_salida_trabajo + ", total_horas_trabajo="
				+ total_horas_trabajo + ", total_horas_extra=" + total_horas_extra + ", registro_atraso="
				+ registro_atraso + ", total_horas_atraso=" + total_horas_atraso + ", registro_falta=" + registro_falta
				+ ", registro_vacacion=" + registro_vacacion + ", total_horas_trabajo_mes=" + total_horas_trabajo_mes
				+ "]";
	}


}
