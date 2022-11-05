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
@Table(name = "usuarios")
public class Usuarios implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	@Column(name = "contrasenia", nullable = false)
	private String Contrasenia;
	
	@Column(name = "usuario", nullable = false, unique = true)
	private String Usuario;
	
	@Column(name = "estado", nullable = false)
	private Boolean Estado;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "persona_id", nullable = false)
	private Personas PersonaId;
	
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "rol_id", nullable = false)
	private Roles RolId;


	public Long getId() {
		return Id;
	}


	public void setId(Long id) {
		Id = id;
	}


	public String getContrasenia() {
		return Contrasenia;
	}


	public void setContrasenia(String contrasenia) {
		Contrasenia = contrasenia;
	}


	public String getUsuario() {
		return Usuario;
	}


	public void setUsuario(String usuario) {
		Usuario = usuario;
	}


	public Boolean getEstado() {
		return Estado;
	}


	public void setEstado(Boolean estado) {
		Estado = estado;
	}


	public Personas getPersonaId() {
		return PersonaId;
	}


	public void setPersonaId(Personas personaId) {
		PersonaId = personaId;
	}


	public Roles getRolId() {
		return RolId;
	}


	public void setRolId(Roles rolId) {
		RolId = rolId;
	}
}
