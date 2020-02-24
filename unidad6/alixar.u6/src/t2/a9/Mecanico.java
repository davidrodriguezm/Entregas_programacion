package t2.a9;

import java.io.Serializable;

public class Mecanico implements Serializable {
    String nombre_com;
    String telefono;
    String especialidad;

    public Mecanico(String nombre, String telefono, String especialidad) {
        nombre_com = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }
    public void mostrar_informacion() {
        System.out.println( "Mecanico: " + nombre_com + " con telefono " + telefono +
                " y especialidad: " + especialidad);
    }
}
