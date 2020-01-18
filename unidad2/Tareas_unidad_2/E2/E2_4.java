import java.util.Scanner;

public class E2_4 {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.print("¿Cuantas millas? ");
            int millas = teclado.nextInt();
            System.out.print(" son ");
            System.out.print(millas * 1609);
            System.out.print(" metros");
        }
}
