package com.corhuila.trabajo.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "detallesFacturas")
public class DetallesFacturas implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name = "cantidad", nullable = false)
	private String Cantidad;
	
	@Column(name = "precio", nullable = false)
	private Integer Precio;

	@Column(name = "estado", nullable = false)
	private Boolean Estado;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "factura_id", nullable = false)
	private Facturas FacturaId;
		
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "inventario_id", nullable = false)
	private Inventarios InventarioId;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getCantidad() {
		return Cantidad;
	}

	public void setCantidad(String cantidad) {
		Cantidad = cantidad;
	}

	public Integer getPrecio() {
		return Precio;
	}

	public void setPrecio(Integer precio) {
		Precio = precio;
	}

	public Boolean getEstado() {
		return Estado;
	}

	public void setEstado(Boolean estado) {
		Estado = estado;
	}

	public Facturas getFacturaId() {
		return FacturaId;
	}

	public void setFacturaId(Facturas facturaId) {
		FacturaId = facturaId;
	}

	public Inventarios getInventarioId() {
		return InventarioId;
	}

	public void setInventarioId(Inventarios inventarioId) {
		InventarioId = inventarioId;
	}
}
