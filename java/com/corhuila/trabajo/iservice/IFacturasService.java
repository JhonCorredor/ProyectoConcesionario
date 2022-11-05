package com.corhuila.trabajo.iservice;

import java.util.List;
import java.util.Optional;

import com.corhuila.trabajo.entity.Facturas;

public interface IFacturasService {

public List<Facturas> all();
	
	public Optional<Facturas> findById(Long id);
	
	public Facturas save(Facturas facturas);
	
	public void delete(Long id);
}
