package ar.edu.unlu.poo.listasDoble;

public class Nodo {
    private Object dato;
    private Nodo siguiente = null;
    private Nodo anterior = null;

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

    public boolean haySiguiente (){
        return (siguiente != null);
    }
    public void setAnterior (Nodo nodo){
        this.anterior = nodo;
    }

    public Nodo getAnterior (){
        return anterior;
    }
}