package t2.a1;

import java.util.Arrays;

public class lista_1 {
    private int num_elementos;
    private Integer[] lista;

    public lista_1() {
        num_elementos= 0;
        lista = new Integer[10];
    }
    public lista_1( int tama_lista ) {
        num_elementos= 0;
        lista = new Integer[tama_lista];
    }
    public int numero_elementos() {
        return num_elementos;
    }
    public void ajustar_lista() {
        if ( lista.length <= num_elementos ) {
            lista = Arrays.copyOf(lista,lista.length + 1);
        }
    }
    public void inser_final( Integer nuevo_elem ) {
        ajustar_lista();
        if ( lista[ 0 ] == null ) {
            lista[ 0 ] = nuevo_elem;
            num_elementos++;
        } else {
            lista[ num_elementos ] = nuevo_elem;
            num_elementos++;
        }
    }
    public void inser_principio( Integer nuevo_elem ) {
        ajustar_lista();
        if ( lista[0] == null ) {
            lista[0] = nuevo_elem;
            num_elementos++;
        } else {
            Integer[] copy_lista = Arrays.copyOf(lista, lista.length);
            for (int i = 0; i < lista.length - 1; i++) {
                lista[i + 1] = copy_lista[i];
            }
            lista[0] = nuevo_elem;
            num_elementos++;
        }
    }
    public void inser_indice( Integer nuevo_elem, int indice ) {
        ajustar_lista();
        if ( indice <= num_elementos && indice >= 0 ) {
            Integer[] copy_lista = new Integer[lista.length];
            for (int i = 0; i < indice; i++) {
                copy_lista[i] = lista[i];
            }
            copy_lista[indice] = nuevo_elem;
            for (int i = indice + 1; i < copy_lista.length ; i++) {
                copy_lista[i] = lista[i - 1];
            }
            lista = Arrays.copyOf(copy_lista, copy_lista.length);
            num_elementos++;
        } else {
            System.out.println("Indice fuera de rango, rango de " + 0 + " a " + (num_elementos));
        }
    }
    public void eliminar_indice( int indice ) {
        if ( indice <= num_elementos && indice >= 0 ) {
            Integer[] copy_lista = new Integer[lista.length];
            for (int i = 0; i < indice; i++) {
                copy_lista[i] = lista[i];
            }
            for (int i = indice + 1; i < lista.length ; i++) {
                copy_lista[i - 1] = lista[i];
            }
            lista = Arrays.copyOf(copy_lista, copy_lista.length);
            num_elementos--;
        } else {
            System.out.println("Indice fuera de rango ");
        }
    }
    public void inser_lista( Integer[] nueva_lista) {
        lista = Arrays.copyOf(lista,(lista.length + nueva_lista.length));
        int cont_lista = num_elementos;
        int cont_nueva_lista = 0;
        while ( cont_lista < lista.length && cont_nueva_lista < nueva_lista.length) {
            lista[cont_lista] = nueva_lista[cont_nueva_lista];
            num_elementos++;
            cont_lista++;
            cont_nueva_lista++;
        }
    }

    public int get_indice( int indice ) {
        Integer devuelve = null;
        if ( indice <= num_elementos && indice >= 0 ) {
            devuelve = lista[ indice ];
        }
        return devuelve;
    }
    public int buscar_indice( Integer buscar ) {
        int indice = -1;
        for (int i = 0; i <num_elementos ; i++) {
            if ( lista[i].equals(buscar) ) {
                indice = i;
            }
        }
        return indice;
    }
    public String mostrar_cadena() {
        String cadena = "";
        for (int i = 0; i < num_elementos; i++) {
            cadena += lista[i] + "  ";
        }
        return cadena;
    }
    public void mostrar_informacion() {
        for (int i = 0; i < lista.length ; i++) {
            if ( lista[i] == null) {
                break;
            }
            System.out.print("Posicion " + i + ": ");
            System.out.println( lista[i]);
        }
    }
}
