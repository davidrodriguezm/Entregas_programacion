package t3.a2;

public class ExceptionEdadNegativa_2 extends Exception {
    public ExceptionEdadNegativa_2(int edad) {
        super("Error: la edad no puede ser negativa: " + edad);
    }
}
