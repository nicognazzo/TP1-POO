import ar.edu.unlu.poo.colas.Cola;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Cola cola = new Cola();
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nEsta cola es de tipo 'Object', pero el main trabaja con enteros, no ingrese otro tipo de datos");

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Crear cola");
            System.out.println("2. Consultar si la cola está vacía");
            System.out.println("3. Consultar la longitud de la cola");
            System.out.println("4. Agregar elemento a la cola");
            System.out.println("5. Eliminar elemento de la cola");
            System.out.println("6. Recuperar elemento de la cola (sin alterarla)");
            System.out.println("7. Mostrar cola");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cola = new Cola();
                    System.out.println("Nueva cola creada.");
                    break;
                case 2:
                    boolean esVacia = cola.esVacia();
                    if (esVacia) System.out.println("Cola vacia.");
                    else System.out.println("La cola no esta vacia.");
                    break;
                case 3:
                    cola.longitud();
                    break;
                case 4:
                    System.out.print("Ingrese un valor para encolar: ");
                    int valorAgregar = scanner.nextInt();
                    cola.encolar(valorAgregar);
                    System.out.println("Elemento apilado con exito.");
                    break;
                case 5:
                    Object valorEliminar = cola.desencolar();
                    System.out.println("Se desapilo el tope, su contenido era: " + valorEliminar);
                    break;
                case 6:
                    Object datoTope = cola.frente();
                    System.out.println("El tope contiene el dato: " + datoTope);
                    break;
                case 7:
                    System.out.println("Pila actual:");
                    cola.mostrarCola();
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