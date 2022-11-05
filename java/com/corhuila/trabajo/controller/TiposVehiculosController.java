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

import com.corhuila.trabajo.entity.TiposVehiculos;
import com.corhuila.trabajo.iservice.ITiposVehiculosService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("api/tiposVehiculos")
public class TiposVehiculosController {

	@Autowired
	private ITiposVehiculosService service;

	@GetMapping
	public List<TiposVehiculos> all() {
		return service.all();
	}
	
	@GetMapping("{id}")
	public Optional<TiposVehiculos> show(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public TiposVehiculos save(@RequestBody TiposVehiculos tiposVehiculos) {
		return service.save(tiposVehiculos);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(code = HttpStatus.CREATED)
	public TiposVehiculos update(@PathVariable Long id, @RequestBody TiposVehiculos tiposVehiculos) {
		Optional<TiposVehiculos> op = service.findById(id);
		
		if (!op.isEmpty()) {
			TiposVehiculos tiposVehiculosUpdate = op.get();
			tiposVehiculosUpdate.setCodigo(tiposVehiculos.getCodigo());
			tiposVehiculosUpdate.setDescripcion(tiposVehiculos.getDescripcion());
			tiposVehiculosUpdate.setEstado(tiposVehiculos.getEstado());
			return service.save(tiposVehiculosUpdate);
		}
		
		return tiposVehiculos;
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(code = HttpStatus.NO_CONTENT)
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}
}
