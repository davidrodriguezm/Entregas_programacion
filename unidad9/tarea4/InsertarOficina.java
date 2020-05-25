package tarea4;

import java.sql.*;

public abstract class InsertarOficina {

    public static void insertar_oficina(Oficina o) throws SQLException {
        Connection con = ConexionBD_4.getConnection();
        String add_oficina = "INSERT INTO offices VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement consultas = con.prepareStatement(add_oficina);
        consultas.setString(1,o.getOfficeCode());
        consultas.setString(2,o.getCity());
        consultas.setString(3,o.getPhone());
        consultas.setString(4,o.getAddressLine1());
        consultas.setString(5,o.getAddressLine2());
        consultas.setString(6,o.getState());
        consultas.setString(7,o.getCountry());
        consultas.setString(8,o.getPostalCode());
        consultas.setString(9,o.getTerritory());
        consultas.executeUpdate();
    }
}
