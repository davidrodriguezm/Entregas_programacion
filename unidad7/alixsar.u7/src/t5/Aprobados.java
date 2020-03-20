package t5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeMap;
import java.util.TreeSet;

public abstract class Aprobados {

    public static void liasta_aprobados() {
        TreeMap<Integer,ArrayList<Float>> l_calificaciones = null;
        TreeMap<Integer,Aspirantes> l_aspirantes = null;
        ObjectInputStream entrada_id = null;
        ObjectInputStream entrada_notas = null;
        ObjectInputStream entrada_aspirantes = null;
        try {
            entrada_notas = new ObjectInputStream( new FileInputStream("src\\t5\\calificaciones.dat"));
            entrada_aspirantes = new ObjectInputStream( new FileInputStream("src\\t5\\aspirantes.dat"));
            l_calificaciones = (TreeMap<Integer, ArrayList<Float>>) entrada_notas.readObject();
            System.out.println(l_calificaciones);
            l_aspirantes = (TreeMap<Integer, Aspirantes>) entrada_aspirantes.readObject();
        } catch ( Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (entrada_id != null) {
                    entrada_id.close();
                }
                if (entrada_notas != null) {
                    entrada_notas.close();
                }
                if (entrada_aspirantes != null) {
                    entrada_aspirantes.close();
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        System.out.println("Nombre-----------------DNI------------Calificación media");
        TreeSet<Aspirantes> conj_aspi = new TreeSet<>(l_aspirantes.values());
        for ( Aspirantes aspi : conj_aspi ){
            ArrayList<Float> notas = l_calificaciones.get(aspi.getNumero_identificacion());
            if ( notas != null ){
                float media = 0;
                int cont = 0;
                for ( float nota: notas ) {
                    media += nota;
                    cont++;
                }
                media /= (float) cont;
                if ( media >= 5 ) {
                    System.out.println( aspi.getNombre() + "         " + aspi.getDni() + "           " + media);
                }
            }
        }
    }
}
