package ALTA_DOCENTE;

import ModeloDatos.Docente;
import BaseDeDatos.ModeloTabla;
import java.math.BigInteger;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class FormularioRegistro extends javax.swing.JFrame {
    
    private final JTable registro;
    
    public FormularioRegistro(JTable _registro) {
        initComponents();
        this.registro = _registro;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label_id = new javax.swing.JLabel();
        label_nombre = new javax.swing.JLabel();
        label_apellidos = new javax.swing.JLabel();
        label_rfc = new javax.swing.JLabel();
        label_direccion = new javax.swing.JLabel();
        label_e_civil = new javax.swing.JLabel();
        label_telefono = new javax.swing.JLabel();
        btn_guardar = new javax.swing.JButton();
        campo_telefono = new javax.swing.JFormattedTextField();
        combo_e_civil = new javax.swing.JComboBox<>();
        campo_direccion = new javax.swing.JTextField();
        campo_rfc = new javax.swing.JTextField();
        campo_apellidos = new javax.swing.JTextField();
        campo_nombre = new javax.swing.JTextField();
        campo_id = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro Docente");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(200, 200));
        setName("formularioRegistro"); // NOI18N
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Docente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        label_id.setForeground(new java.awt.Color(51, 51, 51));
        label_id.setText("ID docente:");

        label_nombre.setForeground(new java.awt.Color(51, 51, 51));
        label_nombre.setText("Nombre:");

        label_apellidos.setForeground(new java.awt.Color(51, 51, 51));
        label_apellidos.setText("Apellidos:");

        label_rfc.setForeground(new java.awt.Color(51, 51, 51));
        label_rfc.setText("RFC:");

        label_direccion.setForeground(new java.awt.Color(51, 51, 51));
        label_direccion.setText("Direccion:");

        label_e_civil.setForeground(new java.awt.Color(51, 51, 51));
        label_e_civil.setText("Estado civil:");

        label_telefono.setForeground(new java.awt.Color(51, 51, 51));
        label_telefono.setText("Telefono:");

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agregar_icono.png"))); // NOI18N
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        campo_telefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        combo_e_civil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero", "Casado", "Union libre" }));

        campo_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_nombreActionPerformed(evt);
            }
        });

        campo_id.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(label_nombre)
                        .addComponent(label_id)
                        .addComponent(label_apellidos)
                        .addComponent(label_rfc)
                        .addComponent(label_direccion))
                    .addComponent(label_e_civil, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_telefono, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_guardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campo_direccion)
                    .addComponent(campo_rfc)
                    .addComponent(combo_e_civil, 0, 245, Short.MAX_VALUE)
                    .addComponent(campo_nombre)
                    .addComponent(campo_apellidos)
                    .addComponent(campo_id)
                    .addComponent(campo_telefono))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_id)
                    .addComponent(campo_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_apellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_apellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_rfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_rfc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_direccion)
                    .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_e_civil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_e_civil))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_telefono)
                    .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btn_guardar)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar Nuevo");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleName("RegistroDocente");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Método al presionar el botón guardar
    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        
        // Verificar que todos los campos del formulario sean llenados
        if(campo_id.getText().isEmpty() || campo_id.getText().isEmpty() || campo_nombre.getText().isEmpty() ||
           campo_apellidos.getText().isEmpty() || campo_rfc.getText().isEmpty() || campo_telefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Uno o varios de los campos se encuentran vacíos", "Actividad Complementaria", 0);
            return;
        }

        // Recuperar los valores de los campos del formulario
        int id = Integer.valueOf(campo_id.getText());
        String nombre = campo_nombre.getText();
        String apellidos = campo_apellidos.getText();
        String rfc = campo_rfc.getText(); 
        String direccion = campo_direccion.getText();
        String estado_civil = combo_e_civil.getSelectedItem().toString();
        BigInteger telefono = new BigInteger(campo_telefono.getText());

        // Crear un nuevo registro en la Base de datos con los valores recuperados
        BaseDeDatos.Registro.docentes.add(new Docente(id, nombre, apellidos, rfc, direccion, estado_civil, telefono));
        BaseDeDatos.Registro.actualizarDatosBD();
        
        // Actualizar modelo de tabla de registro
        ModeloTabla modelo = new ModeloTabla(BaseDeDatos.Registro.docentes);
        registro.setModel(modelo);
        
        // Cerrar formilario
        this.setVisible(false);
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void campo_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_nombreActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JTextField campo_apellidos;
    private javax.swing.JTextField campo_direccion;
    private javax.swing.JFormattedTextField campo_id;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_rfc;
    private javax.swing.JFormattedTextField campo_telefono;
    private javax.swing.JComboBox<String> combo_e_civil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel label_apellidos;
    private javax.swing.JLabel label_direccion;
    private javax.swing.JLabel label_e_civil;
    private javax.swing.JLabel label_id;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_rfc;
    private javax.swing.JLabel label_telefono;
    // End of variables declaration//GEN-END:variables
}
