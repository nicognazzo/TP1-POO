import ar.edu.unlu.poo.pilas.Pila;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Pila pila = new Pila();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEsta pila es de tipo 'Object', pero el main trabaja con enteros, no ingrese otro tipo de datos");

        while (true) {
            System.out.println("1. Crear pila");
            System.out.println("2. Consultar si la pila está vacía");
            System.out.println("3. Consultar la longitud de la pila");
            System.out.println("4. Agregar elemento a la pila");
            System.out.println("5. Eliminar elemento de la pila");
            System.out.println("6. Recuperar elemento de la pila (sin alterarla)");
            System.out.println("7. Mostrar pila");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    pila = new Pila();
                    System.out.println("Nueva pila creada.");
                    break;
                case 2:
                    boolean esVacia = pila.esVacia();
                    if (esVacia) System.out.println("Pila vacia.");
                    else System.out.println("La pila no esta vacia.");
                    break;
                case 3:
                    pila.longitud();
                    break;
                case 4:
                    System.out.print("Ingrese un valor para apilar al final de la pila: ");
                    int valorAgregar = scanner.nextInt();
                    pila.apilar(valorAgregar);
                    System.out.println("Elemento apilado con exito.");
                    break;
                case 5:
                    Object valorEliminar = pila.desapilar();
                    System.out.println("Se desapilo el tope, su contenido era: " + valorEliminar);
                    break;
                case 6:
                    Object datoTope = pila.verTope();
                    System.out.println("El tope contiene el dato: " + datoTope);
                    break;
                case 7:
                    System.out.println("Pila actual:");
                    pila.mostrarPila();
                    break;
                case 8:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
            }
        }
    }
}