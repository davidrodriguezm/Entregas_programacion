import java.util.Scanner;

public class U3_E1_10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dos numeros para saber si son amigos");
        int numero_1 = teclado.nextInt();
        int numero_2 = teclado.nextInt();
        if (amigos(numero_1, numero_2)) {
            System.out.println("Son amigos");
        } else {
            System.out.println("No son amigos");
        }
    }
    static boolean amigos(int numero1, int numero2) {
        boolean com_amigo = suma_div(numero1) == numero2 && suma_div(numero2) == numero1 ? true : false;
        return com_amigo;
    }
    static int suma_div(int numero) {
        int suma = 0;
        for (int dividiendo = 1; dividiendo < numero ; dividiendo++) {
            if (numero % dividiendo == 0) {
                suma = suma + dividiendo;
            }
        }
        return suma;
    }
}
