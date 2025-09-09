package ar.edu.unju.escmi.tp3.ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GatoSimple gato = null;
        GatoSimple gatoContrincante = null;

        int opcion;
        do {
            System.out.println("\n--- Menú de GatoSimple ---");
            System.out.println("1 – Crear gato simple");
            System.out.println("2 – Dar de comer a un gato simple");
            System.out.println("3 – Mostrar todos los gatos");
            System.out.println("4 – Crear gato contrincante");
            System.out.println("5 – Pelear");
            System.out.println("6 – Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Raza: ");
                    String raza = scanner.nextLine();
                    System.out.print("Color: ");
                    String color = scanner.nextLine();
                    System.out.print("Peso (kg): ");
                    double peso = scanner.nextDouble();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine(); // limpiar buffer
                    System.out.print("Sexo (macho/hembra): ");
                    String sexo = scanner.nextLine();
                    gato = new GatoSimple(color, peso, raza, edad, nombre, sexo);
                    break;

                case 2:
                    if (gato != null) {
                        System.out.print("Ingrese la comida: ");
                        String comida = scanner.nextLine();
                        gato.comer(comida);
                    } else {
                        System.out.println("Primero debe crear un gato.");
                    }
                    break;

                case 3:
                    if (gato != null) {
                        System.out.println("\n🐾 Gato Simple:");
                        System.out.println(gato);
                        gato.maullar();
                        gato.ronronear();
                    } else {
                        System.out.println("No hay gato simple creado.");
                    }
                    if (gatoContrincante != null) {
                        System.out.println("\n🐾 Gato Contrincante:");
                        System.out.println(gatoContrincante);
                        gatoContrincante.maullar();
                        gatoContrincante.ronronear();
                    } else {
                        System.out.println("No hay gato contrincante creado.");
                    }
                    break;

                case 4:
                    if (gato != null) {
                        System.out.print("Nombre del contrincante: ");
                        String nombreC = scanner.nextLine();
                        System.out.print("Raza: ");
                        String razaC = scanner.nextLine();
                        System.out.print("Color: ");
                        String colorC = scanner.nextLine();
                        System.out.print("Peso (kg): ");
                        double pesoC = scanner.nextDouble();
                        System.out.print("Edad: ");
                        int edadC = scanner.nextInt();
                        scanner.nextLine(); // limpiar buffer
                        System.out.print("Sexo (macho/hembra): ");
                        String sexoC = scanner.nextLine();
                        gatoContrincante = new GatoSimple(colorC, pesoC, razaC, edadC, nombreC, sexoC);
                    } else {
                        System.out.println("Primero debe crear un gato.");
                    }
                    break;

                case 5:
                    if (gato != null && gatoContrincante != null) {
                        gato.pelear(gatoContrincante);
                    } else {
                        System.out.println("Debe crear ambos gatos antes de pelear.");
                    }
                    break;

                case 6:
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}
