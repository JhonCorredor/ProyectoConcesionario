package com.corhuila.trabajo.iservice;

import java.util.List;
import java.util.Optional;

import com.corhuila.trabajo.entity.Usuarios;

public interface IUsuariosService {

public List<Usuarios> all();
	
	public Optional<Usuarios> findById(Long id);
	
	public Usuarios save(Usuarios usuarios);
	
	public void delete(Long id);
}
