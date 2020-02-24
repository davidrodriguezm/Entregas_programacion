package t3.a1;

public class principal_3_1 {
    public static void main(String[] args)  {
        try {
            Cliente c1 = new Cliente("878Z", "Joni Melavo", -56, -10.33);
        } catch (ExceptionEdadNegativa | ExceptionDemasiadaEdad | ExceptionMenorEdad e ) {
            System.out.println(e.getMessage());
        }

        try {
            Cliente c2 = new Cliente("666J", "Gorke Zurcido", 15, 500.5);
        } catch (ExceptionEdadNegativa | ExceptionDemasiadaEdad | ExceptionMenorEdad e) {
            System.out.println(e.getMessage());
        }

        try {
            Cliente c3 = new Cliente("464F", "Oristila Marrajo", 115, 1783.45);
        } catch (ExceptionEdadNegativa | ExceptionDemasiadaEdad | ExceptionMenorEdad e) {
            System.out.println(e.getMessage());
        }

        try {
            Cliente c4 = new Cliente("132A", "Eufrasio Piesverdes", 47, 130.21);
            Cliente c5 = new Cliente("577E", "Dombina Anacleto", 39, 4563.8);
        } catch(ExceptionEdadNegativa | ExceptionDemasiadaEdad | ExceptionMenorEdad e) {
            System.out.println("Aquí no llega nunca");
        }

    }
}
