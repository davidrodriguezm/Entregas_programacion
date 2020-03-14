package t2.a16;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Traductor t = new Traductor("src\\t2\\a16\\Traducido.txt");
        System.out.println("Escribe una frase o palabra para traducirla");
        String frase = teclado.nextLine();
        System.out.println(t.traducir(frase));
    }
}
