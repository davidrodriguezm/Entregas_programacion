package t1.a4;

import java.util.Scanner;

public class principal_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        CuentaCorriente_4 c = new CuentaCorriente_4( "David", "666");
        System.out.println( "Introduce el nombre del banco" );
        String banco =  teclado.nextLine();
        c.banco(banco);
        System.out.println( c.nom_banco);
    }
}
