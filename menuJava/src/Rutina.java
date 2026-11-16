public class Rutina 
{
    private int idRutina;
    private String nombre;
    private String descripcion;

    public Rutina(int idRutina, String nombre, String descripcion) {
        this.idRutina = idRutina;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getIdRutina() {
        return idRutina;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }
}