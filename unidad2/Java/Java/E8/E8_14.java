import java.util.Scanner;

public class E8_14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce un numero para dibujar un triangulo ");
        int numero = teclado.nextInt();
        int i, z;
        for (i = numero; i >= 1; i--) {
            for (z = 1; z <= i; z++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
