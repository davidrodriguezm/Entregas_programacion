package tarea4;

import java.sql.*;

public abstract class InsertarRelacinarCliente {

    public static void insertar_cliente(int customerNumber, String customerName, String contactLastName,
                                        String contactFirstName, String phone, String addressLine1, String addressLine2,
                                        String city, String state, String postalCode, String country,
                                        int lesRepEmployeeNumber, float creditLimit) throws SQLException {
        Connection con = ConexionBD_4.getConnection();
        String add_cliente = "INSERT INTO customers VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement consultas = con.prepareStatement(add_cliente);
        consultas.setInt(1,customerNumber);
        consultas.setString(2,customerName);
        consultas.setString(3,contactLastName);
        consultas.setString(4,contactFirstName);
        consultas.setString(5,phone);
        consultas.setString(6,addressLine1);
        consultas.setString(7,addressLine2);
        consultas.setString(8,city);
        consultas.setString(9,state);
        consultas.setString(10,postalCode);
        consultas.setString(11,country);
        consultas.setInt(12,lesRepEmployeeNumber);
        consultas.setFloat(13,creditLimit);
        consultas.executeUpdate();
    }
}
