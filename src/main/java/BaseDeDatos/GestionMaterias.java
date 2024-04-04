package BaseDeDatos;

import ModeloDatos.Materia;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

// Implementación de los métodos para la gestión de materias en la Base de Datos
public class GestionMaterias {
    
    public static void registrarMateria(Object[] CAMPOS){
        PreparedStatement ps;
        
        try{
            ps = BaseDeDatos.Conexion.conexion.prepareStatement("INSERT INTO SECCION_MATERIAS VALUES (" + 
                                                                "DEFAULT, ?, ?, ?, ?)");
            ps.setString(1, CAMPOS[0].toString());
            ps.setString(2, CAMPOS[1].toString());
            ps.setString(3, CAMPOS[2].toString());
            ps.setInt(4, Integer.parseInt(CAMPOS[3].toString()));
            ps.executeUpdate();
            ps.close();
            
            JOptionPane.showMessageDialog(null, "La materia fue agregada correctamente al registro de materias.",
                                          "Actividad Complementaria", 1);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static void editarMateria(int ID, Object[] CAMPOS){
        PreparedStatement ps;
        
        try{
            ps = BaseDeDatos.Conexion.conexion.prepareStatement("UPDATE SECCION_MATERIAS SET MATERIA = ?, " +
                                                                "SEMESTRE = ?, " +
                                                                "CICLO_ESCOLAR = ?, " +
                                                                "ID_CARRERA = ? WHERE ID_MATERIA = " + ID);
            ps.setString(1, CAMPOS[0].toString());
            ps.setInt(2, Integer.parseInt(CAMPOS[1].toString()));
            ps.setString(3, CAMPOS[2].toString());
            ps.setInt(4, Integer.parseInt(CAMPOS[3].toString()));
            ps.executeUpdate();
            ps.close();
            
            JOptionPane.showMessageDialog(null, "La materia con ID: " + ID + ", se actualizo correctamente.",
                                          "Actividad Complementaria", 1);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public static List<Materia> obtenerMaterias(){
        List<Materia> materias = new ArrayList();
        
        Statement st;
        ResultSet rs;
        
        try{
            st = BaseDeDatos.Conexion.conexion.createStatement();
            rs = st.executeQuery("SELECT * FROM SECCION_MATERIAS");
            
            while(rs.next()){
                Materia materia = new Materia();
                
                materia.setId_materia(rs.getInt(1));
                materia.setMateria(rs.getString(2));
                materia.setSemestre(rs.getInt(3));
                materia.setCiclo_escolar(rs.getString(4));
                materia.setId_carrera(rs.getInt(5));
                
                materias.add(materia);
            }
            st.close();
            rs.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return materias;
    }
    
    public static void bajaDeMateria(int ID){
        Statement st;
        
        try{
            st = BaseDeDatos.Conexion.conexion.createStatement();
            st.executeUpdate("DELETE FROM SECCION_MATERIAS WHERE ID_MATERIA = " + ID);
            st.close();
            
            JOptionPane.showMessageDialog(null, "La materia ha sido borrada de la Base de Datos.",
                                          "Actividad Complementaria", 1);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
