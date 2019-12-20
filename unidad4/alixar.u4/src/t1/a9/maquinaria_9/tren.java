package t1.a9.maquinaria_9;

import t1.a9.personal_9.maquinista;
import t1.a9.principal_9.mercancia;

public class tren {
    locomotora loco;
    vagon vagones[];
    maquinista responsable;
    private int cont_vagones;
    final int vagones_max = 5;

    public tren( locomotora loco, maquinista responsable) {
        this.loco = loco;
        this.responsable = responsable;
        vagones = new vagon[vagones_max];
        cont_vagones = 0;
    }
    public void conecta_vagon( int capa_max, int capa_actual, mercancia carga) {
        if ( capa_max >= capa_actual && cont_vagones < vagones_max ) {
            vagon v = new vagon( capa_max, capa_actual, carga);
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
        System.out.println("Caracteristicas del tren:");
        loco.mostrar_informacion();
        responsable.mostrar_informacion();
        System.out.println("Con los vagones:");
        for (int i = 0; i < cont_vagones ; i++) {
            System.out.print("Vagon " + ( i + 1 ));
            vagones[i].mostrar_informacion();
        }
    }
}
