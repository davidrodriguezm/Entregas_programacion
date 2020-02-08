public abstract class Vehiculos {
    protected String nombre;
    protected int plazas;
    protected int transporta = 0;

    @Override
    public String toString() {
        return "nombre: " +  nombre + ", numero de plazas: " + plazas + ", transporta: " + transporta + " ";
    }

    public void Transportar(int transporta) {
        this.transporta = transporta;
    }
}
