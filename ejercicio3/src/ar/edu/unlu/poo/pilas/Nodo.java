package ar.edu.unlu.poo.pilas;

// Reciclado de las listas, se podria importar la clase nodo del ejercicio 1
public class Nodo {
    private Object dato;
    private Nodo siguiente = null;

    //-------- Metodos -------//
    public void setDato (Object dato){
        this.dato = dato;
    }
    public Object getDato (){
        return dato;
    }

    public void setSiguiente (Nodo nodo){
        this.siguiente = nodo;
    }

    public Nodo getSiguiente (){
        return siguiente;
    }
}
