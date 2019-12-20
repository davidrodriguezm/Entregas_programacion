package t1.a9.principal_9;

import t1.a9.maquinaria_9.locomotora;
import t1.a9.maquinaria_9.tren;
import t1.a9.personal_9.jefe_estacion;
import t1.a9.personal_9.maquinista;
import t1.a9.personal_9.mecanico;

public class principal_9 {
    public static void main(String[] args) {
        jefe_estacion jefe = new jefe_estacion( "Juan no se que", "123332l");
        jefe.mostrar_informacion();
        mecanico meca = new mecanico("Eufrasio Cañeda", "254 362 543", "Hidraulica");
        maquinista maqui = new maquinista( "Anacleto Marrajo", "666D", 562, "Demente");
        locomotora loco = new locomotora( "88546H", 690, 2016, meca);
        tren tre = new tren( loco, maqui );
        tre.conecta_vagon( 7080, 3640, mercancia.Aguacates );
        //El siguiente no se crea capa_max menor a capa_actual
        tre.conecta_vagon( 5080, 6790, mercancia.Aguacates );
        tre.conecta_vagon( 9480, 3740, mercancia.Vozka );
        tre.conecta_vagon( 9480, 3740, mercancia.Melocotones );
        tre.conecta_vagon( 9480, 3740, mercancia.Petardos );
        tre.conecta_vagon( 9480, 3740, mercancia.Elefantes );
        //El siguiente no se crea, solo se puede 5 vagones
        tre.conecta_vagon( 7080, 3640, mercancia.maquinas_del_tiempo );
        tre.mostrar_informacion();

    }
}
