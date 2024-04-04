package BaseDeDatos;

import ModeloDatos.Alumno;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

// Modelo a implementar en la tabla alumnos
public class ModeloTablaAlumnos implements TableModel {
    
    List<Alumno> alumnos = new ArrayList();
    
    public ModeloTablaAlumnos(List<Alumno> lista_alumnos){
        this.alumnos = lista_alumnos;
    }
    
    @Override
    public int getRowCount() {
        return alumnos.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String nombre = null;
        switch(columnIndex){
            case 0:
                nombre = "ID";
                break;
            case 1:
                nombre = "Nombre";
                break;
            case 2:
                nombre = "Direccion";
                break;
            case 3:
                nombre = "CURP";
                break;
        }
        return nombre;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Alumno seleccion = alumnos.get(rowIndex);
        Object valor = null;
        switch(columnIndex){
            case 0:
                valor = seleccion.getId();
                break;
            case 1:
                valor = seleccion.getNombre();
                break;
            case 2:
                valor = seleccion.getDireccion();
                break;
            case 3:
                valor = seleccion.getCurp();
                break;
        }
        return valor;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Alumno seleccion = alumnos.get(rowIndex);
        switch(columnIndex){
            case 0:
                seleccion.setId(Integer.parseInt(aValue.toString()));
                break;
            case 1:
                seleccion.setNombre(aValue.toString());
                break;
            case 2:
                seleccion.setDireccion(aValue.toString());
                break;
            case 3:
                seleccion.setCurp(aValue.toString());
                break;
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        
    }
    
}
