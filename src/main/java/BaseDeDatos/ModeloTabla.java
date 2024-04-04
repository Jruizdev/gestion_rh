package BaseDeDatos;

import ModeloDatos.Docente;
import java.math.BigInteger;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

// Implementando la interfaz de modelo de tabla a la clase
public class ModeloTabla implements TableModel {
    
    private final List<Docente> docentes;
    
    // Constructor de la clase
    public ModeloTabla(List<Docente> _docentes){
        this.docentes = _docentes;
    }

    @Override
    public int getRowCount() {
        return docentes.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public String getColumnName(int columnIndex) {
        
        String nombre = null;
        switch (columnIndex){
                case 0:
                    nombre = "ID";
                    break;
                case 1:
                    nombre = "Nombre";
                    break;
                case 2:
                    nombre = "Apellidos";
                    break;
                case 3:
                    nombre = "RFC";
                    break;
                case 4:
                    nombre = "Direccion";
                    break;
                case 5:
                    nombre = "Estado civil";
                    break;
                case 6:
                    nombre = "Telefono";
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
        
        Docente consulta = docentes.get(rowIndex);
        String resultado = null;
        
        switch(columnIndex){
                case 0:
                    resultado = "" + consulta.getId();
                    break;
                case 1:
                    resultado = consulta.getNombre();
                    break;
                case 2:
                    resultado = consulta.getApellidos();
                    break;
                case 3:
                    resultado = consulta.getRfc();
                    break;
                case 4:
                    resultado = consulta.getDireccion();
                    break;
                case 5:
                    resultado = consulta.getEstado_civil();
                    break;
                case 6:
                    resultado = "" + consulta.getTelefono();
                    break;
            }
        
        return resultado;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Docente consulta = docentes.get(rowIndex);
        
        switch(columnIndex){
                case 0:
                    consulta.setId((int)aValue);
                    break;
                case 1:
                    consulta.setNombre((String)aValue);
                    break;
                case 2:
                    consulta.setApellidos((String)aValue);
                    break;
                case 3:
                    consulta.setRfc((String)aValue);
                    break;
                case 4:
                    consulta.setDireccion((String)aValue);
                    break;
                case 5:
                    consulta.setEstado_civil((String)aValue);
                    break;
                case 6:
                    consulta.setTelefono(new BigInteger((String)aValue));
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
