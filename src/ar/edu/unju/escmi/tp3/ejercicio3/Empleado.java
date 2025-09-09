package ar.edu.unju.escmi.tp3.ejercicio3;

public class Empleado {
    private String nombre;
    private int legajo;
    private double salario;

    // Constantes
    public static final double SALARIO_MINIMO = 600000.00;
    public static final double AUMENTO_MERITOS = 90000.00;

    // Constructor parametrizado con validación de salario mínimo
    public Empleado(String nombre, int legajo, double salario) {
        this.nombre = nombre;
        this.legajo = legajo;
        if (salario >= SALARIO_MINIMO) {
            this.salario = salario;
        } else {
            this.salario = SALARIO_MINIMO;
        }
    }

    // Sobreescritura de toString para mostrar datos
    @Override
    public String toString() {
        return "Nombre del empleado: " + nombre +
               "\nLegajo: " + legajo +
               "\nSalario: $" + String.format("%.2f", salario);
    }

    // Aumentar salario
    public void aumentarSalario() {
        this.salario += AUMENTO_MERITOS;
    }

    // Para poder verificar el legajo
    public int getLegajo() {
        return legajo;
    }
}

