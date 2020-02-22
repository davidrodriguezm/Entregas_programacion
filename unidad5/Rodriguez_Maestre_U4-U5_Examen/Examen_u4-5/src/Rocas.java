public class Rocas extends Material {
    private int dureza;

    public Rocas(String nombre, int masa, int ca_quemarse, int ca_diluirse, boolean movibles, int dureza) {
        super(nombre, masa, ca_quemarse, ca_diluirse, movibles);
        this.dureza = dureza;
    }

    @Override
    public String toString() {
        String cadena = "Material: roca, dureza= " + dureza + ", ";
        cadena += super.toString();
        return cadena;
    }
}
