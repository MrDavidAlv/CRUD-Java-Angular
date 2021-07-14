package com.example.Ejemplo01;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpleadoServiceImp implements EmpleadoService{
	
	@Autowired
	private EmpleadoRepositorio repositorio;

	@Override
	public List<Empleado> listar() {
		return repositorio.findAll();
	}
	

	@Override
	public Empleado listarId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empleado add(Empleado p) {
		// TODO Auto-generated method stub
		return repositorio.save(p);
	}

	@Override
	public Empleado edit(Empleado p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empleado delete(Empleado p) {
		// TODO Auto-generated method stub
		return null;
	}
	


	


}
