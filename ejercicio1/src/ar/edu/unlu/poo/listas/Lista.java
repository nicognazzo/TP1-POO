package ar.edu.unlu.poo.listas;

public class Lista {
    private Nodo inicio = null;
    private int cantidadNodos = 0;

    //-----Metodos-----//
    // Agregar elemento al final de la lista [append].
    public void agregarFinal (Object dato){
        Nodo nodo = new Nodo();
        nodo.setDato(dato);

        if (inicio == null){
            inicio = nodo;
        } else {
            Nodo nodoAux = inicio;
            while (nodoAux.haySiguiente() ){
                nodoAux = nodoAux.getSiguiente();
            }
            nodoAux.setSiguiente(nodo);
        }
        cantidadNodos ++;
    }

    // Retorna true si esta vacia
    public boolean esVacia (){
        return !(inicio.haySiguiente());
    }

    // La longitud se modifica en cada alteracion de la lista, por lo tanto no necesita ser calculada
    public void longitud(){
        System.out.println("La lista tiene una longitud de " + cantidadNodos + " nodos");
    }

    // Elimina el primer nodo que coincida con el dato recibido como parametro
    public void eliminar (Object dato){
        if ( !esVacia() ){ //vacia salgo
            return;
        }

        if (inicio.getDato() == dato){ //si el nodo a eliminar es el primero asigno inicio al segundo nodo
            inicio = inicio.getSiguiente();
            cantidadNodos --;
            return;
        }

        Nodo anterior = inicio;
        Nodo auxiliar = inicio.getSiguiente();
        while (auxiliar != null && auxiliar.getDato() != dato){
            anterior = anterior.getSiguiente();
            auxiliar = auxiliar.getSiguiente();
        }
        if (auxiliar != null){
            anterior.setSiguiente(auxiliar.getSiguiente());
            cantidadNodos --;
        }

    }

    public Object recuperar (int posicion){
        if (posicion > cantidadNodos){
            return null;
        } else {
            int i = 2;
            Nodo auxiliar = inicio;
            Nodo siguiente;
            while (i < posicion){
                auxiliar = auxiliar.getSiguiente();
                i++;
            }
            siguiente = auxiliar.getSiguiente(); //el que tengo que devolver
            auxiliar.setSiguiente( siguiente.getSiguiente() ); //anterior apunta dos mas adelante y el nodo a recuperar deja de existir
            return siguiente.getDato();
        }
    }

    public void insertarIndexado (int posicion, Object dato){
        if (posicion > cantidadNodos){
            System.out.println("El indice ingresado excede al ultimo elemento de la lista (" + cantidadNodos + ("). Intente de nuevo sin exceder ese numero."));
            return;
        } else {
            int i = 1;
            Nodo auxiliar = inicio;
            Nodo siguiente = new Nodo();
            while (i < (posicion - 1) ){
                auxiliar = auxiliar.getSiguiente();
                i++;
            }
            siguiente.setSiguiente( auxiliar.getSiguiente() );
            siguiente.setDato(dato);
            auxiliar.setSiguiente(siguiente);
        }
    }
    public void mostrar() {
        Nodo auxiliar = inicio;
        while (auxiliar != null) {
            System.out.print(auxiliar.getDato() + " -> ");
            auxiliar = auxiliar.getSiguiente();
        }
        System.out.println("// null // fin de lista");
    }
}
