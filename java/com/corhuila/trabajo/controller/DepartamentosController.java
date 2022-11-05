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

import com.corhuila.trabajo.entity.Departamentos;
import com.corhuila.trabajo.iservice.IDepartamentosService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/departamentos")
public class DepartamentosController {

	@Autowired
	private IDepartamentosService service;

	@GetMapping
	public List<Departamentos> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Departamentos> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Departamentos save(@RequestBody Departamentos departamentos) {
		return service.save(departamentos);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Departamentos update(@PathVariable Long id, @RequestBody Departamentos departamentos) {
		Optional<Departamentos> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Departamentos departamentosUpdate = op.get();
			departamentosUpdate.setCodigo(departamentos.getCodigo());
			departamentosUpdate.setDescripcion(departamentos.getDescripcion());
			departamentosUpdate.setEstado(departamentos.getEstado());
			return service.save(departamentosUpdate);
		}
		
		return departamentos;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
