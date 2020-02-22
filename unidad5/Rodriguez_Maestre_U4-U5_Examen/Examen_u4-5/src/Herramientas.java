public abstract class Herramientas extends Material {

    public Herramientas(String nombre, int masa, int ca_quemarse, int ca_diluirse, boolean movibles) {
        super(nombre, masa, ca_quemarse, ca_diluirse, movibles);
    }

    @Override
    public String toString() {
        String cadena = "Material: herramienta, ";
        cadena += super.toString();
        return cadena;
    }
}
