import java.util.Scanner;

public class U3_E1_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuantas veces quieres que se repita el menjaje Eco...?");
        int n = teclado.nextInt();
        eco(n);
    }
    static void eco(int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.println("Eco...");
        }
    }
}
