import java.util.Scanner;

public class U3_E1_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el número 1 para calcular el área total o el 2 para volumen");
        int eleccion = teclado.nextInt();
        System.out.println("Introduce el radio de la base");
        float radio = teclado.nextFloat();
        System.out.println("Introduce la altura");
        float altura = teclado.nextFloat();
        calcular(eleccion, radio, altura);
    }
    static void calcular(int eleccion, float r, float h) {
        double area_total, volumen;
        switch (eleccion) {
            case 1:
                area_total = 2 * Math.PI * r * (h + r) ;
                System.out.println("El area total es: " + area_total);
                break;
            case 2:
                volumen = Math.PI * Math.pow(r, 2) * h;
                System.out.println("El volumen es: " + volumen);
                break;
        }
    }
}
