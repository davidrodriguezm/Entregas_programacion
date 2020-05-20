package tarea2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public abstract class ListaEmployee {

    public static List<Employee> getEmpleados() {
        Connection conexion = ConexionBD.getConnection();
        List<Employee> lista = new ArrayList<>();
        try {
            Statement consultas = conexion.createStatement();
            consultas.setQueryTimeout(30);
            ResultSet resultado = consultas.executeQuery("SELECT * FROM employees");
            while (resultado.next()) {
                Employee emple = new Employee(resultado.getInt("employeeNumber"),resultado.getString("lastName"),
                        resultado.getString("firstName"),resultado.getString("extension"),
                        resultado.getString("email"),resultado.getString("officeCode"),
                        resultado.getInt("reportsTo"),resultado.getString("jobTitle"));
                lista.add(emple);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

}
