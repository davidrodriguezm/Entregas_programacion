package t3.a5;

import t3.a3.Lista_3;

public class Conjunto_5 {
    private Lista_3 lista_conjunto;

    public Conjunto_5(int tama_conjunto ) {
        lista_conjunto = new Lista_3(tama_conjunto);
    }

    public Conjunto_5() {
        lista_conjunto = new Lista_3();
    }

    public int getNum_elementos() {
        return lista_conjunto.get_numero_elementos();
    }

    public void insertar_elemento( Integer elemento ) {
        int esta = lista_conjunto.buscar_indice(elemento);
        if ( esta < 0 ) {
            lista_conjunto.inser_final(elemento);
        }
    }

    public void insertar_conjunto( Conjunto_5 otro_conjunto ) {
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

    public void eleminar_conjunto( Conjunto_5 otro_conjunto ) {
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

    static boolean incluido( Conjunto_5 c1, Conjunto_5 c2 ) {
        int elem_c1 = c1.getNum_elementos();
        int cont_elem_c1 = 0;
        for (int i = 0; i < elem_c1; i++) {
            int esta = c2.lista_conjunto.buscar_indice(c1.lista_conjunto.get_elemento(i));
            if ( esta >= 0 ) {
                cont_elem_c1++;
            }
        }
        if ( cont_elem_c1 == elem_c1 ) {
            return true;
        } else {
            return false;
        }
    }

    static Conjunto_5 union( Conjunto_5 c1, Conjunto_5 c2 ) {
        Conjunto_5 c3 = new Conjunto_5();
        c3.insertar_conjunto(c1);
        c3.insertar_conjunto(c2);
        return c3;
    }

    static Conjunto_5 interseccion(Conjunto_5 c1, Conjunto_5 c2) {
        Conjunto_5 c3 = new Conjunto_5();
        int elem_c1 = c1.getNum_elementos();
        for (int i = 0; i < elem_c1; i++) {
            int esta = c2.lista_conjunto.buscar_indice(c1.lista_conjunto.get_elemento(i));
            if ( esta >= 0 ) {
                c3.insertar_elemento(c1.lista_conjunto.get_elemento(i));
            }
        }
        return c3;
    }

    static Conjunto_5 diferencia(Conjunto_5 c1, Conjunto_5 c2) {
        Conjunto_5 c3 = new Conjunto_5();
        int elem_c1 = c1.getNum_elementos();
        for (int i = 0; i < elem_c1; i++) {
            int esta = c2.lista_conjunto.buscar_indice(c1.lista_conjunto.get_elemento(i));
            if ( esta < 0 ) {
                c3.insertar_elemento(c1.lista_conjunto.get_elemento(i));
            }
        }
        return c3;
    }
}
