package ar.edu.unlu.poo.listasDoble;

public class Lista {
    private Nodo inicio = null;
    private Nodo fin = null;
    private int cantidadNodos = 0;


    //-----Metodos-----//
    // Agregar elemento al final de la lista [append].
    public void agregarFinal (Object dato){

        Nodo nodo = new Nodo();
        nodo.setDato(dato);
        if (fin == null){
            fin = nodo;
            inicio = nodo;
            cantidadNodos++;
            return;
        }
        fin.setSiguiente(nodo);
        nodo.setAnterior(fin);
        fin = nodo;
        cantidadNodos ++;
    }

    // Retorna true si esta vacia
    public boolean esVacia (){ return (inicio == null); }

    // La longitud se modifica en cada alteracion de la lista, por lo tanto no necesita ser calculada
    public void longitud(){
        System.out.println("La lista tiene una longitud de " + cantidadNodos + " nodos");
    }

    // Elimina el primer nodo que coincida con el dato recibido como parametro
    public void eliminar (Object dato){
        if ( esVacia() ){ //vacia salgo
            return;
        }

        if (inicio.getDato() == dato){ //si el nodo a eliminar es el primero asigno inicio al segundo nodo
            inicio = inicio.getSiguiente();
            inicio.setAnterior(null);
            cantidadNodos --;
            return;
        }


        Nodo auxiliar = inicio.getSiguiente();
        while (auxiliar != null && auxiliar.getDato() != dato){
            auxiliar = auxiliar.getSiguiente();
        }
        if (auxiliar != null){
            //enlazo nodo anterior al eliminado con su siguiente a <-> b <-> c  |  a --(b)--> c
            ( auxiliar.getAnterior() ).setSiguiente(auxiliar.getSiguiente() );
            //enlazo nodo siguiente al eliminado con su anterior a <-> b <-> c  |  a <--(b)-- c
            if ( auxiliar.getSiguiente() != null ){
                ( auxiliar.getSiguiente() ).setAnterior(auxiliar.getAnterior() );
            }
            cantidadNodos --;
        }

    }

    public Object recuperar (int posicion){
        if (posicion > cantidadNodos){
            return null;
        } else {
            int i = 1;
            Nodo auxiliar = inicio;
            while (i < posicion){
                auxiliar = auxiliar.getSiguiente();
                i++;
            }
            return auxiliar.getDato();
        }
    }

    public void insertarIndexado (int posicion, Object dato){
        if (posicion > cantidadNodos+1){
            System.out.println("El indice ingresado excede al ultimo elemento de la lista (" + cantidadNodos + ("). Intente de nuevo sin exceder ese numero."));
            return;
        }else if(posicion == cantidadNodos+1){
            agregarFinal(dato);
        }else {
            int i = 1;
            Nodo auxiliar = inicio;
            Nodo nuevo = new Nodo();
            while (i < (posicion) ){
                auxiliar = auxiliar.getSiguiente();
                i++;
            }
            nuevo.setDato(dato);
            nuevo.setSiguiente( auxiliar );
            nuevo.setAnterior( auxiliar.getAnterior() );
            if ( auxiliar.getAnterior() != null ){
            (auxiliar.getAnterior() ).setSiguiente( nuevo );
            }
            if ( auxiliar.getSiguiente() != null ){
                ( auxiliar.getSiguiente() ).setAnterior( nuevo );
            }

        }
    }
    public void mostrar() {
        Nodo auxiliar = inicio;
        while (auxiliar != null) {
            System.out.print(auxiliar.getDato() + " -> ");
            auxiliar = auxiliar.getSiguiente();
        }
        System.out.println("/null/ fin de lista");
    }
}