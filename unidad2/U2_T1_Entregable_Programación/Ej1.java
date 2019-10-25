import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("La primera nota");
        int primera_nota = teclado.nextInt();
        teclado.nextLine();
        System.out.println("La segunda nota");
        int segunda_nota = teclado.nextInt();
        teclado.nextLine();
        System.out.println("La tercera nota");
        int tercera_nota = teclado.nextInt();
        teclado.nextLine();
        int media = Math.round(( primera_nota + segunda_nota + tercera_nota ) / 3);
        if ( media >= 5) {
            System.out.println("Nota del primer control: " + primera_nota);
            System.out.println("Nota del segundo control: " + segunda_nota);
            System.out.println("Nota del tercer control: " + tercera_nota);
            if ( media == 5 ) {
                System.out.println("Tu nota de Programación es " + media + " - Suficiente");
            }
            if ( media == 6 ) {
                System.out.println("Tu nota de Programación es " + media + " - Bien");
            }
            if ( media >= 7 && media < 9 ) {
                System.out.println("Tu nota de Programación es " + media + " - Notable");
            }
            if ( media >= 9 ) {
                System.out.println("Tu nota de Programación es " + media + " - Sobresaliente");
            }
        }
        else {
            System.out.println("¿Cuál ha sido el resultado de la recuperación? (apto/no apto)");
            String recupera = teclado.nextLine();
            String apto = "apto";
            String no_apto = "no apto";
            if ( recupera.equals(apto)) {
                System.out.println( "Apto tu nota de Programación es 5 - Suficiente ");
            }
            if ( recupera.equals(no_apto)) {
                System.out.println( "No apto tu nota de Programación es " +  media + " suspenso");
            }

        }

    }
}
