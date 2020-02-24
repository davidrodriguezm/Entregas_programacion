package t3.a1;

public class ExceptionMenorEdad extends Exception {
    public ExceptionMenorEdad(int edad) {
        super("Error: El cliente es menor de edad: " + edad);
    }
}
