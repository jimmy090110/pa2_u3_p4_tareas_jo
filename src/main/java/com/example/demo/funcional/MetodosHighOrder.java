package com.example.demo.funcional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MetodosHighOrder {

	private static final Logger LOG = LoggerFactory.getLogger(MetodosHighOrder.class);

	// es una implementacion
	//Supplier
	public void metodo(IPersonaSupplier<String> funcion) {
		// funcion.getId();
		LOG.info("High Order Supplier " + funcion.getId());

	}

	//Consumer
	public static void metodoConsumer(IPersonaConsumer<String> funcion2, String cadena) {
		funcion2.accept(cadena);

	}

	//Predicate
	public void metodoPred(IPersonaPredicate<Integer> numero, Integer n) {

		LOG.info("HighOrder predicate " + numero.evaluar(n));
	}
public void metodoFunc(IPersonaFunction<String, Integer> function,Integer arg) {
		
		
		LOG.info("High order function " + function.aplicar(arg) + " String");
	}
	//Unary
	public void metodoUnary(IPersonaUnaryOperator<Double>unary,Double arg) {
		
		
		LOG.info("High order unary " + unary.aplicar(arg));
		
	}

	public void metodoFunc(Object function, Double valueOf) {
		// TODO Auto-generated method stub
		
	}

	





}
