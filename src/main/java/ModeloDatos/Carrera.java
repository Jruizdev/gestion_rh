package ModeloDatos;

// Modelo de la entidad carrera (Base de Datos)
public class Carrera {
    
    private int id_carrera;
    private String carrera; 
    
    public int getId_carrera() {
        return id_carrera;
    }

    public void setId_carrera(int id_carrera) {
        this.id_carrera = id_carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
}
