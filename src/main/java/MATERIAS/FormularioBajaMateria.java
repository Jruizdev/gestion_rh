package MATERIAS;

import BaseDeDatos.ModeloTablaMaterias;
import ModeloDatos.Materia;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FormularioBajaMateria extends javax.swing.JFrame {
    
    private List<Materia> materias = new ArrayList();
    private Materia materia_consultada = new Materia();
    private Materia materia_seleccionada = new Materia();

    public FormularioBajaMateria() {
        initComponents();
        cargarMateriasRegistradas();
        escucharSeleccionTabla();
    }
    
    // Agregar listener de selecciona a la tabla de materias
    private void escucharSeleccionTabla(){
        tabla_materias.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                materia_seleccionada = materias.get(tabla_materias.getSelectedRow());
                btn_baja_seleccion.setEnabled(true);
            }
        });
    }
    
    // Llenar tabla de materias con los datos de la base de datos.
    private void cargarMateriasRegistradas(){
        materias = BaseDeDatos.GestionMaterias.obtenerMaterias();
        ModeloTablaMaterias modelo = new ModeloTablaMaterias(materias);
        tabla_materias.setModel(modelo);
    }
    
    // Llenar tabla de consulta con el resultado obtenido
    private void cargarTablaResultado(){

        // Resultado de la consulta
        List<Materia> resultado = new ArrayList();
        
        int id = Integer.parseInt(campo_id.getText());
        for(Materia materia : materias){
            if(materia.getId_materia() == id){
                resultado.add(materia);
            }
        }
        
        if(resultado.size() == 0){
            JOptionPane.showMessageDialog(null, "No se encontró ninguna materia con este ID.");
        } else{
            materia_consultada = resultado.get(0);
            ModeloTablaMaterias modelo = new ModeloTablaMaterias(resultado);
            tabla_resultado.setModel(modelo);
            btn_baja_id.setEnabled(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_bajaID = new javax.swing.JPanel();
        label_id = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_resultado = new javax.swing.JTable();
        label_resultado = new javax.swing.JLabel();
        btn_baja_id = new javax.swing.JToggleButton();
        campo_id = new javax.swing.JFormattedTextField();
        panel_baja_seleccion = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_materias = new javax.swing.JTable();
        label_materias = new javax.swing.JLabel();
        btn_baja_seleccion = new javax.swing.JButton();
        btn_salir = new javax.swing.JToggleButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dar de baja de materia");
        setLocation(new java.awt.Point(200, 200));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panel_bajaID.setBackground(new java.awt.Color(255, 255, 255));
        panel_bajaID.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Baja por ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        label_id.setText("ID de materia:");

        jToggleButton1.setText("Buscar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        tabla_resultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "ID Materia", "Materia", "Semestre", "Ciclo escolar", "ID Carrera"
            }
        ));
        jScrollPane1.setViewportView(tabla_resultado);

        label_resultado.setText("Resultado:");

        btn_baja_id.setText("Dar de baja");
        btn_baja_id.setEnabled(false);
        btn_baja_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_baja_idActionPerformed(evt);
            }
        });

        campo_id.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout panel_bajaIDLayout = new javax.swing.GroupLayout(panel_bajaID);
        panel_bajaID.setLayout(panel_bajaIDLayout);
        panel_bajaIDLayout.setHorizontalGroup(
            panel_bajaIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bajaIDLayout.createSequentialGroup()
                .addGroup(panel_bajaIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_bajaIDLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(panel_bajaIDLayout.createSequentialGroup()
                        .addGroup(panel_bajaIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_bajaIDLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label_resultado))
                            .addGroup(panel_bajaIDLayout.createSequentialGroup()
                                .addGap(121, 121, 121)
                                .addGroup(panel_bajaIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(label_id)
                                    .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .addComponent(campo_id))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(panel_bajaIDLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(btn_baja_id, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_bajaIDLayout.setVerticalGroup(
            panel_bajaIDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bajaIDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jToggleButton1)
                .addGap(22, 22, 22)
                .addComponent(label_resultado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btn_baja_id, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panel_baja_seleccion.setBackground(new java.awt.Color(255, 255, 255));
        panel_baja_seleccion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Baja por ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        tabla_materias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "ID Materia", "Materia", "Semestre", "Ciclo escolar", "ID Carrera"
            }
        ));
        jScrollPane2.setViewportView(tabla_materias);

        label_materias.setText("Materias registradas:");

        btn_baja_seleccion.setText("Dar de baja materia seleccionada");
        btn_baja_seleccion.setEnabled(false);
        btn_baja_seleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_baja_seleccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_baja_seleccionLayout = new javax.swing.GroupLayout(panel_baja_seleccion);
        panel_baja_seleccion.setLayout(panel_baja_seleccionLayout);
        panel_baja_seleccionLayout.setHorizontalGroup(
            panel_baja_seleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_baja_seleccionLayout.createSequentialGroup()
                .addGroup(panel_baja_seleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_baja_seleccionLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_baja_seleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_materias)))
                    .addGroup(panel_baja_seleccionLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(btn_baja_seleccion)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_baja_seleccionLayout.setVerticalGroup(
            panel_baja_seleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_baja_seleccionLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(label_materias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(btn_baja_seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btn_salir.setText("Salir");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(151, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(panel_bajaID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_baja_seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(498, Short.MAX_VALUE)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel_bajaID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel_baja_seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(54, Short.MAX_VALUE)))
        );

        jPanel6.setBackground(new java.awt.Color(0, 0, 153));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Eliminar Materia");

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
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    
    // Cerrar formulario
    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_salirActionPerformed

    
    // Buscar materia por ID
    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        
        // Validar campor de ID
        if(campo_id.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No ha sido ingresado ningun ID.", "Actividad Complementaria", 0);
            return;
        }
        
        cargarTablaResultado();
    }//GEN-LAST:event_jToggleButton1ActionPerformed
    
    // Dar de baja materia por ID
    private void btn_baja_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_baja_idActionPerformed
        
        // Eliminar en caso de confirmacion.
        if(confirmacionDeBaja(materia_consultada.getId_materia())){
            BaseDeDatos.GestionMaterias.bajaDeMateria(materia_consultada.getId_materia());
            cargarMateriasRegistradas();

            // Vaciar tabla de consulta
            ModeloTablaMaterias modelo = new ModeloTablaMaterias(new ArrayList());
            tabla_resultado.setModel(modelo);
            btn_baja_id.setEnabled(false);
        }
    }//GEN-LAST:event_btn_baja_idActionPerformed
    
    // Solicitar confirmación de baja, al usuario.
    private boolean confirmacionDeBaja(int ID){
        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de eliminar la materia con ID: " + ID + 
                                                            "?", "Eliminar materia", 1);
        if(confirmacion == 0) return true;
        return false;
    }
    
    // Dar de baja materia por seleccion.
    private void btn_baja_seleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_baja_seleccionActionPerformed
        
        // Eliminar en caso de confirmación
        if(confirmacionDeBaja(materia_seleccionada.getId_materia())){
            BaseDeDatos.GestionMaterias.bajaDeMateria(materia_seleccionada.getId_materia());
            cargarMateriasRegistradas();

            // Vaciar tabla de consulta
            ModeloTablaMaterias modelo = new ModeloTablaMaterias(new ArrayList());
            tabla_resultado.setModel(modelo);
            btn_baja_id.setEnabled(false);
        }
    }//GEN-LAST:event_btn_baja_seleccionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_baja_id;
    private javax.swing.JButton btn_baja_seleccion;
    private javax.swing.JToggleButton btn_salir;
    private javax.swing.JFormattedTextField campo_id;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel label_id;
    private javax.swing.JLabel label_materias;
    private javax.swing.JLabel label_resultado;
    private javax.swing.JPanel panel_bajaID;
    private javax.swing.JPanel panel_baja_seleccion;
    private javax.swing.JTable tabla_materias;
    private javax.swing.JTable tabla_resultado;
    // End of variables declaration//GEN-END:variables
}
