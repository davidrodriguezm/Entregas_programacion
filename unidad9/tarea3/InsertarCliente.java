package tarea3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public abstract class InsertarCliente {

    public static void insertar_cliente() {
        Scanner teclado = new Scanner(System.in);
        Connection conexion = ConexionBD_3.getConnection();
        String add_cliente = "INSERT INTO customers VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
        try {
            PreparedStatement consultas = conexion.prepareStatement(add_cliente);
            System.out.println("Introduce customerNumber");
            int customerNumber = teclado.nextInt();
            teclado.nextLine();
            consultas.setInt(1,customerNumber);
            System.out.println("Introduce customerName");
            String customerName = teclado.nextLine();
            consultas.setString(2,customerName);
            System.out.println("Introduce contactLastName");
            String contactLastName = teclado.nextLine();
            consultas.setString(3,contactLastName);
            System.out.println("Introduce contactFirstName");
            String contactFirstName = teclado.nextLine();
            consultas.setString(4,contactFirstName);
            System.out.println("Introduce phone");
            String phone = teclado.nextLine();
            consultas.setString(5,phone);
            System.out.println("Introduce addressLine1");
            String addressLine1 = teclado.nextLine();
            consultas.setString(6,addressLine1);
            System.out.println("Introduce addressLine2");
            String addressLine2 = teclado.nextLine();
            consultas.setString(7,addressLine2);
            System.out.println("Introduce city");
            String city = teclado.nextLine();
            consultas.setString(8,city);
            System.out.println("Introduce state");
            String state = teclado.nextLine();
            consultas.setString(9,state);
            System.out.println("Introduce postalCode");
            String postalCode = teclado.nextLine();
            consultas.setString(10,postalCode);
            System.out.println("Introduce country");
            String country = teclado.nextLine();
            consultas.setString(11,country);
            System.out.println("Introduce lesRepEmployeeNumber");
            int lesRepEmployeeNumber = teclado.nextInt();
            teclado.nextLine();
            consultas.setInt(12,lesRepEmployeeNumber);
            System.out.println("Introduce creditLimit");
            float creditLimit = teclado.nextFloat();
            teclado.nextLine();
            consultas.setFloat(13,creditLimit);
            consultas.executeUpdate();
            System.out.println("Cliente insertado\n");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
