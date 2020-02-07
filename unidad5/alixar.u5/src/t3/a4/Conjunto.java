package t3.a4;

import t3.a3.Lista_3;

public class Conjunto {
    private Lista_3 lista_conjunto;

    public Conjunto( int tama_conjunto ) {
        lista_conjunto = new Lista_3(tama_conjunto);
    }

    public Conjunto() {
        lista_conjunto = new Lista_3();
    }

    public int getNum_elementos() {
        return lista_conjunto.get_numero_elementos();
    }

    public void insertar_elemento( Integer elemento ) {
        int esta = lista_conjunto.buscar_indice(elemento);
        if ( esta < 0 ) {
            lista_conjunto.inser_final(elemento);
        } else {
            System.out.println( "El elemento " + elemento + " ya esta en el conjunto" );
        }
    }

    public void insertar_conjunto( Conjunto otro_conjunto ) {
        int elem_otro = otro_conjunto.getNum_elementos();
        for (int i = 0; i < elem_otro; i++) {
            insertar_elemento( otro_conjunto.lista_conjunto.get_elemento(i));
        }
    }


    public void eliminar_elemento( Integer elemento ) {
        int esta = lista_conjunto.buscar_indice(elemento);
        if ( esta >= 0 ) {
            lista_conjunto.eliminar_indice(esta);
        } else {
            System.out.println( "El elemento no esta en el conjunto" );
        }
    }

    public void eleminar_conjunto( Conjunto otro_conjunto ) {
        int elem_otro = otro_conjunto.getNum_elementos();
        for (int i = 0; i < elem_otro; i++) {
            eliminar_elemento( otro_conjunto.lista_conjunto.get_elemento(i));
        }
    }

    public void buscar_elemento( Integer elemento ) {
        int esta = lista_conjunto.buscar_indice(elemento);
        if ( esta >= 0 ) {
            System.out.println( "El elemento esta en el conjunto" );
        } else {
            System.out.println( "El elemento no esta en el conjunto" );
        }
    }

    public String toString() {
        return lista_conjunto.toString();
    }

}
