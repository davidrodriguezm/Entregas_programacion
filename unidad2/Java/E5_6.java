import java.util.Scanner;

public class E5_6 {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("introduce el tiempo ");
        double tiempo = teclado.nextDouble();
        double gravedad = 9.8;
        if (tiempo > 0){
            System.out.print("la velocidad es " + (gravedad * tiempo));
        }
        else {
            System.out.print("Tiempo incorrecto ");

        }
    }
}
