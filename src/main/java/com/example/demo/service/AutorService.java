package com.example.demo.service;

import java.util.List;

import com.example.demo.repository.modelo.Autor;


public interface AutorService {
	public void agregar(Autor autor);
	public void actualizar(Autor autor);
	public Autor buscar(Integer id);
	public void eliminar(Integer id);
	
public List<Autor> buscarInnerJoin();
	
	public List<Autor> buscarOuterRighyJoin();
	
	public List<Autor> buscarOuterLeftJoin();
	
	public List<Autor> buscarOuterFullJoin();
	
	public List<Autor> buscarWhereJoin();
}
