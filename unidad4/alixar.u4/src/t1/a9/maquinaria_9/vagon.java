package t1.a9.maquinaria_9;

import t1.a9.principal_9.mercancia;

class vagon {
    int capa_max;
    int capa_actual;
    mercancia carga;

    public vagon(int capa_max, int capa_actual, mercancia carga) {
        this.capa_max = capa_max;
        this.capa_actual = capa_actual;
        this.carga = carga;
    }
    public void mostrar_informacion() {
        System.out.println(" con capacidad maxima de: " + capa_max + ", capacidad actual: " + capa_actual +
                " y mercancia: " + carga );
    }
}
