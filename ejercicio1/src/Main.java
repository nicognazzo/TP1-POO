import ar.edu.unlu.poo.listas.Lista;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Lista lista = new Lista();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEsta lista es de tipo 'Object', pero el main trabaja con enteros, no ingrese otro tipo de datos");

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Crear lista");
            System.out.println("2. Consultar si la lista está vacía");
            System.out.println("3. Consultar la longitud de la lista");
            System.out.println("4. Agregar elemento al final de la lista");
            System.out.println("5. Eliminar elemento de la lista");
            System.out.println("6. Recuperar elemento de la lista");
            System.out.println("7. Insertar elemento en la lista en una posición específica");
            System.out.println("8. Mostrar la lista");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    lista = new Lista();
                    System.out.println("Nueva lista creada.");
                    break;
                case 2:
                    boolean estaVacia = lista.esVacia();
                    if (estaVacia) System.out.println("Lista vacia.");
                    else System.out.println("La lista no esta vacia.");
                    break;
                case 3:
                    lista.longitud();
                    break;
                case 4:
                    System.out.print("Ingrese un valor para agregar al final de la lista: ");
                    int valorAgregar = scanner.nextInt();
                    lista.agregarFinal(valorAgregar);
                    System.out.println("Elemento agregado al final de la lista.");
                    break;
                case 5:
                    System.out.print("Ingrese el valor del elemento que desea eliminar: ");
                    int valorEliminar = scanner.nextInt();
                    lista.eliminar(valorEliminar);
                    System.out.println("Elemento eliminado de la lista.");
                    break;
                case 6:
                    System.out.print("Ingrese la posicion del elemento que desea recuperar: ");
                    int posicionRecuperar = scanner.nextInt();
                    Object elementoRecuperado = lista.recuperar(posicionRecuperar);
                    System.out.println("Elemento en la posicion " + posicionRecuperar + ": " + elementoRecuperado);
                    break;
                case 7:
                    System.out.print("Ingrese la posición (indice) donde desea insertar el elemento, debe ser un entero: ");
                    int posicionInsertar = scanner.nextInt();
                    System.out.print("Ingrese el dato a insertar: ");
                    int valorInsertar = scanner.nextInt();
                    lista.insertarIndexado(posicionInsertar, valorInsertar);
                    System.out.println("Elemento insertado en la posición " + posicionInsertar + ".");
                    break;
                case 8:
                    System.out.println("Lista actual:");
                    lista.mostrar();
                    break;
                case 9:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        }
    }
}