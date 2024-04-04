package ALUMNOS;

import BaseDeDatos.ModeloTablaAlumnos;
import ModeloDatos.Alumno;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FormularioConsultaAlumno extends javax.swing.JFrame {
    
    private List<Alumno> alumnos = new ArrayList();
    
    public FormularioConsultaAlumno() {
        initComponents();
        cargarAlumnos();
        
        tabla_alumnos.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                btn_consultar_seleccion.setEnabled(true);
            }
        });
    }
    
    // Cargar todos los alumnos de la base de datos, en la tabla
    private void cargarAlumnos(){
        alumnos = BaseDeDatos.Consulta.obtenerAlumnos();
        ModeloTablaAlumnos modelo = new ModeloTablaAlumnos(alumnos);
        tabla_alumnos.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_id = new javax.swing.JPanel();
        label_id = new javax.swing.JLabel();
        campo_id = new javax.swing.JFormattedTextField();
        btn_consultar_id = new javax.swing.JButton();
        panel_alumnos = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_alumnos = new javax.swing.JTable();
        label_alumnos = new javax.swing.JLabel();
        btn_consultar_seleccion = new javax.swing.JToggleButton();
        btn_salir = new javax.swing.JToggleButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultar alumno");
        setLocation(new java.awt.Point(200, 200));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panel_id.setBackground(new java.awt.Color(255, 255, 255));
        panel_id.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consultar por ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        label_id.setText("ID de Alumno:");

        campo_id.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        btn_consultar_id.setText("Consultar ID");
        btn_consultar_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultar_idActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_idLayout = new javax.swing.GroupLayout(panel_id);
        panel_id.setLayout(panel_idLayout);
        panel_idLayout.setHorizontalGroup(
            panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_idLayout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_consultar_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_id)
                    .addComponent(campo_id, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        panel_idLayout.setVerticalGroup(
            panel_idLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_idLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(label_id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_consultar_id)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panel_alumnos.setBackground(new java.awt.Color(255, 255, 255));
        panel_alumnos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consultar por ID", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        tabla_alumnos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabla_alumnos);

        label_alumnos.setText("Alumnos registrados:");

        btn_consultar_seleccion.setText("Consultar alumno seleccionado");
        btn_consultar_seleccion.setEnabled(false);
        btn_consultar_seleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultar_seleccionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_alumnosLayout = new javax.swing.GroupLayout(panel_alumnos);
        panel_alumnos.setLayout(panel_alumnosLayout);
        panel_alumnosLayout.setHorizontalGroup(
            panel_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_alumnosLayout.createSequentialGroup()
                .addGroup(panel_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_alumnosLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(panel_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_alumnos)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_alumnosLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(btn_consultar_seleccion)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        panel_alumnosLayout.setVerticalGroup(
            panel_alumnosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_alumnosLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(label_alumnos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_consultar_seleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(110, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(panel_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(157, 157, 157))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel_alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(350, 350, 350)
                .addComponent(btn_salir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(180, 180, 180)
                    .addComponent(panel_alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(40, Short.MAX_VALUE)))
        );

        jPanel6.setBackground(new java.awt.Color(0, 0, 153));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Consultar Alumno");

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
    
    // Mostrar formulario para editar información de alumno
    private void btn_consultar_seleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultar_seleccionActionPerformed
        
        int ID = alumnos.get(tabla_alumnos.getSelectedRow()).getId();
        Alumno consulta_alumno = null;
        
        for(Alumno alumno : alumnos){
            if(alumno.getId() == ID){
                consulta_alumno = alumno;
            }
        }
        
        FormularioEditar formulario = new FormularioEditar(consulta_alumno);
        
        formulario.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        formulario.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                formulario.setVisible(false);
            }
            @Override
            public void windowDeactivated(WindowEvent e){
                cargarAlumnos();
                btn_consultar_seleccion.setEnabled(false);
            }
        });
        formulario.setVisible(true);
    }//GEN-LAST:event_btn_consultar_seleccionActionPerformed
    
    // Mostrar formulario para editar informacion de alumno
    private void btn_consultar_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultar_idActionPerformed
        if(campo_id.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No ha sido ingresado ningún ID.", "Actividad Complementaria", 0);
            return;
        }
        
        boolean usuario_encontrado = false;
        Alumno consulta_alumno = null;
        
        for(Alumno alumno : BaseDeDatos.Consulta.obtenerAlumnos()){
            if(alumno.getId() == Integer.parseInt(campo_id.getText())){
                usuario_encontrado = true;
                consulta_alumno = alumno;
                break;
            } 
        }
        
        // Mostrar formulario solo si el usuario existe en el registro
        if(usuario_encontrado){
            FormularioEditar formulario = new FormularioEditar(consulta_alumno);
                formulario.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

                formulario.addWindowListener(new WindowAdapter(){
                    @Override
                    public void windowClosing(WindowEvent e){
                        formulario.setVisible(false);
                    }
                });
                formulario.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "El usuario con ID: " + campo_id.getText() + " no ha sido encontrado.");
        }

    }//GEN-LAST:event_btn_consultar_idActionPerformed
    
    // Cerrar formulario
    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_salirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_consultar_id;
    private javax.swing.JToggleButton btn_consultar_seleccion;
    private javax.swing.JToggleButton btn_salir;
    private javax.swing.JFormattedTextField campo_id;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_alumnos;
    private javax.swing.JLabel label_id;
    private javax.swing.JPanel panel_alumnos;
    private javax.swing.JPanel panel_id;
    private javax.swing.JTable tabla_alumnos;
    // End of variables declaration//GEN-END:variables
}
