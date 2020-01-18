import java.util.Scanner;

public class E2_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿grados centígrados? ");
        int centígrados = teclado.nextInt();
        System.out.print(" son ");
        System.out.print(9*centígrados/5 + 32);
        System.out.print(" grados Fahrenheit");
    }
}
