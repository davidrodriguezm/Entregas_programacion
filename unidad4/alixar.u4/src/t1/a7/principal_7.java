package t1.a7;

public class principal_7 {
    public static void main(String[] args) {
        sincronizador_7 s1 = new sincronizador_7( 106.5);
        s1.display();
        s1.up();
        s1.up();
        s1.up();
        s1.up();
        s1.display();
        sincronizador_7 s2 = new sincronizador_7( 81);
        s2.down();
        s2.down();
        s2.down();
        s2.down();
        s2.display();
    }
}
