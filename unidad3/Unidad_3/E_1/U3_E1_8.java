import java.util.Scanner;

public class U3_E1_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero para saber sus vivisores primos");
        int numero = teclado.nextInt();
        System.out.println("El numero tiene: " + es_primo(numero) + " divisores primos");
    }
    static int es_primo(int numero) {
        int div_primo = 0;
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
                        div_primo++;
                    }
                }
            }
        }
        return div_primo;
    }
}
