package tarea3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public abstract class MostrarPedido {

    public static void mostrar_pedido() {
        Scanner teclado = new Scanner(System.in);
        boolean existe = false;
        System.out.println("Introduce el identificador del pedido");
        int id_pedido = teclado.nextInt();
        teclado.nextLine();
        String datos = "SELECT orderNumber, productName, quantityOrdered, priceEach\n" +
                "FROM orderdetails o INNER JOIN products p ON o.productCode=p.productCode\n" +
                "WHERE o.orderNumber=?;";
        Connection conexion = ConexionBD_3.getConnection();
        try {
            PreparedStatement consultas = conexion.prepareStatement(datos);
            consultas.setInt(1,id_pedido);
            ResultSet resultado = consultas.executeQuery();
            while (resultado.next()) {
                if (!existe) {
                    existe = true;
                    System.out.println("Datos del pedido:\nIdentificador del pedido=" +
                            resultado.getString("orderNumber"));
                }
                System.out.println("Nombre del producto: " + resultado.getString("productName") +
                        "  |  Cantidad: " + resultado.getString("quantityOrdered") +
                        "  |  Precio: " + resultado.getString("priceEach"));
            }
            if (existe) {
                String precio_total = "SELECT orderNumber, SUM(quantityOrdered*priceEach)\n" +
                        "FROM orderdetails \n" +
                        "WHERE orderNumber=? GROUP BY orderNumber;";
                consultas = conexion.prepareStatement(precio_total);
                consultas.setInt(1,id_pedido);
                resultado = consultas.executeQuery();
                while (resultado.next()) {
                    System.out.println("El precio total del pedido es: " +
                            resultado.getString("SUM(quantityOrdered*priceEach)") + "\n");
                }
            } else {
                System.out.println("No existe el pedido\n");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
