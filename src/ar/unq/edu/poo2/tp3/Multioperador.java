package ar.unq.edu.poo2.tp3;

import java.util.ArrayList;
import java.util.List;

public class Multioperador {
	
	private List<Integer> lista = new ArrayList<>();
	
	public double suma() {
		return lista.stream()
					.mapToInt(Integer::intValue)
					.sum();
	}
	
	public static int restarEnOrden(List<Integer> lista) {
	    if (lista.isEmpty()) return 0;

	    int resultado = lista.get(0);

	    for (int i = 1; i < lista.size(); i++) {
	        resultado -= lista.get(i);
	    }

	    return resultado;
	}

	
	public int multiplicacion() {
		return lista.stream().reduce(1, (a, b) -> a * b);
	}

}
