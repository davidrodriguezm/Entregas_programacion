package t1.a9.personal_9;

public class jefe_estacion {
    String nombre_com;
    String dni;

    public jefe_estacion(String nombre, String dni ) {
        nombre_com = nombre;
        this.dni = dni;
    }
    public void mostrar_informacion() {
        System.out.println( "El jefe de estacion: " + nombre_com + " con dni " + dni);
    }
}
