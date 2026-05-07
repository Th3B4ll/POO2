package ar.edu.unq.po2.tp2;

import java.time.LocalDate;

public class EmpleadoPermanente extends Empleado {
    private int cantidadHijos;
    private int antiguedadAnios;
    private boolean tieneConyuge;

    public EmpleadoPermanente(String nombre, String direccion, String estadoCivil,
                              LocalDate fechaNacimiento, double sueldoBasico,
                              int cantidadHijos, int antiguedadAnios,
                              boolean tieneConyuge) {
        super(nombre, direccion, estadoCivil, fechaNacimiento, sueldoBasico);
        this.cantidadHijos = cantidadHijos;
        this.antiguedadAnios = antiguedadAnios;
        this.tieneConyuge = tieneConyuge;
    }

    @Override
    public double sueldoBruto() {
        double salarioFamiliar = 150 * cantidadHijos;
        if (tieneConyuge) {
            salarioFamiliar += 100;
        }
        double antiguedad = 50 * antiguedadAnios;
        return sueldoBasico + salarioFamiliar + antiguedad;
    }

    @Override
    public double retenciones() {
        double bruto = this.sueldoBruto();
        double obraSocial = 0.10 * bruto + 20 * cantidadHijos;
        double jubilacion = 0.15 * bruto;
        return obraSocial + jubilacion;
    }
}
