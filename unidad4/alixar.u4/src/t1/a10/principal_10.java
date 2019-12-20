package t1.a10;

import java.util.Scanner;

public class principal_10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        hora_10 h = new hora_10();
        System.out.println("Introduce la hora");
        int hora = teclado.nextInt();
        h.set_hora(hora);
        System.out.println("Introduce el minuto");
        int minuto = teclado.nextInt();
        h.set_minuto(minuto);
        System.out.println("Introduce el segundo");
        int segundo = teclado.nextInt();
        h.set_segundos(segundo);
        System.out.println("Horas: " + h.get_hora() + " minutos: " + h.get_minuto() + " segundos:" + h.get_segundo());
        System.out.println("¿Cuantos segundos quiere sumar?");
        int sum_segundos = teclado.nextInt();
        h.sumar_segundos(sum_segundos);
        System.out.println("Horas: " + h.get_hora() + " minutos: " + h.get_minuto() + " segundos:" + h.get_segundo());
    }
}
