public class RutinaEjercicio 
{
    private int idRutinaEjercicio;
    private int idRutina;
    private Ejercicio ejercicio;
    private int series;
    private int repeticiones;
    private double peso;

    public RutinaEjercicio(int idRutinaEjercicio, int idRutina, Ejercicio ejercicio, int series, int repeticiones, double peso) 
    {
        this.idRutinaEjercicio = idRutinaEjercicio;
        this.idRutina = idRutina;
        this.ejercicio = ejercicio;
        this.series = series;
        this.repeticiones = repeticiones;
        this.peso = peso;
    }

    public int getIdRutinaEjercicio()
    {
        return idRutinaEjercicio;
    }

    public int getIdRutina() 
    {
        return idRutina;
    }

    public Ejercicio getEjercicio()
    {
        return ejercicio;
    }

    public int getSeries()
    {
        return series;
    }

    public void setSeries(int series)
    {
        this.series = series;
    }

    public int getRepeticiones()
    {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones)
    {
        this.repeticiones = repeticiones;
    }

    public double getPeso()
    {
        return peso;
    }

    public void setPeso(double peso)
    {
        this.peso = peso;
    }

    @Override
    public String toString() 
    {
        return "[" + idRutinaEjercicio + "] " + ejercicio.getNombre() + ": " + series + " series x " + repeticiones + " reps (" + peso + " kg)";
    }
}