import java.util.Scanner;

public class Adicional_1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num1 = 5;
        int num2 = 6;
        int num3 = 3;
        int num4 = 4;
        int i;
        int correcto = 0;
        for (i = 1; i <= 4; i++) {
            System.out.println("introduce un número de la contraseña ");
            int contra = teclado.nextInt();
            if (i == 1 && contra == num1) {
                correcto++;
            }
            if (i == 2 && contra == num2) {
                correcto++;
            }
            if (i == 3 && contra == num3) {
                correcto++;
            }
            if (i == 4 && contra == num4) {
                correcto++;
            }
            if ( correcto == 4) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente ");
            }
            if (i == 4  && correcto != 4 ){
                System.out.println("Lo siento, esa no es la combinación");
            }
        }
    }
}
