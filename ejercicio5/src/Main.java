import ar.edu.unlu.poo.todolist1.ListaTarea;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*"Ir al supermercado mañana". Debe tener la fecha límite establecida y estar incompleta.
        "Consultar repuesto del auto". Debe tener la fecha límite para ayer y estar completa.
        "Ir al cine a ver la nueva película de Marvel". Debe tener fecha límite de ayer y estar incompleta.
        */

        Scanner scanner = new Scanner(System.in);
        ListaTarea lista = new ListaTarea(); //se crea una lista automaticamente, no tendria sentido tener mas de una lista de tareas

        while (true) {
            System.out.println("Gestion de Tareas");
            System.out.println("1. Crear Tarea");
            System.out.println("2. Eliminar Tarea");
            System.out.println("3. Marcar Tarea como Completa");
            System.out.println("4. Mostrar Todas las Tareas");
            System.out.println("5. Mostrar Tarea Específica");
            System.out.println("6. Mostrar Tareas Vencidas");
            System.out.println("7. Cambiar Descripcion de Tarea");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    lista.crearTarea();
                    break;
                case 2:
                    System.out.print("Ingrese la descripción de la tarea a eliminar: ");
                    String descripcionElim = scanner.nextLine();
                    lista.eliminarTarea(descripcionElim);
                    break;
                case 3:
                    System.out.print("Ingrese la descripción de la tarea a marcar como completa: ");
                    String descripcionComp = scanner.nextLine();
                    lista.marcarTareaCompleta(descripcionComp);
                    break;
                case 4:
                    lista.mostrarTodasLasTareas();
                    break;
                case 5:
                    System.out.print("Ingrese la descripción de la tarea a mostrar: ");
                    String descripcionMostr = scanner.nextLine();
                    lista.mostrarTareaEspecifica(descripcionMostr);
                    break;
                case 6:
                    lista.mostrarTareasVencidas();
                    break;
                case 7:
                    System.out.print("Ingrese la descripción de la tarea que desea modificar: ");
                    String descripcionOrig = scanner.nextLine();
                    scanner.reset();
                    System.out.print("Ingrese la nueva descripcion: ");
                    String descripcionNueva = scanner.nextLine();
                    lista.cambiarDescripcion(descripcionOrig, descripcionNueva);
                    break;
                case 8:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}