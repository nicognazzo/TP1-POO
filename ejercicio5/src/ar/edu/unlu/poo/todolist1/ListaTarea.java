package ar.edu.unlu.poo.todolist1;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaTarea {
    private ArrayList<Tarea> lista = new ArrayList<>();

    //-----Metodos-----\\
    public ArrayList<Tarea> getLista(){
        return lista;
    }

    // Crea una tarea, pide ingresar por teclado los 3 atributos
    public void crearTarea(){
        Scanner scanner = new Scanner(System.in);

        // Descripcion
        System.out.print("Ingrese la descripción/nombre de la tarea: ");
        String descripcion = scanner.nextLine();

        int prioridad;  // Prioridad
        do {
            System.out.print("Ingrese la prioridad de la tarea (entre 1 y 5): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Por favor, ingrese un número válido.");
                System.out.print("Ingrese la prioridad de la tarea (entre 1 y 5): ");
                scanner.next();
            }
            prioridad = scanner.nextInt();
        } while (prioridad < 1 || prioridad > 5);

        // Fecha limite
        System.out.print("Ingrese la fecha límite de la tarea (AAAA-MM-DD): ");
        LocalDate fechaLimite = LocalDate.parse(scanner.next());

        Tarea tarea = new Tarea(descripcion, prioridad, fechaLimite);
        lista.add(tarea);
    }

    // Se le pasa una descripcion y en base a eso busca la tarea que coincide y la elimina
    public void eliminarTarea(String descripcion) {
        for (Tarea tarea : lista) {
            if (tarea.getDescripcion().equals(descripcion)) {
                lista.remove(tarea);
                break;
            }
        }
    }

    public void marcarTareaCompleta(String descripcion) {
        for (Tarea tarea : lista) {
            if (tarea.getDescripcion().equals(descripcion)) {
                tarea.marcarComoCompleta();
                break;
            }
        }
    }

    public void mostrarTodasLasTareas() {
        System.out.println("Lista completa de tareas:");
        for (Tarea tarea : lista) {
            tarea.mostrarTarea();
            System.out.println("\n");
        }
    }

    public void mostrarTareaEspecifica(String descripcion) {
        for (Tarea tarea : lista) {
            if (tarea.getDescripcion().equals(descripcion)) {
                tarea.mostrarTarea();
                break;
            }
        }
    }

    public void mostrarTareasVencidas() {
        System.out.println("Tareas vencidas: ");
        for (Tarea tarea : lista) {
            if (tarea.estaVencida()) {
                tarea.mostrarTarea();
            }
        }
    }
}
