package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.EmpleadoRepo;
import com.example.demo.repository.modelo.Empleado;


@Service
public class EmpleadoServicceImpl implements EmpleadoService{
	
	@Autowired
	private EmpleadoRepo empleadoRepo;

	@Override
	public void agregar(Empleado empleado) {
		this.empleadoRepo.actualizar(empleado);
	}

	@Override
	public void modificar(Empleado empleado) {
		this.empleadoRepo.actualizar(empleado);
		
	}

	@Override
	public Empleado buscar(Integer id) {
		return this.empleadoRepo.buscar(id);
	}

	@Override
	public void eliminar(Integer id) {
		this.empleadoRepo.elimianar(id);
		
	}

	@Override
	public List<Empleado> buscarInnerJoin() {
		// TODO Auto-generated method stub
		return this.empleadoRepo.seleccionarInnerJoin();
	}

	@Override
	public List<Empleado> buscarOuterRighyJoin() {
		// TODO Auto-generated method stub
		return this.empleadoRepo.seleccionarOuterRighyJoin();
	}

	@Override
	public List<Empleado> buscarOuterLeftJoin() {
		// TODO Auto-generated method stub
		return this.empleadoRepo.seleccionarOuterLeftJoin();
	}

	@Override
	public List<Empleado> buscarOuterFullJoin() {
		// TODO Auto-generated method stub
		return this.empleadoRepo.seleccionarOuterFullJoin();
	}

	@Override
	public List<Empleado> buscarWhereJoin() {
		// TODO Auto-generated method stub
		return this.empleadoRepo.seleccionarWhereJoin();
	}



}
