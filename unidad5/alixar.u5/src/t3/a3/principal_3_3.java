package t3.a3;

import t3.a2.ColaTabla;

public class principal_3_3 {
    public static void main(String[] args) {
        ColaLista cl = new ColaLista();
        for (int i = 1; i <= 10 ; i++) {
            cl.encolar(i);
        }
        cl.mostrar_informacion();
        for (int i = 1; i <= 5 ; i++) {
            System.out.println( cl.desencolar() );
        }
        cl.mostrar_informacion();
    }
}
