package ar.edu.unju.escmi.tp3.ejercicio4;

public class Cliente {
    private int dni;
    private String nombre;
    private char categoria;
    
    // Constructor    
    public Cliente(int dni, String nombre, char categoria) {
        this.dni = dni;
        this.nombre = nombre;
        this.categoria = categoria;
    }

    // Metodos accesores
    public int getDni() {
        return dni;
    }
    public char getCategoria() {
        return categoria;
    }

    // Sobreesctritura del metodo toString
    @Override
    public String toString() {
        return "Cliente[dni="+dni+", nombre="+nombre+", categoria="+categoria+"]";
    }
}
