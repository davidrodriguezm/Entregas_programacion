package t2.a2;

import java.util.Arrays;

public class PilaTabla_2 {
    private Integer[] tabla;
    private int num_elementos = 0;

    public PilaTabla_2() {
        tabla = new Integer[1];
    }
    public void ajustar_lista() {
        if ( tabla.length <= num_elementos ) {
            tabla = Arrays.copyOf(tabla,tabla.length + 1);
        }
    }
    public void apilar( Integer nuevo_elem ) {
        ajustar_lista();
        if ( tabla[ 0 ] == null ) {
            tabla[ 0 ] = nuevo_elem;
            num_elementos++;
        } else {
            tabla[ num_elementos ] = nuevo_elem;
            num_elementos++;
        }
    }
    public void desapilar() {
        tabla = Arrays.copyOf(tabla, num_elementos - 1);
        num_elementos--;
    }
    public void mostrar_informacion() {
        for (int i = 0; i < tabla.length ; i++) {
            if ( tabla[i] == null) {
                break;
            }
            System.out.print("Posicion " + i + ": ");
            System.out.println( tabla[i]);
        }
    }
}
