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
@Table(name = "vehiculos") 
public class Vehiculos implements Serializable{
	
private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name = "codigo", nullable = false, unique = true)
	private String Codigo;
	
	@Column(name = "descripcion", nullable = false)
	private String Descripcion;
	
	@Column(name = "color", nullable = false)
	private String Color;
	
	@Column(name = "cilindraje", nullable = false)
	private String Cilindraje;
	
	@Column(name = "kilometraje", nullable = false, unique = true)
	private Integer Kilometraje;

	@Column(name = "estado", nullable = false)
	private Boolean Estado;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "tipo_vehiculo_id", nullable = false)
	private TiposVehiculos TipoVehiculoId;
		
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "marca_id", nullable = false)
	private Marcas MarcaId;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getCodigo() {
		return Codigo;
	}

	public void setCodigo(String codigo) {
		Codigo = codigo;
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getCilindraje() {
		return Cilindraje;
	}

	public void setCilindraje(String cilindraje) {
		Cilindraje = cilindraje;
	}

	public Integer getKilometraje() {
		return Kilometraje;
	}

	public void setKilometraje(Integer kilometraje) {
		Kilometraje = kilometraje;
	}

	public Boolean getEstado() {
		return Estado;
	}

	public void setEstado(Boolean estado) {
		Estado = estado;
	}

	public TiposVehiculos getTipoVehiculoId() {
		return TipoVehiculoId;
	}

	public void setTipoVehiculoId(TiposVehiculos tipoVehiculoId) {
		TipoVehiculoId = tipoVehiculoId;
	}

	public Marcas getMarcaId() {
		return MarcaId;
	}

	public void setMarcaId(Marcas marcaId) {
		MarcaId = marcaId;
	}
}
