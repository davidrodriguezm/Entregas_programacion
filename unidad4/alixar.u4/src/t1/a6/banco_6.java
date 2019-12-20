package t1.a6;

public class banco_6 {
    private String nombre;
    private double capital_millones;
    private String direccion;

    public banco_6 ( String nombre, String dierccion , double capital) {
        this.nombre = nombre;
        this.direccion = dierccion;
        capital_millones = capital;
    }
    public banco_6 ( String nombre, String dierccion ) {
        this.nombre = nombre;
        this.direccion = dierccion;
        capital_millones = 5.2;
    }
    public void set_direccion( String direccion ) {
        this.direccion = direccion;
    }
    public void set_capital( double capital ) {
        capital_millones = capital;
    }
    public void informacion() {
        System.out.println( "Banco: " + nombre);
        System.out.println( "Capital: " + capital_millones + " millones");
        System.out.println( "Dirección: " + direccion);
    }
}
