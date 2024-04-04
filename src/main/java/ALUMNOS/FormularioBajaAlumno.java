package ALUMNOS;

import BaseDeDatos.ModeloTablaAlumnos;
import BaseDeDatos.ModeloTablaEscolares;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class FormularioBajaAlumno extends javax.swing.JFrame {
    
    private int id_seleccionado = -1;
    
    public FormularioBajaAlumno() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        panel_id = new javax.swing.JPanel();
        label_id = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JToggleButton();
        campo_id = new javax.swing.JFormattedTextField();
        panel_seleccion = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_datos_escolares = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla_alumno = new javax.swing.JTable();
        label_personales = new javax.swing.JLabel();
        label_escolares = new javax.swing.JLabel();
        btn_baja = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Baja de Alumno");
        setLocation(new java.awt.Point(200, 200));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panel_id.setBackground(new java.awt.Color(255, 255, 255));
        panel_id.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información del alumno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        label_id.setText("ID del Alumno:");

        btn_buscar.setText("Buscar alumno");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        campo_id.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout panel_idLayout = new javax.swing.GroupLayout(panel_id);
        panel_id.setLayout(panel_idLayout);
        panel_idLayout.setHorizontalGroup(
            panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_idLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_id, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_buscar, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addGroup(panel_idLayout.createSequentialGroup()
                        .addComponent(label_id)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_idLayout.setVerticalGroup(
            panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_idLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_buscar)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panel_seleccion.setBackground(new java.awt.Color(255, 255, 255));
        panel_seleccion.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Información del alumno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        tabla_datos_escolares.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "Matrícula", "Semestre", "Carrera"
            }
        ));
        jScrollPane2.setViewportView(tabla_datos_escolares);

        tabla_alumno.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Direccion", "CURP"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabla_alumno);

        label_personales.setText("Datos personales:");

        label_escolares.setText("Datos escolares:");

        javax.swing.GroupLayout panel_seleccionLayout = new javax.swing.GroupLayout(panel_seleccion);
        panel_seleccion.setLayout(panel_seleccionLayout);
        panel_seleccionLayout.setHorizontalGroup(
            panel_seleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_seleccionLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(panel_seleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_escolares)
                    .addComponent(label_personales)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
            .addGroup(panel_seleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_seleccionLayout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(40, Short.MAX_VALUE)))
        );
        panel_seleccionLayout.setVerticalGroup(
            panel_seleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_seleccionLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(label_personales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(label_escolares)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(panel_seleccionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panel_seleccionLayout.createSequentialGroup()
                    .addGap(42, 42, 42)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(127, Short.MAX_VALUE)))
        );

        btn_baja.setText("Dar de baja");
        btn_baja.setEnabled(false);
        btn_baja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bajaActionPerformed(evt);
            }
        });

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
                .addGap(168, 168, 168)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_baja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(170, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(161, 161, 161)
                    .addComponent(panel_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(189, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel_seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(12, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(411, Short.MAX_VALUE)
                .addComponent(btn_baja, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(panel_seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(97, Short.MAX_VALUE)))
        );

        jPanel6.setBackground(new java.awt.Color(0, 0, 153));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Baja de Alumno");

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
    

    // Buscar alumno por ID
    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        
        // Validar que se haya ingresado un ID
        if(campo_id.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No ha sido indicado nungún ID todavia.", "Actividad Complementaria", 0);
            return;
        }
        
        // Lista de resultados encontrados
        List<ModeloDatos.Alumno> resultado_alumno = new ArrayList();
        List<ModeloDatos.DatosEscolares> resultado_datos = new ArrayList();
        
        for(ModeloDatos.Alumno alumno : BaseDeDatos.Consulta.obtenerAlumnos()){
            if(alumno.getId() == Integer.parseInt(campo_id.getText())){
                resultado_alumno.add(alumno);
                ModeloTablaAlumnos modelo = new ModeloTablaAlumnos(resultado_alumno);
                tabla_alumno.setModel(modelo);
            }
        }
        
        // Datos escolares
        for(ModeloDatos.DatosEscolares datos : BaseDeDatos.Consulta.obtenerDatosEscolares()){
            if(datos.getId_alumno() == Integer.parseInt(campo_id.getText())){
                resultado_datos.add(datos);
                ModeloTablaEscolares modelo = new ModeloTablaEscolares(resultado_datos);
                tabla_datos_escolares.setModel(modelo);
            }
        }
        
        if(resultado_alumno.size() == 0){
            JOptionPane.showMessageDialog(null, "No se ha encontrado a ningún usuario con este ID.");
        } else {
            id_seleccionado = Integer.parseInt(campo_id.getText());
            btn_baja.setEnabled(true);
        }
    }//GEN-LAST:event_btn_buscarActionPerformed
    
    // Eliminar registros del alumno seleccionado en la base de datos
    private void btn_bajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bajaActionPerformed
        
        int opcion = JOptionPane.showConfirmDialog(null, "Realmente desea eliminar el alumno: " + id_seleccionado + "?",
                                      "Eliminar alumno", 0);
        
        // Si el usuario confirma la baja, eliminar el registro
        if(opcion == 0){
            BaseDeDatos.GestionAlumnos.eliminarAlumno(id_seleccionado);

            // Limpiar tablas mostradas
            ModeloTablaAlumnos registro_alumnos = new ModeloTablaAlumnos(new ArrayList());
            ModeloTablaEscolares registro_datos = new ModeloTablaEscolares(new ArrayList());
            tabla_alumno.setModel(registro_alumnos);
            tabla_datos_escolares.setModel(registro_datos);
        }
        
    }//GEN-LAST:event_btn_bajaActionPerformed
    
    // Cerrar formulario
    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_salirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_baja;
    private javax.swing.JToggleButton btn_buscar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JFormattedTextField campo_id;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel label_escolares;
    private javax.swing.JLabel label_id;
    private javax.swing.JLabel label_personales;
    private javax.swing.JPanel panel_id;
    private javax.swing.JPanel panel_seleccion;
    private javax.swing.JTable tabla_alumno;
    private javax.swing.JTable tabla_datos_escolares;
    // End of variables declaration//GEN-END:variables
}
