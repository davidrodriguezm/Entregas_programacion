package t4;

import java.io.Serializable;

public class Empleado extends Persona implements Serializable {
    private int sueldo;

    public Empleado(String dni, String nombre, int edad, float estatura, int sueldo) {
        super(dni, nombre, edad, estatura);
        this.sueldo = sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        String cadena = "Empleado: " + super.toString() + ", sueldo= " + sueldo;
        return cadena;
    }
}
