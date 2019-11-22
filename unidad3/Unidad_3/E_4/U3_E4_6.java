import java.util.Arrays;

public class U3_E4_6 {
    public static void main(String[] args) {
        int[] con_rep = {1, 5, 4, 1, 7, 4, 12, 5};
        System.out.println( " La tabla con repetidos: " + Arrays.toString( con_rep ) );
        int[] sin_rep = sin_repetidos(con_rep);
        System.out.println( " La tabla sin repetidos: " + Arrays.toString( sin_rep ) );
    }
    static int[] sin_repetidos( int con[]) {
        int copia[] = new int[con.length];
        int lon_copia = copia.length;
        int i = 0;
        int cont_copia = 0;
        while ( i < copia.length) {
            int j = 0;
            while ( con[j] != con[i] ) {
                j++;
            }
            if ( j == i ) {
                copia[cont_copia] = con[i];
                cont_copia++;
            } else {
                lon_copia--;
            }
            i++;
        }
        return Arrays.copyOf(copia, lon_copia);
    }
}
