import java.util.Scanner;

public class U3_E1_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dos numeros para saber el mayor de ellos");
        int numero1 = teclado.nextInt();
        int numero2 = teclado.nextInt();
        System.out.println("El mayor es: " + comparar(numero1, numero2));
    }
    static int comparar( int num1, int num2) {
        int mayor;
        mayor =  num1 > num2 ? num1 : num2;
        return (mayor);
    }
}
