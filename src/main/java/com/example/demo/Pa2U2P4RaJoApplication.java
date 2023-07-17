package com.example.demo;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repository.modelo.Autor;
import com.example.demo.repository.modelo.Libro;
import com.example.demo.service.AutorService;
import com.example.demo.service.EmpleadoService;




@SpringBootApplication
public class Pa2U2P4RaJoApplication implements CommandLineRunner {
	
	@Autowired
	private EmpleadoService empleadoService;
	
	@Autowired
	private AutorService autorService;
	

	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U2P4RaJoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		
//		//Ciudadano-Empleado
		System.out.println("-INNER JOIN-");
		this.empleadoService.buscarInnerJoin().stream().forEach(System.out::println);
		
		System.out.println("-OUTER RIGHT JOIN-");
		this.empleadoService.buscarOuterRighyJoin().stream().forEach(System.out::println);
		
		System.out.println("-OUTER LEFT JOIN-");
		this.empleadoService.buscarOuterLeftJoin().stream().forEach(System.out::println);
		
		System.out.println("-OUTER FULL JOIN-");
		this.empleadoService.buscarOuterFullJoin().stream().forEach(System.out::println);
		
		System.out.println("-WHERE JOIN-");
		this.empleadoService.buscarWhereJoin().stream().forEach(System.out::println);
		
		
		//Libro_Autor
		System.out.println("-INNER JOIN-");
		this.autorService.buscarInnerJoin().stream().forEach(System.out::println);
		
		System.out.println("-OUTER RIGHT JOIN-");
		this.autorService.buscarOuterRighyJoin().stream().forEach(System.out::println);
		
		System.out.println("-OUTER LEFT JOIN-");
		this.autorService.buscarOuterLeftJoin().stream().forEach(System.out::println);
		
		System.out.println("-OUTER FULL JOIN-");
		this.autorService.buscarOuterFullJoin().stream().forEach(System.out::println);
		
		System.out.println("-WHERE JOIN-");
		this.autorService.buscarWhereJoin().stream().forEach(System.out::println);
		
		
		
		
		
	
		

		
		
		

		
	
		
	
		
		
		
	
	
		
		
	}
	
	

}
