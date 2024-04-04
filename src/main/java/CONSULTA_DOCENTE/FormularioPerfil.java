package CONSULTA_DOCENTE;

import ModeloDatos.Docente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class FormularioPerfil extends javax.swing.JFrame {

    public FormularioPerfil() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        label_id = new javax.swing.JLabel();
        btn_buscar = new javax.swing.JToggleButton();
        campo_id = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        label_n = new javax.swing.JLabel();
        res_nombre = new javax.swing.JLabel();
        label_a = new javax.swing.JLabel();
        res_apellidos = new javax.swing.JLabel();
        label_r = new javax.swing.JLabel();
        res_rfc = new javax.swing.JLabel();
        label_d = new javax.swing.JLabel();
        res_direccion = new javax.swing.JLabel();
        label_e = new javax.swing.JLabel();
        res_estado_c = new javax.swing.JLabel();
        label_t = new javax.swing.JLabel();
        res_telefono = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        label_trab = new javax.swing.JLabel();
        label_ced = new javax.swing.JLabel();
        label_esp = new javax.swing.JLabel();
        dp_experiencia = new javax.swing.JLabel();
        dp_trabajo = new javax.swing.JLabel();
        dp_cedula = new javax.swing.JLabel();
        dp_especialidad = new javax.swing.JLabel();
        label_exp = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        resultado_nombre = new javax.swing.JLabel();
        resultado_apellidos = new javax.swing.JLabel();
        resultado_rfc = new javax.swing.JLabel();
        resultado_direccion = new javax.swing.JLabel();
        resultado_estado = new javax.swing.JLabel();
        resultado_telefono = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultar Perfil");
        setLocation(new java.awt.Point(200, 100));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(0, 0, 153));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Perfil de Docente");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        label_id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        label_id.setForeground(new java.awt.Color(51, 51, 51));
        label_id.setText("ID de usuario a consultar:");

        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/buscar_icono.png"))); // NOI18N
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        campo_id.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Datos personales:");

        label_n.setForeground(new java.awt.Color(102, 102, 102));
        label_n.setText("Nombre:");

        res_nombre.setForeground(new java.awt.Color(51, 51, 51));

        label_a.setForeground(new java.awt.Color(102, 102, 102));
        label_a.setText("Apellidos:");

        res_apellidos.setForeground(new java.awt.Color(51, 51, 51));

        label_r.setForeground(new java.awt.Color(102, 102, 102));
        label_r.setText("RFC:");

        res_rfc.setForeground(new java.awt.Color(51, 51, 51));

        label_d.setForeground(new java.awt.Color(102, 102, 102));
        label_d.setText("Dirección:");

        res_direccion.setForeground(new java.awt.Color(51, 51, 51));

        label_e.setForeground(new java.awt.Color(102, 102, 102));
        label_e.setText("Estado civil:");

        res_estado_c.setForeground(new java.awt.Color(51, 51, 51));

        label_t.setForeground(new java.awt.Color(102, 102, 102));
        label_t.setText("Teléfono:");

        res_telefono.setForeground(new java.awt.Color(51, 51, 51));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        label_trab.setForeground(new java.awt.Color(102, 102, 102));
        label_trab.setText("Trabajo anterior:");

        label_ced.setForeground(new java.awt.Color(102, 102, 102));
        label_ced.setText("Cédula profesional:");

        label_esp.setForeground(new java.awt.Color(102, 102, 102));
        label_esp.setText("Especialidad:");

        dp_experiencia.setForeground(new java.awt.Color(51, 51, 51));

        dp_trabajo.setForeground(new java.awt.Color(51, 51, 51));

        dp_cedula.setForeground(new java.awt.Color(51, 51, 51));

        dp_especialidad.setForeground(new java.awt.Color(51, 51, 51));

        label_exp.setForeground(new java.awt.Color(102, 102, 102));
        label_exp.setText("Experiencia:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Datos profesionales:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_esp)
                    .addComponent(label_ced)
                    .addComponent(label_trab)
                    .addComponent(label_exp)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dp_cedula)
                    .addComponent(dp_trabajo)
                    .addComponent(dp_especialidad)
                    .addComponent(dp_experiencia))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label_exp)
                    .addComponent(dp_experiencia))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dp_trabajo)
                    .addComponent(label_trab))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dp_cedula)
                    .addComponent(label_ced))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dp_especialidad)
                    .addComponent(label_esp))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        resultado_nombre.setForeground(new java.awt.Color(51, 51, 51));
        resultado_nombre.setText("      ");

        resultado_apellidos.setForeground(new java.awt.Color(51, 51, 51));
        resultado_apellidos.setText("       ");

        resultado_rfc.setForeground(new java.awt.Color(51, 51, 51));
        resultado_rfc.setText("      ");

        resultado_direccion.setForeground(new java.awt.Color(51, 51, 51));
        resultado_direccion.setText("        ");

        resultado_estado.setForeground(new java.awt.Color(51, 51, 51));
        resultado_estado.setText("       ");

        resultado_telefono.setForeground(new java.awt.Color(51, 51, 51));
        resultado_telefono.setText("      ");

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salir_icono.png"))); // NOI18N
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(label_r)
                            .addComponent(label_a)
                            .addComponent(label_n)
                            .addComponent(label_d)
                            .addComponent(label_e)
                            .addComponent(label_t))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resultado_estado)
                            .addComponent(resultado_telefono)
                            .addComponent(resultado_apellidos)
                            .addComponent(resultado_nombre)
                            .addComponent(resultado_rfc)
                            .addComponent(resultado_direccion)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(res_telefono)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(res_nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(res_apellidos))
                            .addComponent(res_rfc)
                            .addComponent(res_direccion)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(res_estado_c))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btn_buscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label_id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campo_id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(102, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_id)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campo_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_buscar)
                .addGap(47, 47, 47)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_n)
                    .addComponent(res_nombre)
                    .addComponent(resultado_nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_a)
                    .addComponent(res_apellidos)
                    .addComponent(resultado_apellidos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_r)
                    .addComponent(res_rfc)
                    .addComponent(resultado_rfc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_d)
                    .addComponent(res_direccion)
                    .addComponent(resultado_direccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_e)
                    .addComponent(res_estado_c)
                    .addComponent(resultado_estado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_t)
                    .addComponent(res_telefono)
                    .addComponent(resultado_telefono))
                .addGap(25, 25, 25)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_salir)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        
        // Verificar que se haya ingresado un ID
        if(campo_id.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "No se ha ingresado ningún ID", "Actividad Complementaria", 0);
            return;
        }
        
        List<Docente> resultado = new ArrayList<>();
        
        // Buscar ID en lista de docentes
        for(Docente docente : BaseDeDatos.Registro.docentes){
            if(docente.getId() == Integer.valueOf(campo_id.getText())){
                resultado.add(docente);
                break;
            }
        }
        
        if(resultado.isEmpty()){
            // Mostrar mensaje en caso de no encontrar ningún registro
            JOptionPane.showMessageDialog(null, "No se ha encontrado ningún usuario con este ID");
        } else {
            // Recuperar informacion del usuario
            resultado_nombre.setText(resultado.get(0).getNombre());
            resultado_apellidos.setText(resultado.get(0).getApellidos());
            resultado_rfc.setText(resultado.get(0).getRfc());
            resultado_direccion.setText(resultado.get(0).getDireccion());
            resultado_estado.setText(resultado.get(0).getEstado_civil());
            resultado_telefono.setText(resultado.get(0).getTelefono().toString());
            
            // recuperar Datos Profesionales
            dp_experiencia.setText(resultado.get(0).getExperiencia() == null ? "No hay datos aún" : resultado.get(0).getExperiencia());
            dp_trabajo.setText(resultado.get(0).getTrabajo_anterior() == null ? "No hay datos aún" : resultado.get(0).getTrabajo_anterior());
            dp_cedula.setText(resultado.get(0).getCedula() == null ? "No hay datos aún" : resultado.get(0).getCedula());
            dp_especialidad.setText(resultado.get(0).getEspecialidad() == null ? "No hay datos aún" : resultado.get(0).getEspecialidad());
        }
    }//GEN-LAST:event_btn_buscarActionPerformed
    
    // Botón de cerrar
    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_salirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_buscar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JFormattedTextField campo_id;
    private javax.swing.JLabel dp_cedula;
    private javax.swing.JLabel dp_especialidad;
    private javax.swing.JLabel dp_experiencia;
    private javax.swing.JLabel dp_trabajo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel label_a;
    private javax.swing.JLabel label_ced;
    private javax.swing.JLabel label_d;
    private javax.swing.JLabel label_e;
    private javax.swing.JLabel label_esp;
    private javax.swing.JLabel label_exp;
    private javax.swing.JLabel label_id;
    private javax.swing.JLabel label_n;
    private javax.swing.JLabel label_r;
    private javax.swing.JLabel label_t;
    private javax.swing.JLabel label_trab;
    private javax.swing.JLabel res_apellidos;
    private javax.swing.JLabel res_direccion;
    private javax.swing.JLabel res_estado_c;
    private javax.swing.JLabel res_nombre;
    private javax.swing.JLabel res_rfc;
    private javax.swing.JLabel res_telefono;
    private javax.swing.JLabel resultado_apellidos;
    private javax.swing.JLabel resultado_direccion;
    private javax.swing.JLabel resultado_estado;
    private javax.swing.JLabel resultado_nombre;
    private javax.swing.JLabel resultado_rfc;
    private javax.swing.JLabel resultado_telefono;
    // End of variables declaration//GEN-END:variables
}
