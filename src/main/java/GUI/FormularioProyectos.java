package GUI;

import ModeloDatos.Docente;
import javax.swing.JOptionPane;

public class FormularioProyectos extends javax.swing.JFrame {
    
    private final Docente docente;
    
    public FormularioProyectos(Docente _docente) {
        initComponents();
        this.docente = _docente;
        cargarDatos();
    }
    
    // Cargar datos iniciales en el formulario
    private void cargarDatos(){
        texto_nombre.setText(docente.getNombre() + " " + docente.getApellidos());
        combo_proyectos.setSelectedItem(docente.getProyecto_asignado());
        radio_investigador.setSelected(docente.isPerfil_investigador());
        combo_proyectos.setEnabled(docente.isPerfil_investigador());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_proyecto = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JButton();
        radio_investigador = new javax.swing.JRadioButton();
        combo_proyectos = new javax.swing.JComboBox<>();
        label_nombre = new javax.swing.JLabel();
        texto_nombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proyecto Asigmado");
        setLocation(new java.awt.Point(200, 200));
        setResizable(false);

        label_proyecto.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_proyecto.setText("Proyecto asignado:");

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        radio_investigador.setText("Perfil investigador");
        radio_investigador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio_investigadorActionPerformed(evt);
            }
        });

        combo_proyectos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Proyecto 1", "Proyecto 2", "Proyecto 3", "Proyecto 4" }));
        combo_proyectos.setEnabled(false);

        label_nombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_nombre.setText("Docente:");

        texto_nombre.setText("Nombre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texto_nombre)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radio_investigador)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(combo_proyectos, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_proyecto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(label_nombre))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(texto_nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(radio_investigador)
                .addGap(18, 18, 18)
                .addComponent(label_proyecto)
                .addGap(13, 13, 13)
                .addComponent(combo_proyectos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btn_guardar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Activar perfil investigador
    private void radio_investigadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio_investigadorActionPerformed
        if(radio_investigador.isSelected()){
            combo_proyectos.setEnabled(true);
            docente.setJornada_laboral(8);
        } else {
           combo_proyectos.setEnabled(false);
            docente.setJornada_laboral(6); 
        }
    }//GEN-LAST:event_radio_investigadorActionPerformed
    
    // Guardar datos del docente
    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        docente.setProyecto_asignado(combo_proyectos.getSelectedItem() + "");
        docente.setPerfil_investigador(radio_investigador.isSelected());
        
        JOptionPane.showMessageDialog(null, "Datos guardados");
        this.setVisible(false);
    }//GEN-LAST:event_btn_guardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JComboBox<String> combo_proyectos;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_proyecto;
    private javax.swing.JRadioButton radio_investigador;
    private javax.swing.JLabel texto_nombre;
    // End of variables declaration//GEN-END:variables
}
