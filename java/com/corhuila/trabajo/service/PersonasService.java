package com.corhuila.trabajo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.trabajo.entity.Personas;
import com.corhuila.trabajo.irepository.IPersonasRepository;
import com.corhuila.trabajo.iservice.IPersonasService;

@Service
public class PersonasService implements IPersonasService{

	@Autowired
	private IPersonasRepository repository;
	
	@Override
	public List<Personas> all() {
		return this.repository.findAll();
	}	
	
	@Override
	public Optional<Personas> findById(Long id) {
		return this.repository.findById(id);
	}
	
	@Override
	public Personas save(Personas personas) {
		return this.repository.save(personas);
	}

	@Override
	public void delete(Long id) {
		this.repository.deleteById(id);
	}

}
