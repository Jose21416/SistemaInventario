package Logica;

import java.sql.Connection;
import java.sql.DriverManager;

public class LConexion {
    
    static Connection con = null;
    
    public static Connection getConnection() {
        try {
            // Cargar el driver (opcional en Java 8+ y MySQL 8+)
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Conectar con la base de datos, especificando la zona horaria para Lima, Perú
            con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/DBAlmacen?serverTimezone=America/Lima",
                "root",
                ""
            );
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        return con;
    }
}
