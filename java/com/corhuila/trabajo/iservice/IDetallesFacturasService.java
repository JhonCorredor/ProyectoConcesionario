package com.corhuila.trabajo.iservice;

import java.util.List;
import java.util.Optional;

import com.corhuila.trabajo.entity.DetallesFacturas;

public interface IDetallesFacturasService {

public List<DetallesFacturas> all();
	
	public Optional<DetallesFacturas> findById(Long id);
	
	public DetallesFacturas save(DetallesFacturas detallesFacturas);
	
	public void delete(Long id);
}
