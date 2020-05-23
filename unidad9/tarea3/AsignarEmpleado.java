package tarea3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public abstract class AsignarEmpleado {

    public static void asignar_empleado() {
        Scanner teclado = new Scanner(System.in);
        boolean existe_empleado = false;
        boolean existe_cliente = false;
        System.out.println("Introduce el identificador del empleado(employeeNumber)");
        int employeeNumber = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Introduce el identificador del cliente(customerNumber)");
        int customerNumber = teclado.nextInt();
        teclado.nextLine();
        Connection conexion = ConexionBD_3.getConnection();
        try {
            String empleado = "SELECT employeeNumber\n" +
                    "FROM employees\n" +
                    "WHERE employeeNumber=?;";
            PreparedStatement consultas = conexion.prepareStatement(empleado);
            consultas.setInt(1,employeeNumber);
            ResultSet resultado = consultas.executeQuery();
            existe_empleado = resultado.next() ? true : false;
            String cliente = "SELECT customerNumber\n" +
                    "FROM customers\n" +
                    "WHERE customerNumber=?;";
            consultas = conexion.prepareStatement(cliente);
            consultas.setInt(1,customerNumber);
            resultado = consultas.executeQuery();
            existe_cliente = resultado.next() ? true : false;
            if (existe_empleado & existe_cliente) {
                String asignar_emple = "UPDATE customers SET salesRepEmployeeNumber=?\n" +
                        "WHERE customerNumber=?;";
                consultas = conexion.prepareStatement(asignar_emple);
                consultas.setInt(1,employeeNumber);
                consultas.setInt(2,customerNumber);
                consultas.executeUpdate();
                System.out.println("Empleado asignado a cliente\n");
            } else if (!existe_empleado & !existe_cliente) {
                System.out.println("No existe el empleado y cliente\n");
            }else if (!existe_empleado & existe_cliente) {
                System.out.println("No existe el empleado\n");
            } else if (existe_empleado & !existe_cliente) {
                System.out.println("No existe el cliente\n");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
