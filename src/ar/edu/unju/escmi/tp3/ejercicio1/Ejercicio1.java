package ar.edu.unju.escmi.tp3.ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();
        int opc = 0;

        do {
            System.out.println("1 - Crear objeto con Constructor por defecto.");
            System.out.println("2 - Crear objeto con Constructor parametrizado.");
            System.out.println("3 - Crear objeto con Constructor (dni, nombre, fecha de nacimiento).");
            System.out.println("4 - Mostrar personas.");
            System.out.println("5 - Salir");
            System.out.print("Seleccione una opción: ");
            opc = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (opc) {
                case 1:
                    Persona p1 = new Persona();
                    System.out.print("Ingrese dni: ");
                    p1.setDni(sc.nextLine());
                    System.out.print("Ingrese nombre: ");
                    p1.setNombre(sc.nextLine());
                    System.out.print("Ingrese fecha de nacimiento (YYYY-MM-DD): ");
                    p1.setFechaNacimiento(LocalDate.parse(sc.nextLine()));
                    System.out.print("Ingrese domicilio: ");
                    p1.setDomicilio(sc.nextLine());
                    System.out.print("Ingrese provincia: ");
                    p1.setProvincia(sc.nextLine());
                    personas.add(p1);
                    break;

                case 2:
                    System.out.print("Ingrese dni: ");
                    String dni2 = sc.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombre2 = sc.nextLine();
                    System.out.print("Ingrese fecha de nacimiento (YYYY-MM-DD): ");
                    LocalDate fnac2 = LocalDate.parse(sc.nextLine());
                    System.out.print("Ingrese domicilio: ");
                    String domicilio2 = sc.nextLine();
                    System.out.print("Ingrese provincia: ");
                    String provincia2 = sc.nextLine();
                    Persona p2 = new Persona(dni2, nombre2, fnac2, domicilio2, provincia2);
                    personas.add(p2);
                    break;

                case 3:
                    System.out.print("Ingrese dni: ");
                    String dni3 = sc.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombre3 = sc.nextLine();
                    System.out.print("Ingrese fecha de nacimiento (YYYY-MM-DD): ");
                    LocalDate fnac3 = LocalDate.parse(sc.nextLine());
                    Persona p3 = new Persona(dni3, nombre3, fnac3);
                    personas.add(p3);
                    break;

                case 4:
                    if (personas.isEmpty()) {
                        System.out.println("No hay personas cargadas.");
                    } else {
                        for (Persona p : personas) {
                            p.mostrarDatos();
                        }
                    }
                    break;

                case 5:
                    System.out.println("Fin del programa.");
                    break;

                default:
                    System.out.println("Opción inválida.");
                    break;
            }
        } while (opc != 5);

        sc.close();
    }
}

