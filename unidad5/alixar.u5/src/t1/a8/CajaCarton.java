package t1.a8;

import t1.a7.Caja;

public class CajaCarton extends Caja {
    static double carton_total = 0;
    protected double volumen_carton;
    private int etiqueta_carton;

    public CajaCarton(double ancho, double alto, double fondo, int etiqueta) {
        super(ancho, alto, fondo, Unidades.cm);
        etiqueta_carton = etiqueta;
        double area_carton = 2 * ( ancho * alto + ancho * fondo + ancho * fondo );
        carton_total += area_carton;
    }
    @Override
    public double getVolumen() {
        volumen_carton = (ancho * alto * fondo) * 0.8;
        return volumen_carton;
    }
    @Override
    public String toString() {
        String cadena = "Ancho: " + ancho + u +" Alto: " + alto + u + " Fondo: " + fondo + u +
                " Codigo: " + etiqueta_carton + "\nEl total de caton usado es: " + carton_total +
                " centimetros cuadrados";
        return cadena;
    }
}
