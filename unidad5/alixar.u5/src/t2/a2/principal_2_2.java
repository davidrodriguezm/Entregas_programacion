package t2.a2;

import java.util.Arrays;

public class principal_2_2 {
    public static void main(String[] args) {
        Cliente[] tabla = new Cliente[5];
        Cliente c1 = new Cliente("666J", "Gorke Zurcido", 22, 500.5);
        Cliente c2 = new Cliente("464F", "Oristila Marrajo", 21, 1783.45);
        Cliente c3 = new Cliente("132A", "Eufrasio Piesverdes", 47, 130.21);
        Cliente c4 = new Cliente("878Z", "Joni Melavo", 56, 10.33);
        Cliente c5 = new Cliente("577E", "Dombina Anacleto", 39, 4563.8);
        tabla[0] = c1;
        tabla[1] = c2;
        tabla[2] = c3;
        tabla[3] = c4;
        tabla[4] = c5;
        Arrays.sort(tabla);
        System.out.println( "Tabla ordenada por DNI");
        for (int i = 0; i < tabla.length ; i++) {
            System.out.println( tabla[i].toString() );
        }
        Arrays.sort(tabla, new Compara_edad());
        System.out.println( "Tabla ordenada por edad");
        for (int i = 0; i < tabla.length ; i++) {
            System.out.println( tabla[i].toString() );
        }
        Arrays.sort(tabla, new Compara_nombres());
        System.out.println( "Tabla ordenada por nombres");
        for (int i = 0; i < tabla.length ; i++) {
            System.out.println( tabla[i].toString() );
        }
    }
}
