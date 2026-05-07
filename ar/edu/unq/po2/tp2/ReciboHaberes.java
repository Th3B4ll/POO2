package ar.edu.unq.po2.tp2;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ReciboHaberes {
	private String empleadoNombre;
	private String empleadoDireccion;
	private LocalDate fechaEmision;
	private double sueldoBruto;
	private double sueldoNeto;
	private List<ConceptoRecibo> conceptos = new ArrayList<>();

	public ReciboHaberes(String empleadoNombre, String empleadoDireccion,
	                     LocalDate fechaEmision, double sueldoBruto, double sueldoNeto) {
		this.empleadoNombre = empleadoNombre;
		this.empleadoDireccion = empleadoDireccion;
		this.fechaEmision = fechaEmision;
		this.sueldoBruto = sueldoBruto;
		this.sueldoNeto = sueldoNeto;
	}

	public void agregarConcepto(ConceptoRecibo c) {
		conceptos.add(c);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Recibo de Haberes\n");
		sb.append("Empleado: ").append(empleadoNombre).append("\n");
		sb.append("Direccion: ").append(empleadoDireccion).append("\n");
		sb.append("Fecha Emision: ").append(fechaEmision).append("\n");
		sb.append("Sueldo Bruto: ").append(sueldoBruto).append("\n");
		sb.append("Sueldo Neto: ").append(sueldoNeto).append("\n");
		sb.append("Conceptos:\n");
		for (ConceptoRecibo c : conceptos) {
			sb.append("  - ").append(c.toString()).append("\n");
		}
		return sb.toString();
	}
}
