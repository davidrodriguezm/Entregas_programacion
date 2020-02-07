package t3.a2;

import java.util.Arrays;

public class ColaTabla implements Cola {
    private Integer[] tabla;
    private int num_elementos = 0;

    public ColaTabla() {
        tabla = new Integer[1];
    }

    @Override
    public void encolar( Integer nuevo_elem ) {
        if ( tabla.length <= num_elementos ) {
            tabla = Arrays.copyOf(tabla,tabla.length + 1);
        }
        tabla[num_elementos] = nuevo_elem;
        num_elementos++;
    }

    @Override
    public Integer desencolar() {
        Integer devolver = null;
        if ( num_elementos > 0) {
            devolver = tabla[0];
            Integer[] copia_tabla = new Integer[tabla.length];
            copia_tabla = Arrays.copyOf(tabla,tabla.length);
            for (int i = 1; i < tabla.length; i++) {
                tabla[i-1] = copia_tabla[i];
            }
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

    public String toString() {
        String cadena = "";
        for (int i = 0; i < num_elementos; i++) {
            cadena += tabla[i] + ", ";
        }
        return cadena;
    }

}
