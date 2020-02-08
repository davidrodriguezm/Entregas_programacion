public class Aereo extends Vehiculos {
    protected int altitud;
    protected String codigo;

    public Aereo(String nombre, int plazas, int altitud, String codigo) {
        this.nombre = nombre;
        this.plazas = plazas;
        this.altitud = altitud;
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        String cadena = super.toString();
        cadena += ",codigo: " + codigo + ", altitud: " + altitud;
        return cadena;
    }
}
