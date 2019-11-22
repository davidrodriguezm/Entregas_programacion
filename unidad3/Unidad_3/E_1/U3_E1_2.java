import java.util.Scanner;

public class U3_E1_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un numero y otro mayor despues para ver los que hay numeros entre ellos");
        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();
        eco(numero1, numero2);
    }
    static void eco(int numero1, int numero2) {
        int menor = numero1 < numero2 ? numero1 : numero2;
        int mayor = numero2 < numero1 ? numero1 : numero2;
        for (int i = menor + 1; i < mayor; i++) {
            System.out.println(i);
        }
    }
}
