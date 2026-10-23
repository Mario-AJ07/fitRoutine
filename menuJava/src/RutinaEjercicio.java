public class RutinaEjercicio 
{
    private int idRutinaEjercicio;
    private int idRutina;
    private Ejercicio ejercicio;
    private int series;
    private int repeticiones;

    public RutinaEjercicio(int idRutinaEjercicio, int idRutina, Ejercicio ejercicio, int series, int repeticiones) 
    {
        this.idRutinaEjercicio = idRutinaEjercicio;
        this.idRutina = idRutina;
        this.ejercicio = ejercicio;
        this.series = series;
        this.repeticiones = repeticiones;
    }

    public int getIdRutina() 
    {
        return idRutina;
    }

    @Override
    public String toString() 
    {
        return "- " + ejercicio.getNombre() + ": " + series + " series x " + repeticiones + " reps";
    }
}