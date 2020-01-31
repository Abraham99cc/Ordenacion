package Eddpractica;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ordenacionTest {

	@Test
	void testOrdenar3() {
		String resultado = ordenacion.ordenar3(2,4,6);
		System.out.println(resultado);
		String esperado = "2,4,6";
		assertEquals(esperado, resultado);
		
		String resultado2 = ordenacion.ordenar3(6,4,2);
		System.out.println(resultado);
		String esperado2 = "2,4,6";
		assertEquals(esperado2, resultado2);
		
		String resultado3 = ordenacion.ordenar3(4,2,6);
		System.out.println(resultado);
		String esperado3 = "2,4,6";
		assertEquals(esperado3, resultado3);
		
		String resultado4 = ordenacion.ordenar3(2,6,4);
		System.out.println(resultado);
		String esperado4 = "2,4,6";
		assertEquals(esperado2, resultado2);
	}

}
