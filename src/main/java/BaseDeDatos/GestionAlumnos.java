package BaseDeDatos;

import java.sql.PreparedStatement;
import java.sql.Statement;
import javax.swing.JOptionPane;

// Clase con los métodos para eliminar y actualizar tablas en la base de datos
public class GestionAlumnos {
    
    // Método para agragar un nuevo alumno a la tabla "Alumnos" de la Base de Datos
    public static void agregarRegistroAlumno(Object[] CAMPOS_ALUMNO, 
                                             Object[] CAMPOS_CONTACTO, 
                                             Object[] CAMPOS_ESCOLARES){
        PreparedStatement ps;
        try{
            // Agregar datos de contacto a la base de datos
            ps = BaseDeDatos.Conexion.conexion.prepareStatement("INSERT INTO DATOS_CONTACTO VALUES (0, ?, ?)");

            ps.setString(1, CAMPOS_CONTACTO[0].toString());
            ps.setString(2, CAMPOS_CONTACTO[1].toString());
            
            ps.executeUpdate();
            
            // Agregar datos escolares a la base de datos
            ps = BaseDeDatos.Conexion.conexion.prepareStatement("INSERT INTO DATOS_ESCOLARES VALUES (0, ?, ?, ?)");

            ps.setString(1, CAMPOS_ESCOLARES[0].toString());
            ps.setString(2, CAMPOS_ESCOLARES[1].toString());
            ps.setInt(3, Integer.parseInt(CAMPOS_ESCOLARES[2].toString()));
            
            ps.executeUpdate();
            
            // Agregar datos personales a la base de datos
            ps = BaseDeDatos.Conexion.conexion.prepareStatement("INSERT INTO ALUMNOS VALUES (0, ?, ?, ?, null, ?, ?)");

            ps.setString(1, CAMPOS_ALUMNO[0].toString());
            ps.setString(2, CAMPOS_ALUMNO[1].toString());
            ps.setString(3, CAMPOS_ALUMNO[2].toString());
            ps.setInt(4, BaseDeDatos.Consulta.obtenerUltimoIndice("datos_escolares"));
            ps.setInt(5, BaseDeDatos.Consulta.obtenerUltimoIndice("datos_contacto"));
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "El alumno fue agregado correctamente al registro con el ID: " +
                                         BaseDeDatos.Consulta.obtenerUltimoIndice("ALUMNOS"),
                                         "Actividad Complementaria", 1);
            
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    // Método para eliminar registro de Alumno seleccionado
    public static void eliminarAlumno(int ID){
        Statement st;
        
        try{
            st = BaseDeDatos.Conexion.conexion.createStatement();
            st.executeUpdate("DELETE FROM ALUMNOS WHERE ID = "+ ID);
            st.executeUpdate("DELETE FROM DATOS_CONTACTO WHERE ID_CONTACTO = " + ID);
            st.executeUpdate("DELETE FROM DATOS_ESCOLARES WHERE ID_ALUMNO = " + ID);
            st.close();
            
            JOptionPane.showMessageDialog(null, "El usuario con ID: " + ID + ", ha sido eliminado exitosamente.",
                                          "Actividad Complementaria", 1);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    // Método para actualizar datos de un alumno seleccionado
    public static void actualizarAlumno(int ID, Object[] CAMPOS_ALUMNO, Object[] CAMPOS_CONTACTO, Object[] CAMPOS_ESCOLARES){
        PreparedStatement ps;
        
        try{
            ps = BaseDeDatos.Conexion.conexion.prepareStatement("UPDATE ALUMNOS SET NOMBRE = ?, " +
                                                                                "DIRECCION = ?, " +
                                                                                "CURP = ? WHERE ID = " + ID);
            ps.setString(1, CAMPOS_ALUMNO[0].toString());
            ps.setString(2, CAMPOS_ALUMNO[1].toString());
            ps.setString(3, CAMPOS_ALUMNO[2].toString());
            ps.executeUpdate();

            ps = BaseDeDatos.Conexion.conexion.prepareStatement("UPDATE DATOS_CONTACTO SET TELEFONO = ?, " +
                                                                                          "CORREO = ? " +
                                                                                          "WHERE ID_CONTACTO = " + ID);
            ps.setString(1, CAMPOS_CONTACTO[0].toString());
            ps.setString(2, CAMPOS_CONTACTO[1].toString());
            ps.executeUpdate();

            ps = BaseDeDatos.Conexion.conexion.prepareStatement("UPDATE DATOS_ESCOLARES SET MATRICULA = ?, " +
                                                                                           "SEMESTRE = ?, " +
                                                                                           "ID_CARRERA = ? " +
                                                                                           "WHERE ID_ALUMNO = " + ID);
            ps.setString(1, CAMPOS_ESCOLARES[0].toString());
            ps.setInt(2, Integer.parseInt(CAMPOS_ESCOLARES[1].toString()));
            ps.setInt(3, Integer.parseInt(CAMPOS_ESCOLARES[2].toString()));
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Los datos del usuario han sido actualizados exitosamente.",
                                          "Actividad Complementaria", 1);
            ps.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
