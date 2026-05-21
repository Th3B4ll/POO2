package ar.unq.edu.poo2.tp3;

import java.util.*;

public class Counter {

	private List<Integer> lista = new ArrayList<>();
	
	public Counter() {
	}
	
	public int getPairCount(String opcion) {
		int totalP = 0;
		int totalOdd = 0;
		for (int n: this.lista) {
			if (n % 2 == 0) {totalP++;} 
			else {totalOdd++;}
		}
		if (opcion == "par") {return totalP;} 
		else {return totalOdd;}
	}
	
	public int cantidadMultiplos(int n, int limite) {
		return limite / n;}

	public void addNumber(int n) {
		lista.add(n);}
	
	public int getEvenOcurrences() {
		return getPairCount("par");
	}
	private int contarDigitosPares(int n) {
	    n = Math.abs(n); // por si es negativo

	    if (n == 0) {
	        return 1; // el 0 es par y es un dígito
	    }

	    int contador = 0;

	    while (n > 0) {
	        int digito = n % 10;   // tomo el último dígito
	        if (digito % 2 == 0) { // si es par
	            contador++;
	        }
	        n = n / 10;            // elimino el último dígito
	    }

	    return contador;
	}
	public int numeroConMasDigitosPares(int[] numeros) {
	    if (numeros == null || numeros.length == 0) {
	        throw new IllegalArgumentException("El arreglo no puede ser nulo ni vacío");
	    }

	    int mejorNumero = numeros[0];
	    int maxPares = contarDigitosPares(numeros[0]);

	    for (int i = 1; i < numeros.length; i++) {
	        int actual = numeros[i];
	        int paresActual = contarDigitosPares(actual);

	        if (paresActual > maxPares) {
	            maxPares = paresActual;
	            mejorNumero = actual;
	        }
	    }

	    return mejorNumero;
	}
}
