import java.util.Scanner;

public class E9_5 {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        String mul_inicio = "Javalín, javalón ";
        String mul_final = " javalén, len, len";
        int long_mul_inicio =  mul_inicio.length();
        int long_mul_final =  mul_final.length();
        System.out.println( "Escribe una frase ");
        String frase = teclado.nextLine();
        int long_frase = frase.length();
        int resta_final = frase.length() - long_mul_final;
        boolean javalandia_inicial = false;
        boolean javalandia_final = false;
        if ( long_frase >= long_mul_inicio ){
            if ( frase.substring( 0,long_mul_inicio ).equals( mul_inicio) ) {
                javalandia_inicial = true;
            }
        }
        if ( long_frase >= long_mul_final ){
            if ( frase.substring(resta_final,long_frase ).equals( mul_final ) ) {
                javalandia_final = true;
            }
        }
        if ( javalandia_inicial || javalandia_final ) {
            System.out.println( "La frase está escrita en Javalandia " );
            System.out.print( "La traduccion es: " );
        }
        else {
            System.out.println( "La frase no está escrita en Javalandia ");
        }
        if (javalandia_inicial && javalandia_final == false) {
            System.out.println( frase.substring( long_mul_inicio, long_frase) );
        }
        if (javalandia_final && javalandia_inicial == false) {
            System.out.println(frase.substring(0, resta_final));
        }
        if (javalandia_final && javalandia_inicial) {
            System.out.println(frase.substring(long_mul_inicio, resta_final));
        }
    }
}
