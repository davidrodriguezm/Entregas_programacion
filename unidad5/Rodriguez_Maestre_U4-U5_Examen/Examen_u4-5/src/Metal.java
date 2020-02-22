public class Metal extends Material {
    private boolean imantable;

    public Metal(String nombre, int masa, int ca_quemarse, int ca_diluirse, boolean movibles, boolean imantable) {
        super(nombre, masa, ca_quemarse, ca_diluirse, movibles);
        this.imantable = imantable;
    }

    @Override
    public String toString() {
        String cadena = "Material: metal, imantable= " + imantable + ", ";
        cadena += super.toString();
        return cadena;
    }
}
