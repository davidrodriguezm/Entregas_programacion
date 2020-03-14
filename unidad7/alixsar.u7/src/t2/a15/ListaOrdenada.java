package t2.a15;

import java.util.Comparator;
import java.util.LinkedList;

class ListaOrdenada<E> extends LinkedList<E> {
    private Comparator<E> comparador;

    public ListaOrdenada(Comparator<E> comparador) {
        super();
        this.comparador = comparador;
    }

    public void inserOrdenada( E elemento ) {
        if ( size() == 0 ) {
            add(elemento);
        } else {
            int indice = 0;
            while ( indice < size() && comparador.compare(elemento, get(indice)) > 0 ) {
                indice++;
            }
            add(indice, elemento);
        }
//        add(elemento);
//        sort(comparador);
    }

}
