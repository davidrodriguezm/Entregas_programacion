package t2.a3;

public class Circulo implements Figura {
    protected double radio;
    protected PoligonoRegular.Colores color;

    public Circulo(double radio, PoligonoRegular.Colores color) {
        this.radio = radio;
        this.color = color;
    }

    public Circulo() {
        radio = 10;
        color = PoligonoRegular.Colores.azul;
    }

    @Override
    public double getArea() {
        double area = Math.PI * Math.pow(radio,2);
        return area;
    }

    @Override
    public String toString() {
        return "Circulo datos: " + "radio= " + radio + ", color= " + color +
                ", area= " + getArea();
    }
}
