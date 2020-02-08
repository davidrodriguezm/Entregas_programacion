public class Avioneta extends Aereo {

    public Avioneta(String nombre, int plazas, int altitud, String codigo) {
        super(nombre, plazas, altitud, codigo);
    }

    public String toString() {
        String cadena = super.toString();
        cadena = "Avioneta: " + cadena;
        return cadena;
    }

    public String volar() {
        String cadena = "tipo de aeronave avioneta, altura: " + altitud;
        return cadena;
    }
}
