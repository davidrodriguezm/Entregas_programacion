package tarea2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public abstract class ListaOffice {

    public static List<Office> getOffices() {
        Connection conexion = ConexionBD.getConnection();
        List<Office> lista = new ArrayList<>();
        try {
            Statement consultas = conexion.createStatement();
            consultas.setQueryTimeout(30);
            ResultSet resultado = consultas.executeQuery("SELECT * FROM offices");
            while (resultado.next()) {
                Office offi = new Office(resultado.getString("officeCode"),resultado.getString("city"),
                        resultado.getString("phone"),resultado.getString("addressLine1"),
                        resultado.getString("addressLine2"),resultado.getString("state"),
                        resultado.getString("country"),resultado.getString("postalCode"),
                        resultado.getString("territory"));
                lista.add(offi);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

}
