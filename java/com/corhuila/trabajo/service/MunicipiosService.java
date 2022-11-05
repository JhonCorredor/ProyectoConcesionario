package com.corhuila.trabajo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.trabajo.entity.Municipios;
import com.corhuila.trabajo.irepository.IMunicipiosRepository;
import com.corhuila.trabajo.iservice.IMunicipiosService;

@Service
public class MunicipiosService implements IMunicipiosService{

	@Autowired
	private IMunicipiosRepository repository;
	
	@Override
	public List<Municipios> all() {
		return this.repository.findAll();
	}	
	
	@Override
	public Optional<Municipios> findById(Long id) {
		return this.repository.findById(id);
	}
	
	@Override
	public Municipios save(Municipios municipios) {
		return this.repository.save(municipios);
	}

	@Override
	public void delete(Long id) {
		this.repository.deleteById(id);
	}

}
