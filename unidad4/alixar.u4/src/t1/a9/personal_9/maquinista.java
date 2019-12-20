package t1.a9.personal_9;

public class maquinista {
    String nombre_com;
    String dni;
    double sueldo_men;
    String rango;

    public maquinista(String nombre, String dni, double sueldo, String rango) {
        nombre_com = nombre;
        this.dni = dni;
        sueldo_men = sueldo;
        this.rango = rango;
    }
    public void mostrar_informacion() {
        System.out.println( "Maquinista: " + nombre_com + ", dni: " + dni +
                ", sueldo mensual: " + sueldo_men + " y rango: " + rango);
    }
}
