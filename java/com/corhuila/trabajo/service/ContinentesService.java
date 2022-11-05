package com.corhuila.trabajo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.trabajo.entity.Continentes;
import com.corhuila.trabajo.irepository.IContinentesRepository;
import com.corhuila.trabajo.iservice.IContinentesService;

@Service
public class ContinentesService implements IContinentesService{

	@Autowired
	private IContinentesRepository repository;
	
	@Override
	public List<Continentes> all() {
		return this.repository.findAll();
	}	
	
	@Override
	public Optional<Continentes> findById(Long id) {
		return this.repository.findById(id);
	}
	
	@Override
	public Continentes save(Continentes continentes) {
		return this.repository.save(continentes);
	}

	@Override
	public void delete(Long id) {
		this.repository.deleteById(id);
	}

}