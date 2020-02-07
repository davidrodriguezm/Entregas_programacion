package t1.a9;

public class Electrodomestico {
    public enum Colores {Blanco,Negro,Rojo,Azul,Gris}
    public enum Categoria_Consumo {A,B,C,D,E,F}
    protected Colores color;
    protected Categoria_Consumo consumo;
    protected double precio_base;
    protected double peso;
    protected double precio_final;

    public Electrodomestico() {
        color = Colores.Blanco;
        consumo = Categoria_Consumo.F;
        precio_base = 100;
        peso = 5;
    }

    public Electrodomestico( double precio, double peso ) {
        precio_base = precio;
        this.peso = peso;
        color = Colores.Blanco;
        consumo = Categoria_Consumo.F;
    }

    public Electrodomestico( double precio, double peso, Colores color, Categoria_Consumo consumo ) {
        precio_base = precio;
        this.peso = peso;
        this.color = color;
        this.consumo = consumo;
    }

    public Colores getColor() {
        return color;
    }

    public Categoria_Consumo getConsumo() {
        return consumo;
    }

    public double getPrecio_base() {
        return precio_base;
    }

    public double getPeso() {
        return peso;
    }

    public double getPrecioFinal() {
        precio_final = precio_base;
        switch ( consumo ) {
            case A:
                precio_final += 100;
                break;
            case B:
                precio_final += 80;
                break;
            case C:
                precio_final += 60;
                break;
            case D:
                precio_final += 50;
                break;
            case E:
                precio_final += 30;
                break;
            case F:
                precio_final += 10;
                break;
        }
        if ( peso >= 0 && peso <= 29 ) {
            precio_final += 10;
        } else if ( peso >= 30 && peso <= 49 ) {
            precio_final += 60;
        } else if ( peso >= 50 && peso <= 79 ) {
            precio_final += 80;
        } else if ( peso >= 80 ) {
            precio_final += 100;
        }
        return precio_final;
    }
    public String toString() {
        String cadena = "Ficha de electrodomestico, consumo electrico: " + consumo + ", peso: " + peso +
                ", color: " + color + ", precio base: " + precio_base + ", precio final: " + getPrecioFinal();
        return cadena;
    }
}
