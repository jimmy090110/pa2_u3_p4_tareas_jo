package com.example.demo.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetodosReferenciados {
	
	private static final Logger LOG = LoggerFactory.getLogger(MetodosReferenciados.class);


	public Integer getId() {
		return 8;
	}
	
	public String getIdHO() {
		LOG.info("Metodos ReferenciadosHO");
		return "Jimmy Ortegaa";
	}
	
	
	public void aceptar(String arg) {
		String cadena = "Jimmyyyyyyyyyyyy";
		LOG.info(cadena + " " + arg);		
	}
	
	public boolean evaluar(Integer arg) {
		Integer numero = 2;
		LOG.info(" " + numero + 5);
		return true;
	}
	
		public static String aplicar(Integer arg) {
			String valorFinal = arg.toString().concat("valor string");
			return valorFinal;
		}

	
		public static Double aplicar(Double arg) {
			Double num = arg * 0.2;
			return num;
		}
}
