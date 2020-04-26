package tarea5;

import com.google.gson.Gson;

import java.util.ArrayList;

public class principal_5 {
    public static void main(String[] args) {
        //Creo los Futbolistas
        ArrayList<String> posiciones1 = new ArrayList<>();
        posiciones1.add("Portero");
        Futbolista fu1 = new Futbolista(1, "Casillas",posiciones1, "Real Madrid");
        ArrayList<String> posiciones2 = new ArrayList<>();
        posiciones2.add("Lateral derecho");
        posiciones2.add( "Medio centro");
        Futbolista fu2 = new Futbolista(15, "Ramos",posiciones2, "Real Madrid");
        ArrayList<String> posiciones3 = new ArrayList<>();
        posiciones3.add("Central");
        Futbolista fu3 = new Futbolista(3, "Pique",posiciones3, "FC Barcelona");
        ArrayList<String> posiciones4 = new ArrayList<>();
        posiciones4.add("Central");
        Futbolista fu4 = new Futbolista(5, "Puyol",posiciones4, "FC Barcelona");
        ArrayList<String> posiciones5 = new ArrayList<>();
        posiciones5.add("Lateral izquierdo");
        Futbolista fu5 = new Futbolista(11, "Capdevila",posiciones5,"Villareal");
        ArrayList<String> posiciones6 = new ArrayList<>();
        posiciones6.add("Defensa mediocampo");
        posiciones6.add("Mediocampo");
        Futbolista fu6 = new Futbolista(14, "Xabi Alonso",posiciones6, "Real Madrid");
        ArrayList<String> posiciones7 = new ArrayList<>();
        posiciones7.add("Defensa mediocampo");
        Futbolista fu7 = new Futbolista(16, "Busquets",posiciones7, "FC Barcelona");
        ArrayList<String> posiciones8 = new ArrayList<>();
        posiciones8.add("Defensa mediocampo");
        Futbolista fu8 = new Futbolista(8, "Xavi Hernandez",posiciones8, "FC Barcelona");
        ArrayList<String> posiciones9 = new ArrayList<>();
        posiciones9.add("Extremo izquierdo");
        posiciones9.add("Falso extremo");
        Futbolista fu9 = new Futbolista(18, "Pedrito",posiciones9, "FC Barcelona");
        ArrayList<String> posiciones10 = new ArrayList<>();
        posiciones10.add("Extremo derecho");
        posiciones10.add("Mediocampo");
        Futbolista fu10 = new Futbolista(6, "Iniesta",posiciones10, "FC Barcelona");
        ArrayList<String> posiciones11 = new ArrayList<>();
        posiciones11.add("Delantero centro");
        Futbolista fu11 = new Futbolista(7, "Villa",posiciones11, "FC Barcelona");
        //Los añado a un ArrayList
        ArrayList<Futbolista> futbolistas = new ArrayList<>();
        futbolistas.add(fu1);
        futbolistas.add(fu2);
        futbolistas.add(fu3);
        futbolistas.add(fu4);
        futbolistas.add(fu5);
        futbolistas.add(fu6);
        futbolistas.add(fu7);
        futbolistas.add(fu8);
        futbolistas.add(fu9);
        futbolistas.add(fu10);
        futbolistas.add(fu11);
        Gson gson = new Gson();
        String alineacion = gson.toJson(futbolistas);
        System.out.println(alineacion);
    }
}
