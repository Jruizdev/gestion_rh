package ALTA_DOCENTE;

import ModeloDatos.Docente;
import java.awt.Font;
import javax.swing.JOptionPane;

public class AgregarDatosProfesionales extends javax.swing.JFrame {
    
    private final Docente seleccion;
   
    public AgregarDatosProfesionales(Docente _seleccion) {
        initComponents();
        this.seleccion = _seleccion;
        
        // Mostrar el nombre del doccente seleccionado
        label_nombre.setText(seleccion.getNombre() + " " + seleccion.getApellidos());
        label_nombre.setFont(new Font("Arial", Font.PLAIN, 12));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        label_docente = new javax.swing.JLabel();
        label_nombre = new javax.swing.JLabel();
        label_datos = new javax.swing.JLabel();
        label_experiencia = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        campo_experiencia = new javax.swing.JTextArea();
        label_trabajo = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        campo_trabajo = new javax.swing.JTextArea();
        label_cedula = new javax.swing.JLabel();
        campo_cedula = new javax.swing.JTextField();
        label_especialidad = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        campo_especialidad = new javax.swing.JTextArea();
        btn_guardar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Datos Profesionales");
        setLocation(new java.awt.Point(200, 200));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        label_docente.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_docente.setForeground(new java.awt.Color(51, 51, 51));
        label_docente.setText("Docente:");

        label_nombre.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        label_nombre.setForeground(new java.awt.Color(51, 51, 51));
        label_nombre.setText("Nombre");

        label_datos.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        label_datos.setForeground(new java.awt.Color(51, 51, 51));
        label_datos.setText("Datos Profesionales:");

        label_experiencia.setForeground(new java.awt.Color(51, 51, 51));
        label_experiencia.setText("Experiencia profesional:");

        campo_experiencia.setColumns(20);
        campo_experiencia.setRows(5);
        jScrollPane2.setViewportView(campo_experiencia);

        label_trabajo.setForeground(new java.awt.Color(51, 51, 51));
        label_trabajo.setText("Trabajo anterior:");

        campo_trabajo.setColumns(20);
        campo_trabajo.setRows(5);
        jScrollPane3.setViewportView(campo_trabajo);

        label_cedula.setForeground(new java.awt.Color(51, 51, 51));
        label_cedula.setText("Cédula profesional:");

        label_especialidad.setForeground(new java.awt.Color(51, 51, 51));
        label_especialidad.setText("Especialidad:");

        campo_especialidad.setColumns(20);
        campo_especialidad.setRows(5);
        jScrollPane5.setViewportView(campo_especialidad);

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/agregar_icono.png"))); // NOI18N
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_datos)
                            .addComponent(label_nombre)
                            .addComponent(label_docente)
                            .addComponent(label_experiencia)
                            .addComponent(label_trabajo)
                            .addComponent(label_cedula)
                            .addComponent(label_especialidad))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(campo_cedula)
                    .addComponent(jScrollPane5))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_guardar)
                .addGap(104, 104, 104))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_docente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_nombre)
                .addGap(32, 32, 32)
                .addComponent(label_datos)
                .addGap(18, 18, 18)
                .addComponent(label_experiencia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(label_trabajo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_cedula)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(label_especialidad)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_guardar)
                .addGap(133, 133, 133))
        );

        jPanel2.setBackground(new java.awt.Color(0, 0, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Datos Profesionales");

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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        
        // Verificar que los campos no esten vacíos
        if(campo_experiencia.getText().isEmpty() || campo_trabajo.getText().isEmpty() ||
           campo_cedula.getText().isEmpty() || campo_especialidad.getText().isEmpty()){
            JOptionPane.showConfirmDialog(null, "Uno o varios de los campos se encuentran vacíos", "Actividad Complementaria", 0);
            return;
        }
        
        // Obtener datos de los campos del formulario
        String experiencia = campo_experiencia.getText();
        String trabajo = campo_trabajo.getText();
        String cedula = campo_cedula.getText();
        String especialidad = campo_especialidad.getText();
        
        // Asignar los datos al usuario docente
        seleccion.setExperiencia(experiencia);
        seleccion.setTrabajo_anterior(trabajo);
        seleccion.setCedula(cedula);
        seleccion.setEspecialidad(especialidad);
        
        JOptionPane.showMessageDialog(null, "Datos profesionales agregados");
        
        // Cerrar formulario
        this.setVisible(false);
    }//GEN-LAST:event_btn_guardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JTextField campo_cedula;
    private javax.swing.JTextArea campo_especialidad;
    private javax.swing.JTextArea campo_experiencia;
    private javax.swing.JTextArea campo_trabajo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel label_cedula;
    private javax.swing.JLabel label_datos;
    private javax.swing.JLabel label_docente;
    private javax.swing.JLabel label_especialidad;
    private javax.swing.JLabel label_experiencia;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_trabajo;
    // End of variables declaration//GEN-END:variables
}
