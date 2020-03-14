package t1;

import java.util.TreeSet;

public class a3 {
    public static void main(String[] args) {
        TreeSet<Integer> conj = new TreeSet<>(new IntegerDecreciente());
        while ( conj.size() < 20 ) {
            conj.add( (int) (Math.random()*100) );
        }
        System.out.println("El conjunto ordenado descendente:");
        System.out.println(conj);
    }
}
