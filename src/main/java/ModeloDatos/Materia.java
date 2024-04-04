package ModeloDatos;

// Modelo de la entidad Materia (Base de Datos)
public class Materia {
    
    // Atributos
    private int id_materia;
    private String materia;
    private int semestre;
    private String ciclo_escolar;
    private int id_carrera;

    public int getId_materia() {
        return id_materia;
    }

    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getCiclo_escolar() {
        return ciclo_escolar;
    }

    public void setCiclo_escolar(String ciclo_escolar) {
        this.ciclo_escolar = ciclo_escolar;
    }

    public int getId_carrera() {
        return id_carrera;
    }

    public void setId_carrera(int id_carrera) {
        this.id_carrera = id_carrera;
    }
}
