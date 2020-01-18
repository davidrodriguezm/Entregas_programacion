import java.util.Scanner;

public class E9_4 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        System.out.println( "Escribe una frase ");
        String frase = teclado.nextLine();
        String espacio = " ";
        int medio =  Math.round(frase.length()/2);
        if ( frase.substring(medio,medio + 1).equals(espacio) ){
            System.out.println( "el carácter de la posición central es un espacio");
        }
        else {
            System.out.println( "el carácter de la posición central no es un espacio");
        }
    }
}
