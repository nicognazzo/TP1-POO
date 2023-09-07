package ar.edu.unlu.poo.pilas;

public class Pila {
    private Nodo tope = null;
    private int tamanio = 0;

    //-------- Metodos -------//
    // Retorna true si la pila esta vacia
    public boolean esVacia() {
        return tope == null;
    }
    public void apilar(Object dato) {
        Nodo nodo = new Nodo();
        nodo.setDato(dato);
        nodo.setSiguiente(tope);
        tope = nodo;
        tamanio++;
    }
    // Retorna el contenido del tope y lo elimina de la pila
    public Object desapilar() {
        if ( esVacia() ) {
            System.out.println("Lista vacia!!!");
            return null;
        }
        Object contenido = tope.getDato();
        tope = tope.getSiguiente();
        tamanio--;
        return contenido;
    }
    // Muestra el contenido del tope sin desapilar
    public Object verTope() {
        if (esVacia()) {
            System.out.println("Lista vacia!!!");
            return null;
        }
        return tope.getDato();
    }
    public void longitud(){
        System.out.println("La pila tiene una longitud de " + tamanio + " nodos");
    }
    public void mostrarPila() {
        Nodo auxiliar = tope;
        while (auxiliar != null) {
            System.out.print(auxiliar.getDato() + " ; ");
            auxiliar = auxiliar.getSiguiente();
        }
        System.out.println(" FIN //");
    }
}
