import java.util.Scanner;

public class E5_5 {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("introduce primer numero ");
        long numero1 = teclado.nextLong();
        System.out.print("introduce segundo numero ");
        long numero2 =  teclado.nextLong();
        System.out.print("introduce tercer numero ");
        long numero3 =  teclado.nextLong();
        if (numero1 > numero2 && numero1 > numero3) {
            System.out.print("el mayor es el primer numero " + numero1);
        }
        if (numero2 > numero1 && numero2 > numero3){
            System.out.print("el mayor es el segudo numero " + numero2);
        }
        if (numero3 > numero1 && numero3 > numero2){
            System.out.print("el mayor es el tercer numero " + numero3);
         }
    }
}
