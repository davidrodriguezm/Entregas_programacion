package t2.a2;

public class Cliente implements Comparable {
    protected String dni;
    protected String nombre;
    protected int edad;
    protected double saldo;

    public Cliente( String dni, String nombre, int edad, double saldo  ) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.saldo = saldo;
    }

    public boolean equals( Object otro ) {
        Cliente otro_cliente = (Cliente) otro;
        return this.dni.equals( otro_cliente.dni);
    }

    @Override
    public int compareTo( Object otro ) {
        Cliente otro_cliente = (Cliente) otro;
        return this.dni.compareTo( otro_cliente.dni);
    }

    public String toString() {
        String cadena = "DNI: " + dni + ", nombre: " + nombre + ", edad: " + edad + ", saldo: " + saldo;
        return cadena;
    }
}
