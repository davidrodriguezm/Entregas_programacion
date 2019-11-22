import java.util.Scanner;

public class U3_E4_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántos números deseas introducir?");
        int cantidad = teclado.nextInt();
        int[] numeros = new int[cantidad];
        int cont_cero = 0;
        int cont_positivo = 0;
        int cont_negativo = 0;
        int suma_positivo = 0;
        int suma_negativo = 0;
        System.out.println("Introduce " + cantidad + " numeros");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = teclado.nextInt();
        }
        for (int j = 0; j < numeros.length ; j++) {
            if ( numeros[j] > 0){
                cont_positivo++;
                suma_positivo = suma_positivo + numeros[j];
            }
            if ( numeros[j] < 0){
                cont_negativo++;
                suma_negativo = suma_negativo + numeros[j];
            }
            if ( numeros[j] == 0){
                cont_cero++;
            }
        }
        System.out.println("La media de numeros positivos es: " + suma_positivo/cont_positivo);
        System.out.println("La media de numeros positivos es: " + suma_negativo/cont_negativo);
        System.out.println("Hay " + cont_cero + " numeros cero");
    }
}
