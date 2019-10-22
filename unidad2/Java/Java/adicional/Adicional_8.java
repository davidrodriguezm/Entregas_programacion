import java.util.Scanner;

public class Adicional_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indroduce primer dia para carcular las horas ");
        int primer_dia = teclado.nextInt();
        System.out.println("Hora");
        int hora_inicial = teclado.nextInt();
        System.out.println("Indroduce segundo dia");
        int segundo_dia = teclado.nextInt();
        System.out.println("Hora");
        int hora_final = teclado.nextInt();
        if ( primer_dia < segundo_dia && primer_dia > 0 && primer_dia <8 && segundo_dia > 0 && segundo_dia <8
        && hora_inicial > -1 && hora_inicial < 25 && hora_final > -1 && hora_final < 25) {
            System.out.println("Informacion valida");
            int horas_dia_1 = 24 - hora_inicial;
            int dias = ( segundo_dia - primer_dia ) -1;
            int horas_total = ( 24 * dias ) + horas_dia_1 + hora_final;
            System.out.println("Son " + horas_total + " horas");
        }
        else {
            System.out.println("Informacion no valida");
        }

    }
}
