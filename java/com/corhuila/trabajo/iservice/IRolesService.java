package com.corhuila.trabajo.iservice;

import java.util.List;
import java.util.Optional;

import com.corhuila.trabajo.entity.Roles;

public interface IRolesService {

public List<Roles> all();
	
	public Optional<Roles> findById(Long id);
	
	public Roles save(Roles roles);
	
	public void delete(Long id);
}
