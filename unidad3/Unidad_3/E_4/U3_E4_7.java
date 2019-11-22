import java.util.Scanner;

public class U3_E4_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final int nu_alumnos = 5;
        final int nu_trimestre = 3;
        int[][] alun_notas = new int[nu_alumnos][nu_trimestre];
        for (int alum = 0; alum < nu_alumnos; alum++) {
            System.out.println("Introduce las notas del alumno " + (alum + 1) );
            for (int trime = 0; trime < nu_trimestre; trime++) {
                alun_notas[alum][trime] = teclado.nextInt();
            }
        }
        int con_media = 0;
        float media_tri = 0;
        for (int trimestre = 0; trimestre < nu_trimestre; trimestre++) {
            for (int alumno = 0; alumno < nu_alumnos; alumno++) {
                con_media = con_media + alun_notas[alumno][trimestre];
            }
            media_tri = (float) con_media / nu_alumnos;
            System.out.print("La media el trimestre " + (trimestre + 1) + " es " );
            System.out.println( media_tri );
            con_media = 0;
            media_tri = 0;
        }
        System.out.println("Introduce el numero del alumno  para ver la media de sus notas, hay cinco ");
        int alum_elegido = teclado.nextInt();
        int con_alumno = 0;
        float media_alumno = 0;
        for (int trim_alum = 0; trim_alum < nu_trimestre; trim_alum++) {
            con_alumno = con_alumno + alun_notas[alum_elegido][trim_alum];
        }
        media_alumno = (float) con_alumno / nu_alumnos;
        System.out.print("La media del alumno es " + media_alumno );
    }
}
