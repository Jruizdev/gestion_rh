package MATERIAS;

import ModeloDatos.Materia;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FormularioEditarMateria extends javax.swing.JFrame {
    
    private JFrame ventana_consulta = null;
    private List<ModeloDatos.Carrera> carreras = new ArrayList();
    private Materia materia = null;
    
    public FormularioEditarMateria(Materia seleccion, JFrame ventana) {
        initComponents();
        this.materia = seleccion;
        this.ventana_consulta = ventana;
        obtenerCarreras();
        rellenarCamposConSeleccion();
    }
    
    // Método para agregar las carreras disponibles en el Combobox
    private void obtenerCarreras(){
        carreras = BaseDeDatos.Consulta.obtenerCarreras();
        combo_carrera.removeAllItems();
        for(ModeloDatos.Carrera carrera : carreras){
            combo_carrera.addItem(carrera.getId_carrera() + " : " +carrera.getCarrera());
        }
    }
    
    // Método para rellenar los campos del formulario con los datos de la materia
    private void rellenarCamposConSeleccion(){
        campo_nombre.setText(materia.getMateria());
        campo_semestre.setValue(materia.getSemestre());
        campo_ciclo.setText(materia.getCiclo_escolar());
        
        int indice = -1;
        // Seleccionar carrera correspondiente a la materia en el Combobox
        for(int i = 0; i < carreras.size(); i++){
            if(carreras.get(i).getId_carrera() == materia.getId_carrera()){
                indice = i;
                break;
            }
        }
        
        combo_carrera.setSelectedIndex(indice);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btn_salir = new javax.swing.JButton();
        panel_datos = new javax.swing.JPanel();
        label_nombre = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        label_semestre = new javax.swing.JLabel();
        campo_semestre = new javax.swing.JSpinner();
        label_carrera = new javax.swing.JLabel();
        combo_carrera = new javax.swing.JComboBox<>();
        label_ciclo = new javax.swing.JLabel();
        campo_ciclo = new javax.swing.JTextField();
        btn_guardar2 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar campos de materia");
        setLocation(new java.awt.Point(200, 200));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        panel_datos.setBackground(new java.awt.Color(255, 255, 255));
        panel_datos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informacion de la materia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        label_nombre.setText("Nombre de la materia:");

        label_semestre.setText("Semestre:");

        label_carrera.setText("Carrera:");

        combo_carrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        label_ciclo.setText("Ciclo escolar:");

        javax.swing.GroupLayout panel_datosLayout = new javax.swing.GroupLayout(panel_datos);
        panel_datos.setLayout(panel_datosLayout);
        panel_datosLayout.setHorizontalGroup(
            panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label_ciclo)
                    .addComponent(label_carrera)
                    .addComponent(label_semestre)
                    .addComponent(label_nombre)
                    .addComponent(campo_nombre)
                    .addComponent(campo_semestre)
                    .addComponent(combo_carrera, 0, 241, Short.MAX_VALUE)
                    .addComponent(campo_ciclo))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panel_datosLayout.setVerticalGroup(
            panel_datosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(label_nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_semestre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_semestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_carrera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combo_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(label_ciclo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(campo_ciclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        btn_guardar2.setText("Guardar");
        btn_guardar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_guardar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(296, Short.MAX_VALUE)
                .addComponent(btn_guardar2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_salir)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel_datos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(82, Short.MAX_VALUE)))
        );

        jPanel6.setBackground(new java.awt.Color(0, 0, 153));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Editar Materia");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_salirActionPerformed
    
    // Guardar Cambios realizados en la base de datos
    private void btn_guardar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardar2ActionPerformed

        // Validar que no haya campos vacíos
        if(campo_nombre.getText().isEmpty() || campo_ciclo.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Alguno de los campos se encuentra vacío.", "Actividad Complementaria", 0);
            return;
        }
        
        // Campos de la tabla en la base de datos
        Object[] campos = new Object[4];
        campos[0] = campo_nombre.getText();
        campos[1] = campo_semestre.getValue();
        campos[2] = campo_ciclo.getText();
        campos[3] = carreras.get(combo_carrera.getSelectedIndex()).getId_carrera();
        
        BaseDeDatos.GestionMaterias.editarMateria(materia.getId_materia(), campos);
        this.setVisible(false);
    }//GEN-LAST:event_btn_guardar2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar2;
    private javax.swing.JButton btn_salir;
    private javax.swing.JTextField campo_ciclo;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JSpinner campo_semestre;
    private javax.swing.JComboBox<String> combo_carrera;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel label_carrera;
    private javax.swing.JLabel label_ciclo;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_semestre;
    private javax.swing.JPanel panel_datos;
    // End of variables declaration//GEN-END:variables
}
