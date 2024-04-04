/*
    Docente: Carlos Pineda Luna
    Grupo: DS-DPO2-2102-B1-003

    Nombre: Jonathan Ruiz Olvera 
    Matrícula: ES202100495

    Universidad Abierta y a Distancia de México
    Ingeniería en Desarrollo de Software
*/
package ModeloDatos;

import java.math.BigInteger;

// Entidad de Docente
public class Docente {
    
    // Atributos encapsulados
    private int id;
    private String nombre;
    private String apellidos;
    private String rfc;
    private String direccion;
    private String estado_civil;
    private BigInteger telefono;
    private String experiencia;
    private String trabajo_anterior;
    private String cedula;
    private String especialidad;
    private int cantidad_materias;
    private int jornada_laboral;
    private boolean perfil_investigador;
    private String proyecto_asignado;
    private String vacuna_tipo;
    private int vacuna_dosis;
    
    // Constructor con datos personales
    public Docente(int _id, String _nombre, String _apellidos, String _rfc, String _direccion,
                    String _estado_civil, BigInteger _telefono){
        this.id = _id;
        this.nombre = _nombre;
        this.apellidos = _apellidos;
        this.rfc = _rfc;
        this.direccion = _direccion;
        this.estado_civil = _estado_civil;
        this.telefono = _telefono;
        this.jornada_laboral = 6;
        this.perfil_investigador = false;
        this.vacuna_tipo = "Ninguna";
        this.vacuna_dosis = 0;
    }
    
    // Métodos set y get de los atributos
    public String getVacuna_tipo() {
        return vacuna_tipo;
    }

    public void setVacuna_tipo(String vacuna_tipo) {
        this.vacuna_tipo = vacuna_tipo;
    }

    public int getVacuna_dosis() {
        return vacuna_dosis;
    }

    public void setVacuna_dosis(int vacuna_dosis) {
        this.vacuna_dosis = vacuna_dosis;
    }

    public int getCantidad_materias() {
        return cantidad_materias;
    }

    public void setCantidad_materias(int cantidad_materias) {
        this.cantidad_materias = cantidad_materias;
    }

    public boolean isPerfil_investigador() {
        return perfil_investigador;
    }

    public void setPerfil_investigador(boolean perfil_investigador) {
        this.perfil_investigador = perfil_investigador;
    }

    public String getProyecto_asignado() {
        return proyecto_asignado;
    }

    public void setProyecto_asignado(String proyecto_asignado) {
        this.proyecto_asignado = proyecto_asignado;
    }

    public int getJornada_laboral() {
        return jornada_laboral;
    }

    public void setJornada_laboral(int jornada_laboral) {
        this.jornada_laboral = jornada_laboral;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }

    public BigInteger getTelefono() {
        return telefono;
    }

    public void setTelefono(BigInteger telefono) {
        this.telefono = telefono;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public String getTrabajo_anterior() {
        return trabajo_anterior;
    }

    public void setTrabajo_anterior(String trabajo_anterior) {
        this.trabajo_anterior = trabajo_anterior;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
}
