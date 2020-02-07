package t3.a1;

import java.util.Arrays;
import java.util.Comparator;

public class principal_3_1 {
    public static void main(String[] args) {
        Integer[] t1 = new Integer[20];
        for (int i = 0; i < 20; i++) {
            t1[i] = ((int) (Math.random() * 99) + 1);
        }
        Arrays.sort(t1, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int resultado = 0;
                Integer e1 = (Integer) o1;
                Integer e2 = (Integer) o2;
                if ( e1 < e2) {
                    resultado = 1;
                } else if (e1 > e2) {
                    resultado = -1;
                }
                return resultado;
            }
        });
        System.out.println("Ordenado descendente:");
        System.out.println(Arrays.toString(t1));
    }
}
