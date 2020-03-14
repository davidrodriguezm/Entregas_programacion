package t2;

import java.util.HashSet;
import java.util.Set;

public class a12 {
    public static void main(String[] args) {
        Set<Integer> con_1 = new HashSet<>();
        Set<Integer> con_2 = new HashSet<>();
        for (int i = 1; i < 5; i++) {
            con_1.add(i);
        }
        for (int i = 1; i < 10; i++) {
            con_2.add(i);
        }
        System.out.println("Conjunto 1:\n" + con_1);
        System.out.println("Conjunto 2:\n" + con_2);
        System.out.println("Conjunto 1 incluido en el Conjunto 2: " + incluido(con_1,con_2));
        System.out.println("Conjunto 2 incluido en el Conjunto 1: " + incluido(con_2,con_1));
    }

    static boolean incluido(Set conjunto1, Set conjunto2) {
        return conjunto2.containsAll(conjunto1);
    }
}
