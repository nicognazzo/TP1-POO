package ar.edu.unlu.poo.todolist1;
import java.time.LocalDate;
import ar.edu.unlu.poo.todolist1.EstadoTarea;

public class Tarea {
    private String descripcion;
    private int prioridad;
    private EstadoTarea estado;
    private LocalDate fechaLimite;

    // Constructor
    public Tarea(String descripcion, int prioridad, LocalDate fechaLimite) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
        this.estado = EstadoTarea.INCOMPLETA;
        this.fechaLimite = fechaLimite;
    }

    public void setDescripcion(String nuevaDescripcion) {
        descripcion = nuevaDescripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void cambiarPrioridad(int nuevaPrioridad) {
        prioridad = nuevaPrioridad;
    }

    public void marcarComoCompleta() {
        estado = EstadoTarea.COMPLETA;
    }

    public void mostrarTarea() {
        estaVencida(); //verifica si esta vencida y actualiza su estado
        System.out.println("[" + estado + "] " + descripcion + " // Prioridad: " + prioridad + " // Fecha limite: " + fechaLimite);
    }

    // Verifica si esta vencida, retorna true si lo esta, marca como vencida si lo amerita
    public boolean estaVencida() {
        if (estado == EstadoTarea.VENCIDA){
            return true;
        } else if (estado != EstadoTarea.COMPLETA && fechaLimite != null) {
            LocalDate fechaActual = LocalDate.now();
            boolean auxiliar = fechaActual.isAfter(fechaLimite);
            if (auxiliar)  estado = EstadoTarea.VENCIDA;
            return auxiliar;
        }
        return false;
    }

    // Completa = true
    public boolean estaCompleta() {
        return (estado == EstadoTarea.COMPLETA);
    }


}
