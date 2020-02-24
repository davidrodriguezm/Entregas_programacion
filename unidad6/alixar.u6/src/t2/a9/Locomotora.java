package t2.a9;

import java.io.Serializable;

public class Locomotora implements Serializable {
    String matricula;
    int potencia;
    int year_fafricacion;
    Mecanico meca;

    public Locomotora(String matricula, int potencia, int year_fafricacion, Mecanico meca) {
        this.matricula = matricula;
        this.potencia = potencia;
        this.year_fafricacion = year_fafricacion;
        this.meca = meca;
    }
    public void mostrar_informacion() {
        System.out.print("Locomotora con matricula: " + matricula + ", potencia: " + potencia +
                ", año de fafricacion: " + year_fafricacion + " y " );
        meca.mostrar_informacion();
    }

}
