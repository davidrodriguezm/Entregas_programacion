package t1.a9.maquinaria_9;

import t1.a9.personal_9.mecanico;

public class locomotora {
    String matricula;
    int potencia;
    int year_fafricacion;
    mecanico meca;

    public locomotora( String matricula, int potencia, int year_fafricacion, mecanico meca) {
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
