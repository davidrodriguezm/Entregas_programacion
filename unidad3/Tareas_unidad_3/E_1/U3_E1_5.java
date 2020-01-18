import java.util.Scanner;

public class U3_E1_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tres numeros para saber el mayor de ellos");
        int num_1 = teclado.nextInt();
        System.out.println("Introduce otro");
        int num_2 = teclado.nextInt();
        int num_mayor_inicial = comparar(num_1, num_2);
        System.out.println("Introduce otro");
        int num_3 = teclado.nextInt();
        System.out.println("El mayor es: " + comparar(num_mayor_inicial, num_3) );
    }
    static int comparar( int num1, int num2) {
        int mayor;
        mayor =  num1 >= num2 ? num1 : num2;
        return (mayor);
    }
}
