public class U3_E4_8 {
    public static void main(String[] args) {
        final int tam_tabla = 5;
        int[][] tabla = new int[tam_tabla][tam_tabla];
        for ( int i = 0; i < tam_tabla; i++) {
            for ( int j = 0; j < tam_tabla; j++) {
                tabla[i][j] = i + j;
            }
        }
        System.out.println("La tabla es: ");
        for ( int i = 0; i < tam_tabla; i++) {
            for ( int j = 0; j < tam_tabla; j++) {
                System.out.print( tabla[i][j] );
                if( j != 4 ) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
