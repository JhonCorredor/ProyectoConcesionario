package com.corhuila.trabajo.iservice;

import java.util.List;
import java.util.Optional;

import com.corhuila.trabajo.entity.Departamentos;

public interface IDepartamentosService {

public List<Departamentos> all();
	
	public Optional<Departamentos> findById(Long id);
	
	public Departamentos save(Departamentos departamentos);
	
	public void delete(Long id);
}
