package tarea3;

public class principal_3 {
    public static void main(String[] args) {
        ArbolDOMPersonas arbol = new ArbolDOMPersonas("src\\main\\java\\tarea3\\PersonasTarea3.xml");
        Persona3 p1 = new Persona3("Ambrosio",32);
        Persona3 p2 = new Persona3("Ortensia",26);
        arbol.addPersona(p1);
        arbol.addPersona(p2);
        System.out.println("Se muestran los valores de edad introducidos en las personas, " +
                "Ambrosio tiene 32 y Ortensia 26.\n");
        arbol.leeDOM();
        p1.setEdad(57);
        p2.setEdad(63);
        arbol.addPersona(p1);
        arbol.addPersona(p2);
        System.out.println("\nSe cambian los valores de edad y se introducen de nuevo las mismas personas, " +
                "Ambrosio tiene ahora 57 y Ortensia 63.\n");
        arbol.leeDOM();
    }
}
