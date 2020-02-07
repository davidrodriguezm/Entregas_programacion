package t2.a1;

import java.util.Arrays;

public class PilaTabla implements Pila {
    private Integer[] tabla;
    private int num_elementos = 0;

    public PilaTabla() {
        tabla = new Integer[1];
    }

    @Override
    public void apilar( Integer nuevo_elem ) {
        if ( tabla.length <= num_elementos ) {
            tabla = Arrays.copyOf(tabla,tabla.length + 1);
        }
        tabla[num_elementos] = nuevo_elem;
        num_elementos++;
    }

    @Override
    public Integer desapilar() {
        Integer devolver = null;
        if ( num_elementos > 0) {
            devolver = tabla[num_elementos - 1];
            tabla = Arrays.copyOf(tabla, num_elementos - 1);
            num_elementos--;
        }
        return devolver;
    }
    public void mostrar_informacion() {
        for (int i = 0; i < num_elementos ; i++) {
            System.out.print("Posicion " + i + ": ");
            System.out.println( tabla[i]);
        }
    }
}
