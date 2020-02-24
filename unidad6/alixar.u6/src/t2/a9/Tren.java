package t2.a9;

import java.io.Serializable;

public class Tren implements Serializable {
    Locomotora loco;
    Vagon vagones[];
    Maquinista responsable;
    private int cont_vagones;
    final int vagones_max = 5;

    public Tren(Locomotora loco, Maquinista responsable) {
        this.loco = loco;
        this.responsable = responsable;
        vagones = new Vagon[vagones_max];
        cont_vagones = 0;
    }
    public void conecta_vagon( int capa_max, int capa_actual, mercancia carga) {
        if ( capa_max >= capa_actual && cont_vagones < vagones_max ) {
            Vagon v = new Vagon( capa_max, capa_actual, carga);
            vagones[cont_vagones] = v;
            cont_vagones++;
        } else if ( cont_vagones < vagones_max) {
            System.out.println("No se puede crear capacida maxima: " + capa_max +
                    " menor a capacidad actual: " + capa_actual);
        } else {
            System.out.println("Se ha alcanzado el maximo de vagones: " + vagones_max);
        }

    }
    public void mostrar_informacion() {
        System.out.println("Caracteristicas del Tren:");
        loco.mostrar_informacion();
        responsable.mostrar_informacion();
        System.out.println("Con los vagones:");
        for (int i = 0; i < cont_vagones ; i++) {
            System.out.print("Vagon " + ( i + 1 ));
            vagones[i].mostrar_informacion();
        }
    }
}
