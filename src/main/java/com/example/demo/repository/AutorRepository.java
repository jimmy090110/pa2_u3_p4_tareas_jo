package com.example.demo.repository;

import java.util.List;

import com.example.demo.repository.modelo.Autor;

public interface AutorRepository {
	public void insertar(Autor autor);
	public void actualizar(Autor autor);
	public Autor buscar(Integer id);
	public void eliminar(Integer id);
	
public List<Autor> seleccionarInnerJoin();
	
	public List<Autor> seleccionarOuterRighyJoin();
	
	public List<Autor> seleccionarOuterLeftJoin();
	
	public List<Autor> seleccionarOuterFullJoin();
	
	public List<Autor> seleccionarWhereJoin();

}
