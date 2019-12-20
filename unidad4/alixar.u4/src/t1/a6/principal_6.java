package t1.a6;

public class principal_6 {
    public static void main(String[] args) {
        banco_6 b1 = new banco_6( "Usureros S.A.","calle la que sea", 2.4);
        banco_6 b2 = new banco_6( "Avaros S.L.","la cueva de alibaba");
        b1.set_direccion("Calle falsa 123");
        b2.set_capital(3.7);
        CuentaCorriente_6 c1 = new CuentaCorriente_6( "Pedro picapiedra",  "7789j", b1);
        CuentaCorriente_6 c2 = new CuentaCorriente_6( "Anacleto Marrajo",  "666d");
        CuentaCorriente_6 c3 = new CuentaCorriente_6( "Carlos noseque",  "2433l", b1);
        c1.mostrar_informacion();
        System.out.println();
        c2.mostrar_informacion();
        System.out.println();
        c3.mostrar_informacion();
        System.out.println();
        c3.cambiar_banco( b2 );
        c3.mostrar_informacion();
    }

}
