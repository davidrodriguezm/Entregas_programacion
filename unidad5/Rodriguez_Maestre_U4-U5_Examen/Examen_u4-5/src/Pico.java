public class Pico extends Herramientas {
    private int grosor;

    public Pico(String nombre, int masa, int ca_quemarse, int ca_diluirse, boolean movibles, int grosor) {
        super(nombre, masa, ca_quemarse, ca_diluirse, movibles);
        this.grosor = grosor;
    }

    @Override
    public String toString() {
        String cadena = "Material: pico , grosor: " + grosor +", ";
        cadena += super.toString();
        return cadena;
    }
}
