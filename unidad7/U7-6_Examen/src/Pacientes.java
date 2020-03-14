import java.io.Serializable;

public class Pacientes implements Serializable, Comparable {
    private String nombre;
    private Integer edad;
    private Integer peso;
    private Boolean vacunas;
    private Medico medi;
    private Character cepa;

    public Pacientes(String nombre, Integer edad, Integer peso, Boolean vacunas, Medico medi, Character cepa) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.vacunas = vacunas;
        this.medi = medi;
        this.cepa = cepa;
    }

    public Character getCepa() {
        return cepa;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getPeso() {
        return peso;
    }

    @Override
    public boolean equals( Object otro) {
        Pacientes p = (Pacientes) otro;
        return nombre.equalsIgnoreCase(p.getNombre());
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", vacunas=" + vacunas +
                ", medi=" + medi +
                ", cepa=" + cepa +
                '}';
    }

    @Override
    public int compareTo(Object otro) {
        Pacientes p = (Pacientes) otro;
        return p.getPeso()-peso;
    }
}
