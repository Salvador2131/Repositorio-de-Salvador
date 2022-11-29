
package cl.duoc.seguros.basedatos;
import java.sql.*;


public class Conexion {

    private static Conexion instance = new Conexion();

    public static Conexion getInstance() {
        return instance;
    }
private Conexion() {
        try {
            System.out.println("Conexion() : instanciando Driver");
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Conexion(): Driver instanciado!");
        } catch (Exception e) {
            System.out.println("Conexion(): ERROR: No se pudo instanciar el driver");
            e.printStackTrace();
        }
    }
public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String password = "1234";
        return getConnection(url, user, password);
    }
 public static Connection getConnection(String url, String user, String password) {
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, user, password);
        } catch (Exception e) {
            System.out.println("Conexion:getConnection() : ERROR: No se pudo crear la conexion");
            e.printStackTrace();
        }

        return conn;
    }
}