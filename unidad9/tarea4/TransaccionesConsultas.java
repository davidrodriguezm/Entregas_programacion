package tarea4;

import java.sql.*;

public abstract class TransaccionesConsultas {

    public static void transaccion_1() {
        Connection con = ConexionBD_4.getConnection();
        try {
            con.setAutoCommit(false);
            Oficina ofi = new Oficina("8","Lepe","748490","cualquiera",
                    "laquesea","no hay","el polo norte","47476","elquesea");
            InsertarOficina.insertar_oficina(ofi);
            Empleado emp1 = new Empleado(1008,"Zuzuganga","Abrosio","x374",
                    "emailuno", ofi.getOfficeCode(),1056,"Supervisor de siestas");
            InesrtarEmpleado.insertar_empleado(emp1);
            Empleado emp2 = new Empleado(1009,"Marrajo","Eufrasio","x343",
                    "emaildos", ofi.getOfficeCode(), emp1.getEmployeeNumber(),"Dormidor de siestas");
            InesrtarEmpleado.insertar_empleado(emp2);
            // Creo el cliente asociado a uno de los empleados creados
            InsertarRelacinarCliente.insertar_cliente(107,"Ninja en paro","Volvere",
                    "Terminator","56378","8ghfjik","568tufk","Tocina",
                    "Cualciera","56423","Nunca jamas",emp1.getEmployeeNumber(),98437);
            con.commit();
            System.out.println("Transaccion 1 terminada");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            if (con != null) {
                try {
                    con.rollback();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

    public static void transaccion_2() {
        Connection con = ConexionBD_4.getConnection();
        try {
            con.setAutoCommit(false);
            // Uso el cliente creado en la transaccion_1 customerNumber 107
            Pedido ped = new Pedido(10050,"2019-03-23","2020-04-21","2020-04-19",
                    "Shipped","fje0gie09e",107);
            InsertarPedido.insertar_pedido(ped);
            InsertarProducto.producto_producto( ped.getOrderNumber(), "S10_2016", 3, 453,
                    1);
            InsertarProducto.producto_producto( ped.getOrderNumber(), "S10_1949", 6, 746,
                    2);
            con.commit();
            System.out.println("Transaccion 2 terminada");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            if (con != null) {
                try {
                    con.rollback();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

    public static void consulta_1(int customerNumber) {
        Connection con = ConexionBD_4.getConnection();
        System.out.println("Consulta 1");
        String sql = "SELECT c.customerName,e.firstName,e.lastName,o.city FROM customers c INNER JOIN employees e " +
                "ON c.salesRepEmployeeNumber=e.employeeNumber INNER JOIN offices o ON e.officeCode=o.officeCode\n" +
                "WHERE c.customerNumber=?;";
        try {
            PreparedStatement consultas = con.prepareStatement(sql);
            consultas.setInt(1,customerNumber);
            ResultSet resultado = consultas.executeQuery();
            while (resultado.next()) {
                System.out.println("Nombre del cliente(customerName): " + resultado.getString("customerName"));
                System.out.println("Nombre del empleado que le lleva las ventas(firstName, lastName): " +
                        resultado.getString("firstName") + " " + resultado.getString("lastName"));
                System.out.println("La ciudad donde está la oficina del empleado(city): " +
                        resultado.getString("city"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void consulta_2(int customerNumber) {
        Connection con = ConexionBD_4.getConnection();
        System.out.println("Consulta 2");
        String sql = "SELECT c.customerName,o.orderDate,o.`status`,p.productName,od.quantityOrdered,od.priceEach\n" +
                "FROM customers c INNER JOIN orders o ON c.customerNumber=o.customerNumber \n" +
                "INNER JOIN orderdetails od ON o.orderNumber=od.orderNumber INNER JOIN products p \n" +
                "ON od.productCode=p.productCode WHERE c.customerNumber=?;";
        try {
            PreparedStatement consultas = con.prepareStatement(sql);
            consultas.setInt(1,customerNumber);
            ResultSet resultado = consultas.executeQuery();
            boolean primera_vez = true;
            while (resultado.next()) {
                if (primera_vez) {
                    System.out.println("Nombre del cliente(customerName): " + resultado.getString("customerName"));
                    System.out.println("Fecha del pedido(orderDate): " + resultado.getString("orderDate"));
                    System.out.println("Estado del pedido(status): " + resultado.getString("status"));
                    System.out.println("Productos del pedido:");
                    primera_vez = false;
                }
                System.out.println("Producto(productName): " + resultado.getString("productName") +
                        "  |  Cantidad(quantityOrdered): " + resultado.getString("quantityOrdered") +
                        "  |  Precio(priceEach): " + resultado.getString("priceEach"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
