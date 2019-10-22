import java.util.Scanner;

public class E9_3 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println( "Escribe una contraseña ");
        String codigo = teclado.nextLine();
        int i = 0;
        boolean acierto;
        System.out.println( "Adivina la contraseña ");
        while (i == 0) {
            String intento = teclado.nextLine();
            acierto = intento.equals(codigo);
            if (acierto) {
                System.out.println( "Acertaste ");
                i++;
            }
            if ( codigo.compareTo(intento) < 0) {
                System.out.println( "Mayor ");
            }
            if ( codigo.compareTo(intento) > 0) {
                System.out.println("Menor ");
            }
        }
    }
}
