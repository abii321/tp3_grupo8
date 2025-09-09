package ar.edu.unju.escmi.tp3.ejercicio3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Empleado {
    private String nombre;
    private int legajo;
    private double salario;
    private LocalDate fechaIngreso;

    // Constantes
    public static final double SALARIO_MINIMO = 600000.00;
    public static final double AUMENTO_MERITOS = 90000.00;

    // Constructor parametrizado con validación de salario mínimo
    public Empleado(String nombre, int legajo, double salario, LocalDate fechaIngreso) {
        this.nombre = nombre;
        this.legajo = legajo;
        if (salario >= SALARIO_MINIMO) {
            this.salario = salario;
        } else {
            this.salario = SALARIO_MINIMO;
        }
        this.fechaIngreso = fechaIngreso;
    }

    // Getters
    public String getNombre() { return nombre; }
    public int getLegajo() { return legajo; }
    public double getSalario() { return salario; }
    public LocalDate getFechaIngreso() { return fechaIngreso; }

    // Setters
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setSalario(double salario) { this.salario = salario; }
    public void setFechaIngreso(LocalDate fechaIngreso) { this.fechaIngreso = fechaIngreso; }

    // Mostrar datos
    public String mostrarDatos() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        StringBuilder sb = new StringBuilder();
        sb.append("Nombre del empleado: ").append(nombre).append("\n");
        sb.append("Legajo: ").append(legajo).append("\n");
        sb.append("Fecha de ingreso: ").append(fechaIngreso.format(fmt)).append("\n");
        sb.append("Salario: $").append(String.format("%.2f", salario));
        return sb.toString();
    }

    // Aumentar salario
    public void aumentarSalario() {
        this.salario += AUMENTO_MERITOS;
    }
}
