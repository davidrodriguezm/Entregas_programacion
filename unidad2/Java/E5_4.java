import java.util.Scanner;

public class E5_4 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("introduce el primer número ");
        int numero1 = teclado.nextInt();
        System.out.print("introduce el segundo número ");
        int numero2 = teclado.nextInt();
        if (numero1 %2 == 0){
            System.out.println("el primer numero es par " + numero1);
        }
        if (numero2 %2 == 0) {
            System.out.print("el segundo numero es par " + numero2);
        }
    }
}
