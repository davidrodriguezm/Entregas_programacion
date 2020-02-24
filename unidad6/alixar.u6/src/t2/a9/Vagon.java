package t2.a9;


import java.io.Serializable;

class Vagon implements Serializable {
    int capa_max;
    int capa_actual;
    mercancia carga;

    public Vagon(int capa_max, int capa_actual, mercancia carga) {
        this.capa_max = capa_max;
        this.capa_actual = capa_actual;
        this.carga = carga;
    }
    public void mostrar_informacion() {
        System.out.println(" con capacidad maxima de: " + capa_max + ", capacidad actual: " + capa_actual +
                " y mercancia: " + carga );
    }
}

