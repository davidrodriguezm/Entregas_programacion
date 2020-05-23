package tarea3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public abstract class ProductoPedido {

    public static void producto_pedido() {
        Scanner teclado = new Scanner(System.in);
        boolean existe_producto = false;
        boolean existe_pedido = false;
        System.out.println("Introduce el identificador del producto(productCode)");
        String productCode = teclado.nextLine();
        System.out.println("Introduce el identificador del pedido(orderNumber)");
        int orderNumber = teclado.nextInt();
        teclado.nextLine();
        Connection conexion = ConexionBD_3.getConnection();
        try {
            String producto = "SELECT productCode FROM products " +
                    "WHERE productCode=?;";
            PreparedStatement consultas = conexion.prepareStatement(producto);
            consultas.setString(1,productCode);
            ResultSet resultado = consultas.executeQuery();
            existe_producto = resultado.next() ? true : false;
            String pedido = "SELECT orderNumber FROM orders\n" +
                    "WHERE orderNumber=?;";
            consultas = conexion.prepareStatement(pedido);
            consultas.setInt(1,orderNumber);
            resultado = consultas.executeQuery();
            existe_pedido = resultado.next() ? true : false;
            if (existe_producto & existe_pedido) {
                String add_producto = "INSERT INTO orderdetails VALUES(?, ?, ?, ?, ?);";
                consultas = conexion.prepareStatement(add_producto);
                consultas.setInt(1,orderNumber);
                consultas.setString(2,productCode);
                System.out.println("Introduce la cantidad del producto(quantityOrdered)");
                int quantityOrdered = teclado.nextInt();
                teclado.nextLine();
                consultas.setInt(3,quantityOrdered);
                System.out.println("Introduce el precio del producto(priceEach)");
                float priceEach = teclado.nextFloat();
                teclado.nextLine();
                consultas.setFloat(4,priceEach);
                System.out.println("Introduce el numero de linea de pedido(orderLineNumber)");
                int orderLineNumber = teclado.nextInt();
                teclado.nextLine();
                consultas.setInt(5,orderLineNumber);
                consultas.executeUpdate();
                System.out.println("Producto asignado a pedido\n");
            } else if (!existe_producto & !existe_pedido) {
                System.out.println("No existe el producto y pedido\n");
            }else if (!existe_producto & existe_pedido) {
                System.out.println("No existe el producto\n");
            } else if (existe_producto & !existe_pedido) {
                System.out.println("No existe el pedido\n");
            }
        } catch (SQLException e) {
            System.out.println("error");
            System.out.println(e.getMessage());
        }
    }
}
