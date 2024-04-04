package BaseDeDatos;

import ModeloDatos.DatosEscolares;
import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

// Modelo a implementar en la tabla Datos Escolaress
public class ModeloTablaEscolares implements TableModel {
    List<DatosEscolares> datos = new ArrayList();
    
    public ModeloTablaEscolares(List<DatosEscolares> lista_datos){
        this.datos = lista_datos;
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String nombre = null;
        switch(columnIndex){
            case 0:
                nombre = "Matrícula";
                break;
            case 1:
                nombre = "Semestre";
                break;
            case 2:
                nombre = "Carrera";
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
        DatosEscolares seleccion = datos.get(rowIndex);
        Object valor = null;
        
        switch(columnIndex){
            case 0:
                valor = seleccion.getMatricula();
                break;
            case 1:
                valor = seleccion.getSemestre();
                break;
            case 2:
                valor = seleccion.getCarrera();
                break;
        }
        return valor;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        DatosEscolares seleccion = datos.get(rowIndex);
        switch(columnIndex){
            case 0:
                seleccion.setMatricula(aValue.toString());
                break;
            case 1:
                seleccion.setSemestre(aValue.toString());
                break;
            case 2:
                seleccion.setCarrera(aValue.toString());
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
