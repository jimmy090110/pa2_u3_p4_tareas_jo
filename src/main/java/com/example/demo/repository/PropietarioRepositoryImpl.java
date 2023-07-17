package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Propietario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Transactional
@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Propietario propietario) {
		this.entityManager.persist(propietario);
		
	}

	@Override
	public Propietario seleccionarCedula(String cedula) {
		TypedQuery<Propietario>query=this.entityManager.createQuery("SELECT p from Propietario p WHERE p.cedula = :datoCedula",Propietario.class);
		query.setParameter("datoCedula", cedula);
		return query.getSingleResult();
	}

}
