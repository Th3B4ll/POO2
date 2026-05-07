package ar.edu.unq.po2.tp2;

import java.time.LocalDate;
import java.time.Period;

public abstract class Empleado {
    protected String nombre;
    protected String direccion;
    protected String estadoCivil;
    protected LocalDate fechaNacimiento;
    protected double sueldoBasico;

    public Empleado(String nombre, String direccion, String estadoCivil,
                    LocalDate fechaNacimiento, double sueldoBasico) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.estadoCivil = estadoCivil;
        this.fechaNacimiento = fechaNacimiento;
        this.sueldoBasico = sueldoBasico;
    }

    public int getEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
    }

    public abstract double sueldoBruto();

    public abstract double retenciones();

    public double sueldoNeto() {
        return this.sueldoBruto() - this.retenciones();
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }
}