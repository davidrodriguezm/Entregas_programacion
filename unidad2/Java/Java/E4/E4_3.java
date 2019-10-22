import java.util.Scanner;

public class E4_3 {
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        System.out.print("introduce una nota ");
        int numero1 = teclado.nextInt();
        System.out.print("introduce otra nota ");
        int numero2 = teclado.nextInt();
        System.out.print("introduce otra mas ");
        int numero3 = teclado.nextInt();
        int media = (numero1 + numero2 + numero3) / 3;
        System.out.print("la media es  " + media);
    }
}
