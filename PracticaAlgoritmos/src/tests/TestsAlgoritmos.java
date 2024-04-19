package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import util.Algoritmos;

class TestsAlgoritmos {
	static Algoritmos a1;
	static Algoritmos a2;
	@BeforeAll
	static void setUp(){

	}
	
	@Test
	void factorial () {
		int factorialEsperado = 24;
		int factorialObtenido = a1.factorial(4);
		assertEquals(factorialEsperado, factorialObtenido);	
	}
	
	@Test
	void fibonacci() {
		int fibonacciEsperado = 8;
		int fibonacciObtenido = a1.fibonacci(6);
		assertEquals(fibonacciEsperado, fibonacciObtenido);		
	}
	
	@Test
	void esPrimo() {
		boolean fibonacciEsperado = false;
		boolean fibonacciObtenido = a1.esPrimo(6);
		assertEquals(fibonacciEsperado, fibonacciObtenido);		
	}
}
