package ar.edu.unju.escmi.tp3.ejercicio2;

import java.util.Random;

public class GatoSimple {
    private String color;
    private double peso;
    private String raza;
    private int edad;
    private String nombre;
    private String sexo;
    private int energia; // Nueva variable para medir cuánto se alimentó

    public GatoSimple(String color, double peso, String raza, int edad, String nombre, String sexo) {
        this.color = color;
        this.peso = peso;
        this.raza = raza;
        this.edad = edad;
        this.nombre = nombre;
        this.sexo = sexo.toLowerCase();
        this.energia = 50; // valor inicial
    }

    public void maullar() {
        System.out.println(nombre + ": Miauu");
    }

    public void ronronear() {
        System.out.println(nombre + ": prrrr");
    }

    public void comer(String comida) {
        if (comida.equalsIgnoreCase("pescado")) {
            // funcionalidad extra que agregamos para mayor interactividad que se usa en la funcion de pelea
            energia += 20;
            if (energia > 100) energia = 100; // límite máximo
            System.out.println(nombre + ": ¡Qué rico! Ahora tengo " + energia + " de energía.");
        } else {
            System.out.println(nombre + ": Lo siento, yo solo como pescado");
        }
    }

    public void pelear(GatoSimple gatoContrincante) {
        if (this.sexo.equals("hembra")) {
            System.out.println(nombre + ": No me gusta pelear 😺");
            return;
        }

        if (this.sexo.equals("macho") && gatoContrincante.sexo.equals("hembra")) {
            System.out.println(nombre + ": No peleo contra gatitas 🐱‍👩");
            return;
        }

        // Sistema de probabilidades - funcionalidad extra que agregamos para mayor interactividad
        Random random = new Random();
        int probabilidad = random.nextInt(this.energia + gatoContrincante.energia);

        System.out.println("\n⚔️ ¡Comienza la pelea!");
        System.out.println(this.nombre + " (energía: " + this.energia + ") vs " +
                           gatoContrincante.nombre + " (energía: " + gatoContrincante.energia + ")");

        if (probabilidad < this.energia) {
            System.out.println("🏆 El ganador es: " + this.nombre);
        } else {
            System.out.println("🏆 El ganador es: " + gatoContrincante.nombre);
        }
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
               "\nRaza: " + raza +
               "\nColor: " + color +
               "\nPeso: " + peso + " kg" +
               "\nEdad: " + edad + " años" +
               "\nSexo: " + sexo +
               "\nEnergía: " + energia;
    }
}
