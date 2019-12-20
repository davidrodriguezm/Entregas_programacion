package t2.a3;
import t2.a1.lista_1;

public class PilaTabla_3 {
    private lista_1 tabla;

    public PilaTabla_3() {
        tabla = new lista_1();
    }

    public void apilar( Integer nuevo_elem ) {
        tabla.inser_final(nuevo_elem);
    }
    public void desapilar() {
        tabla.eliminar_indice(tabla.numero_elementos() - 1);
    }
    public void mostrar_informacion() {
        tabla.mostrar_informacion();
    }
}
