import java.util.Scanner;

public class E8_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int mayor = 0;
        int alumnos = 0;
        int suma = 0;
        int media;
        int para = 1;
        while ( para >= 0 ){
            System.out.println("introduce la edad del alumno ");
            int edad = teclado.nextInt();
            alumnos++;
            if (edad > 17){
                mayor++;
            }
            suma = (suma + edad);
            media = suma / alumnos;
            if (edad >= 0){
                System.out.println("la suma de las edades es " + suma);
                System.out.println("la media es " + media);
                System.out.println("el numero de alumnos es " + alumnos);
                System.out.println("son mayores de edad " + mayor);
            }
            para = edad;
        }
    }
}
