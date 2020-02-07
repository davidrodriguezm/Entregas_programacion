package t2.a3;

public abstract class PoligonoRegular implements Figura {
    public enum Colores {amarillo, azul, rojo, verde}
    public Colores color;
    protected double lado;
    static int contadorPoligonos = 0;
}
