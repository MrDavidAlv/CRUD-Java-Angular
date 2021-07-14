package com.example.Ejemplo01;

import org.springframework.data.repository.Repository;

import java.util.List;

public interface EmpleadoRepositorio extends Repository<Empleado, Integer>{
		List<Empleado>findAll();
		Empleado findOne(int id);
		Empleado save(Empleado p);
		void delete(Empleado p); 
}
