package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Empleado;

public interface EmpleadoService {
	
	public void agregar(Empleado empleado);
	public void modificar(Empleado empleado);
	public Empleado buscar(Integer id);
	public void eliminar(Integer id);
	
public List<Empleado> buscarInnerJoin();
	
	public List<Empleado> buscarOuterRighyJoin();
	
	public List<Empleado> buscarOuterLeftJoin();
	
	public List<Empleado> buscarOuterFullJoin();
	
	public List<Empleado> buscarWhereJoin();
	
	
	

}
