import java.util.Scanner;

public class E8_13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i;
        int suspenso = 0;
        int condicionados = 0;
        int aprobados = 0;
        for (i = 1; i <= 6; i++) {
            System.out.println("introduce la nota de un alumno ");
            int nota = teclado.nextInt();
            if (nota < 4 ){
                suspenso++;
            }
            if (nota == 4 ){
                condicionados++;
            }
            if (nota >= 5){
                aprobados++;
            }
            if (i ==6 && suspenso != 0){
                System.out.println("hay " + suspenso + " suspensos ");
            }
            if (i ==6 && condicionados != 0) {
                System.out.println("hay " + condicionados + " condicionados ");
            }
            if (i ==6 && aprobados != 0) {
                System.out.println("hay " + aprobados + " aprobados ");
            }
        }
    }
}
