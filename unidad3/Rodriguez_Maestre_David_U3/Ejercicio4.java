import java.util.Arrays;

public class Ejercicio4 {
    public static void main(String[] args) {
        int[] tabla = { 6, 2, 5, 0, 1 };
        System.out.println( "El Array es:");
        System.out.println( Arrays.toString( tabla ));
        String cadena = convierteArrayEnString(tabla);
        System.out.println( "El String es:");
        System.out.println( cadena );
    }
    public static String convierteArrayEnString(int[] tabla) {
        String cadena1 = "";
        for (int i = 0; i < tabla.length; i++) {
            cadena1 = cadena1 + Integer.toString(tabla[i]);
        }
        return cadena1;
    }
}
