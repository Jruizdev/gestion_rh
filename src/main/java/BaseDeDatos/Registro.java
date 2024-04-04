package BaseDeDatos;

import ModeloDatos.Docente;
import java.math.BigInteger;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Registro {
    // Lista pública de docentes registrados en el sistema (Base de Datos)
    public static List<Docente> docentes = new ArrayList<>();
    
    public static void obtenerTablaDatos(){
        
        BaseDeDatos.Registro.docentes.clear();
        BaseDeDatos.Conexion.conectarBD();
        Statement st;
        
        try{
            st = BaseDeDatos.Conexion.conexion.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM DATOSPERSONALES");
            while(rs.next()){

                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                String apellidos = rs.getString(3);
                String rfc = rs.getString(4);
                String direccion = rs.getString(5);
                String estado_civil = rs.getString(6);
                String tel = rs.getString(7);

                Docente docente = new Docente(id, nombre, apellidos, rfc, direccion, estado_civil, new BigInteger(tel));
                BaseDeDatos.Registro.docentes.add(docente);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    // Eliminar una fila de la base de datos, con base en su ID
    // Devuelve 1 si la eliminación fue exitosa y 0 en caso contrario.
    public static int eliminarFila(int ID_fila){
        Statement st;
        try{
            st = BaseDeDatos.Conexion.conexion.createStatement();
            st.executeUpdate("DELETE FROM DATOSPERSONALES WHERE ID = " + ID_fila);
            JOptionPane.showMessageDialog(null, "Se ha eliminado exitosamente el registro con ID: " + ID_fila,
                                          "Actividad Complementaria", 1);
            BaseDeDatos.Registro.actualizarDatosBD();
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return 0;
        }
        return 1;
    }
    
    public static void actualizarDatosBD() {
        
        PreparedStatement ps;
        Statement st;
        
        try{
            // Buscar los registros de la lista de docente en la Base de datos
            // Si existen, se acualizan los datos, sino se agregan como nuevo registro
            for(Docente docente : BaseDeDatos.Registro.docentes){
                
                int id = docente.getId();
                String nombre = docente.getNombre();
                String apellidos = docente.getApellidos();
                String rfc = docente.getRfc();
                String direccion = docente.getDireccion();
                String estado_civil = docente.getEstado_civil();
                String tel = docente.getTelefono().toString();
                
                st = BaseDeDatos.Conexion.conexion.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM DATOSPERSONALES WHERE ID = " + id);
                
                // Existe el registro en la base de datos
                if(rs.next()){
                    ps = BaseDeDatos.Conexion.conexion.prepareStatement("UPDATE DATOSPERSONALES SET ID = ?" + 
                                                                                                ", NOMBRE = ?" + 
                                                                                                ", APELLIDOS = ?" + 
                                                                                                ", RFC = ?" + 
                                                                                                ", DIRECCION = ?" + 
                                                                                                ", ESTADO_CIVIL = ?" + 
                                                                                                ", TELEFONO = ?" + 
                                                                                                " WHERE ID = ?;");
                    ps.setInt(1, id);
                    ps.setString(2, nombre);
                    ps.setString(3, apellidos);
                    ps.setString(4, rfc);
                    ps.setString(5, direccion);
                    ps.setString(6, estado_civil);
                    ps.setString(7, tel);
                }
                
                // No existe el registro en la base de datos
                else {
                    ps = BaseDeDatos.Conexion.conexion.prepareStatement("INSERT INTO DATOSPERSONALES VALUES (?, ?, ?, ?, ?, ?, ?)");
                    ps.setInt(1, id);
                    ps.setString(2, nombre);
                    ps.setString(3, apellidos);
                    ps.setString(4, rfc);
                    ps.setString(5, direccion);
                    ps.setString(6, estado_civil);
                    ps.setString(7, tel);

                    ps.executeUpdate();
                }
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
        JOptionPane.showMessageDialog(null, "Base de datos actualizada correctamente", "Actividad Complementaria", 1);
    }
}
