package BaseDeDatos;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Consulta {
    
    // Consultar y obtener carreras disponibles en la Base de Datos
    public static List<ModeloDatos.Carrera> obtenerCarreras(){
        Statement st;
        ResultSet rs;
        List<ModeloDatos.Carrera> lista = new ArrayList();
        
        try{
            st = BaseDeDatos.Conexion.conexion.createStatement();
            rs = st.executeQuery("SELECT * FROM CARRERA");
            
            while(rs.next()){
                ModeloDatos.Carrera registro = new ModeloDatos.Carrera();
                registro.setId_carrera(rs.getInt(1));
                registro.setCarrera(rs.getString(2));
                lista.add(registro);
            }
        }catch(Exception e){
        }
        
        return lista;
    }
    
    // Obtener alumnos de la base de datos
    public static List<ModeloDatos.Alumno> obtenerAlumnos(){
        List<ModeloDatos.Alumno> lista = new ArrayList();
        
        Statement st;
        ResultSet rs;
        
        try{
            st = BaseDeDatos.Conexion.conexion.createStatement();
            rs = st.executeQuery("SELECT * FROM ALUMNOS");
            while(rs.next()){
                ModeloDatos.Alumno alumno = new ModeloDatos.Alumno();
                alumno.setId(rs.getInt(1));
                alumno.setNombre(rs.getString(2));
                alumno.setDireccion(rs.getString(3));
                alumno.setCurp(rs.getString(4));
                alumno.setId_alumno(rs.getInt(6));
                alumno.setId_contacto(7);
                lista.add(alumno);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return lista;
    }
    
    // Obtener datos de contacto de la base de datos
    public static List<ModeloDatos.DatosContacto> obtenerDatosContacto(){
        List<ModeloDatos.DatosContacto> lista = new ArrayList();
        
        Statement st;
        ResultSet rs;
        try{
            st = BaseDeDatos.Conexion.conexion.createStatement();
            rs = st.executeQuery("SELECT * FROM DATOS_CONTACTO");
            while(rs.next()){
                ModeloDatos.DatosContacto datos = new ModeloDatos.DatosContacto();
                datos.setId_contacto(rs.getInt(1));
                datos.setTelefono(rs.getString(2));
                datos.setCorreo(rs.getString(3));
                lista.add(datos);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return lista;
    }
    
    // Obtener datos escolares de la base de datos
    public static List<ModeloDatos.DatosEscolares> obtenerDatosEscolares(){
        List<ModeloDatos.DatosEscolares> lista = new ArrayList();
        
        Statement st;
        ResultSet rs;
        
        try{
            st = BaseDeDatos.Conexion.conexion.createStatement();
            rs = st.executeQuery("SELECT * FROM DATOS_ESCOLARES");
            while(rs.next()){
                ModeloDatos.DatosEscolares datos = new ModeloDatos.DatosEscolares();
                datos.setId_alumno(rs.getInt(1));
                datos.setMatricula(rs.getString(2));
                datos.setSemestre(rs.getString(3));
                datos.setId_carrera(rs.getInt(4));
                
                Statement consulta_carrera = BaseDeDatos.Conexion.conexion.createStatement();
                ResultSet carrera = consulta_carrera.executeQuery("SELECT CARRERA FROM CARRERA WHERE ID_CARRERA = " + 
                                                                  rs.getInt(4));
                if(carrera.next()){
                    datos.setCarrera(carrera.getString(1));
                }
                consulta_carrera.close();
                carrera.close();
               
                lista.add(datos);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
        return lista;
    }
    
    // Obtener el último índice de una tabla de la base de datos
    public static int obtenerUltimoIndice(String TABLA){
        Statement st;
        ResultSet rs;
        try{
            st = BaseDeDatos.Conexion.conexion.createStatement();
            rs = st.executeQuery("SELECT `AUTO_INCREMENT` FROM  INFORMATION_SCHEMA.TABLES" +
                                 " WHERE TABLE_SCHEMA = 'evidencia_aprendizaje'" +
                                 " AND   TABLE_NAME   = '"+ TABLA +"'");
            while(rs.next()){
                return rs.getInt(1) - 1;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return 0;
    }
}
