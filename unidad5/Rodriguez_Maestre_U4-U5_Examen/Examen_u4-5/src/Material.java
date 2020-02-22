public abstract class Material implements Comparable {
    private String nombre;
    private int masa;
    private int ca_quemarse;
    private int ca_diluirse;
    private boolean movibles;

    public Material(String nombre, int masa, int ca_quemarse, int ca_diluirse, boolean movibles) {
        if ( masa > 1000 || masa < 1){
            this.masa = 500;
        } else {
            this.masa = masa;
        }
        if ( ca_quemarse > 100 || ca_quemarse < 0 ){
            this.ca_quemarse = 50;
        } else {
            this.ca_quemarse = ca_quemarse;
        }
        if ( ca_diluirse > 100 || ca_diluirse < 0 ){
            this.ca_quemarse = 50;
        } else {
            this.ca_diluirse = ca_diluirse;
        }
        this.nombre = nombre;
        this.movibles = movibles;
    }

    public int getMasa() {
        return masa;
    }

    public int getCa_quemarse() {
        return ca_quemarse;
    }

    public int getCa_diluirse() {
        return ca_diluirse;
    }

    @Override
    public int compareTo( Object otro_materiaal) {
        Material otro = (Material) otro_materiaal;
        int resultado;
        if ( masa < otro.getMasa() ) {
            resultado = -1;
        } else if ( masa > otro.getMasa() ) {
            resultado = 1;
        } else {
            resultado = 0;
        }
        return resultado;
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + ", masa=" + masa + ", capacidad de quemarse= " + ca_quemarse +
                ", capacidad de diluirse= " + ca_diluirse + ", movible= " + movibles;
    }
}