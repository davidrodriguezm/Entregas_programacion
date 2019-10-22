import java.util.Scanner;

public class E8_3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int azar, para;
        para = 0;
        azar = (int) (Math.random() * 100) +1;
        while ( para != -1){
            System.out.println("acierta el numero de 1 a 100 ");
            int numero = teclado.nextInt();
            para = numero;
            if (numero != -1 ){
                if (azar > numero){
                    System.out.println("mayor");
                }
                if (azar <numero){
                    System.out.println("menor");
                }
                if (azar == numero){
                    System.out.println("correcto");
                    para = -1;
                }
            }
        }
    }
}
