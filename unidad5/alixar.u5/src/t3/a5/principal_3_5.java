package t3.a5;

import t3.a4.Conjunto;

public class principal_3_5 {
    public static void main(String[] args) {
        Conjunto_5 c1 = new Conjunto_5();
        Conjunto_5 c2 = new Conjunto_5(6);
        for (int i = 1; i <= 5 ; i++) {
            c1.insertar_elemento(i);
        }
        System.out.println("Conjunto 1: " + c1);

        for (int i = 1; i <= 10 ; i++) {
            c2.insertar_elemento(i);
        }
        System.out.println( "Conjunto 2: " + c2 );
        System.out.println("Conjunto 1 esta incluido en el cojunto 2: " + c1.incluido( c1, c2));
        Conjunto_5 c3 = new Conjunto_5();
        for (int i = 3; i <= 15 ; i+=3) {
            c3.insertar_elemento(i);
        }
        System.out.println( "Conjunto 3: " + c3 );
        System.out.println("Conjunto 2 esta incluido en el cojunto 3: " + c2.incluido( c2, c3));
        System.out.println("Conjunto 1 y el 3 unidos: " + c1.union( c1, c3 ) );
        System.out.println("Elementos comunes del conjunto 2 y en el cojunto 3: " + c2.interseccion( c2, c3));
        System.out.println("Elementos que estan en el conjunto 2 y no en el cojunto 3: "
                + c2.diferencia( c2, c3));
    }
}
