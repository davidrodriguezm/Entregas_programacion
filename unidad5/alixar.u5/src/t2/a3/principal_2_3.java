package t2.a3;

import java.util.Arrays;
import java.util.Comparator;

import static t2.a3.PoligonoRegular.contadorPoligonos;

public class principal_2_3 {
    public static void main(String[] args) {
        Figura[] figuras_geometricas = new Figura[5];
        figuras_geometricas[0] = new Cuadrado();
        figuras_geometricas[1] = new Triangulo();
        figuras_geometricas[2] = new Circulo();
        figuras_geometricas[3] = new Cuadrado(34, PoligonoRegular.Colores.amarillo);
        figuras_geometricas[4] = new Circulo(24.5, PoligonoRegular.Colores.verde);
        for (int i = 0; i < figuras_geometricas.length; i++) {
            System.out.println( figuras_geometricas[i] );
        }
        System.out.println( "El numero de poligonos es de " + contadorPoligonos);
        Triangulo[] triangulos = new Triangulo[5];
        triangulos[0] = new Triangulo(56,7.5, PoligonoRegular.Colores.amarillo);
        triangulos[1] = new Triangulo(46,80, PoligonoRegular.Colores.verde);
        triangulos[2] = new Triangulo(7.8,34, PoligonoRegular.Colores.rojo);
        triangulos[3] = new Triangulo();
        triangulos[4] = new Triangulo(93,53, PoligonoRegular.Colores.verde);
        Arrays.sort(triangulos);
        System.out.println( "Triangulos ordenados por lado:" );
        for (int i = 0; i < triangulos.length; i++) {
            System.out.println( triangulos[i] );
        }
        Arrays.sort(triangulos,
                new Comparator() {
                    public int compare( Object ob1, Object ob2 ){
                        Triangulo t1 = (Triangulo) ob1;
                        Triangulo t2 = (Triangulo) ob2;
                        return t1.color.compareTo(t2.color);
                    }
                });
        System.out.println( "Triangulos ordenados por color:" );
        for (int i = 0; i < triangulos.length; i++) {
            System.out.println( triangulos[i] );
        }
    }
}
