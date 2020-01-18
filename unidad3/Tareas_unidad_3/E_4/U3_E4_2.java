import java.util.Scanner;

public class U3_E4_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántos números deseas introducir?");
        int cantidad = teclado.nextInt();
        int[] numeros = new int[cantidad];
        System.out.println("Introduce " + cantidad + " numeros");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = teclado.nextInt();
        }
        for (int j = numeros.length -1; j >= 0 ; j--) {
            System.out.println(numeros[j]);
        }
    }
}
