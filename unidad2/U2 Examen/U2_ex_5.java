import java.util.Scanner;

public class U2_ex_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase = teclado.nextLine();
        String vocales = "aeiouáéíóú";
        int cont_vocal = 0;
        for (int i = 0; i < vocales.length() ; i++) {
            for (int j = 0; j < frase.length(); j++) {
                if (vocales.substring(i, i + 1).equalsIgnoreCase(frase.substring(j, j + 1))){
                    cont_vocal++;
                }
            }
        }
        System.out.println("Hay " + cont_vocal + " vocales");
    }
}
