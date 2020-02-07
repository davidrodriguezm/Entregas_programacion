package t3.a4;

public class principal_3_4 {
    public static void main(String[] args) {
        Conjunto c1 = new Conjunto();
        Conjunto c2 = new Conjunto(6);
        for (int i = 1; i <= 10 ; i++) {
            c1.insertar_elemento(i);
        }
        System.out.println("Conjunto 1: " + c1.toString());
        for (int i = 0; i <= 10 ; i += 3) {
            c1.eliminar_elemento(i);
        }
        System.out.println("Conjunto 1: " + c1.toString());
        for (int i = 8; i <= 15 ; i++) {
            c2.insertar_elemento(i);
        }
        System.out.println( "Conjunto 2: " +c2.toString() );
        c1.insertar_conjunto(c2);
        System.out.println("Conjunto 1: " + c1.toString());
        System.out.println("Se eliminan los elementos del Conjunto 2");
        c1.eleminar_conjunto(c2);
        System.out.println("Conjunto 1: " + c1.toString());
        System.out.println( "El numero de elementos del conjunto 1 es: " + c1.getNum_elementos() );
    }
}
