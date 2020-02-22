public class Sierra extends Herramientas {
    private int diametro;

    public Sierra(String nombre, int masa, int ca_quemarse, int ca_diluirse, boolean movibles, int diametro) {
        super(nombre, masa, ca_quemarse, ca_diluirse, movibles);
        this.diametro = diametro;
    }

    @Override
    public String toString() {
        String cadena = "Material: sierra , diametro: " + diametro +", ";
        cadena += super.toString();
        return cadena;
    }
}
