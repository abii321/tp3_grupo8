package ar.edu.unju.escmi.tp3.ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    // Método de búsqueda por código (ahora String)
    public static int buscarCodigo(int cantidad, String codigo, Producto arregloProductos[]) {
        for (int j = 0; j < cantidad; j++) {
            if (arregloProductos[j].getCodigo().equals(codigo)) return j;
        }
        return -1;
    }

    // Método para pausar antes de volver al menú
    public static void pausa(Scanner sc) {
        System.out.println("\nPresione ENTER para volver al menú...");
        sc.nextLine();
    }

    public static void main(String[] args) {
        Producto arregloProductos[] = new Producto[3];
        Scanner sc = new Scanner(System.in);

        int opcion, cantidad = 0;

        do {
            System.out.println("--------------Menu de Opciones--------------");
            System.out.println("1 - Crear producto");
            System.out.println("2 - Mostrar productos");
            System.out.println("3 - Modificar precio de producto");
            System.out.println("4 - Mostrar productos que superen un precio");
            System.out.println("5 - Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt(); sc.nextLine();

            switch (opcion) {
                case 1: {
                    if (cantidad > 2) {
                        System.out.println("No hay espacio para agregar otro producto");
                    } else {
                        Producto p = new Producto(); // primero creamos el producto

                        System.out.print("Ingrese código: ");
                        p.setCodigo(sc.nextLine());

                        System.out.print("Ingrese descripción: ");
                        p.setDescripcion(sc.nextLine());

                        System.out.print("Ingrese precio: ");
                        p.setPrecio(sc.nextDouble()); sc.nextLine();

                        arregloProductos[cantidad] = p;
                        System.out.println("Producto agregado con éxito");
                        cantidad++;
                    }
                    pausa(sc);
                    break;
                }

                case 2: {
                    if (cantidad == 0) {
                        System.out.println("No hay productos para mostrar");
                    } else {
                        for (int j = 0; j < cantidad; j++)
                            System.out.println(arregloProductos[j].toString());
                    }
                    pausa(sc);
                    break;
                }

                case 3: {
                    System.out.print("Ingrese código del producto a modificar: ");
                    String codigo = sc.nextLine();

                    int indice = buscarCodigo(cantidad, codigo, arregloProductos);
                    if (indice == -1) {
                        System.out.println("No se encontró el producto con ese código");
                    } else {
                        System.out.print("Ingrese nuevo precio: ");
                        double nuevoPrecio = sc.nextDouble(); sc.nextLine();
                        arregloProductos[indice].setPrecio(nuevoPrecio);
                        System.out.println("Precio actualizado con éxito");
                    }
                    pausa(sc);
                    break;
                }

                case 4: {
                    System.out.print("Ingrese precio límite: ");
                    double precioLimite = sc.nextDouble(); sc.nextLine();
                    boolean alguno = false;

                    for (int j = 0; j < cantidad; j++) {
                        if (arregloProductos[j].getPrecio() > precioLimite) {
                            System.out.println(arregloProductos[j].toString());
                            alguno = true;
                        }
                    }

                    if (!alguno) System.out.println("No hay productos que superen ese precio.");
                    pausa(sc);
                    break;
                }

                case 5:
                    System.out.println("Fin del programa");
                    break;

                default:
                    System.out.println("Opción inválida");
                    pausa(sc);
                    break;
            }

        } while (opcion != 5);

        sc.close();
    }
}
