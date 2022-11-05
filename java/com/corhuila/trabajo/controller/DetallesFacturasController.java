package com.corhuila.trabajo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.corhuila.trabajo.entity.DetallesFacturas;
import com.corhuila.trabajo.iservice.IDetallesFacturasService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/detallesFacturas")
public class DetallesFacturasController {

	@Autowired
	private IDetallesFacturasService service;

	@GetMapping
	public List<DetallesFacturas> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<DetallesFacturas> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public DetallesFacturas save(@RequestBody DetallesFacturas detallesFacturas) {
		return service.save(detallesFacturas);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public DetallesFacturas update(@PathVariable Long id, @RequestBody DetallesFacturas detallesFacturas) {
		Optional<DetallesFacturas> op = service.findById(id);
		
		if (!op.isEmpty()) {
			DetallesFacturas detallesFacturasUpdate = op.get();
			detallesFacturasUpdate.setCantidad(detallesFacturas.getCantidad());
			detallesFacturasUpdate.setPrecio(detallesFacturas.getPrecio());
			detallesFacturasUpdate.setEstado(detallesFacturas.getEstado());
			return service.save(detallesFacturasUpdate);
		}
		
		return detallesFacturas;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
