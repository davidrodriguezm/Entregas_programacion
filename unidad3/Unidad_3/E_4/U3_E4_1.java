import java.util.Scanner;

public class U3_E4_1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        float[] numeros = new float[5];
        System.out.println("Introduce 5 numeros");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = teclado.nextFloat();
        }
        for (int j = 0; j < numeros.length; j++) {
            System.out.println(numeros[j]);
        }
    }
}

