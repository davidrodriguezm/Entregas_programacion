import java.util.Scanner;

public class U3_E4_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántos números deseas introducir?");
        int digitos = teclado.nextInt();
        int[] clave = new int[digitos];
        int[] adivinar = new int[digitos];
        boolean acierto = false;
        for (int i = 0; i < digitos; i++) {
            int aleatorio = (int) Math.floor(Math.random()* 5 + 1);
            clave[i] = aleatorio;
        }
        System.out.println("La longitud de la clave es: " + clave.length + " son numeros son del 1 al 5");
        do {
            System.out.println("Intente acertarla");
            int contador = 0;
            for (int j = 0; j < digitos; j++) {
                adivinar[j] = teclado.nextInt();
            }
            for (int compara = 0; compara < digitos; compara++) {
                if (adivinar[compara] < clave[compara]) {
                    System.out.println(adivinar[compara] + " Es menor");
                }
                if (adivinar[compara] > clave[compara]) {
                    System.out.println(adivinar[compara] + " Es mayor");
                }
                if (adivinar[compara] == clave[compara]) {
                    System.out.println(adivinar[compara] + " Es igual");
                    contador++;
                }
                if ( contador == digitos ){
                    acierto = true;
                }
            }
        } while (acierto == false);
    }
}
