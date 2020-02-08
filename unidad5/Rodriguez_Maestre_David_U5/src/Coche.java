public class Coche extends Terrestre {

    public Coche(String nombre, int plazas, String matricula, int fecha_fabricacion, Terrestre.Colores color) {
        super(nombre,plazas,matricula,fecha_fabricacion,color);
    }

    @Override
    public String toString() {
        String cadena = super.toString();
        cadena = "Coche: " + cadena;
        return cadena;
    }
}
