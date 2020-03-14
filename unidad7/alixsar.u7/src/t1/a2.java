package t1;

import java.util.ArrayList;
import java.util.Collections;

public class a2 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            lista.add((int) (Math.random()*100));
        }
        System.out.println(lista);
        IntegerDecreciente dec = new IntegerDecreciente();
        Collections.sort(lista, dec);
        System.out.println("La lista ordenada descendente:");
        System.out.println(lista);
    }
}
