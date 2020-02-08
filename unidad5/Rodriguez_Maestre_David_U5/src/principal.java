import java.util.Arrays;
import java.util.Comparator;

public class principal {
    public static void main(String[] args) {
        Terrestre[] ter = new Terrestre[6];
        ter[0] = new Coche( "batmovil", 5, "777s", 2019, Terrestre.Colores.azul );
        ter[1] = new Coche( "ibiza", 2, "647d", 2009, Terrestre.Colores.amarillo );
        ter[2] = new Coche( "overdrive", 5, "237f", 2014, Terrestre.Colores.rojo );
        ter[3] = new Motocicleta( "harlidivison", 2, "237f", 2016, Terrestre.Colores.verde );
        ter[4] = new Motocicleta( "toledo", 4, "964o", 2011, Terrestre.Colores.azul );
        ter[5] = new Motocicleta( "vespino", 1, "189j", 2016, Terrestre.Colores.amarillo );
        System.out.println( "Son iguales: " + ter[2].equals(ter[3]));
        Arrays.sort(ter);
        System.out.println( "Coches y Motos ordenados por matricula:" );
        for (int i = 0; i < ter.length; i++) {
            System.out.println( ter[i] );
        }
        System.out.println( "Coches y Motos ordenados por year de fabricacion:" );
        Arrays.sort(ter,
                new Comparator() {
                    public int compare( Object ob1, Object ob2 ){
                        Terrestre t1 = (Terrestre) ob1;
                        Terrestre t2 = (Terrestre) ob2;
                        int devuelve = 0;
                        if ( t1.year_fabricacion < t2.year_fabricacion ) {
                            devuelve = -1;
                        } else if ( t1.year_fabricacion > t2.year_fabricacion ) {
                            devuelve = 1;
                        }
                        return devuelve;
                    }
                });
        for (int i = 0; i < ter.length; i++) {
            System.out.println( ter[i] );
        }
        Helicoptero h1 = new Helicoptero( "torbellino", 12, 2000, "el que sea");
        Avioneta a1 = new Avioneta( "vion", 20, 5600, "yo que se");
        System.out.println( h1 );
        System.out.println( a1 );
        System.out.println( a1.volar() );
        h1.Transportar(9);
        System.out.println( h1 );
    }
}
