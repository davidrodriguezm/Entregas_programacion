package t1.a1;

public class principal {
    public static void main(String[] args) {
        CuentaCorriente c = new CuentaCorriente( "David", "666");
        c.mostrar_informacion();
        c.ingresar_dinero( 100);
        c.mostrar_informacion();
        if (c.sacar_dinero( 60)) {
            System.out.println( "Desde el principal, se saco dinero");
        } else {
            System.out.println( "Desde el principal, no se pudo sacar dinero");
        }
        c.mostrar_informacion();
        if (c.sacar_dinero( 95)) {
            System.out.println( "Desde el principal, se saco dinero");
        } else {
            System.out.println( "Desde el principal, no se pudo sacar dinero");
        }
        c.mostrar_informacion();
    }
}
