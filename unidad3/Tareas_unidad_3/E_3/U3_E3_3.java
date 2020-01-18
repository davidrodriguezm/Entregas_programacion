import java.util.Scanner;

public class U3_E3_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println( "Escribe tu nombre y apellidos");
        String nombre = teclado.nextLine();
        String vocales = "aeiouáéíóú";
        String sin_vocales = "";
        for (int i = 0; i < nombre.length() ; i++) {
            boolean introducir = true;
            for (int j = 0; j < vocales.length(); j++) {
                if ( nombre.substring(i, i + 1).equalsIgnoreCase(vocales.substring(j, j + 1) ) ) {
                    introducir = false;
                }
            }
            if ( introducir ) {
                sin_vocales = sin_vocales + nombre.substring( i, i +1);
            }
        }
        System.out.println( sin_vocales);
    }
}
