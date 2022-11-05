package com.corhuila.trabajo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.trabajo.entity.TiposVehiculos;
import com.corhuila.trabajo.irepository.ITiposVehiculosRepository;
import com.corhuila.trabajo.iservice.ITiposVehiculosService;

@Service
public class TiposVehiculosService implements ITiposVehiculosService{

	@Autowired
	private ITiposVehiculosRepository repository;
	
	@Override
	public List<TiposVehiculos> all() {
		return this.repository.findAll();
	}	
	
	@Override
	public Optional<TiposVehiculos> findById(Long id) {
		return this.repository.findById(id);
	}
	
	@Override
	public TiposVehiculos save(TiposVehiculos tiposVehiculos) {
		return this.repository.save(tiposVehiculos);
	}

	@Override
	public void delete(Long id) {
		this.repository.deleteById(id);
	}

}
