package t2.a1;

public class principal_2_1 {
    public static void main(String[] args) {
        Pila pt = new PilaTabla();
        int num_elementos = 10;
        for (int i = 1; i <= num_elementos ; i++) {
            pt.apilar(i);
        }
        System.out.println("La tabla en orden inverso ");
        for (int i = 1; i <= num_elementos ; i++) {
            System.out.println( pt.desapilar() );
        }
        pt = new PilaLista();
        System.out.println("La lista en orden inverso ");
        for (int i = 1; i <= num_elementos ; i++) {
            pt.apilar(i);
        }
        for (int i = 1; i <= num_elementos ; i++) {
            System.out.println( pt.desapilar() );
        }
    }
}
