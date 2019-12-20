package t1.a2;

public class CuentaCorriente_2 {
    private double saldo;
    private int limite_descubimiento;
    private String nombre;
    private String dni;

    public CuentaCorriente_2(String nombre, String dni) {
        this.saldo = 0;
        this.nombre = nombre;
        this.dni = dni;
        this.limite_descubimiento = -50;
    }
    public CuentaCorriente_2(int saldo, int limite_descubimiento, String dni) {
        this.saldo = saldo;
        this.limite_descubimiento = limite_descubimiento;
        this.dni = dni;
    }
    public boolean sacar_dinero(double peticion) {
        boolean resultado = false;
        if ((saldo - peticion) >= limite_descubimiento) {
            saldo -= peticion;
            resultado = true;
            System.out.println( "Se hen sacado " + peticion + " euros");
        } else {
            System.out.println( "No se apodido sacar dinero");
        }
        return resultado;
    }

    public void ingresar_dinero(double ingreso){
        saldo += ingreso;
    }

    public void mostrar_informacion() {
        System.out.println( "La cuentacorriente pertenece a: " + nombre + " con dni " + dni);
        System.out.println( "Tiene un saldo de: " + saldo + " euros");
        System.out.println( "Tiene un limite de descubierto de: " + limite_descubimiento + " euros");
    }
}
