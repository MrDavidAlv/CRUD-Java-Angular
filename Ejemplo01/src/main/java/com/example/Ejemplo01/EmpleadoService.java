package com.example.Ejemplo01;

import java.util.List;

public interface EmpleadoService {
	List <Empleado> listar();
	Empleado listarId(int id);
	Empleado add(Empleado p);
	Empleado edit(Empleado p);
	Empleado delete(Empleado p);
}
