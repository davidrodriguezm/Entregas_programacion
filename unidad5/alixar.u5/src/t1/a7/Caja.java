package t1.a7;

public class Caja {
    public enum Unidades {cm,m}
    protected double ancho;
    protected double alto;
    protected double fondo;
    protected Unidades u;
    protected double volumen;
    protected String etiqueta = "";

    public Caja( double ancho, double alto, double fondo, Unidades u) {
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.u = u;
    }
    public void Set_etiqueta( String etiqueta ){
        this.etiqueta = etiqueta;
    }
    public double getVolumen() {
            switch ( u ) {
                case cm:
                    volumen = (ancho / 100) * (alto / 100) * (fondo / 100);
                    break;
                case m:
                    volumen = ancho * alto * fondo;
                    break;
            }
        return volumen;
    }
    public String toString() {
        String cadena = "Ancho: " + ancho + u +" Alto: " + alto + u + " Fondo: " + fondo + u + " " + etiqueta;
        return cadena;
    }
}
