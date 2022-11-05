package com.corhuila.trabajo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.trabajo.entity.Departamentos;
import com.corhuila.trabajo.irepository.IDepartamentosRepository;
import com.corhuila.trabajo.iservice.IDepartamentosService;

@Service
public class DepartamentosService implements IDepartamentosService{

	@Autowired
	private IDepartamentosRepository repository;
	
	@Override
	public List<Departamentos> all() {
		return this.repository.findAll();
	}	
	
	@Override
	public Optional<Departamentos> findById(Long id) {
		return this.repository.findById(id);
	}
	
	@Override
	public Departamentos save(Departamentos departamentos) {
		return this.repository.save(departamentos);
	}

	@Override
	public void delete(Long id) {
		this.repository.deleteById(id);
	}

}
