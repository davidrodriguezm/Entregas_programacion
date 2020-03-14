package t1;

import java.util.*;

public class a4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir frase:");
        String frase = teclado.nextLine();
        String[] palabras = frase.split(" ");
        List<String> lista_pala = new ArrayList<>();
        for ( String pal : palabras ) {
            lista_pala.add(pal);
        }
        List<String> copi_lista = new ArrayList<>(lista_pala);
        Set<String> pal_repe = new HashSet<>();
        while ( copi_lista.size() > 0 ) {
            String palabra = copi_lista.remove(0);
            if ( copi_lista.contains(palabra) ) {
                pal_repe.add( palabra );
            }
        }
        copi_lista = new ArrayList<>(lista_pala);
        copi_lista.removeAll(pal_repe);
        System.out.println("Palabras repetidas:\n" + pal_repe);
        System.out.println("Palabras no repetidas:\n" + copi_lista);
    }
}
