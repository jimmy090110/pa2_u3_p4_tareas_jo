package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Empleado;

public interface EmpleadoRepo {
	public void insertar(Empleado empleado);
	public void actualizar(Empleado empleado);
	public Empleado buscar(Integer id);
	public void elimianar(Integer id);
	
	public List<Empleado> seleccionarInnerJoin();
	
	public List<Empleado> seleccionarOuterRighyJoin();
	
	public List<Empleado> seleccionarOuterLeftJoin();
	
	public List<Empleado> seleccionarOuterFullJoin();
	
	public List<Empleado> seleccionarWhereJoin();
	
	
	

}
