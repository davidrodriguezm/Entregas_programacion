package t2.a3;

public class Cuadrado extends PoligonoRegular {

    public Cuadrado(double lado, Colores color) {
        this.lado = lado;
        this.color = color;
        contadorPoligonos++;
    }

    public Cuadrado() {
        lado = 10;
        color = Colores.azul;
        contadorPoligonos++;
    }

    @Override
    public double getArea() {
        double area = Math.pow(lado,2);
        return area;
    }

    @Override
    public String toString() {
        return "Cuadrado datos: " + "color= " + color + ", lado= " + lado +
                ", area= " + getArea();
    }
}
