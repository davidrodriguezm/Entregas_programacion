import java.util.Scanner;

public class Adicional_7 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println( "Escribe un numero ");
        String numero = teclado.nextLine();
        int logitud = numero.length();
        for (int i = ( logitud -1 ); i >= 0; i--) {
            System.out.print( numero.charAt( i ) );
        }
    }
}
