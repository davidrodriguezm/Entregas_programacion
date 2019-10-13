import java.util.Scanner;

public class E8_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce numero para hallar su factorial");
        int numero = teclado.nextInt();
        int i;
        int factorial = 1;
        for (i = numero; i >= 1; i--){
            factorial = factorial * i;
        }
        System.out.println("su factorial es " + factorial);
    }
}
