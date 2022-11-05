package com.corhuila.trabajo.iservice;

import java.util.List;
import java.util.Optional;

import com.corhuila.trabajo.entity.Marcas;

public interface IMarcasService {

public List<Marcas> all();
	
	public Optional<Marcas> findById(Long id);
	
	public Marcas save(Marcas marcas);
	
	public void delete(Long id);
}
