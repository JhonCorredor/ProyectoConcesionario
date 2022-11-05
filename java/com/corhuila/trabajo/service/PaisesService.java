package com.corhuila.trabajo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.trabajo.entity.Paises;
import com.corhuila.trabajo.irepository.IPaisesRepository;
import com.corhuila.trabajo.iservice.IPaisesService;

@Service
public class PaisesService implements IPaisesService{

	@Autowired
	private IPaisesRepository repository;
	
	@Override
	public List<Paises> all() {
		return this.repository.findAll();
	}	
	
	@Override
	public Optional<Paises> findById(Long id) {
		return this.repository.findById(id);
	}
	
	@Override
	public Paises save(Paises paises) {
		return this.repository.save(paises);
	}

	@Override
	public void delete(Long id) {
		this.repository.deleteById(id);
	}

}
