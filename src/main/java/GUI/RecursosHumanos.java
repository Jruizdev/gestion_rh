/*
    Docente: Carlos Pineda Luna
    Grupo: DS-DPO2-2102-B1-003

    Nombre: Jonathan Ruiz Olvera 
    Matrícula: ES202100495

    Universidad Abierta y a Distancia de México
    Ingeniería en Desarrollo de Software
*/

package GUI;
import ALTA_DOCENTE.AgregarDatosProfesionales;
import ALTA_DOCENTE.FormularioRegistro;
import ALUMNOS.FormularioAltaAlumno;
import ALUMNOS.FormularioBajaAlumno;
import ALUMNOS.FormularioConsultaAlumno;
import BaseDeDatos.ModeloTabla;
import CONSULTA_DOCENTE.FormularioConsulta;
import CONSULTA_DOCENTE.FormularioPerfil;
import EXPEDIENTE.FormularioCovid;
import EXPEDIENTE.HistorialVacunacion;
import MATERIAS.FormularioAltaMateria;
import MATERIAS.FormularioBajaMateria;
import MATERIAS.FormularioConsultaMateria;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

// Clase principal de la interfaz
public class RecursosHumanos extends javax.swing.JFrame {

    // Constructor de la clase
    public RecursosHumanos() throws SQLException {
        
        initComponents();
        actualizarRegistro();
        
        // Activar boton de "agregar" al dar clic en algún elemento de la lista
        tabla_datos_personales.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){
                btn_agregar_datos.setEnabled(true);
                btn_materias.setEnabled(true);
                btn_proyectos.setEnabled(true);
                btn_jornada.setEnabled(true);
                btn_eliminar.setEnabled(true);
            }
        });
    }
    
    // Actualizar los registros de empleados
    private void actualizarRegistro(){
        // Obtener Tabla de Datos personales de la Base de Datos SQL
        BaseDeDatos.Registro.obtenerTablaDatos();
        
        // Crear modelo de tabla y cargarlo en la tabla
        ModeloTabla modelo = new ModeloTabla(BaseDeDatos.Registro.docentes);
        tabla_datos_personales.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        btn_agregar_datos = new javax.swing.JButton();
        btn_materias = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn_proyectos = new javax.swing.JButton();
        btn_jornada = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_datos_personales = new javax.swing.JTable();
        btn_eliminar = new javax.swing.JButton();
        barra_menu = new javax.swing.JMenuBar();
        menu_registro = new javax.swing.JMenu();
        submenu_docente = new javax.swing.JMenu();
        opcion_nuevo = new javax.swing.JMenuItem();
        menu_consulta = new javax.swing.JMenu();
        submenu_n_empleado = new javax.swing.JMenuItem();
        opcion_datos = new javax.swing.JMenuItem();
        menu_expediente = new javax.swing.JMenu();
        opcion_covid = new javax.swing.JMenuItem();
        opcion_historial = new javax.swing.JMenuItem();
        menu_alumnos = new javax.swing.JMenu();
        opcion_alta_alumno = new javax.swing.JMenuItem();
        opcion_baja_alumno = new javax.swing.JMenuItem();
        opcion_consultar_alumno = new javax.swing.JMenuItem();
        menu_materias = new javax.swing.JMenu();
        opcion_alta_materia = new javax.swing.JMenuItem();
        opcion_baja_materia = new javax.swing.JMenuItem();
        opcion_consulta_materia = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Recursos Humanos");
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(200, 200));
        setName("VentanaPrincipal"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones de registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        btn_agregar_datos.setText("Agregar Datos Profesionales");
        btn_agregar_datos.setEnabled(false);
        btn_agregar_datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregar_datosActionPerformed(evt);
            }
        });

        btn_materias.setText("Cantidad de materias");
        btn_materias.setEnabled(false);
        btn_materias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_materiasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_materias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_agregar_datos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_agregar_datos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_materias)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones de consulta", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11), new java.awt.Color(51, 51, 51))); // NOI18N

        btn_proyectos.setText("Proyectos de Investigación");
        btn_proyectos.setEnabled(false);
        btn_proyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_proyectosActionPerformed(evt);
            }
        });

        btn_jornada.setText("Jornada Laboral");
        btn_jornada.setEnabled(false);
        btn_jornada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_jornadaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_proyectos, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(btn_jornada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_proyectos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_jornada)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/salir_2_icono.png"))); // NOI18N
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo.png"))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de docentes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(51, 51, 51))); // NOI18N

        tabla_datos_personales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Apellidos", "RFC", "Dirección", "Estado civil", "Teléfono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla_datos_personales.setName("tabla_datos"); // NOI18N
        jScrollPane1.setViewportView(tabla_datos_personales);

        btn_eliminar.setText("Eliminar registro seleccionado");
        btn_eliminar.setEnabled(false);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_eliminar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_eliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(logo)
                        .addGap(103, 103, 103)
                        .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 15, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logo, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_salir, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        barra_menu.setBackground(new java.awt.Color(0, 0, 204));

        menu_registro.setForeground(new java.awt.Color(255, 255, 255));
        menu_registro.setText("Registro");

        submenu_docente.setText("Docente");
        submenu_docente.setName(""); // NOI18N

        opcion_nuevo.setText("Nuevo");
        opcion_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion_nuevoActionPerformed(evt);
            }
        });
        submenu_docente.add(opcion_nuevo);

        menu_registro.add(submenu_docente);

        barra_menu.add(menu_registro);

        menu_consulta.setForeground(new java.awt.Color(255, 255, 255));
        menu_consulta.setText("Consulta");

        submenu_n_empleado.setText("Datos generales");
        submenu_n_empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submenu_n_empleadoActionPerformed(evt);
            }
        });
        menu_consulta.add(submenu_n_empleado);

        opcion_datos.setText("Perfil");
        opcion_datos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion_datosActionPerformed(evt);
            }
        });
        menu_consulta.add(opcion_datos);

        barra_menu.add(menu_consulta);

        menu_expediente.setForeground(new java.awt.Color(255, 255, 255));
        menu_expediente.setText("Expediente");

        opcion_covid.setText("COVID");
        opcion_covid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion_covidActionPerformed(evt);
            }
        });
        menu_expediente.add(opcion_covid);

        opcion_historial.setText("Historial de vacunacion");
        opcion_historial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion_historialActionPerformed(evt);
            }
        });
        menu_expediente.add(opcion_historial);

        barra_menu.add(menu_expediente);

        menu_alumnos.setForeground(new java.awt.Color(255, 255, 255));
        menu_alumnos.setText("Alumnos");

        opcion_alta_alumno.setText("Alta de alumno");
        opcion_alta_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion_alta_alumnoActionPerformed(evt);
            }
        });
        menu_alumnos.add(opcion_alta_alumno);

        opcion_baja_alumno.setText("Baja de alumno");
        opcion_baja_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion_baja_alumnoActionPerformed(evt);
            }
        });
        menu_alumnos.add(opcion_baja_alumno);

        opcion_consultar_alumno.setText("Consultar alumno");
        opcion_consultar_alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion_consultar_alumnoActionPerformed(evt);
            }
        });
        menu_alumnos.add(opcion_consultar_alumno);

        barra_menu.add(menu_alumnos);

        menu_materias.setBackground(new java.awt.Color(255, 255, 255));
        menu_materias.setForeground(new java.awt.Color(255, 255, 255));
        menu_materias.setText("Materias");

        opcion_alta_materia.setText("Altas");
        opcion_alta_materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion_alta_materiaActionPerformed(evt);
            }
        });
        menu_materias.add(opcion_alta_materia);

        opcion_baja_materia.setText("Bajas");
        opcion_baja_materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion_baja_materiaActionPerformed(evt);
            }
        });
        menu_materias.add(opcion_baja_materia);

        opcion_consulta_materia.setText("Consulta");
        opcion_consulta_materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion_consulta_materiaActionPerformed(evt);
            }
        });
        menu_materias.add(opcion_consulta_materia);

        barra_menu.add(menu_materias);

        setJMenuBar(barra_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    // Abrir formulario para el registro de nuevos usuarios (docente)
    private void opcion_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion_nuevoActionPerformed
        
        // Mostrar formulario de registro y enviar tabla de registro
        FormularioRegistro registro = new FormularioRegistro(tabla_datos_personales);
        registro.setVisible(true);
        
        // Cerrar únicamente el formulario de registro al salir
        registro.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        registro.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                registro.setVisible(false);
            }
        });

    }//GEN-LAST:event_opcion_nuevoActionPerformed

    // Cerrar el programa
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        System.exit(0);
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

    }//GEN-LAST:event_formWindowClosing
    
    private void btn_agregar_datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregar_datosActionPerformed

        // Obtener el elemento seleccionado y enviarlo al formulario de datos
        int fila = tabla_datos_personales.getSelectedRow();
        AgregarDatosProfesionales datos = new AgregarDatosProfesionales(BaseDeDatos.Registro.docentes.get(fila));
        
        // Cerrar únicamente formulario
        datos.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        datos.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                datos.setVisible(false);
            }
        });
        
        // Mostrar formulario en pantalla
        datos.setVisible(true);
    }//GEN-LAST:event_btn_agregar_datosActionPerformed
    
    // Abrir formulario para asignar la cantidad de materias 
    private void btn_materiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_materiasActionPerformed
        int fila = tabla_datos_personales.getSelectedRow();
        FormularioMaterias formulario = new FormularioMaterias(BaseDeDatos.Registro.docentes.get(fila));
        
        formulario.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        formulario.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                formulario.setVisible(false);
            }
        });
        
        // Mostrar formulario en pantalla
        formulario.setVisible(true);
    }//GEN-LAST:event_btn_materiasActionPerformed
    
    // Formulario de Expediente / COVID
    private void opcion_covidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion_covidActionPerformed
        FormularioCovid formulario = new FormularioCovid();
        
         formulario.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        formulario.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                formulario.setVisible(false);
            }
        });
        
        // Mostrar formulario en pantalla
        formulario.setVisible(true);
    }//GEN-LAST:event_opcion_covidActionPerformed
    
    // Mostrar formulario de perfil (consultar datos)
    private void opcion_datosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion_datosActionPerformed
        FormularioPerfil consulta = new FormularioPerfil();

        // Cerrar únicamente formulario
        consulta.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        consulta.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                consulta.setVisible(false);
            }
        });

        // Mostrar formulario
        consulta.setVisible(true);
    }//GEN-LAST:event_opcion_datosActionPerformed
    
    // Abrir formulario para la consulta de docentes
    private void submenu_n_empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submenu_n_empleadoActionPerformed
        FormularioConsulta consulta = new FormularioConsulta();

        // Cerrar únicamente formulario
        consulta.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        consulta.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                consulta.setVisible(false);
            }
        });

        // Mostrar formulario
        consulta.setVisible(true);
    }//GEN-LAST:event_submenu_n_empleadoActionPerformed
    
    // Abrir formulario de proyectos asignados
    private void btn_proyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_proyectosActionPerformed
        int fila = tabla_datos_personales.getSelectedRow();
        FormularioProyectos formulario = new FormularioProyectos(BaseDeDatos.Registro.docentes.get(fila));
        
        // Cerrar únicamente formulario
        formulario .setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        formulario .addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                formulario .setVisible(false);
            }
        });

        // Mostrar formulario
        formulario .setVisible(true);
    }//GEN-LAST:event_btn_proyectosActionPerformed
    
    // Abrir formulario de jornada
    private void btn_jornadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_jornadaActionPerformed
        
        int fila = tabla_datos_personales.getSelectedRow();
        JLabel label_nombre = new JLabel(BaseDeDatos.Registro.docentes.get(fila).getNombre() + " " + 
                                         BaseDeDatos.Registro.docentes.get(fila).getApellidos());
        label_nombre.setFont(new Font("Arial", Font.PLAIN, 12));
        JLabel label_jornada = new JLabel("La jornada actual es de :");
        label_jornada.setFont(new Font("Arial", Font.BOLD, 12));
        JLabel texto_jornada = new JLabel(BaseDeDatos.Registro.docentes.get(fila).getJornada_laboral() + " Horas");
        texto_jornada.setFont(new Font("Arial", Font.PLAIN, 12));
        Object[] componentes = {label_nombre, label_jornada, texto_jornada};
        
        
        JOptionPane.showMessageDialog(null, componentes, "Activdad Complementaria", 1);
    }//GEN-LAST:event_btn_jornadaActionPerformed
    
    // Botón salir
    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void opcion_historialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion_historialActionPerformed
        HistorialVacunacion formulario = new HistorialVacunacion();
        
        // Cerrar únicamente formulario
        formulario .setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        formulario .addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                formulario .setVisible(false);
            }
        });

        // Mostrar formulario
        formulario .setVisible(true);
    }//GEN-LAST:event_opcion_historialActionPerformed
    
    // Eliminar registro de la base de datos
    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        int fila = tabla_datos_personales.getSelectedRow();
        int ID_seleccion = BaseDeDatos.Registro.docentes.get(fila).getId();
        
        BaseDeDatos.Registro.docentes.remove(fila);
        if(BaseDeDatos.Registro.eliminarFila(ID_seleccion) == 1){
            actualizarRegistro();
        }
    }//GEN-LAST:event_btn_eliminarActionPerformed
    
    // Formulario para baja de alumnos
    private void opcion_baja_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion_baja_alumnoActionPerformed
        FormularioBajaAlumno formulario = new FormularioBajaAlumno();
        formulario.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        formulario.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                formulario.setVisible(false);
            }
        });
        
        // Mostrar formulario
        formulario.setVisible(true);
    }//GEN-LAST:event_opcion_baja_alumnoActionPerformed
    
    // Formulario para consulta de alumnos
    private void opcion_consultar_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion_consultar_alumnoActionPerformed
        FormularioConsultaAlumno formulario = new FormularioConsultaAlumno();
        formulario.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        formulario.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                formulario.setVisible(false);
            }
        });
        
        // Mostrar formulario
        formulario.setVisible(true);
    }//GEN-LAST:event_opcion_consultar_alumnoActionPerformed
    
    // Formulario para alta de alumnos
    private void opcion_alta_alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion_alta_alumnoActionPerformed
        FormularioAltaAlumno formulario = new FormularioAltaAlumno();
        
        formulario.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        formulario.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                formulario.setVisible(false);
            }
        });
        // Mostrar formulario de altas de alumno
        formulario.setVisible(true);
    }//GEN-LAST:event_opcion_alta_alumnoActionPerformed
    
    // Formulario de alta para materias
    private void opcion_alta_materiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion_alta_materiaActionPerformed
        FormularioAltaMateria formulario = new FormularioAltaMateria();
        formulario.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        formulario.addWindowListener(new WindowAdapter(){
           @Override
            public void windowClosing(WindowEvent e){
                formulario.setVisible(false);
            } 
        });
        
        // Mostrar formulario
        formulario.setVisible(true);
    }//GEN-LAST:event_opcion_alta_materiaActionPerformed
    
    // Formulario para baja de materias
    private void opcion_baja_materiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion_baja_materiaActionPerformed
        FormularioBajaMateria formulario = new FormularioBajaMateria();
        formulario.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        formulario.addWindowListener(new WindowAdapter(){
           @Override
            public void windowClosing(WindowEvent e){
                formulario.setVisible(false);
            } 
        });
        
        // Mostrar formulario
        formulario.setVisible(true);
    }//GEN-LAST:event_opcion_baja_materiaActionPerformed
    
    // Formulario para consulta de materias
    private void opcion_consulta_materiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcion_consulta_materiaActionPerformed
        FormularioConsultaMateria formulario = new FormularioConsultaMateria();
        formulario.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        formulario.addWindowListener(new WindowAdapter(){
           @Override
            public void windowClosing(WindowEvent e){
                formulario.setVisible(false);
            } 
        });
        
        // Mostrar formulario
        formulario.setVisible(true);
    }//GEN-LAST:event_opcion_consulta_materiaActionPerformed

    public static void main(String args[]) {
        
        // Crear la interfaz gráfica
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new RecursosHumanos().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(RecursosHumanos.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barra_menu;
    private javax.swing.JButton btn_agregar_datos;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_jornada;
    private javax.swing.JButton btn_materias;
    private javax.swing.JButton btn_proyectos;
    private javax.swing.JButton btn_salir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logo;
    private javax.swing.JMenu menu_alumnos;
    private javax.swing.JMenu menu_consulta;
    private javax.swing.JMenu menu_expediente;
    private javax.swing.JMenu menu_materias;
    private javax.swing.JMenu menu_registro;
    private javax.swing.JMenuItem opcion_alta_alumno;
    private javax.swing.JMenuItem opcion_alta_materia;
    private javax.swing.JMenuItem opcion_baja_alumno;
    private javax.swing.JMenuItem opcion_baja_materia;
    private javax.swing.JMenuItem opcion_consulta_materia;
    private javax.swing.JMenuItem opcion_consultar_alumno;
    private javax.swing.JMenuItem opcion_covid;
    private javax.swing.JMenuItem opcion_datos;
    private javax.swing.JMenuItem opcion_historial;
    private javax.swing.JMenuItem opcion_nuevo;
    private javax.swing.JMenu submenu_docente;
    private javax.swing.JMenuItem submenu_n_empleado;
    private javax.swing.JTable tabla_datos_personales;
    // End of variables declaration//GEN-END:variables
}
