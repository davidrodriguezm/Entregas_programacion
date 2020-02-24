package t2.a9;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class principal_2_9 {
    public static void main(String[] args) {
        ObjectOutputStream salida = null;
        ObjectInputStream entrada = null;
        Mecanico meca_1 = new Mecanico("Ansio Noseque", "254 362 543", "Hidraulica");
        Maquinista maqui_1 = new Maquinista( "Anacleto Marrajo", "666D", 562, "Demente");
        Locomotora loco_1 = new Locomotora( "88546H", 690, 2016, meca_1);
        Tren tre_1 = new Tren( loco_1, maqui_1 );
        tre_1.conecta_vagon( 7080, 3640, mercancia.Aguacates );
        tre_1.conecta_vagon( 9480, 3740, mercancia.Vozka );
        tre_1.conecta_vagon( 9480, 3740, mercancia.Melocotones );
        tre_1.conecta_vagon( 9480, 3740, mercancia.Petardos );
        tre_1.conecta_vagon( 9480, 3740, mercancia.Elefantes );
        Mecanico meca_2 = new Mecanico("Eufrasio Piesverdes", "254 362 543", "Vagear");
        Maquinista maqui_2 = new Maquinista( "Oristila Marrajo", "463D", 562, "Chapuzas");
        Locomotora loco_2 = new Locomotora( "748465j", 890, 2019, meca_2);
        Tren tre_2 = new Tren( loco_2, maqui_2 );
        try {
            salida = new ObjectOutputStream(new FileOutputStream("src\\t2\\a9\\trenes.dat"));
            salida.writeObject(tre_1);
            salida.writeObject(tre_2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (salida != null) {
                    salida.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        try {
            entrada = new ObjectInputStream(new FileInputStream("src\\t2\\a9\\trenes.dat"));
            Tren tren_1 = (Tren) entrada.readObject();
            Tren tren_2 = (Tren) entrada.readObject();
            System.out.println("Los trenes :");
            tre_1.mostrar_informacion();
            tre_2.mostrar_informacion();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (entrada != null) {
                    entrada.close();
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
