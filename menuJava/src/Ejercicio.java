public class Ejercicio 
{
    private int idEjercicio;
    private String nombre;
    private String descripcion;

    public Ejercicio(int idEjercicio, String nombre, String descripcion) 
    {
        this.idEjercicio = idEjercicio;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getIdEjercicio() 
    {
        return idEjercicio;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public String getDescripcion() 
    {
        return descripcion;
    }

    @Override
    public String toString() 
    {
        return idEjercicio + ". " + nombre + " (" + descripcion + ")";
    }
}