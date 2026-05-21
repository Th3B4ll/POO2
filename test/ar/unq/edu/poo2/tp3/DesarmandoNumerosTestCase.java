package ar.unq.edu.poo2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DesarmandoNumerosTestCase {

	    @Test
	    void testNumeroConMasDigitosPares() {
	    	DesarmandoNumeros dn = new DesarmandoNumeros();

	        int[] numeros = { 1234, 2486, 1357, 8080 };

	        int resultado = dn.numeroConMasDigitosPares(numeros);

	        // 2486 tiene 4 dígitos pares (2,4,8,6)
	        // 8080 también tiene 4 (8,0,8,0)
	        // Si tu implementación rompe empates devolviendo el primero, el esperado es 2486
	        assertEquals(2486, resultado);
	    }

	    @Test
	    void testConNegativos() {
	        DesarmandoNumeros dn = new DesarmandoNumeros();

	        int[] numeros = { -222, -1357, -808 };

	        int resultado = dn.numeroConMasDigitosPares(numeros);

	        // -222 tiene 3 dígitos pares
	        assertEquals(-222, resultado);
	    }

	    @Test
	    void testConCero() {
	        DesarmandoNumeros dn = new DesarmandoNumeros();

	        int[] numeros = { 0, 1357, 246 };

	        int resultado = dn.numeroConMasDigitosPares(numeros);

	        // 0 tiene 1 dígito par (el 0)
	        // 246 tiene 3 dígitos pares → debe ganar 246
	        assertEquals(246, resultado);
	    }

	    @Test
	    void testArregloDeUnSoloElemento() {
	        DesarmandoNumeros dn = new DesarmandoNumeros();

	        int[] numeros = { 8080 };

	        int resultado = dn.numeroConMasDigitosPares(numeros);

	        assertEquals(8080, resultado);
	    }

	    @Test
	    void testArregloVacioDebeFallar() {
	        DesarmandoNumeros dn = new DesarmandoNumeros();

	        assertThrows(IllegalArgumentException.class, () -> {
	            dn.numeroConMasDigitosPares(new int[] {});
	        });
	    }
}