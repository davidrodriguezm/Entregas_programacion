package t1.a7;

public class pricipal_7 {
    public static void main(String[] args) {
        Caja a = new Caja(50, 70, 50, Caja.Unidades.cm);
        a.Set_etiqueta("Envio para Don Eufrasio Marrajo Zurcido. Entregar en calle Falsa 123");
        System.out.println("El volumen es: " + a.getVolumen() + " metros cubicos");
        System.out.println(a.toString());
        Caja b = new Caja(0.9, 1.3, 1.0, Caja.Unidades.m);
        b.Set_etiqueta("Envio para Doña Oristila Piesverdes Zuzunaga. Entregar en calle Sumergida 7");
        System.out.println("El volumen es: " + b.getVolumen() + " metros cubicos");
        System.out.println(b.toString());
    }
}
