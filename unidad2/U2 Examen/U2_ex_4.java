import java.util.Scanner;

public class U2_ex_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero enteros positivos. Para terminar, introduzca un número primo");
        int numero = teclado.nextInt();
        int max = 0;
        int min = numero;
        int media = 0;
        int contador = 0;
        int almacenar = 0;
        boolean primo = false;
        while ( primo == false ) {
            if ( numero >= 0 ) {
                int contador_div = 0;
                for (int i = 1; i <= numero; i++) {
                    if (numero % i == 0) {
                        contador_div++;
                    }
                    primo = contador_div == 2 ? true : false;
                }
                if (primo) {
                    break;
                }
                contador++;
                almacenar = almacenar + numero;
                media = almacenar / contador;
                if (numero > max) {
                    max = numero;
                }
                if (numero < min) {
                    min = numero;
                }
                System.out.println("Ha introducido: " + contador + " números no primos");
                System.out.println("Máximo: " + max);
                System.out.println("Mínimo: " + min);
                System.out.println("Media: " + media);
                numero = teclado.nextInt();
            }
        }
    }
}
