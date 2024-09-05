package com.distribuida.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "forma_pago")
public class Formapago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_forma_pago") 
    private int id_forma_pago; 
    @Column(name = "forma_pago") 
    private String forma_pago; 
    @Column(name = "descripcion")  // Cambié 'descipcion' a 'descripcion'
    private String descripcion; 
    
    public Formapago() {}

	public Formapago(int id_forma_pago, String forma_pago, String descripcion) { // Cambié 'descipcion' a 'descripcion'
		
		this.id_forma_pago = id_forma_pago;
		this.forma_pago = forma_pago;
		this.descripcion = descripcion; // Cambié 'descipcion' a 'descripcion'
	}

	public int getId_forma_pago() {
		return id_forma_pago;
	}

	public void setId_forma_pago(int id_forma_pago) {
		this.id_forma_pago = id_forma_pago;
	}

	public String getForma_pago() {
		return forma_pago;
	}

	public void setForma_pago(String forma_pago) {
		this.forma_pago = forma_pago;
	}

	public String getDescripcion() {  // Cambié 'descipcion' a 'descripcion'
		return descripcion;
	}

	public void setDescripcion(String descripcion) {  // Cambié 'descipcion' a 'descripcion'
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Formapago [id_forma_pago=" + id_forma_pago + ", forma_pago=" + forma_pago + ", descripcion=" + descripcion
				+ "]";
	}
}
