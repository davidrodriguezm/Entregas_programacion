import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int num_mesas = 10;
        int grupo = 0;
        int[] mesas = new int[ num_mesas ];
        for (int i = 0; i < num_mesas; i++) {
            mesas[i] = (int)(Math.random() * 5);
        }
        while ( grupo != -1 ) {
            System.out.print("Mesa:     ");
            for (int mesa = 1; mesa <= num_mesas; mesa++) {
                System.out.print("  " + mesa);
            }
            System.out.println();
            System.out.print("ocupacion:");
            for (int ocupacion = 0; ocupacion < num_mesas; ocupacion++) {
                System.out.print("  " + mesas[ocupacion]);
            }
            System.out.println();
            System.out.println("¿Cuántos son? (Introduzca -1 para salir del programa)");
            grupo = teclado.nextInt();
            if ( grupo < 0) {
                break;
            }
            if ( grupo > 4 ) {
                System.out.println("Lo siento, en estos momentos no queda sitio.");
            } else {
                for (int i = 0; i < num_mesas; i++) {
                    int la_mesa = i + 1;
                    if ( mesas[i] == 0) {
                        System.out.println("Por favor, siéntense en la mesa número " + la_mesa);
                        break;
                    }
                    if ( i == (num_mesas -1) ) {
                        for (int j = 0; j < num_mesas; j++) {
                            int la_mesa_com = j + 1;
                            int cabe = mesas[j] + grupo;
                            if (cabe <= 4) {
                                System.out.println("Tendrán que compartir mesa. " +
                                        "Por favor, siéntense en la mesa número" + la_mesa_com);
                                break;
                            }
                            if ( j == (num_mesas -1) ) {
                                System.out.println("Lo siento, en estos momentos no queda sitio.");
                            }
                        }
                    }
                }
            }
        }
    }
}
