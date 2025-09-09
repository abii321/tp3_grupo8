package ar.edu.unju.escmi.tp3.ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

    // Métodos de utilidad antes del main
    private static int leerEntero(Scanner sc) {
        while (true) {
            String line = sc.nextLine().trim();
            try {
                return Integer.parseInt(line);
            } catch (NumberFormatException e) {
                System.out.print("Ingrese un número válido: ");
            }
        }
    }

    private static double leerDouble(Scanner sc) {
        while (true) {
            String line = sc.nextLine().trim().replace(",", ".");
            try {
                return Double.parseDouble(line);
            } catch (NumberFormatException e) {
                System.out.print("Ingrese un número válido: ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Empleado empleado = null;
        int opcion;

        do {
            System.out.println("\n--- MENÚ EJERCICIO 3 ---");
            System.out.println("1- Crear empleado");
            System.out.println("2- Aumentar salario");
            System.out.println("3- Mostrar datos del empleado");
            System.out.println("4- Salir");
            System.out.print("Opción: ");
            opcion = leerEntero(sc);

            switch (opcion) {
                case 1:
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine().trim();
                    System.out.print("Legajo: ");
                    int legajo = leerEntero(sc);
                    System.out.print("Salario: ");
                    double salario = leerDouble(sc);
                    empleado = new Empleado(nombre, legajo, salario);
                    System.out.println(">> Empleado creado.");
                    break;

                case 2:
                    if (empleado == null) {
                        System.out.println("Primero debe crear un empleado.");
                    } else {
                        System.out.print("Ingrese el legajo para aplicar aumento: ");
                        int legajoBuscado = leerEntero(sc);
                        if (legajoBuscado == empleado.getLegajo()) {
                            empleado.aumentarSalario();
                            System.out.println(">> Aumento aplicado.");
                        } else {
                            System.out.println("El legajo no coincide.");
                        }
                    }
                    break;

                case 3:
                    if (empleado == null) {
                        System.out.println("No hay empleado cargado.");
                    } else {
                        System.out.println("\n--- DATOS DEL EMPLEADO ---");
                        System.out.println(empleado);
                    }
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opcion != 4);

        sc.close();
    }
}
