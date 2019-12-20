package t1.a4;

public class CuentaCorriente_4 {
    private double saldo;
    private int limite_descubimiento;
    private String nombre;
    private String dni;
    static String nom_banco;

    public CuentaCorriente_4(String nombre, String dni) {
        saldo = 0;
        this.nombre = nombre;
        this.dni = dni;
        limite_descubimiento = -50;
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
    public static void banco(String banco) {
        nom_banco = banco;
    }

    public void ingresar_dinero(double ingreso) {
        saldo += ingreso;
    }
    public void mostrar_informacion() {
        System.out.println( "La cuentacorriente pertenece a: " + nombre + " con dni " + dni);
        System.out.println( "Tiene un saldo de: " + saldo + " euros");
        System.out.println( "Tiene un limite de descubierto de: " + limite_descubimiento + " euros");
    }
}
