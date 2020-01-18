import java.util.Scanner;

public class U3_E1_11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la base (numero real)");
        double base = teclado.nextDouble();
        System.out.println("Introduce el exponente (numero entero no negativo)");
        int exponente = teclado.nextInt();
        System.out.println("Introduce el numero 1 para la versión iterativa y el numero 2 para la recursiva");
        int version = teclado.nextInt();
        if ( exponente >= 0 ) {
            switch (version) {
                case 1:
                    System.out.println("Es: " + iterativa( base, exponente ));
                    break;
                case 2:
                    System.out.println("Es: " + recursiva( base, exponente ));
                    break;
                default:
                    System.out.println("No existe esa versión");
            }
        } else {
            System.out.println("Exponente incorrecto");
        }
    }
    static double iterativa( double base, int exponente) {
        double resultado = 1;
        if ( exponente != 0) {
            resultado = base;
            for (int i = 1; i < exponente; i++) {
                resultado = resultado * base;
            }
        }
        return resultado;
    }
    static double recursiva( double base, int exponente) {
        double resultado;
        if ( exponente == 0) {
            resultado = 1;
        }
        else {
            resultado = base * recursiva(base,exponente -1);
        }
        return resultado;
    }
}
