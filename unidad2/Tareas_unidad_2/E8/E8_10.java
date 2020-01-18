import java.util.Scanner;

public class E8_10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int minimo = 1;
        int maximo = 10;
        int para = 0;
        int tabla;
        int i;
        while (para == 0) {
            System.out.println("intoduce un numero del 1 al 10 para calcular su tabla de multiplicar ");
            int numero = teclado.nextInt();
            if (numero <= maximo && numero >= minimo) {
                for (i = minimo; i <= maximo; i++) {
                    tabla = numero * i;
                    System.out.println(numero + "x" + i + "=" + tabla);
                    if (i == maximo){
                        para++;
                    }
                }
            }
        }
    }
}
