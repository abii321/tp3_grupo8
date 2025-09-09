package ar.edu.unju.escmi.tp3.ejercicio1;

import java.time.LocalDate;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persona[] personas = new Persona[50];
        int cantidad = 0;

        int opc = 0;
        do {
            System.out.println("1 - Crear objeto con Constructor por defecto.");
            System.out.println("2 - Crear objeto con Constructor parametrizado.");
            System.out.println("3 - Crear objeto con Constructor (dni, nombre, fecha de nacimiento).");
            System.out.println("4 - Mostrar personas.");
            System.out.println("5 - Salir");
            System.out.print("Seleccione una opción: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1: {
                    if (cantidad == personas.length) {
                        System.out.println("No hay más espacio en el arreglo.");
                        break;
                    }
                    Persona p = new Persona();
                    System.out.print("Ingrese dni: ");
                    p.setDni(sc.nextInt());
                    sc.nextLine();
                    System.out.print("Ingrese nombre: ");
                    p.setNombre(sc.nextLine());
                    System.out.print("Ingrese fecha de nacimiento (YYYY-MM-DD): ");
                    p.setFechaNacimiento(LocalDate.parse(sc.nextLine()));
                    System.out.print("Ingrese domicilio: ");
                    p.setDomicilio(sc.nextLine());
                    System.out.print("Ingrese provincia: ");
                    p.setProvincia(sc.nextLine());

                    personas[cantidad] = p;
                    cantidad++;
                    break;
                }

                case 2: {
                    if (cantidad == personas.length) {
                        System.out.println("No hay más espacio en el arreglo.");
                        break;
                    }
                    System.out.print("Ingrese dni (entero): ");
                    int dni = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese fecha de nacimiento (YYYY-MM-DD): ");
                    LocalDate fnac = LocalDate.parse(sc.nextLine());
                    System.out.print("Ingrese domicilio: ");
                    String domicilio = sc.nextLine();
                    System.out.print("Ingrese provincia: ");
                    String provincia = sc.nextLine();

                    personas[cantidad] = new Persona(dni, nombre, fnac, domicilio, provincia);
                    cantidad++;
                    break;
                }

                case 3: {
                    if (cantidad == personas.length) {
                        System.out.println("No hay más espacio en el arreglo.");
                        break;
                    }
                    System.out.print("Ingrese dni (entero): ");
                    int dni = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Ingrese nombre: ");
                    String nombre = sc.nextLine();
                    System.out.print("Ingrese fecha de nacimiento (YYYY-MM-DD): ");
                    LocalDate fnac = LocalDate.parse(sc.nextLine());

                    personas[cantidad] = new Persona(dni, nombre, fnac);
                    cantidad++;
                    break;
                }

                case 4: {
                    if (cantidad == 0) {
                        System.out.println("No hay personas cargadas.");
                    } else {
                        for (int i = 0; i < cantidad; i++) {
                            personas[i].mostrarDatos();
                        }
                    }
                    break;
                }

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