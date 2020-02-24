package t3.a1;

public class ExceptionDemasiadaEdad extends Exception {
    public ExceptionDemasiadaEdad(int edad) {
        super("Error: El cliente es demasiado viejo: " + edad);
    }
}
