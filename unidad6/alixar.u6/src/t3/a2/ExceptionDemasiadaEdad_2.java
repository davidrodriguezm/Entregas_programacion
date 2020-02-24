package t3.a2;

public class ExceptionDemasiadaEdad_2 extends Exception {
    public ExceptionDemasiadaEdad_2(int edad) {
        super("Error: El cliente es demasiado viejo: " + edad);
    }
}
