package com.corhuila.trabajo.iservice;

import java.util.List;
import java.util.Optional;

import com.corhuila.trabajo.entity.Inventarios;

public interface IInventariosService {

public List<Inventarios> all();
	
	public Optional<Inventarios> findById(Long id);
	
	public Inventarios save(Inventarios inventarios);
	
	public void delete(Long id);
}
