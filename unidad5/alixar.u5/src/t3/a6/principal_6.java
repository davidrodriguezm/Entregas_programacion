package t3.a6;

import t3.a2.Cola;
import t3.a2.ColaTabla;
import t3.a3.ColaLista;

public class principal_6 {
    public static void main(String[] args) {
        Cola ct = new ColaTabla();
        for (int i = 1; i <= 10 ; i++) {
            ct.encolar(((int) (Math.random() * 99) + 1));
        }
        System.out.println("La tabla:");
        for (int i = 1; i <= 10 ; i++) {
            System.out.print( ct.desencolar() + "  ");
        }
        System.out.println();
        System.out.println("La lista:");
        Cola cl = new ColaLista();
        for (int i = 1; i <= 10 ; i++) {
            cl.encolar(((int) (Math.random() * 99) + 1));
        }
        for (int i = 1; i <= 10 ; i++) {
            System.out.print( cl.desencolar() + "  " );
        }
    }
}
