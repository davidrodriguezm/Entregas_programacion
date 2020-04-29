package tarea8;

public class Asignatura {
    private Integer id;
    private String nombre;
    private Integer alumnoId;

    public Asignatura(Integer id, String nombre, Integer alumnoId) {
        this.id = id;
        this.nombre = nombre;
        this.alumnoId = alumnoId;
    }

    public Integer getAlumnoId() {
        return alumnoId;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", alumnoId=" + alumnoId +
                '}';
    }
}
