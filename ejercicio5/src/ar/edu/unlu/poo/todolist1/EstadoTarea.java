package ar.edu.unlu.poo.todolist1;

public enum EstadoTarea {
    INCOMPLETA(1),
    COMPLETA(2),
    VENCIDA(3);

    private final int valor;

    private EstadoTarea(int valor) {
        this.valor = valor;
    }
    public int getValor() {
        return valor;
    }
}
