package tarea8;

import java.util.ArrayList;

public class Alumno {
    private Integer id;
    private String nombre;
    private String apellidos;
    private Integer edad;
    private ArrayList<Asignatura> asignaturas;

    public Alumno(Integer id, String nombre, String apellidos, Integer edad, ArrayList<Asignatura> asignaturas) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.asignaturas = asignaturas;
    }

    public Alumno(Integer id, String nombre, String apellidos, Integer edad) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public Integer getId() {
        return id;
    }

    public void setAsignaturas(ArrayList<Asignatura> asignaturas) {
        this.asignaturas = asignaturas;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", asignaturas=" + asignaturas +
                '}';
    }
}
