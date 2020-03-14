package t4;

import java.io.Serializable;

public class Persona implements Serializable {
    private String dni;
    private String nombre;
    private int edad;
    private float estatura;

    public Persona(String dni, String nombre, int edad, float estatura) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
    }

    public String getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    @Override
    public String toString() {
        return "dni= " + dni + ", nombre= " + nombre + ", edad= " + edad + ", estatura= " + estatura ;
    }
}
