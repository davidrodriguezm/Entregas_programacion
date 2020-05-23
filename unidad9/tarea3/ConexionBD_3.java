package tarea3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ConexionBD_3 {
    private static Connection conexion = null;

    public static Connection getConnection(){
        try{
            if( conexion == null ){
                conexion = DriverManager.getConnection("jdbc:mysql://localhost/classicmodels?user=root&password=root");
            }
        }
        catch( SQLException ex){
            ex.printStackTrace();
        }
        return conexion;
    }

    public static void close() {
        if ( conexion != null ) {
            conexion = null;
            System.out.println("\nConexion cerrada");
        }
    }
}
