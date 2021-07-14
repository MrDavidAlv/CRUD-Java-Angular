package com.example.Ejemplo01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http//localhost:4200", maxAge=3600)
@RestController
@RequestMapping({"/Empleados"})

public class Controlador {      /**Redireccion al proyecto Frontend**/
	
	@Autowired  
	EmpleadoService service;
	
	@GetMapping
	public List<Empleado>Listar(){
		return service.listar();
	}
	
	@PostMapping
	Public Empleado aggredar(@RequestBody empleado p) {
		
	}

}
