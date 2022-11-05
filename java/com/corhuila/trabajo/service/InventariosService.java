package com.corhuila.trabajo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.trabajo.entity.Inventarios;
import com.corhuila.trabajo.irepository.IInventariosRepository;
import com.corhuila.trabajo.iservice.IInventariosService;

@Service
public class InventariosService implements IInventariosService{

	@Autowired
	private IInventariosRepository repository;
	
	@Override
	public List<Inventarios> all() {
		return this.repository.findAll();
	}	
	
	@Override
	public Optional<Inventarios> findById(Long id) {
		return this.repository.findById(id);
	}
	
	@Override
	public Inventarios save(Inventarios inventarios) {
		return this.repository.save(inventarios);
	}

	@Override
	public void delete(Long id) {
		this.repository.deleteById(id);
	}

}
