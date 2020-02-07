package t1.a9;

import java.util.Arrays;
import java.util.Comparator;

public class principal_9 {
    public static void main(String[] args) {
        Electrodomestico almacen[] = new Electrodomestico[10];
        Electrodomestico e1 = new Lavadora();
        Electrodomestico e2 = new Lavadora(56);
        Electrodomestico e3 = new Television();
        Electrodomestico e4 = new Television(200, 67);
        Electrodomestico e5 = new Electrodomestico(504, 100);
        Electrodomestico e6 = new Electrodomestico();
        Electrodomestico e7 = new Lavadora(35, 37);
        Electrodomestico e8 = new Television(20, true);
        Electrodomestico e9 = new Television();
        Electrodomestico e10 = new Electrodomestico(23,30, Electrodomestico.Colores.Negro,
                Electrodomestico.Categoria_Consumo.C);
        System.out.println( "Array de electrodomesticos");
        almacen[0] = e1;
        almacen[1] = e2;
        almacen[2] = e3;
        almacen[3] = e4;
        almacen[4] = e5;
        almacen[5] = e6;
        almacen[6] = e7;
        almacen[7] = e8;
        almacen[8] = e9;
        almacen[9] = e10;
        for (int i = 0; i < almacen.length ; i++) {
            System.out.println( almacen[i].toString() );
        }
        System.out.println( "Array de lavadoras ordenado por carga");
        Lavadora lavadoras1[] = new Lavadora[5];
        Lavadora lav1 = new Lavadora();
        Lavadora lav2 = new Lavadora(500, 10, 30);
        Lavadora lav3 = new Lavadora(352, 3.5, 2);
        Lavadora lav4 = new Lavadora(250, 2.3, 1.5);
        Lavadora lav5 = new Lavadora(20, 20,20);
        lavadoras1[0] = lav1;
        lavadoras1[1] = lav2;
        lavadoras1[2] = lav3;
        lavadoras1[3] = lav4;
        lavadoras1[4] = lav5;
        Arrays.sort(lavadoras1);
        for (int i = 0; i < lavadoras1.length ; i++) {
            System.out.println( lavadoras1[i].toString() );
        }
        System.out.println( "Array de lavadoras ordenado por precio final");
        Arrays.sort(lavadoras1,
                new Comparator() {
                    public int compare( Object ob1, Object ob2 ){
                        int resultado = 0;
                        Lavadora lav1 = (Lavadora) ob1;
                        Lavadora lav2 = (Lavadora) ob2;
                        if (lav1.getPrecioFinal() < lav2.getPrecioFinal()) {
                            resultado = -1;
                        } else if (lav1.getPrecioFinal() > lav2.getPrecioFinal()) {
                            resultado = 1;
                        }
                        return resultado;
                    }
                });
        for (int i = 0; i < lavadoras1.length ; i++) {
            System.out.println( lavadoras1[i].toString() );
        }
    }
}
