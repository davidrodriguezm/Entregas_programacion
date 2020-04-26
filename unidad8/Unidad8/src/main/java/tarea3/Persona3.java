package tarea3;

import java.io.Serializable;

class Persona3 implements Serializable {
    private String nombre;
    private int edad;

    public Persona3(String nombre, int edad) {

        this.nombre=nombre;

        this.edad=edad;



    }

    public Persona3(){

        this.nombre=null;

    }

    public void setNombre (String nom) { nombre=nom;}

    public void setEdad (int ed) {edad=ed;}

    public String getNombre() {return nombre;}

    public int getEdad() {return edad;}
}
