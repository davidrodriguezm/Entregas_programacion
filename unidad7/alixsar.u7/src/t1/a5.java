package t1;

import java.util.TreeSet;

public class a5 {
    public static void main(String[] args) {
        TreeSet<Integer> conjunto = new TreeSet<>(new IntegerDecreciente());
         while ( conjunto.size() <= 20) {
             conjunto .add((int) (Math.random()*100));
        }
        System.out.println(conjunto);
    }
}
