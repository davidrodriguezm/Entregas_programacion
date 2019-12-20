package t1.a7;

public class sincronizador_7 {
    private final double frecu_min = 80;
    private final double frecu_max = 108;
    private double frecu_sinto = 80;


    sincronizador_7(double frecuencia) {
        if ( frecuencia < frecu_min ) {
            frecu_sinto = frecu_max;
        } else if ( frecuencia > frecu_max ) {
            frecu_sinto = frecu_min;
        } else {
            frecu_sinto = frecuencia;
        }
    }
    public void ajustar_rango() {
        if ( frecu_sinto < frecu_min ) {
            frecu_sinto = frecu_max;
        }
        if ( frecu_sinto > frecu_max ) {
            frecu_sinto = frecu_min;
        }
    }
    public void up() {
        frecu_sinto += 0.5;
        ajustar_rango();
    }
    public void down() {
        frecu_sinto -= 0.5;
        ajustar_rango();
    }
    public void display() {
        System.out.println("Frecuencia sintonizada " + frecu_sinto + " HMz");
    }
}
