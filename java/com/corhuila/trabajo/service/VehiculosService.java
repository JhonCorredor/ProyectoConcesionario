package com.corhuila.trabajo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.trabajo.entity.Vehiculos;
import com.corhuila.trabajo.irepository.IVehiculosRepository;
import com.corhuila.trabajo.iservice.IVehiculosService;

@Service
public class VehiculosService implements IVehiculosService{

	@Autowired
	private IVehiculosRepository repository;
	
	@Override
	public List<Vehiculos> all() {
		return this.repository.findAll();
	}	
	
	@Override
	public Optional<Vehiculos> findById(Long id) {
		return this.repository.findById(id);
	}
	
	@Override
	public Vehiculos save(Vehiculos vehiculos) {
		return this.repository.save(vehiculos);
	}

	@Override
	public void delete(Long id) {
		this.repository.deleteById(id);
	}

}
