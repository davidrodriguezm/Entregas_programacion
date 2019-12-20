package t1.a8;

public class principal_8 {
    public static void main(String[] args) {
        bombilla_8 b1 = new bombilla_8();
        bombilla_8 b2 = new bombilla_8();
        b1.enciende();
        b2.enciende();
        System.out.println("b1: " + b1.estado());
        System.out.println("b2: " + b2.estado());
        b2.apaga();
        System.out.println("b2: " + b2.estado());
        bombilla_8.i_general = false;
        System.out.println("Se corta la corriente usando el IG");
        System.out.println("b1: " + b1.estado());
        System.out.println("b2: " + b2.estado());
        bombilla_8.i_general = true;
        System.out.println("Se reestablece la corriente usando el IG");
        System.out.println("b1: " + b1.estado());
        System.out.println("b2: " + b2.estado());
    }
}
