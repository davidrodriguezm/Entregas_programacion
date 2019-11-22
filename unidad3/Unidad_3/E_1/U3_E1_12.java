import java.util.Scanner;

public class U3_E1_12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero para saber su factorial");
        int numero = teclado.nextInt();
        System.out.println("El factorial es: " + factorial(numero));
    }
    static int factorial(int numero) {
        int resultado;
        if ( numero == 0) {
            return 1;
        }
        else {
            resultado = numero * factorial(numero -1);
        }
        return resultado;
    }
}
