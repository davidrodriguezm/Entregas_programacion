package tarea4;

import java.sql.*;

public abstract class InsertarPedido {

    public static void insertar_pedido(Pedido p) throws SQLException {
        Connection con = ConexionBD_4.getConnection();
        String add_oficina = "INSERT INTO orders VALUES(?, ?, ?, ?, ?, ?, ?);";
        PreparedStatement consultas = con.prepareStatement(add_oficina);
        consultas.setInt(1,p.getOrderNumber());
        consultas.setString(2,p.getOrderDate());
        consultas.setString(3,p.getRequiredDate());
        consultas.setString(4,p.getShippedDate());
        consultas.setString(5,p.getStatus());
        consultas.setString(6,p.getComments());
        consultas.setInt(7,p.getCustomerNumber());
        consultas.executeUpdate();
    }
}
