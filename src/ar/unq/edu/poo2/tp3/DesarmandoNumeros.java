package ar.unq.edu.poo2.tp3;

public class DesarmandoNumeros {
	
	public DesarmandoNumeros() {
		
	}
	private int contarDigitosPares(int n) {
	    n = Math.abs(n); // por si es negativo
	    // el 0 es par y es un dígito
	    if (n == 0) {return 1;}
	    int contador = 0;
	    while (n > 0) {
	        int digito = n % 10; // último número
	        if (digito % 2 == 0) {contador++;}
	        n = n / 10;            // elimino el último dígito
	    }return contador;
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
