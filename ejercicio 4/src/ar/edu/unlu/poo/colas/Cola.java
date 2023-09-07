package ar.edu.unlu.poo.colas;

public class Cola {
    private Nodo frente = null;
    private Nodo fin = null;
    private int tamanio = 0;

    //-------- Metodos -------//
    public boolean esVacia() {
        return frente == null;
    }

    public void encolar(Object dato) {
        Nodo nodo = new Nodo();
        nodo.setDato(dato);
        if (esVacia()) {
            frente = nodo;
            fin = nodo;
        } else {
            fin.setSiguiente(nodo);
            fin = nodo;
        }
        tamanio++;
    }
    // Desencola, retorna el dato del nodo y lo ELIMINA
    public Object desencolar() {
        if (esVacia()) {
            System.out.println("Cola vacia!!!");
            return null;
        }
        Object elemento = frente.getDato();
        frente = frente.getSiguiente();
        if (frente == null) {
            fin = null;
        }
        tamanio--;
        return elemento;
    }
    // Retorna el dato del frente SIN DESENCOLAR ni modificar la cola
    public Object frente() {
        if (esVacia()) {
            System.out.println("Cola vacia!!!");
            return null;
        }
        return frente.getDato();
    }
    // Printea todos los datos de la cola
    public void mostrarCola() {
        Nodo auxiliar = frente;
        while (auxiliar != null) {
            System.out.print(auxiliar.getDato() + " ; ");
            auxiliar = auxiliar.getSiguiente();
        }
        System.out.println("null // FIN //");
    }
    public void longitud(){
        System.out.println("La cola tiene una longitud de " + cantidadNodos + " nodos");
    }

}
