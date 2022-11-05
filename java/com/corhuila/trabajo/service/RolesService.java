package com.corhuila.trabajo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.trabajo.entity.Roles;
import com.corhuila.trabajo.irepository.IRolesRepository;
import com.corhuila.trabajo.iservice.IRolesService;

@Service
public class RolesService implements IRolesService{

	@Autowired
	private IRolesRepository repository;
	
	@Override
	public List<Roles> all() {
		return this.repository.findAll();
	}	
	
	@Override
	public Optional<Roles> findById(Long id) {
		return this.repository.findById(id);
	}
	
	@Override
	public Roles save(Roles roles) {
		return this.repository.save(roles);
	}

	@Override
	public void delete(Long id) {
		this.repository.deleteById(id);
	}

}
