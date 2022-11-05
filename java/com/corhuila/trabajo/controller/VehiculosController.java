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

import com.corhuila.trabajo.entity.Vehiculos;
import com.corhuila.trabajo.iservice.IVehiculosService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/vehiculos")
public class VehiculosController {

	@Autowired
	private IVehiculosService service;

	@GetMapping
	public List<Vehiculos> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<Vehiculos> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public Vehiculos save(@RequestBody Vehiculos vehiculos) {
		return service.save(vehiculos);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Vehiculos update(@PathVariable Long id, @RequestBody Vehiculos vehiculos) {
		Optional<Vehiculos> op = service.findById(id);
		
		if (!op.isEmpty()) {
			Vehiculos vehiculosUpdate = op.get();
			vehiculosUpdate.setCodigo(vehiculos.getCodigo());
			vehiculosUpdate.setDescripcion(vehiculos.getDescripcion());
			vehiculosUpdate.setColor(vehiculos.getColor());
			vehiculosUpdate.setCilindraje(vehiculos.getCilindraje());
			vehiculosUpdate.setKilometraje(vehiculos.getKilometraje());
			vehiculosUpdate.setEstado(vehiculos.getEstado());
			return service.save(vehiculosUpdate);
		}
		
		return vehiculos;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
