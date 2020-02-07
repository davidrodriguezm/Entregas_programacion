package t3.a3;

import t3.a2.Cola;

public class ColaLista  implements Cola {
    private Lista_3 cola_lista;

    public ColaLista() {
        this.cola_lista = new Lista_3();
    }

    @Override
    public void encolar(Integer nuevo_elem) {
        cola_lista.inser_final(nuevo_elem);
    }

    @Override
    public Integer desencolar() {
        Integer devolver = null;
        devolver = cola_lista.get_elemento(0);
        cola_lista.eliminar_indice(0);
        return devolver;
    }

    public void mostrar_informacion() {
        cola_lista.mostrar_informacion();
    }

    public String toString() {
        return cola_lista.toString();
    }
}
