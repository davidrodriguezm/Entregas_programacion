import java.util.Scanner;

public class U3_E3_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println( "Escribe una frase");
        String frase = teclado.nextLine();
        int con_espacio = 0;
        for (int i = 0; i < frase.length(); i++) {
            if ( frase.charAt(i) == ' ' ) {
                con_espacio++;
            }
        }
        System.out.println( "Hay " + con_espacio + " espacios");
    }
}
