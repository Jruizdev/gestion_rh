package BaseDeDatos;

import ModeloDatos.Docente;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

// Modelo para tabla de vacunacion
public class ModeloVacunacion implements TableModel {
    
    private final List<Docente> docentes;
    
    public ModeloVacunacion(List<Docente> _docentes){
        this.docentes = _docentes;
    }

    @Override
    public int getRowCount() {
        return docentes.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
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
                    nombre = "Tipo de Vacuna";
                    break;
                case 4:
                    nombre = "Dosis";
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
                    resultado = consulta.getVacuna_tipo();
                    break;
                case 4:
                    resultado = consulta.getVacuna_dosis() + "";
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
                    consulta.setVacuna_tipo((String)aValue);
                    break;
                case 4:
                    consulta.setVacuna_dosis((int)aValue);
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
