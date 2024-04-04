package BaseDeDatos;

import ModeloDatos.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

// Modelo a implementar en la tabla Materias
public class ModeloTablaMaterias implements TableModel {
    
    // Lista de materias a mostrar
    private List<Materia> materias = new ArrayList();
    
    public ModeloTablaMaterias(List<Materia> lista_materias){
        this.materias = lista_materias;
    }

    @Override
    public int getRowCount() {
        return materias.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String nombre = null;
        switch(columnIndex){
            case 0:
                nombre = "ID Materia";
                break;
            case 1:
                nombre = "Materia";
                break;
            case 2:
                nombre = "Semestre";
                break;
            case 3:
                nombre = "Ciclo escolar";
                break;
            case 4:
                nombre = "ID Carrera";
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
        
        Materia consulta = materias.get(rowIndex);
        Object valor = null;
        
        switch(columnIndex){
            case 0:
                valor = consulta.getId_materia();
                break;
            case 1:
                valor = consulta.getMateria();
                break;
            case 2:
                valor = consulta.getSemestre();
                break;
            case 3:
                valor = consulta.getCiclo_escolar();
                break;
            case 4:
                valor = consulta.getId_carrera();
                break;
        }
        return valor;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        Materia consulta = materias.get(rowIndex);
        
        switch(columnIndex){
            case 0:
                consulta.setId_materia(Integer.parseInt(aValue.toString()));
                break;
            case 1:
                consulta.setMateria(aValue.toString());
                break;
            case 2:
                consulta.setSemestre(Integer.parseInt(aValue.toString()));
                break;
            case 3:
                consulta.setCiclo_escolar(aValue.toString());
                break;
            case 4:
                consulta.setId_carrera(Integer.parseInt(aValue.toString()));
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
