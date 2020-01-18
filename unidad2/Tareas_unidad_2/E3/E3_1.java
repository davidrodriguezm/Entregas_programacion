import java.util.Scanner;

public class E3_1 {
        public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("primer numero");
        byte PrimerNumero = (byte) teclado.nextInt();

        System.out.print("segundo numero");
        byte Segundonumero = (byte) teclado.nextInt();

        System.out.print("el resultado de la suma es ");
        System.out.print(PrimerNumero + Segundonumero);
    }
}
