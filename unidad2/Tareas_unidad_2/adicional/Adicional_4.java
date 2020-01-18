import java.util.Scanner;

public class Adicional_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int negativo = 0;
        int positivo = 0;
        int i = 1;
        while (i <= 10) {
            System.out.println("introduce un número");
            int numero = teclado.nextInt();
            if ( numero > 0 ) {
                positivo++;
            }
            if ( numero < 0 ) {
                negativo++;
            }
            i++;
        }
        System.out.println("hay "  + positivo);
        System.out.println("hay "  + negativo);
    }
}
