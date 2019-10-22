import java.util.Scanner;

public class Adicional_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("introduce un número saver su cuadrado y cubo ");
        int numero = teclado.nextInt();
        int i, z;
        for (i = (numero +1); i <= (numero +6); i++) {
            System.out.println( i + " el cuadrado = " + Math.pow(i,2) + " el cubo = " + Math.pow(i,3));

        }

    }
}
