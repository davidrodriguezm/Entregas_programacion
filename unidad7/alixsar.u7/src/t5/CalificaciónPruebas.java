package t5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeMap;

public abstract class CalificaciónPruebas {
    static TreeMap<Integer,ArrayList<Float>> lista_calificaciones = new TreeMap<Integer,ArrayList<Float>>();

    public static void Calificar() {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Float> notas = new ArrayList<Float>();
        HashSet<Integer> num_identificadores = null;
        try ( ObjectInputStream entrada = new ObjectInputStream( new FileInputStream("src\\t5\\ids_aspirantes.dat")) ){
            num_identificadores = (HashSet<Integer>) entrada.readObject();
        } catch ( Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Introduzca el numero de identificacion del aspirante\nnumeros de aspirantes: " + num_identificadores);
        Integer identificador = teclado.nextInt();
        teclado.nextLine();
        if ( num_identificadores.contains(identificador) ) {
            for (int i = 1; i == 1;) {
                System.out.println("Introduzca Calificación (float) de 0 al 10");
                float nota = teclado.nextFloat();
                teclado.nextLine();
                if ( nota >= 0 && nota <= 10 ) {
                    notas.add(nota);
                } else {
                    System.out.println("Calificación no valida (float) de 0 al 10");
                }
                System.out.println("Para continuar Calificando este aspirante Introduzca (int): 1, otro parar");
                i = teclado.nextInt();
                teclado.nextLine();
            }
            lista_calificaciones.put(identificador,notas);
        }
    }

    public static void guardarFichero() {
        try (ObjectOutputStream salida = new ObjectOutputStream( new FileOutputStream("src\\t5\\calificaciones.dat"))){
            salida.writeObject(lista_calificaciones);
        } catch ( Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
