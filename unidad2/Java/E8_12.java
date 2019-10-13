import java.util.Scanner;

public class E8_12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int i;
        int suspenso = 0;
        for (i = 1; i <= 5; i++) {
            System.out.println("introduce la nota de un alumno ");
            int nota = teclado.nextInt();
            if (nota < 5 && suspenso == 0){
                suspenso++;
            }
            if (i ==5 && suspenso != 0){
                System.out.println("hay suspensos ");
            }
            if (i ==5 && suspenso == 0) {
                System.out.println("no hay suspensos ");
            }
        }
    }
}