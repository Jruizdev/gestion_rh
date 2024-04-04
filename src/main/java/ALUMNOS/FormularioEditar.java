package ALUMNOS;

import ModeloDatos.Alumno;
import ModeloDatos.DatosContacto;
import ModeloDatos.DatosEscolares;
import java.util.ArrayList;
import java.util.List;

public class FormularioEditar extends javax.swing.JFrame {
    
    private Alumno alumno = null;
    int id_carrera = -1;
    private List<ModeloDatos.Carrera> carreras = new ArrayList();
   
    public FormularioEditar(Alumno alumno_seleccion) {
        this.alumno = alumno_seleccion;
        initComponents();
        obtenerCarreras();
        cargarCampos();
    }
    
    // Método para agregar las carreras disponibles en el Combobox
    private void obtenerCarreras(){
        carreras = BaseDeDatos.Consulta.obtenerCarreras();
        combo_carrera.removeAllItems();
        for(ModeloDatos.Carrera carrera : carreras){
            combo_carrera.addItem(carrera.getId_carrera() + " : " +carrera.getCarrera());
        }
    }
    
    // Obtener todos los campos y datos referentes al usuario consultado
    private void cargarCampos(){
        
        // Campos de datos personales
        campo_nombre.setText(alumno.getNombre());
        campo_direccion.setText(alumno.getDireccion());
        campo_curp.setText(alumno.getCurp());
        
        // Campos de datos escolares
        DatosEscolares datos_escolares = new DatosEscolares();
        for(DatosEscolares datos : BaseDeDatos.Consulta.obtenerDatosEscolares()){
            if(datos.getId_alumno() == alumno.getId()){
                datos_escolares = datos;
                break;
            }
        }

        for(int i = 0; i < carreras.size(); i++){
            if(datos_escolares.getId_carrera() == carreras.get(i).getId_carrera()){
                id_carrera = i;
               break;
            }
        }
        
        campo_matricula.setText(datos_escolares.getMatricula());
        combo_carrera.setSelectedIndex(id_carrera);
        campo_semestre.setText(datos_escolares.getSemestre());
        
        // Campos de datos de contacto
        DatosContacto datos_contacto = new DatosContacto();
        for(DatosContacto datos : BaseDeDatos.Consulta.obtenerDatosContacto()){
            if(datos.getId_contacto() == alumno.getId()){
                datos_contacto = datos;
                break;
            }
        }
        
        campo_telefono.setText(datos_contacto.getTelefono());
        campo_correo.setText(datos_contacto.getCorreo());   
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panle_datos_escolares = new javax.swing.JPanel();
        label_matricula = new javax.swing.JLabel();
        label_carrera = new javax.swing.JLabel();
        label_semestre = new javax.swing.JLabel();
        campo_matricula = new javax.swing.JTextField();
        campo_semestre = new javax.swing.JTextField();
        combo_carrera = new javax.swing.JComboBox<>();
        panel_datos_contacto = new javax.swing.JPanel();
        label_telefono = new javax.swing.JLabel();
        label_correo = new javax.swing.JLabel();
        campo_telefono = new javax.swing.JTextField();
        campo_correo = new javax.swing.JTextField();
        panel_datos_personales = new javax.swing.JPanel();
        label_nombre = new javax.swing.JLabel();
        label_direccion = new javax.swing.JLabel();
        label_curp = new javax.swing.JLabel();
        campo_nombre = new javax.swing.JTextField();
        campo_direccion = new javax.swing.JTextField();
        campo_curp = new javax.swing.JTextField();
        btn_registrar = new javax.swing.JToggleButton();
        btn_salir = new javax.swing.JToggleButton();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar datos de alumno");
        setLocation(new java.awt.Point(200, 200));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        panle_datos_escolares.setBackground(new java.awt.Color(255, 255, 255));
        panle_datos_escolares.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos escolares", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        label_matricula.setText("Matricula:");

        label_carrera.setText("ID carrera:");

        label_semestre.setText("Semestre:");

        combo_carrera.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout panle_datos_escolaresLayout = new javax.swing.GroupLayout(panle_datos_escolares);
        panle_datos_escolares.setLayout(panle_datos_escolaresLayout);
        panle_datos_escolaresLayout.setHorizontalGroup(
            panle_datos_escolaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panle_datos_escolaresLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panle_datos_escolaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_semestre)
                    .addComponent(label_carrera)
                    .addComponent(label_matricula))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panle_datos_escolaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_matricula)
                    .addComponent(campo_semestre)
                    .addComponent(combo_carrera, 0, 294, Short.MAX_VALUE))
                .addContainerGap())
        );
        panle_datos_escolaresLayout.setVerticalGroup(
            panle_datos_escolaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panle_datos_escolaresLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panle_datos_escolaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_matricula)
                    .addComponent(campo_matricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panle_datos_escolaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_carrera)
                    .addComponent(combo_carrera, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panle_datos_escolaresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_semestre)
                    .addComponent(campo_semestre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panel_datos_contacto.setBackground(new java.awt.Color(255, 255, 255));
        panel_datos_contacto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos escolares", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        label_telefono.setText("Telefono:");

        label_correo.setText("Correo:");

        javax.swing.GroupLayout panel_datos_contactoLayout = new javax.swing.GroupLayout(panel_datos_contacto);
        panel_datos_contacto.setLayout(panel_datos_contactoLayout);
        panel_datos_contactoLayout.setHorizontalGroup(
            panel_datos_contactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datos_contactoLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panel_datos_contactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_telefono)
                    .addComponent(label_correo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_datos_contactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_telefono)
                    .addComponent(campo_correo))
                .addContainerGap())
        );
        panel_datos_contactoLayout.setVerticalGroup(
            panel_datos_contactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datos_contactoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panel_datos_contactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_telefono)
                    .addComponent(campo_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_datos_contactoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_correo)
                    .addComponent(campo_correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panel_datos_personales.setBackground(new java.awt.Color(255, 255, 255));
        panel_datos_personales.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos escolares", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        label_nombre.setText("Nombre:");

        label_direccion.setText("Direccion:");

        label_curp.setText("CURP:");

        javax.swing.GroupLayout panel_datos_personalesLayout = new javax.swing.GroupLayout(panel_datos_personales);
        panel_datos_personales.setLayout(panel_datos_personalesLayout);
        panel_datos_personalesLayout.setHorizontalGroup(
            panel_datos_personalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datos_personalesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panel_datos_personalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label_curp)
                    .addComponent(label_direccion)
                    .addComponent(label_nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_datos_personalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_nombre)
                    .addComponent(campo_direccion)
                    .addComponent(campo_curp))
                .addContainerGap())
        );
        panel_datos_personalesLayout.setVerticalGroup(
            panel_datos_personalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datos_personalesLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panel_datos_personalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_nombre)
                    .addComponent(campo_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_datos_personalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_direccion)
                    .addComponent(campo_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_datos_personalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_curp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label_curp))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        btn_registrar.setText("Guardar cambios");
        btn_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrarActionPerformed(evt);
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(138, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panle_datos_escolares, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_datos_contacto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_datos_personales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap()))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(431, Short.MAX_VALUE)
                .addComponent(btn_registrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_salir)
                .addContainerGap())
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panel_datos_personales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(panel_datos_contacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(panle_datos_escolares, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(98, Short.MAX_VALUE)))
        );

        jPanel6.setBackground(new java.awt.Color(0, 0, 153));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Editar Alumno");

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
            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    
    // Actualizar datos del alumno
    private void btn_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrarActionPerformed
        
        Object[] campos_alumno = new Object[3];
        Object[] campos_escolares = new Object[3];
        Object[] campos_contacto = new Object[2];
        
        campos_alumno[0] = campo_nombre.getText();
        campos_alumno[1] = campo_direccion.getText();
        campos_alumno[2] = campo_curp.getText();
        
        campos_escolares[0] = campo_matricula.getText();
        campos_escolares[1] = campo_semestre.getText();
        id_carrera = combo_carrera.getSelectedIndex() + 1;
        campos_escolares[2] = id_carrera;
        
        campos_contacto[0] = campo_telefono.getText();
        campos_contacto[1] = campo_correo.getText();
        
        BaseDeDatos.GestionAlumnos.actualizarAlumno(alumno.getId(), campos_alumno, campos_contacto, campos_escolares);
        this.setVisible(false);
    }//GEN-LAST:event_btn_registrarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btn_salirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btn_registrar;
    private javax.swing.JToggleButton btn_salir;
    private javax.swing.JTextField campo_correo;
    private javax.swing.JTextField campo_curp;
    private javax.swing.JTextField campo_direccion;
    private javax.swing.JTextField campo_matricula;
    private javax.swing.JTextField campo_nombre;
    private javax.swing.JTextField campo_semestre;
    private javax.swing.JTextField campo_telefono;
    private javax.swing.JComboBox<String> combo_carrera;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel label_carrera;
    private javax.swing.JLabel label_correo;
    private javax.swing.JLabel label_curp;
    private javax.swing.JLabel label_direccion;
    private javax.swing.JLabel label_matricula;
    private javax.swing.JLabel label_nombre;
    private javax.swing.JLabel label_semestre;
    private javax.swing.JLabel label_telefono;
    private javax.swing.JPanel panel_datos_contacto;
    private javax.swing.JPanel panel_datos_personales;
    private javax.swing.JPanel panle_datos_escolares;
    // End of variables declaration//GEN-END:variables
}
