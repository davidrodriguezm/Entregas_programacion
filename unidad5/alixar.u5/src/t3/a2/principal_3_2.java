package t3.a2;

public class principal_3_2 {
    public static void main(String[] args) {
        ColaTabla ct = new ColaTabla();
        for (int i = 1; i <= 10 ; i++) {
                ct.encolar(i);
        }
        ct.mostrar_informacion();
        for (int i = 1; i <= 5 ; i++) {
            System.out.println( ct.desencolar() );
        }
        ct.mostrar_informacion();
    }
}
