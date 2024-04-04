package BaseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    
    public static Connection conexion = null;
    
    // Parametros de conexion
    private static String DRIVER = "com.mysql.jdbc.Driver";
    private static String USUARIO = "root";
    private static String PASSWORD = "";
    private static String URL = "jdbc:mysql://localhost:3306/evidencia_aprendizaje";
    
    // Metodo para conectar la Base de datos
    public static void conectarBD(){
        try{
            Class.forName(DRIVER);
        } catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Error: No se encontro el Driver MYSQL" + e, "Actividad Complementaria", 0);
        }
        
        try{
            conexion = null;
            conexion = DriverManager.getConnection(URL, USUARIO, PASSWORD);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se pudo establecer conexión con la Base de Datos", "Actividad Complementaria", 0);
            System.exit(0);
        }
    }
}
