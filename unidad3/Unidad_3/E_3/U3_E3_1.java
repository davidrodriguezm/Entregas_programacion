import java.util.Scanner;

public class U3_E3_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase = "";
        boolean seguir = true;
        do {
            System.out.println( "Escribe una palabra ");
            String palabrara = teclado.nextLine();
            if ( palabrara.equalsIgnoreCase("fin")) {
                seguir = false;
            } else {
                frase = frase + " " + palabrara;
            }
            System.out.println( frase );
        } while (seguir);
    }
}
