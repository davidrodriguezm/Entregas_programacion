package t3.a2;

import java.io.*;
import java.util.Calendar;

public class principal_3_2 {
    public static void main(String[] args)  {
        try( BufferedWriter escribe = new BufferedWriter(new FileWriter("src\\t3\\a2\\excepciones.log")) ) {
            Calendar c = Calendar.getInstance();
            String fecha ="Fecha:  " + c.get(Calendar.DATE) + "/" + c.get(Calendar.MONTH) +"/"
                    + c.get(Calendar.YEAR) + " - ";
            try {
                Cliente_2 c1 = new Cliente_2("878Z", "Joni Melavo", -56, -10.33);
            } catch (ExceptionEdadNegativa_2 | ExceptionDemasiadaEdad_2 | ExceptionMenorEdad_2 e ) {
                String cadena = fecha + e.getMessage();
                escribe.write(cadena);
                escribe.newLine();
            }

            try {
                Cliente_2 c2 = new Cliente_2("666J", "Gorke Zurcido", 15, 500.5);
            } catch (ExceptionEdadNegativa_2 | ExceptionDemasiadaEdad_2 | ExceptionMenorEdad_2 e) {
                String cadena = fecha + e.getMessage();
                escribe.write(cadena);
                escribe.newLine();
            }

            try {
                Cliente_2 c3 = new Cliente_2("464F", "Oristila Marrajo", 115, 1783.45);
            } catch (ExceptionEdadNegativa_2 | ExceptionDemasiadaEdad_2 | ExceptionMenorEdad_2 e) {
                String cadena = fecha + e.getMessage();
                escribe.write(cadena);
                escribe.newLine();
            }

            try {
                Cliente_2 c4 = new Cliente_2("132A", "Eufrasio Piesverdes", 47, 130.21);
                Cliente_2 c5 = new Cliente_2("577E", "Dombina Anacleto", 39, 4563.8);
            } catch(ExceptionEdadNegativa_2 | ExceptionDemasiadaEdad_2 | ExceptionMenorEdad_2 e) {
                String cadena = fecha + e.getMessage();
                escribe.write(cadena);
                escribe.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
