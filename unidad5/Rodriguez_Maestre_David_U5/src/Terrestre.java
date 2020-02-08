public class Terrestre extends Vehiculos implements Comparable {
    public enum Colores {amarillo, azul, rojo, verde}
    protected String matricula;
    protected int year_fabricacion;
    protected Colores color;

    public Terrestre(String nombre, int plazas, String matricula, int fecha_fabricacion, Colores color ) {
        this.nombre = nombre;
        this.plazas = plazas;
        this.matricula = matricula;
        this.year_fabricacion = fecha_fabricacion;
        this.color = color;
    }

    @Override
    public String toString() {
        String cadena = super.toString();
        cadena += "matricula: " + matricula + ", fecha_fabricacion: "+ year_fabricacion + ", color: " + color;
        return cadena;
    }

    @Override
    public boolean equals( Object otroveiculo) {
        Terrestre otro = (Terrestre) otroveiculo;
        return matricula.equals(otro.matricula);
    }

    @Override
    public int compareTo( Object otroveiculo) {
        Terrestre otro = (Terrestre) otroveiculo;
        return matricula.compareTo(otro.matricula);
    }

}
