package t1.a2;



public class principal_2 {
    public static void main(String[] args) {
        CuentaCorriente_2 c1 = new CuentaCorriente_2( "David", "666");
        CuentaCorriente_2 c2 = new CuentaCorriente_2(100, 0, "46474g");
        CuentaCorriente_2 c3 = new CuentaCorriente_2(500, 0, "6723j");
        c1.mostrar_informacion();
        System.out.println();
        c2.mostrar_informacion();
        System.out.println();
        c3.mostrar_informacion();
        System.out.println();
    }
}
