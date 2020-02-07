package t1.a9;

public class Television extends Electrodomestico {
    protected int resolucion;
    protected boolean sintonizador;

    public Television() {
        super();
        resolucion = 20;
        sintonizador = false;
    }

    public Television( double precio, double peso ) {
        super(precio, peso );
    }

    public Television( int resolucion, boolean sintonizador ) {
        super();
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public double getResolucion() {
        return resolucion;
    }

    public boolean getSintonizador() {
        return sintonizador;
    }

    @Override
    public double getPrecioFinal() {
        precio_final = super.getPrecioFinal();
        if ( resolucion > 40 ) {
            precio_final = precio_final * 1.3;
        }
        if ( sintonizador ) {
            precio_final += 50;
        }
        return precio_final;
    }

    @Override
    public String toString() {
        String cadena = "Ficha de television, consumo electrico: " + consumo + ", peso: " + peso +
                ", color: " + color + ", resolucion: " + resolucion + " pulgadas " + ", precio base: " +
                precio_base + ", precio final: " + getPrecioFinal();
        if ( sintonizador ) {
            cadena += ", sintonizador TDT incorporado";
        }
        return cadena;
    }
}
