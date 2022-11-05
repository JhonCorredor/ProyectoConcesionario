package com.corhuila.trabajo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.trabajo.entity.Facturas;
import com.corhuila.trabajo.irepository.IFacturasRepository;
import com.corhuila.trabajo.iservice.IFacturasService;

@Service
public class FacturasService implements IFacturasService{

	@Autowired
	private IFacturasRepository repository;
	
	@Override
	public List<Facturas> all() {
		return this.repository.findAll();
	}	
	
	@Override
	public Optional<Facturas> findById(Long id) {
		return this.repository.findById(id);
	}
	
	@Override
	public Facturas save(Facturas facturas) {
		return this.repository.save(facturas);
	}

	@Override
	public void delete(Long id) {
		this.repository.deleteById(id);
	}
}
