package tarea4;

import java.sql.*;

public abstract class InsertarProducto {

    public static void producto_producto(int orderNumber, String productCode, int quantityOrdered, float priceEach,
                                       int orderLineNumber) {
        Connection con = ConexionBD_4.getConnection();
        try {
            String add_producto = "INSERT INTO orderdetails VALUES(?, ?, ?, ?, ?);";
            PreparedStatement consultas = con.prepareStatement(add_producto);
            consultas.setInt(1,orderNumber);
            consultas.setString(2,productCode);
            consultas.setInt(3,quantityOrdered);
            consultas.setFloat(4,priceEach);
            consultas.setInt(5,orderLineNumber);
            consultas.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

}
