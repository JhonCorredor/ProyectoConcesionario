package com.corhuila.trabajo.iservice;

import java.util.List;
import java.util.Optional;

import com.corhuila.trabajo.entity.Paises;

public interface IPaisesService {

public List<Paises> all();
	
	public Optional<Paises> findById(Long id);
	
	public Paises save(Paises paises);
	
	public void delete(Long id);
}
