package t3.a1;

public class ExceptionEdadNegativa extends Exception {
    public ExceptionEdadNegativa(int edad) {
        super("Error: la edad no puede ser negativa: " + edad);
    }
}
