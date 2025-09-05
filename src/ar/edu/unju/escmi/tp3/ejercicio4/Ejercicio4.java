package ar.edu.unju.escmi.tp3.ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    public static int busquedaDni(int i, int dni, Cliente arregloCliente[]){
        for(int j=0; j<i; j++){
            if( arregloCliente[j].getDni() == dni ) return j;
        }
        return -1;
    }

    public static void main(String[] args) {
        Cliente arregloClientes[] = new Cliente[4];

        Scanner sc = new Scanner(System.in);
        int opcion, i=0;
        do{
            System.out.println("--------------Menu de Opciones--------------");
            System.out.println("1- Crear Cliente");
            System.out.println("2- Mostrar los datos de un cliente");
            System.out.println("3- Mostrar todos los clientes");
            System.out.println("4- Mostrar todos los clientes por categoria");
            System.out.println("5- Salir");
            System.out.println("Elige una opcion");
            opcion = sc.nextInt(); sc.nextLine();

            switch(opcion){
                case 1: {
                    if(i>3) System.out.println("No hay espacio para agregar otro cliente");
                    else{
                        int dni; String nombre; char categoria;
                        System.out.println("Ingrese DNI: "); dni = sc.nextInt(); sc.nextLine();
                        System.out.println("Ingrese nombre: "); nombre = sc.nextLine();
                        System.out.println("Ingrese categoria: "); categoria = sc.nextLine().charAt(0);
                        
                        arregloClientes[i] = new Cliente(dni, nombre, categoria);
                        System.out.println("Cliente agregado con exito");
                        i++;
                    }
                    break;
                }
                case 2: {
                    int dni;
                    System.out.println("Ingrese DNI: "); dni = sc.nextInt(); sc.nextLine();
                    int indiceEncont=busquedaDni(i,dni,arregloClientes);
                    if( indiceEncont == -1 ) System.out.println("No se encontro el DNI");
                    else System.out.println(arregloClientes[indiceEncont].toString());
                    break;
                }
                case 3:{
                    if(i==0) System.out.println("No hay clientes para mostrar");
                    else{
                        for(int j=0; j<i; j++) System.out.println( arregloClientes[j].toString() );
                    }
                    break;
                }
                case 4:{
                    char categoria;
                    System.out.println("Ingrese una categoria: ");
                    categoria = sc.nextLine().charAt(0);
                    for(int j=0; j<i; j++){
                        if(arregloClientes[j].getCategoria()==categoria)
                            System.out.println(arregloClientes[j].toString());
                    }
                    break;
                }
                case 5: System.out.println("Fin del programa"); break;
                default: System.out.println("Opcion invalida"); break;
            }

        } while(opcion!=5);
        sc.close();
    }
}
