public class Cristal extends Material {
    enum Tipo_ristal { TRANSPARENTE, TRANSLUCIDO }
    private Tipo_ristal tipo;

    public Cristal(String nombre, int masa, int ca_quemarse, int ca_diluirse, boolean movibles, Tipo_ristal tipo) {
        super(nombre, masa, ca_quemarse, ca_diluirse, movibles);
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        String cadena = "Material: cristal, tipo= " + tipo + ", ";
        cadena += super.toString();
        return cadena;
    }
}
