import java.util.Scanner;

public class U3_E1_9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero para saber sus vivisores primos");
        int numero = teclado.nextInt();
        System.out.println("Los divisores primos son: ");
        es_primo(numero);
    }
    static void es_primo(int numero) {
        for (int dividiendo = 2; dividiendo <= numero ; dividiendo++) {
            int divisor = 0;
            if (numero % dividiendo == 0) {
                divisor = dividiendo;
                int contador = 0;
                for (int primos = 1; primos <= divisor ; primos++) {
                    if (divisor % primos == 0) {
                        contador++;
                    }
                    if (contador == 2 && primos == divisor) {
                        System.out.println( divisor);
                    }
                }
            }
        }
    }
}
