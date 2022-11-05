package com.corhuila.trabajo.iservice;

import java.util.List;
import java.util.Optional;

import com.corhuila.trabajo.entity.Municipios;

public interface IMunicipiosService {

public List<Municipios> all();
	
	public Optional<Municipios> findById(Long id);
	
	public Municipios save(Municipios municipios);
	
	public void delete(Long id);
}
