package t1.a9;

public class Lavadora extends Electrodomestico implements Comparable {
    protected double carga;

    public Lavadora() {
        super();
        carga = 5;
    }

    public Lavadora( double carga ) {
        super();
        this.carga = carga;
    }

    public Lavadora( double precio, double peso ) {
        super(precio, peso );
        carga = 5;
    }

    public Lavadora( double precio, double peso, double carga ) {
        super(precio, peso );
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    @Override
    public double getPrecioFinal() {
        precio_final = super.getPrecioFinal();
        if ( carga > 30 ) {
            precio_final += 50;
        }
        return precio_final;
    }

    @Override
    public String toString() {
        String cadena = "Ficha de lavadora, consumo electrico: " + consumo + ", peso: " + peso +
                ", color: " + color + ", carga: " + carga + ", precio base: " + precio_base +
                ", precio final: " + getPrecioFinal();
        return cadena;
    }

    @Override
    public boolean equals( Object otraLavadora) {
        Lavadora otra = (Lavadora) otraLavadora;
        boolean iguales;
        if ( getPrecioFinal() == otra.getPrecioFinal() ) {
            iguales = true;
        } else {
            iguales = false;
        }
        return iguales;
    }
    @Override
    public int compareTo( Object o) {
        int resultado = 0;
        Lavadora otraLavadora = (Lavadora) o;
        if ( this.carga < otraLavadora.getCarga() ) {
            resultado = -1;
        } else if ( this.carga > otraLavadora.getCarga() ) {
            resultado = 1;
        }
        return resultado;
    }
}
