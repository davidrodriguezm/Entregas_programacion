import java.util.Scanner;

public class E8_15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce un numero para saber cuantos números primos hay entre 1 y ese numero ");
        int numero = teclado.nextInt();
        int i, z, divisor;
        for (i = 2; i <= numero; i++) {
            divisor = 0;
            for (z = 2; z <= i; z++) {
                if ( i % z ==0 ){
                   divisor++;
                }
            }
            if (divisor == 1){
                System.out.println("es primo " + i);
            }
        }
    }
}
