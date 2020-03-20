package t5;

import java.util.Scanner;

public class principal_t5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        while ( true ) {
            System.out.println("Introduzca (int):\n1. Introducir datos de aspirantes\n" +
                    "2. Calificar prueba\n" +
                    "3. Aprobados\n" +
                    "4. Salir");
            int opcion = teclado.nextInt();
            teclado.nextLine();
            if (opcion == 4) {
                break;
            }
            switch (opcion) {
                case 1:
                    for ( int continuar = 1; continuar == 1; ) {
                        System.out.println("Introduzca los datos del aspirante:\nDNI");
                        String dni = teclado.nextLine();
                        System.out.println("Nombre");
                        String nombre = teclado.nextLine();
                        System.out.println("Telefono ");
                        String telefono = teclado.nextLine();
                        Aspirantes a = new Aspirantes(dni,nombre,telefono);
                        Aspirantes.InsertaAspirante(a);
                        System.out.println("Para introducir mas empleados aspirantes (int): 1 continuar, otro parar");
                        continuar = teclado.nextInt();
                        teclado.nextLine();
                    }
                    Aspirantes.guardarFicheros();
                    break;
                case 2:
                    for ( int continuar = 1; continuar == 1; ) {
                        CalificaciónPruebas.Calificar();
                        System.out.println("Para calificar aspirantes (int): 1 continuar, otro parar");
                        continuar = teclado.nextInt();
                        teclado.nextLine();
                    }
                    CalificaciónPruebas.guardarFichero();
                    break;
                case 3:
                    Aprobados.liasta_aprobados();
                    break;
            }
        }
    }
}
