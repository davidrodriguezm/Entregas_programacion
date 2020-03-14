package t2;

import java.util.ArrayList;
import java.util.List;

public class a13 {
    public static void main(String[] args) {
        List<Integer> lis_1 = new ArrayList<>();
        List<Integer> lis_2 = new ArrayList<>();
        for (int i = 0; i < 12; i+=2) {
            lis_1.add(i);
        }
        for (int i = 1; i < 15; i+=3) {
            lis_2.add(i);
        }
        System.out.println("lista 1:\n" + lis_1);
        System.out.println("lista 2:\n" + lis_2);
        List fusi = fusion(lis_1,lis_2);
        System.out.println("La fusion de las listas:\n" + fusi);
    }

    static List fusion(List<Integer> lis_1, List<Integer> lis_2) {
        List<Integer> lis_final = new ArrayList<>();
        int cont_1 = 0;
        int cont_2 = 0;
        while ( cont_1 < lis_1.size() && cont_2 < lis_2.size() ) {
            if( lis_1.get(cont_1) < lis_2.get(cont_2) ) {
                lis_final.add( lis_1.get(cont_1) );
                cont_1++;
            } else {
                lis_final.add( lis_2.get(cont_2) );
                cont_2++;
            }
        }
        while ( cont_1 < lis_1.size() ) {
            lis_final.add( lis_1.get(cont_1) );
            cont_1++;
        }
        while ( cont_2 < lis_2.size() ) {
            lis_final.add( lis_2.get(cont_2) );
            cont_2++;
        }
        return lis_final;
    }
}
