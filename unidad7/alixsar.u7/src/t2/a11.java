package t2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class a11 {
    public static void main(String[] args) {
        Set<Integer> con_1 = new HashSet<>();
        Set<Integer> con_2 = new HashSet<>();
        for (int i = -1; i < 5; i++) {
            con_1.add(i);
        }
        for (int i = 2; i < 10; i++) {
            con_2.add(i);
        }
        System.out.println("Conjunto 1:\n" + con_1);
        System.out.println("Conjunto 2:\n" + con_2);
        Set dife = diferencia(con_1,con_2);
        System.out.println("La diferencia de los conjuntos:\n" + dife);
    }

    static Set diferencia(Set conjunto1, Set conjunto2) {
        Set inter = new HashSet();
        for (Iterator<Object> iter = conjunto1.iterator(); iter.hasNext(); ) {
            Object elemento = iter.next();
            if ( !conjunto2.contains(elemento) ) {
                inter.add(elemento);
            }
        }
        return inter;
    }
}
