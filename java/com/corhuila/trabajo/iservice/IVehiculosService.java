package com.corhuila.trabajo.iservice;

import java.util.List;
import java.util.Optional;

import com.corhuila.trabajo.entity.Vehiculos;

public interface IVehiculosService {

public List<Vehiculos> all();
	
	public Optional<Vehiculos> findById(Long id);
	
	public Vehiculos save(Vehiculos vehiculos);
	
	public void delete(Long id);
}
