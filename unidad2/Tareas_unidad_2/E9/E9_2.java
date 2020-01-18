import java.util.Scanner;

public class E9_2 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.println( " escribe una contraseña ");
        String codigo = teclado.nextLine();
        int i = 0;
        boolean acierto;
        System.out.println( "adivina la contraseña ");
        System.out.print("pista primera letra " + codigo.charAt( 0 ));
        System.out.println(" y ultima letra " + codigo.charAt( codigo.length()-1));
        while (i == 0) {
            String intento = teclado.nextLine();
            acierto = intento.equals(codigo);
            if (acierto) {
                System.out.println( "Acertaste ");
                i++;
            }
            else {
                System.out.println( "Fallaste");

            }
        }
    }
}
