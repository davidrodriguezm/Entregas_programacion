package t2.a1;

public class PilaLista implements Pila {
    private Lista pila_lista;
    private int eleme_lista;

    public PilaLista() {
        this.pila_lista = new Lista();
    }

    @Override
    public void apilar(Integer nuevo_elem ) {
        pila_lista.inser_final(nuevo_elem);
    }

    @Override
    public Integer desapilar() {
        eleme_lista = pila_lista.get_numero_elementos();
        Integer devuelve = pila_lista.get_indice(eleme_lista - 1);
        pila_lista.eliminar_indice(eleme_lista - 1);
        return devuelve;
    }
}
