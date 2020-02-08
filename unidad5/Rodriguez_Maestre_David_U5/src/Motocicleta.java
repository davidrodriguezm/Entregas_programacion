public class Motocicleta extends Terrestre {

    public Motocicleta(String nombre, int plazas, String matricula, int fecha_fabricacion, Colores color) {
        super(nombre, plazas, matricula, fecha_fabricacion, color);
    }

    @Override
    public String toString() {
        String cadena = super.toString();
        cadena = "Motocicleta: " + cadena;
        return cadena;
    }
}
