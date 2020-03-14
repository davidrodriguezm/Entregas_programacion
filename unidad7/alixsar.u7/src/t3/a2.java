package t3;

import java.util.HashMap;
import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        HashMap<Integer,String> m = new HashMap<>();
        m.put(calcular_clave("1234P"),"Ambrosio");
        m.put(calcular_clave("7788D"),"Ortensia");
        m.put(calcular_clave("4563J"),"Enriqueta");
        String dni = teclado.nextLine();
        int clave = calcular_clave(dni);
        if ( m.get(clave) != null ) {
            System.out.println(m.get(clave));
        } else {
            System.out.println("No se encuentra");
        }
    }

    public static int calcular_clave( String dni ) {
        int suma = 0;
        for (int i = 0; i < dni.length()-1 ; i++) {
            suma += Integer.parseInt(dni.substring(i, i+1));
        }
        return suma;
    }
}
