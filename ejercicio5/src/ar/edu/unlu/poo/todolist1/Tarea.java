package ar.edu.unlu.poo.todolist1;
import java.time.LocalDate;

public class Tarea {
    private String descripcion;
    private int prioridad;
    private EstadoTarea.EstadoTarea estado;
    private LocalDate fechaLimite;

    // Constructor
    public Tarea(String descripcion, int prioridad, LocalDate fechaLimite) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = ar.edu.unlu.poo.todolist1.EstadoTarea.EstadoTarea.INCOMPLETA;
        this.fechaLimite = fechaLimite;
    }

    public void modificarDescripcion(String nuevaDescripcion) {
        this.descripcion = nuevaDescripcion;
    }

    public void cambiarPrioridad(int nuevaPrioridad) {
        this.prioridad = nuevaPrioridad;
    }

    public void marcarComoCompleta() {
        this.estado = true;
    }

    // Método para mostrar la tarea
    public void mostrarTarea() {
        if (estado == ar.edu.unlu.poo.todolist1.EstadoTarea.EstadoTarea.VENCIDA){
            System.out.println("(Vencida)"+ descripcion);
        }
        else {
            System.out.println(descripcion);
        }
    }

    // Métodos para verificar el estado de la tarea
    public boolean estaVencida() {
        if (estado == ar.edu.unlu.poo.todolist1.EstadoTarea.EstadoTarea.VENCIDA){
            return true;
        } else if (estado != ar.edu.unlu.poo.todolist1.EstadoTarea.EstadoTarea.COMPLETA && fechaLimite != null) {
            LocalDate fechaActual = new LocalDate.now();
            boolean auxiliar = fechaActual.isAfter(fechaLimite);
            if (auxiliar) this.estado = ar.edu.unlu.poo.todolist1.EstadoTarea.EstadoTarea.VENCIDA;
            return auxiliar;
        }
        return false;
    }

    public boolean estaCompleta() {
        return (estado == ar.edu.unlu.poo.todolist1.EstadoTarea.EstadoTarea.COMPLETA);
    }


}
