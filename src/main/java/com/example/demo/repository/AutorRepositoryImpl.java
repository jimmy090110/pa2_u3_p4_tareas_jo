package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Autor;
import com.example.demo.repository.modelo.Empleado;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AutorRepositoryImpl implements AutorRepository {

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public void insertar(Autor autor) {
		this.entityManager.persist(autor);
		
	}

	@Override
	public void actualizar(Autor autor) {
		this.entityManager.merge(autor);
		
	}

	@Override
	public Autor buscar(Integer id) {
		
		return this.entityManager.find(Autor.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		Autor aut = this.buscar(id);
		this.entityManager.remove(aut);
		
	}

	@Override
	public List<Autor> seleccionarInnerJoin() {
		TypedQuery<Autor> myQuery = entityManager.createQuery("SELECT au from Autor au INNER JOIN au.libros li",Autor.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Autor> seleccionarOuterRighyJoin() {
		TypedQuery<Autor> myQuery = entityManager.createQuery("SELECT au from Autor au Right JOIN au.libros li",Autor.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Autor> seleccionarOuterLeftJoin() {
		TypedQuery<Autor> myQuery = entityManager.createQuery("SELECT au from Autor au LEFT JOIN au.libros li",Autor.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Autor> seleccionarOuterFullJoin() {
		TypedQuery<Autor> myQuery = entityManager.createQuery("SELECT au from Autor au Full JOIN au.libros li",Autor.class);
		return myQuery.getResultList();
	}

	@Override
	public List<Autor> seleccionarWhereJoin() {
		TypedQuery<Autor> myQuery = entityManager.createQuery("SELECT au FROM Autor au, Libro li WHERE au=li.autores",Autor.class);
		
		return myQuery.getResultList();
	}
	

}
