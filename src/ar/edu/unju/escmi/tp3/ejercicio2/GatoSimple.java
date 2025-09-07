package ar.edu.unju.escmi.tp3.ejercicio2;

public class GatoSimple {
    private String color;
    private double peso;
    private String raza;
    private int edad;
    private String nombre;
    private String sexo;

    public GatoSimple(String color, double peso, String raza, int edad, String nombre, String sexo) {
        this.color = color;
        this.peso = peso;
        this.raza = raza;
        this.edad = edad;
        this.nombre = nombre;
        this.sexo = sexo.toLowerCase();
    }

    public void maullar() {
        System.out.println("Miauu");
    }

    public void ronronear() {
        System.out.println("prrrr");
    }

    public void comer(String comida) {
        if (comida.equalsIgnoreCase("pescado")) {
            System.out.println("¡Qué rico! ¡Gracias!");
        } else {
            System.out.println("Lo siento, yo solo como pescado");
        }
    }

    public void pelear(GatoSimple gatoContrincante) {
        if (this.sexo.equals("hembra")) {
            System.out.println("No me gusta pelear");
        } else if (this.sexo.equals("macho")) {
            if (gatoContrincante.sexo.equals("hembra")) {
                System.out.println("No peleo contra gatitas");
            } else {
                System.out.println("¡Ven aquí que te vas a enterar!");
            }
        }
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Raza: " + raza);
        System.out.println("Color: " + color);
        System.out.println("Peso: " + peso + " kg");
        System.out.println("Edad: " + edad + " años");
        System.out.println("Sexo: " + sexo);
    }
}
