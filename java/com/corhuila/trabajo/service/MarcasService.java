package com.corhuila.trabajo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.trabajo.entity.Marcas;
import com.corhuila.trabajo.irepository.IMarcasRepository;
import com.corhuila.trabajo.iservice.IMarcasService;

@Service
public class MarcasService implements IMarcasService{

	@Autowired
	private IMarcasRepository repository;
	
	@Override
	public List<Marcas> all() {
		return this.repository.findAll();
	}	
	
	@Override
	public Optional<Marcas> findById(Long id) {
		return this.repository.findById(id);
	}
	
	@Override
	public Marcas save(Marcas marcas) {
		return this.repository.save(marcas);
	}

	@Override
	public void delete(Long id) {
		this.repository.deleteById(id);
	}

}
