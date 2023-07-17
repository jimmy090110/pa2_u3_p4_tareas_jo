package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.IPropietarioRepository;
import com.example.demo.repository.modelo.Propietario;

@Service
public class PropietarioServiceImpl implements IPropietarioService {
	
	@Autowired
	private IPropietarioRepository propietarioRepository;

	@Override
	public void ingresar(Propietario propietario) {
		this.propietarioRepository.insertar(propietario);
	}

	@Override
	public Propietario buscarCedula(String cedula) {
		return this.propietarioRepository.seleccionarCedula(cedula);
	}

}
