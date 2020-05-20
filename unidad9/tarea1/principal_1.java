package tarea1;

import java.sql.*;

public class principal_1 {
    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:sampledatabase.db");
            Statement consultas = conexion.createStatement();
            consultas.setQueryTimeout(30);
            ResultSet resultado = consultas.executeQuery("SELECT * FROM customers WHERE state IS null");
            System.out.println("Listado de customers con el campo state nulo:");
            while (resultado.next()) {
                System.out.println("customerNumber = " + resultado.getString("customerNumber")
                        + " | state = " + resultado.getString("state"));
            }
            resultado = consultas.executeQuery("SELECT * FROM payments WHERE amount>30000");
            System.out.println("\nListado de los payments cuyo amount sea mayor de 30.000:");
            while (resultado.next()) {
                System.out.println("customerNumber = " + resultado.getString("customerNumber")
                        + " | amount = " + resultado.getString("amount"));
            }
            resultado = consultas.executeQuery("SELECT * FROM employees WHERE reportsTo=1143");
            System.out.println("\nListado de los employees que dan cuenta (reportsTo) al empleado con Id = 1143:");
            while (resultado.next()) {
                System.out.println("employeeNumber = " + resultado.getString("employeeNumber")
                        + " | reportsTo = " + resultado.getString("reportsTo"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conexion != null ) {
                    conexion.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
