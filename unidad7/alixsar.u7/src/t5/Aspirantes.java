package t5;

import java.io.*;
import java.util.HashSet;
import java.util.TreeMap;

public class Aspirantes implements Comparable, Serializable {
    private String dni;
    private String nombre;
    private String telefono;
    private Integer numero_identificacion;
    static Integer cont_num_identificativo = 1;
    static TreeMap<Integer,Aspirantes> lista_aspirantes = new TreeMap<Integer,Aspirantes>();
    static HashSet<Integer> identificativos = new HashSet<Integer>();

    public Aspirantes(String dni, String nombre, String telefono) {
        this.dni = dni;
        this.nombre = nombre;
        this.telefono = telefono;
        this.numero_identificacion = cont_num_identificativo;
        cont_num_identificativo++;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getNumero_identificacion() {
        return numero_identificacion;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public int compareTo(Object o) {
        Aspirantes a = (Aspirantes) o;
        return nombre.compareToIgnoreCase(a.getNombre());
    }

    public static void InsertaAspirante(Aspirantes a)  {
        lista_aspirantes.put(a.getNumero_identificacion(),a);
        identificativos.add(a.getNumero_identificacion());
    }


    public static void guardarFicheros()  {
        ObjectOutputStream salida_1 = null;
        ObjectOutputStream salida_2 = null;
        try {
            salida_1 = new ObjectOutputStream( new FileOutputStream("src\\t5\\aspirantes.dat"));
            salida_2 = new ObjectOutputStream( new FileOutputStream("src\\t5\\ids_aspirantes.dat"));
            salida_2.writeObject(identificativos);
            salida_1.writeObject(lista_aspirantes);
        } catch ( FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch ( Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if ( salida_1 != null ) {
                    salida_1.close();
                }
                if ( salida_2 != null ) {
                    salida_2.close();
                }
            } catch (IOException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        Aspirantes a = (Aspirantes) o;
        return numero_identificacion.equals(a.getNumero_identificacion());
    }

    @Override
    public String toString() {
        return "Aspirantes{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", numero_identificacion=" + numero_identificacion +
                '}';
    }
}
