package t5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeMap;

public abstract class Aprobados {

    public static void liasta_aprobados() {
        HashSet<Integer> num_identificadores = null;
        TreeMap<Integer,ArrayList<Float>> l_calificaciones = null;
        TreeMap<Integer,Aspirantes> l_aspirantes = null;
        String cadena = "Nombre----------DNI---------Calificación media\n";
        ObjectInputStream entrada_id = null;
        ObjectInputStream entrada_notas = null;
        ObjectInputStream entrada_aspirantes = null;
        try {
            entrada_id = new ObjectInputStream( new FileInputStream("src\\t5\\numero_identificativos.dat"));
            entrada_notas = new ObjectInputStream( new FileInputStream("src\\t5\\calificaciones.dat"));
            entrada_aspirantes = new ObjectInputStream( new FileInputStream("src\\t5\\datos_aspirantes.dat"));
            num_identificadores = (HashSet<Integer>) entrada_id.readObject();
            l_calificaciones = (TreeMap<Integer, ArrayList<Float>>) entrada_notas.readObject();
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
       for ( Integer identificador  : num_identificadores ) {
            ArrayList<Float> notas = l_calificaciones.get(identificador);
            Aspirantes aspi = null;
            float media = 0;
            int cont = 0;
            for ( float nota: notas ) {
                media += nota;
                cont++;
            }
            media /= (float) cont;
            if ( media >= 5 ) {
                aspi = l_aspirantes.get(identificador);
                cadena =  cadena + aspi.getNombre() + "   " + aspi.getDni() + "   " + media + "\n";
            }
        }
        System.out.println(cadena);
    }
}
