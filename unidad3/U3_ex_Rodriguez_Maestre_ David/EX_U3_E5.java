package Exsamen;

public class EX_U3_E5 {
    public static void main(String[] args) {
        final int tam_tabla = 6;
        int con_tabla = 0;
        int tabla[][] = new int[tam_tabla][tam_tabla];
        System.out.println("La tabla es:");
        for (int fila = 0; fila < tam_tabla; fila++) {
            for (int columna = 0; columna < tam_tabla ; columna++) {
                tabla[fila][columna] = (int) Math.floor(Math.random() * (70 + 1) +10);
                System.out.print(tabla[fila][columna] + " ");
            }
            System.out.println();
        }
        System.out.println("La corteza es:");
        for (int fila = 0; fila < tam_tabla; fila++) {
            for (int columna = 0; columna < tam_tabla; columna++) {
                if ( con_tabla < tam_tabla ) {
                    System.out.print(tabla[fila][columna] + " ");
                } else {
                    System.out.print("    ");
                }
                if ( con_tabla < tam_tabla && fila == 0 ) {
                    con_tabla++;
                }
            }
            System.out.println();
        }
    }
}
