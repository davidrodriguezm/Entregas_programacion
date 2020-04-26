package tarea6;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class principal_6 {
    public static void main(String[] args) {
        //Creo los Futbolistas
        ArrayList<String> posiciones1 = new ArrayList<>();
        posiciones1.add("Portero");
        Futbolista_6 fu1 = new Futbolista_6(1, "Casillas",posiciones1, "Real Madrid");
        ArrayList<String> posiciones2 = new ArrayList<>();
        posiciones2.add("Lateral derecho");
        posiciones2.add( "Medio centro");
        Futbolista_6 fu2 = new Futbolista_6(15, "Ramos",posiciones2, "Real Madrid");
        ArrayList<String> posiciones3 = new ArrayList<>();
        posiciones3.add("Central");
        Futbolista_6 fu3 = new Futbolista_6(3, "Pique",posiciones3, "FC Barcelona");
        ArrayList<String> posiciones4 = new ArrayList<>();
        posiciones4.add("Central");
        Futbolista_6 fu4 = new Futbolista_6(5, "Puyol",posiciones4, "FC Barcelona");
        ArrayList<String> posiciones5 = new ArrayList<>();
        posiciones5.add("Lateral izquierdo");
        Futbolista_6 fu5 = new Futbolista_6(11, "Capdevila",posiciones5,"Villareal");
        ArrayList<String> posiciones6 = new ArrayList<>();
        posiciones6.add("Defensa mediocampo");
        posiciones6.add("Mediocampo");
        Futbolista_6 fu6 = new Futbolista_6(14, "Xabi Alonso",posiciones6, "Real Madrid");
        ArrayList<String> posiciones7 = new ArrayList<>();
        posiciones7.add("Defensa mediocampo");
        Futbolista_6 fu7 = new Futbolista_6(16, "Busquets",posiciones7, "FC Barcelona");
        ArrayList<String> posiciones8 = new ArrayList<>();
        posiciones8.add("Defensa mediocampo");
        Futbolista_6 fu8 = new Futbolista_6(8, "Xavi Hernandez",posiciones8, "FC Barcelona");
        ArrayList<String> posiciones9 = new ArrayList<>();
        posiciones9.add("Extremo izquierdo");
        posiciones9.add("Falso extremo");
        Futbolista_6 fu9 = new Futbolista_6(18, "Pedrito",posiciones9, "FC Barcelona");
        ArrayList<String> posiciones10 = new ArrayList<>();
        posiciones10.add("Extremo derecho");
        posiciones10.add("Mediocampo");
        Futbolista_6 fu10 = new Futbolista_6(6, "Iniesta",posiciones10, "FC Barcelona");
        ArrayList<String> posiciones11 = new ArrayList<>();
        posiciones11.add("Delantero centro");
        Futbolista_6 fu11 = new Futbolista_6(7, "Villa",posiciones11, "FC Barcelona");
        //Los añado a un ArrayList
        ArrayList<Futbolista_6> jugadores = new ArrayList<>();
        jugadores.add(fu1);
        jugadores.add(fu2);
        jugadores.add(fu3);
        jugadores.add(fu4);
        jugadores.add(fu5);
        jugadores.add(fu6);
        jugadores.add(fu7);
        jugadores.add(fu8);
        jugadores.add(fu9);
        jugadores.add(fu10);
        jugadores.add(fu11);
        Gson gson = new Gson();
        String alineacion = gson.toJson(jugadores);
        //Obtengo un ArrayList de Futbolista con la información del String
        Type listType = new TypeToken<ArrayList<Futbolista_6>>() {}.getType();
        ArrayList<Futbolista_6> futbolistas = gson.fromJson(alineacion,listType);
        //Obtengo en un ArrayList independiente, la lista de demarcaciones posibles de "Ramos"
        Futbolista_6 ramos = null;
        String nombreFotbolista = "Ramos";
        for ( Futbolista_6 f : futbolistas ) {
            if ( nombreFotbolista.equals(f.getNombre()) ) {
                ramos = f;
            }
        }
        System.out.println("Lista de demarcaciones posibles de Ramos=" + ramos.getDemarcaciones());
    }
}
