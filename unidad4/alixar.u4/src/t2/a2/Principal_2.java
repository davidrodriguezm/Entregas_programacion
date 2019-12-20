package t2.a2;

public class Principal_2 {
    public static void main(String[] args) {
        PilaTabla_2 pila = new PilaTabla_2();
        pila.apilar( 1);
        pila.apilar( 2);
        pila.apilar( 3);
        pila.apilar( 4);
        pila.apilar( 5);
        pila.apilar( 6);
        pila.apilar( 7);
        pila.mostrar_informacion();
        System.out.println();
        pila.desapilar();
        pila.desapilar();
        pila.desapilar();
        pila.mostrar_informacion();
    }
}
