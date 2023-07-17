package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EmpleadoRepoImpl implements EmpleadoRepo{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	@Override
	public void insertar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.entityManager.persist(empleado);
		
	}

	@Override
	public void actualizar(Empleado empleado) {
		// TODO Auto-generated method stub
		this.entityManager.merge(empleado);
		
	}

	@Override
	public Empleado buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Empleado.class, id);
	}

	@Override
	public void elimianar(Integer id) {
		// TODO Auto-generated method stub
		Empleado empl = this.buscar(id);
		this.entityManager.remove(empl);
		
	}

	@Override
	public List<Empleado> seleccionarInnerJoin() {
		TypedQuery<Empleado> myQuery = entityManager.createQuery("SELECT em from Empleado em INNER JOIN em.ciudadano ci",Empleado.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Empleado> seleccionarOuterRighyJoin() {
		TypedQuery<Empleado> myQuery = entityManager.createQuery("SELECT em from Empleado em RIGHT JOIN em.ciudadano ci",Empleado.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Empleado> seleccionarOuterLeftJoin() {
		TypedQuery<Empleado> myQuery = entityManager.createQuery("SELECT em from Empleado em LEFT JOIN em.ciudadano ci",Empleado.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Empleado> seleccionarOuterFullJoin() {
		TypedQuery<Empleado> myQuery = entityManager.createQuery("SELECT em from Empleado em FULL JOIN em.ciudadano ci",Empleado.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Empleado> seleccionarWhereJoin() {
		TypedQuery<Empleado> myQuery = entityManager.createQuery("SELECT em FROM Empleado em, Ciudadano ci WHERE em=ci.empleado",Empleado.class);
		
		return myQuery.getResultList();
	}
	

}
