package com.corhuila.trabajo.entity;

import java.io.Serializable;
import java.sql.Date;

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
@Table(name = "facturas") 
public class Facturas implements Serializable{

private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name = "codigo", nullable = false, unique = true)
	private String Codigo;
	
	@Column(name = "valor_total", nullable = false)
	private Integer ValorTotal;

	@Column(name = "fecha", nullable = false)
	private Date Fecha;
	
	@Column(name = "estado", nullable = false)
	private Boolean Estado;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "municipio_id", nullable = false)
	private Continentes MunicipioId;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "persona_id", nullable = false)
	private Continentes PersonaId;

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

	public Integer getValorTotal() {
		return ValorTotal;
	}

	public void setValorTotal(Integer valorTotal) {
		ValorTotal = valorTotal;
	}

	public Date getFecha() {
		return Fecha;
	}

	public void setFecha(Date fecha) {
		Fecha = fecha;
	}

	public Boolean getEstado() {
		return Estado;
	}

	public void setEstado(Boolean estado) {
		Estado = estado;
	}

	public Continentes getMunicipioId() {
		return MunicipioId;
	}

	public void setMunicipioId(Continentes municipioId) {
		MunicipioId = municipioId;
	}

	public Continentes getPersonaId() {
		return PersonaId;
	}

	public void setPersonaId(Continentes personaId) {
		PersonaId = personaId;
	}
}
