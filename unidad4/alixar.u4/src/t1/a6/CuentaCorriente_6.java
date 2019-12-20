package t1.a6;

public class CuentaCorriente_6 {
    private double saldo;
    private int limite_descubimiento;
    private String nombre;
    private String dni;
    private banco_6 banco;

    public CuentaCorriente_6(String nombre, String dni, banco_6 banco_6) {
        this.nombre = nombre;
        this.dni = dni;
        banco = banco_6;
        limite_descubimiento = -50;
        saldo = 0;
    }
    public CuentaCorriente_6(String nombre, String dni ) {
        this.nombre = nombre;
        this.dni = dni;
        limite_descubimiento = -50;
        saldo = 0;
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
    public void cambiar_banco(banco_6 banco_6) {
        banco = banco_6;
    }

    public void ingresar_dinero(double ingreso) {
        saldo += ingreso;
    }
    public void mostrar_informacion() {
        System.out.println( "La cuentacorriente pertenece a: " + nombre + " con dni " + dni);
        System.out.println( "Tiene un saldo de: " + saldo + " euros");
        System.out.println( "Tiene un limite de descubierto de: " + limite_descubimiento + " euros");
        if ( banco == null ) {
            System.out.println( "Cuenta no asociada a un banco");
        } else {
            banco.informacion();
        }
    }
}
