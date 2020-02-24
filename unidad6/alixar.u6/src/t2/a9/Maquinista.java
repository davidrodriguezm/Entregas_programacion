package t2.a9;

import java.io.Serializable;

public class Maquinista implements Serializable {
    String nombre_com;
    String dni;
    double sueldo_men;
    String rango;

    public Maquinista(String nombre, String dni, double sueldo, String rango) {
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
