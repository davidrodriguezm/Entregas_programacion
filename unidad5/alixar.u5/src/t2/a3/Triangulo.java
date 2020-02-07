package t2.a3;

public class Triangulo extends PoligonoRegular implements Comparable {
    protected double altura;

    public Triangulo(double altura, double base, Colores color) {
        this.altura = altura;
        lado = base;
        this.color = color;
        contadorPoligonos++;
    }

    public Triangulo() {
        altura = 10;
        lado = 10;
        color = Colores.azul;
        contadorPoligonos++;
    }

    @Override
    public double getArea() {
        double area = (altura * lado)/2;
        return area;
    }

    public int compareTo( Object otro ) {
        Triangulo otro_Trianguloe= (Triangulo) otro;
        int resultado = 0;
        if ( lado < otro_Trianguloe.lado) {
            resultado = -1;
        } else if (lado > otro_Trianguloe.lado) {
            resultado = 1;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "Triangulo datos: " + "altura= " + altura + ", color= " + color +
                ", lado= " + lado + ", area= " + getArea();
    }
}
