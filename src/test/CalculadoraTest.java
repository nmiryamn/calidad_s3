package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Calculadora;

class CalculadoraTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testSuma() {
		int resultado = 5;
		int devuelto = Calculadora.suma(2, 3);
		assertEquals(resultado, devuelto);
	}
	
	@Test
	void testResta() {
		int resultado = -1;
		int devuelto = Calculadora.resta(2, 3);
		assertEquals(resultado, devuelto);
	}
	
	@Test
	void testMultiplica() {
		int resultado = 6;
		int devuelto = Calculadora.multiplica(2,3);
		assertEquals(resultado, devuelto);
	}
	
	@Test
	void testDivide() {
		int resultado = 0;
		int devuelto = Calculadora.divide(2, 3);
		assertEquals(resultado, devuelto);
	}

}
