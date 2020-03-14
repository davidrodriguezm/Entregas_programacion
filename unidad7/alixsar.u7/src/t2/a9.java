package t2;

import java.util.HashSet;
import java.util.Set;

public class a9 {
    public static void main(String[] args) {
        Set<Integer> con_1 = new HashSet<>();
        Set<Integer> con_2 = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            con_1.add(i);
        }
        for (int i = 2; i < 10; i++) {
            con_2.add(i);
        }
        System.out.println("Conjunto 1:\n" + con_1);
        System.out.println("Conjunto 2:\n" + con_2);
        Set unidos = union(con_1,con_2);
        System.out.println("La union de los conjuntos:\n" + unidos);
    }

    static Set union(Set conjunto1, Set conjunto2) {
        conjunto1.addAll(conjunto2);
        return conjunto1;
    }
}
