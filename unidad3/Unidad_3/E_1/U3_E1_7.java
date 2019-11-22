import java.util.Scanner;

public class U3_E1_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero para saber si es primo");
        int numero = teclado.nextInt();
        if (es_primo(numero)) {
            System.out.println("Es primo");
        } else {
            System.out.println("No es primo");
        }
    }
    static boolean es_primo(int numero) {
        boolean primo = false;
        int contador = 0;
        for (int i = 1; i <= numero ; i++) {
            if (numero % i == 0) {
                contador++;
            }
            primo = contador == 2 ? true : false;
        }
        return primo;
    }
}
