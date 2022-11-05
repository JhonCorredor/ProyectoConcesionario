package com.corhuila.trabajo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.corhuila.trabajo.entity.DetallesFacturas;
import com.corhuila.trabajo.irepository.IDetallesFacturasRepository;
import com.corhuila.trabajo.iservice.IDetallesFacturasService;

@Service
public class DetallesFacturasService implements IDetallesFacturasService{

	@Autowired
	private IDetallesFacturasRepository repository;
	
	@Override
	public List<DetallesFacturas> all() {
		return this.repository.findAll();
	}	
	
	@Override
	public Optional<DetallesFacturas> findById(Long id) {
		return this.repository.findById(id);
	}
	
	@Override
	public DetallesFacturas save(DetallesFacturas detallesFacturas) {
		return this.repository.save(detallesFacturas);
	}

	@Override
	public void delete(Long id) {
		this.repository.deleteById(id);
	}
}
