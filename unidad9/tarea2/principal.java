package tarea2;


import java.util.List;

public class principal {
    public static void main(String[] args) {
        List<Office> lista_of = ListaOffice.getOffices();
        System.out.println("\nLista de officinas:");
        System.out.println(lista_of);
        List<Employee> lista_em = ListaEmployee.getEmpleados();
        System.out.println("\nLista de empleados:");
        System.out.println(lista_em);
        ConexionBD.close();
    }
}
