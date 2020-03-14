import java.io.*;
import java.util.*;

public class Coronavirus  implements Serializable {
    HashMap<Character, TreeSet<Pacientes>> infectados;
    private String nombre;
    private String origen;

    public Coronavirus(String nombre, String origen) {
        infectados = new HashMap<>();
        this.nombre = nombre;
        this.origen = origen;
    }

    public void addPaciente(Character cepa, Pacientes paciente) {
        Set<Map.Entry<Character,TreeSet<Pacientes>>> clave_valor = infectados.entrySet();
        if ( cepa.equals(paciente.getCepa()) ) {
            boolean esta = false;
            for (Iterator<Map.Entry<Character,TreeSet<Pacientes>>> ite = clave_valor.iterator(); ite.hasNext(); ) {
                Map.Entry<Character, TreeSet<Pacientes>> temp = ite.next();
                if ( temp.getKey() == paciente.getCepa() ) {
                    esta = true;
                    TreeSet<Pacientes> incluye = temp.getValue();
                    incluye.add(paciente);
                    infectados.put(cepa,incluye);
                    break;
                }
            }
            if ( !esta ) {
                TreeSet<Pacientes> incluye_sino = new TreeSet<>();
                incluye_sino.add(paciente);
                infectados.put(cepa,incluye_sino);
            }
        } else {
            System.out.println("El paciente no tiene esa cepa");
        }
    }

    public void darDeAltaPaciente( Pacientes paciente ) {
        if ( infectados.get(paciente.getCepa()) != null ) {
            TreeSet<Pacientes> borra = infectados.get(paciente.getCepa());
            if ( !borra.remove(paciente) ) {
                System.out.println("No se ha encontrado el paciente");
            }
        } else {
            System.out.println("No se ha encontrado el paciente");
        }
    }

    public void pacientesDeUnDoctor(Integer num_colegiado) {

    }

    public void pacientesporPeso(Character cepa) {
        TreeSet<Pacientes> orpeso = infectados.get(cepa);
        System.out.println(orpeso);
    }

    public void pacientesporEdad(Character cepa) {

    }

    public void cargarPacientes() {
        try (ObjectInputStream entrada = new ObjectInputStream( new FileInputStream("src\\pacientes.dat"))){
            infectados = (HashMap<Character, TreeSet<Pacientes>>) entrada.readObject();
        } catch ( Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void guardarPacientes() {
        try (ObjectOutputStream salida = new ObjectOutputStream( new FileOutputStream("src\\pacientes.dat"))){
            salida.writeObject(infectados);
        } catch ( Exception e) {
            System.out.println(e.getMessage());
        }

    }

    @Override
    public String toString() {
        return "Coronavirus{" +
                "infectados=" + infectados +
                ", nombre='" + nombre + '\'' +
                ", origen='" + origen + '\'' +
                '}';
    }
}
