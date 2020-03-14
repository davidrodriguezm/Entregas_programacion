package t3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class a3 {
    public static void main(String[] args) {
        HashMap<Integer,String> m = new HashMap<>();
        m.put(calcular_clave("1234P"),"Ambrosio");
        m.put(calcular_clave("7788D"),"Ortensia");
        m.put(calcular_clave("4563J"),"Enriqueta");
        System.out.println(m);
        Set<Map.Entry<Integer,String>> clave_valor = m.entrySet();
        for ( Iterator<Map.Entry<Integer,String>> ite = clave_valor.iterator(); ite.hasNext(); ) {
            Map.Entry<Integer,String> tem = ite.next();
            System.out.println("La clave " + tem.getKey() +  " está asociada al nombre " + tem.getValue());
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
