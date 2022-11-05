package com.corhuila.trabajo.iservice;

import java.util.List;
import java.util.Optional;

import com.corhuila.trabajo.entity.Continentes;

public interface IContinentesService {

public List<Continentes> all();
	
	public Optional<Continentes> findById(Long id);
	
	public Continentes save(Continentes continentes);
	
	public void delete(Long id);
}
