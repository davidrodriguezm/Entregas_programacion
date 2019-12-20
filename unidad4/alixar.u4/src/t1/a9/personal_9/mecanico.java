package t1.a9.personal_9;

public class mecanico {
    String nombre_com;
    String telefono;
    String especialidad;

    public mecanico(String nombre, String telefono, String especialidad) {
        nombre_com = nombre;
        this.telefono = telefono;
        this.especialidad = especialidad;
    }
    public void mostrar_informacion() {
        System.out.println( "Mecanico: " + nombre_com + " con telefono " + telefono +
                " y especialidad: " + especialidad);
    }
}
