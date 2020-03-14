import java.io.Serializable;

public class Medico implements Serializable {
    private String nombre;
    private String apellidos;
    private String hospital;
    private Integer num_colegiado;

    public Medico(String nombre, String apellidos, String hospital, Integer num_colegiado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.hospital = hospital;
        this.num_colegiado = num_colegiado;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", hospital='" + hospital + '\'' +
                ", num_colegiado=" + num_colegiado +
                '}';
    }
}
