package tarea4;

import java.sql.*;

public abstract class InesrtarEmpleado {

    public static void insertar_empleado(Empleado e) throws SQLException {
        Connection con = ConexionBD_4.getConnection();
        String add_emplead = "INSERT INTO employees VALUES(?, ?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement consultas = con.prepareStatement(add_emplead);
        consultas.setInt(1,e.getEmployeeNumber());
        consultas.setString(2,e.getLastName());
        consultas.setString(3,e.getFirstName());
        consultas.setString(4,e.getExtension());
        consultas.setString(5,e.getEmail());
        consultas.setString(6,e.getOfficeCode());
        consultas.setInt(7,e.getReportsTo());
        consultas.setString(8,e.getJobTitle());
        consultas.executeUpdate();
    }
}
