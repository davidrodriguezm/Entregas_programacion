package t3;

import java.util.HashMap;

public class a1 {
    public static void main(String[] args) {
        HashMap<Integer,String> m = new HashMap<>();
        m.put(calcular_clave("1234P"),"Ambrosio");
        m.put(calcular_clave("7788D"),"Ortensia");
        m.put(calcular_clave("4563J"),"Enriqueta");
        System.out.println(m);
    }

    public static int calcular_clave( String dni ) {
        int suma = 0;
        for (int i = 0; i < dni.length()-1 ; i++) {
            suma += Integer.parseInt(dni.substring(i, i+1));
        }
        return suma;
    }
}
