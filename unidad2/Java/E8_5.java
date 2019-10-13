import java.util.Scanner;

public class E8_5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("intoduce el valor minimo ");
        int minimo = teclado.nextInt();
        System.out.println("intoduce el valor maximo ");
        int maximo = teclado.nextInt();
        int para = 0;
        while (para == 0){
            int rango = 0;
            System.out.println("intoduce un numero dentro del rango: entre el minimo y el maximo ");
            int numero = teclado.nextInt();
            if (numero <= maximo){
                rango = rango + 1;
            }
            if (numero >= minimo) {
                rango = rango + 1;
            }
            if (rango == 2){
                System.out.println("correcto");
                para = 1;
            }
        }
    }
}
