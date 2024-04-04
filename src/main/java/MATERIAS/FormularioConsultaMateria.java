package MATERIAS;

import BaseDeDatos.ModeloTablaMaterias;
import ModeloDatos.Materia;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FormularioConsultaMateria extends javax.swing.JFrame {
    
    private List<Materia> materias = new ArrayList();
    private Materia materia_seleccionada = null;
    
    public FormularioConsultaMateria() {
        initComponents();
        cargarMateriasRegistradas();
        escucharSeleccionTabla();
    }
    
    // Implementar un Listener para la selección de elementos de la tabla
    private void escucharSeleccionTabla(){
        tabla_materias.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e){
                btn_consulta.setEnabled(true);
            }
        });
    }
    
    // Llenar tabla de materias con las materias registradas en la Base de Datos
    private void cargarMateriasRegistradas(){
        materias = BaseDeDatos.GestionMaterias.obtenerMaterias();
        ModeloTablaMaterias modelo = new ModeloTablaMaterias(materias);
        
        tabla_materias.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_materias = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_materias = new javax.swing.JTable();
        label_materias = new javax.swing.JLabel();
        btn_consulta = new javax.swing.JToggleButton();
        btn_salir = new javax.swing.JToggleButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultar materias");
        setLocation(new java.awt.Point(200, 200));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panel_materias.setBackground(new java.awt.Color(255, 255, 255));
        panel_materias.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Materias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        tabla_materias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "ID Materia", "Materia", "Semestre", "Ciclo escolar", "ID Carrera"
            }
        ));
        jScrollPane1.setViewportView(tabla_materias);

        label_materias.setText("Materias Registradas:");

        btn_consulta.setText("Ver detalles de materia");
        btn_consulta.setEnabled(false);
        btn_consulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_materiasLayout = new javax.swing.GroupLayout(panel_materias);
        panel_materias.setLayout(panel_materiasLayout);
        panel_materiasLayout.setHorizontalGroup(
            panel_materiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_materiasLayout.createSequentialGroup()
                .addGroup(panel_materiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_materiasLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(panel_materiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label_materias)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_materiasLayout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(btn_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        panel_materiasLayout.setVerticalGroup(
            panel_materiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_materiasLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(label_materias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_consulta, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(196, Short.MAX_VALUE)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(193, 193, 193))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel_materias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(314, Short.MAX_VALUE)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel_materias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(64, Short.MAX_VALUE)))
        );

        jPanel6.setBackground(new java.awt.Color(0, 0, 153));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Consultar Materia");

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
    
    // Cerrar formulario
    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_salirActionPerformed
    
    // Consultar materia seleccionada
    private void btn_consultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultaActionPerformed
        
        // Validar seleccion
        if(tabla_materias.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "No se ha seleccionado ninguna materia de la lista.", "Actividad Complementaria", 0);
            return;
        }
        
        materia_seleccionada = materias.get(tabla_materias.getSelectedRow());
        FormularioEditarMateria formulario = new FormularioEditarMateria(materia_seleccionada, this);
        formulario.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        formulario.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                formulario.setVisible(false);
            }
            @Override
            public void windowDeactivated(WindowEvent e){
                cargarMateriasRegistradas();
                btn_consulta.setEnabled(false);
            }
        });
        
        // Mostrar formulario de edición
        formulario.setVisible(true);
    }//GEN-LAST:event_btn_consultaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_consulta;
    private javax.swing.JToggleButton btn_salir;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label_materias;
    private javax.swing.JPanel panel_materias;
    private javax.swing.JTable tabla_materias;
    // End of variables declaration//GEN-END:variables
}
