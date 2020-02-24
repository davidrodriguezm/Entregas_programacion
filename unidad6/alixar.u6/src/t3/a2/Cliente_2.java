package t3.a2;

public class Cliente_2 implements Comparable  {
    protected String dni;
    protected String nombre;
    protected int edad;
    protected double saldo;

    public Cliente_2(String dni, String nombre, int edad, double saldo  )
            throws ExceptionEdadNegativa_2, ExceptionMenorEdad_2, ExceptionDemasiadaEdad_2 {
        if (edad < 0) {
            throw new ExceptionEdadNegativa_2(edad);
        } else if (edad < 18) {
            throw new ExceptionMenorEdad_2(edad);
        } else if (edad > 100) {
            throw new ExceptionDemasiadaEdad_2(edad);
        }
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
        this.saldo = saldo;
    }

    public boolean equals( Object otro ) {
        Cliente_2 otro_cliente = (Cliente_2) otro;
        return this.dni.equals( otro_cliente.dni);
    }

    @Override
    public int compareTo( Object otro ) {
        Cliente_2 otro_cliente = (Cliente_2) otro;
        return this.dni.compareTo( otro_cliente.dni);
    }

    public String toString() {
        String cadena = "DNI: " + dni + ", nombre: " + nombre + ", edad: " + edad + ", saldo: " + saldo;
        return cadena;
    }
}
