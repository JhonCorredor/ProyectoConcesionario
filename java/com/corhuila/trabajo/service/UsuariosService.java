package com.corhuila.trabajo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.trabajo.entity.Usuarios;
import com.corhuila.trabajo.irepository.IUsuariosRepository;
import com.corhuila.trabajo.iservice.IUsuariosService;

@Service
public class UsuariosService implements IUsuariosService{

	@Autowired
	private IUsuariosRepository repository;
	
	@Override
	public List<Usuarios> all() {
		return this.repository.findAll();
	}	
	
	@Override
	public Optional<Usuarios> findById(Long id) {
		return this.repository.findById(id);
	}
	
	@Override
	public Usuarios save(Usuarios usuarios) {
		return this.repository.save(usuarios);
	}

	@Override
	public void delete(Long id) {
		this.repository.deleteById(id);
	}

}
