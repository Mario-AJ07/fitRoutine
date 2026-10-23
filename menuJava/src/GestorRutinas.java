import java.util.ArrayList;
import java.util.List;

public class GestorRutinas 
{
    private List<Rutina> rutinas = new ArrayList<>();
    private List<Ejercicio> catalogoEjercicios = new ArrayList<>();
    private List<RutinaEjercicio> relaciones = new ArrayList<>();

    private int contadorRutinas = 1;
    private int contadorRelaciones = 1;

    public GestorRutinas()
    {
        catalogoEjercicios.add(new Ejercicio(1, "Press de Banca", "Pectoral mayor y tríceps"));
        catalogoEjercicios.add(new Ejercicio(2, "Sentadilla", "Cuádriceps y glúteos"));
        catalogoEjercicios.add(new Ejercicio(3, "Dominadas", "Dorsales y bíceps"));
        catalogoEjercicios.add(new Ejercicio(4, "Press Militar", "Hombro y tríceps"));
    }

    public void mostrarCatalogoEjercicios() 
    {
        System.out.println("\n📋 CATÁLOGO DE EJERCICIOS DISPONIBLES:");
        for (Ejercicio ej : catalogoEjercicios)
        {
            System.out.println(ej);
        }
    }

    public Ejercicio buscarEjercicioPorId(int id) 
    {
        for (Ejercicio ej : catalogoEjercicios) 
        {
            if (ej.getIdEjercicio() == id) 
            {
                return ej;
            }
        }
        return null;
    }

    public void crearRutina(String nombre, String descripcion) 
    {
        Rutina nueva = new Rutina(contadorRutinas++, nombre, descripcion);
        rutinas.add(nueva);
        System.out.println("Rutina '" + nombre + "' creada correctamente con ID: " + nueva.getIdRutina());
    }

    public Rutina buscarRutinaPorId(int id) 
    {
        for (Rutina r : rutinas) 
        {
            if (r.getIdRutina() == id) 
            {
                return r;
            }
        }
        return null;
    }

    public void agregarEjercicioARutina(int idRutina, int idEjercicio, int series, int repeticiones) 
    {
        Ejercicio ej = buscarEjercicioPorId(idEjercicio);
        if (ej != null) 
        {
            RutinaEjercicio rel = new RutinaEjercicio(contadorRelaciones++, idRutina, ej, series, repeticiones);
            relaciones.add(rel);
            System.out.println("Ejercicio '" + ej.getNombre() + "' añadido a la rutina.");
        }
        else
        {
            System.out.println("El ID de ejercicio especificado no existe.");
        }
    }

    public void listarRutinas()
    {
        if (rutinas.isEmpty()) 
        {
            System.out.println("No hay rutinas registradas.");
            return;
        }
        System.out.println("\nLISTA DE RUTINAS:");
        for (Rutina r : rutinas)
        {
            System.out.println("[" + r.getIdRutina() + "] " + r.getNombre() + " - " + r.getDescripcion());
        }
    }

    public void consultarRutinaDetallada(int idRutina)
    {
        Rutina r = buscarRutinaPorId(idRutina);
        if (r == null) 
        {
            System.out.println("Rutina no encontrada.");
            return;
        }

        System.out.println("\n==================================");
        System.out.println("RUTINA: " + r.getNombre().toUpperCase());
        System.out.println("Descripción: " + r.getDescripcion());
        System.out.println("==================================");

        boolean tieneEjercicios = false;
        for (RutinaEjercicio re : relaciones) 
        {
            if (re.getIdRutina() == idRutina) 
            {
                System.out.println(re);
                tieneEjercicios = true;
            }
        }

        if (!tieneEjercicios) 
        {
            System.out.println("Aún no se han añadido ejercicios a esta rutina.");
        }
        System.out.println("==================================\n");
    }
}