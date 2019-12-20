package t1.a5;


public class principal_5 {
    public static void main(String[] args) {
        texto_5 t = new texto_5("HOLA que pasa");
        t.cara_principio( '4');
        t.cara_final('y');
        t.cade_principio("e");
        t.cade_final("lololo");
        t.mostrar();
        System.out.println("Hay " + t.cont_vocales() + " vocales");

    }
}
