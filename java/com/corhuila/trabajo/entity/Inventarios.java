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
@Table(name = "inventarios")
public class Inventarios implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;

	@Column(name = "precio_unitario", nullable = false)
	private Double PrecioUnitario;

	@Column(name = "cantidad_existente", nullable = false)
	private Integer CantidadExistente;

	@Column(name = "observacio", nullable = false)
	private String Observacion;

	@Column(name = "estado", nullable = false)
	private Boolean Estado;

	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "vehiculo_id", nullable = false)
	private Vehiculos VehiculoId;

	@Column(name = "tipo_estado", nullable = false)
	private Boolean TipoEstado;

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public Double getPrecioUnitario() {
		return PrecioUnitario;
	}

	public void setPrecioUnitario(Double precioUnitario) {
		PrecioUnitario = precioUnitario;
	}

	public Integer getCantidadExistente() {
		return CantidadExistente;
	}

	public void setCantidadExistente(Integer cantidadExistente) {
		CantidadExistente = cantidadExistente;
	}

	public String getObservacion() {
		return Observacion;
	}

	public void setObservacion(String observacion) {
		Observacion = observacion;
	}

	public Boolean getEstado() {
		return Estado;
	}

	public void setEstado(Boolean estado) {
		Estado = estado;
	}

	public Vehiculos getVehiculoId() {
		return VehiculoId;
	}

	public void setVehiculoId(Vehiculos vehiculoId) {
		VehiculoId = vehiculoId;
	}

	public Boolean getTipoEstado() {
		return TipoEstado;
	}

	public void setTipoEstado(Boolean tipoEstado) {
		TipoEstado = tipoEstado;
	}

}
