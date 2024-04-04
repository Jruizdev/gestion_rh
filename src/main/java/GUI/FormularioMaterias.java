package GUI;

import ModeloDatos.Docente;
import javax.swing.JOptionPane;

public class FormularioMaterias extends javax.swing.JFrame {
    
    private final Docente docente;
    
    public FormularioMaterias(Docente _docente) {
        initComponents();
        this.docente = _docente;
        cargarDatos();
    }
    
    private void cargarDatos(){
        spinner_materias.setValue(docente.getCantidad_materias());
        texto_jornada.setText(docente.getJornada_laboral() + " Horas");
        texto_nombre.setText(docente.getNombre() + " " + docente.getApellidos());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label_jornada = new javax.swing.JLabel();
        texto_jornada = new javax.swing.JLabel();
        label_materias = new javax.swing.JLabel();
        spinner_materias = new javax.swing.JSpinner();
        btn_guardar = new javax.swing.JButton();
        label_nombre = new javax.swing.JLabel();
        texto_nombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cantidad de Materias");
        setLocation(new java.awt.Point(200, 200));
        setResizable(false);

        label_jornada.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_jornada.setText("Jornada Laboral:");

        texto_jornada.setText("       ");

        label_materias.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_materias.setText("Cantidad de materias:");

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        label_nombre.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        label_nombre.setText("Docente:");

        texto_nombre.setText("Nombre");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texto_nombre)
                    .addComponent(label_nombre)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(label_jornada)
                        .addComponent(texto_jornada)
                        .addComponent(label_materias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(spinner_materias)
                        .addComponent(btn_guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(label_nombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(texto_nombre)
                .addGap(33, 33, 33)
                .addComponent(label_jornada)
                .addGap(4, 4, 4)
                .addComponent(texto_jornada)
                .addGap(18, 18, 18)
                .addComponent(label_materias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spinner_materias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_guardar)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        docente.setCantidad_materias((int)spinner_materias.getValue());
        JOptionPane.showMessageDialog(null, "Materias actualizadas");
        this.setVisible(false);
    }//GEN-LAST:event_btn_guardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JLabel label_jornada;
    private javax.swing.JLabel label_materias;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JSpinner spinner_materias;
    private javax.swing.JLabel texto_jornada;
    private javax.swing.JLabel texto_nombre;
    // End of variables declaration//GEN-END:variables
}
