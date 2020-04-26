package tarea7;

import java.util.HashMap;

public class Jugador {
    private Integer id;
    private String nombre;
    private String equipo;
    private HashMap<String,Integer> estadisticas;

    public Jugador(Integer id, String nombre, String equipo, HashMap<String, Integer> estadisticas) {
        this.id = id;
        this.nombre = nombre;
        this.equipo = equipo;
        this.estadisticas = estadisticas;
    }

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public HashMap<String, Integer> getEstadisticas() {
        return estadisticas;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", equipo='" + equipo + '\'' +
                ", estadisticas=" + estadisticas +
                '}';
    }
}
