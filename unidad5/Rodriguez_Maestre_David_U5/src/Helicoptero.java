public class Helicoptero extends Aereo {

    public Helicoptero(String nombre, int plazas, int altitud, String codigo) {
        super(nombre, plazas, altitud, codigo);
    }

    public String toString() {
        String cadena = super.toString();
        cadena = "Helicoptero: " + cadena;
        return cadena;
    }

    public String volar() {
        String cadena = "tipo de aeronave helicoptero, altura: " + altitud;
        return cadena;
    }
}
