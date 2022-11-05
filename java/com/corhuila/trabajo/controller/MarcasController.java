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

import com.corhuila.trabajo.entity.Marcas;
import com.corhuila.trabajo.iservice.IMarcasService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/marcas")
public class MarcasController {

	@Autowired
	private IMarcasService service;

	@GetMapping
	public List<Marcas> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Marcas> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Marcas save(@RequestBody Marcas marcas) {
		return service.save(marcas);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Marcas update(@PathVariable Long id, @RequestBody Marcas marcas) {
		Optional<Marcas> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Marcas marcasUpdate = op.get();
			marcasUpdate.setCodigo(marcas.getCodigo());
			marcasUpdate.setDescripcion(marcas.getDescripcion());
			marcasUpdate.setEstado(marcas.getEstado());
			return service.save(marcasUpdate);
		}
		
		return marcas;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
