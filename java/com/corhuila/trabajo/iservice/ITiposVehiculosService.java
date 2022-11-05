package com.corhuila.trabajo.iservice;

import java.util.List;
import java.util.Optional;

import com.corhuila.trabajo.entity.TiposVehiculos;

public interface ITiposVehiculosService {

public List<TiposVehiculos> all();
	
	public Optional<TiposVehiculos> findById(Long id);
	
	public TiposVehiculos save(TiposVehiculos tiposVehiculos);
	
	public void delete(Long id);
}
