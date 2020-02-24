package t3.a2;

public class ExceptionMenorEdad_2 extends Exception {
    public ExceptionMenorEdad_2(int edad) {
        super("Error: El cliente es menor de edad: " + edad);
    }
}
