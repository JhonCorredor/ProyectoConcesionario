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

import com.corhuila.trabajo.entity.Paises;
import com.corhuila.trabajo.iservice.IPaisesService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/paises")
public class PaisesController {

	@Autowired
	private IPaisesService service;

	@GetMapping
	public List<Paises> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Paises> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Paises save(@RequestBody Paises paises) {
		return service.save(paises);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Paises update(@PathVariable Long id, @RequestBody Paises paises) {
		Optional<Paises> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Paises paisesUpdate = op.get();
			paisesUpdate.setCodigo(paises.getCodigo());
			paisesUpdate.setDescripcion(paises.getDescripcion());
			paisesUpdate.setEstado(paises.getEstado());
			return service.save(paisesUpdate);
		}
		
		return paises;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
