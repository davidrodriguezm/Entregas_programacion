import java.util.Scanner;

public class E8_4 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce un numero  para contar asta el desde 1");
        int numero = teclado.nextInt();
        int para;
        for (para = 1; para <= numero ; para++){
            System.out.println( para );
        }
        for (para = 1; para >= numero ; para--) {
            System.out.println(para);
        }
    }
}
