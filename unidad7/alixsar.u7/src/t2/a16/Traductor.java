package t2.a16;


import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;

class Traductor {
    private HashMap<String, String> diccionario;

    public Traductor(String nombre_fichero) {
        diccionario = new HashMap<>();
        try(BufferedReader fichero = new BufferedReader(new FileReader(nombre_fichero)) ) {
            for (String linea = fichero.readLine(); linea != null;) {
                String[] clave_valor = linea.split(", ");
                diccionario.put(clave_valor[0],clave_valor[1]);
                linea = fichero.readLine();
            }
        } catch (Exception  e) {
            e.getMessage();
        }
    }

    protected String traducir( String frase ) {
        String[] palabras = frase.split(" ");
        String traducido = "";
        for (int i = 0; i < palabras.length; i++) {
            if ( diccionario.get(palabras[i]) != null ) {
                traducido += diccionario.get(palabras[i]) + " ";
            }
        }
        return traducido;
    }


}


