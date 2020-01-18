import java.util.Scanner;

public class U3_E1_6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un caracter");
        String caracter = teclado.nextLine();
        if ( vocal( caracter ) == true) {
            System.out.println("Es vocal");
        }
        else {
            System.out.println("No es vocal");
        }
    }
    static boolean vocal( String caracter) {
        String vocales = "aeiouáéíóú";
        boolean es_vocal = false;
        for (int i = 0; i < vocales.length() ; i++) {
            if (vocales.substring(i, i + 1).equalsIgnoreCase(caracter.substring(0, 1))){
                es_vocal = true;
            }
        }
        return es_vocal;
    }
}
