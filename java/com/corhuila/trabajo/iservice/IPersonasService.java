package com.corhuila.trabajo.iservice;

import java.util.List;
import java.util.Optional;

import com.corhuila.trabajo.entity.Personas;

public interface IPersonasService {

public List<Personas> all();
	
	public Optional<Personas> findById(Long id);
	
	public Personas save(Personas personas);
	
	public void delete(Long id);
}
