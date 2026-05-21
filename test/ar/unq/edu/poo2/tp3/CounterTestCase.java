package ar.unq.edu.poo2.tp3;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTestCase {

	private Counter counter;
	/**
	* Build environment, which means inserting 10 values, only one even
	* con 10 enteros
	*
	* @throws Exception
	*/
	@BeforeEach
	public void setUp() throws Exception {
		
		counter = new Counter();
		
		counter.addNumber(4);
	
	}
	
	/**
	* Check even count
	*/
	@Test
		void testEvenNumbers() {
		Counter c1 = new Counter();
		c1.addNumber(4);
		c1.addNumber(6);
		c1.addNumber(8);
		c1.addNumber(10);
		// Getting the even occurrences
		int amount = c1.getPairCount("par");
		// I check the amount is the expected one
		assertEquals(4, amount);
		}
	
	 @Test
	    void testNumeroConMasDigitosPares() {
	        Counter counter = new Counter();

	        int[] numeros = { 1234, 2486, 1357, 8080 };

	        int resultado = counter.numeroConMasDigitosPares(numeros);

	        // 2486 tiene 4 dígitos pares (2,4,8,6)
	        // 8080 también tiene 4 (8,0,8,0)
	        // Si tu implementación rompe empates devolviendo el primero, el esperado es 2486
	        assertEquals(2486, resultado);
	    }

	    @Test
	    void testConNegativos() {
	        Counter counter = new Counter();

	        int[] numeros = { -222, -1357, -808 };

	        int resultado = counter.numeroConMasDigitosPares(numeros);

	        // -222 tiene 3 dígitos pares
	        assertEquals(-222, resultado);
	    }

	    @Test
	    void testConCero() {
	        Counter counter = new Counter();

	        int[] numeros = { 0, 1357, 246 };

	        int resultado = counter.numeroConMasDigitosPares(numeros);

	        // 0 tiene 1 dígito par (el 0)
	        // 246 tiene 3 dígitos pares → debe ganar 246
	        assertEquals(246, resultado);
	    }

	    @Test
	    void testArregloDeUnSoloElemento() {
	        Counter counter = new Counter();

	        int[] numeros = { 8080 };

	        int resultado = counter.numeroConMasDigitosPares(numeros);

	        assertEquals(8080, resultado);
	    }

	    @Test
	    void testArregloVacioDebeFallar() {
	        Counter counter = new Counter();

	        assertThrows(IllegalArgumentException.class, () -> {counter.numeroConMasDigitosPares(new int[] {});});
	    }
}
