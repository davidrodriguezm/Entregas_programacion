package tarea6;

import java.util.ArrayList;

public class Futbolista_6 {
    private int dorsal;
    private String nombre;
    private ArrayList<String> demarcaciones;
    private String procede;

    public Futbolista_6(int dorsal, String nombre, ArrayList<String> demarcaciones, String procede) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.demarcaciones = demarcaciones;
        this.procede = procede;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getDemarcaciones() {
        return demarcaciones;
    }

    @Override
    public String toString() {
        return "Futbolista{" + "dorsal=" + dorsal + ", nombre='" + nombre + '\'' + ", dermacaciones=" + demarcaciones +
                ", procede='" + procede + '\'' + '}';
    }

}
