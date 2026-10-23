import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        GestorRutinas gestor = new GestorRutinas();
        boolean salir = false;

        while (!salir) 
        {
            System.out.println("\n--- APP RUTINAS GIMNASIO ---");
            System.out.println("1. Crear rutina");
            System.out.println("2. Añadir ejercicio del catálogo a una rutina");
            System.out.println("3. Consultar rutina");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");

            int opcion = sc.nextInt();
            sc.nextLine(); 

            switch (opcion) 
            {
                case 1:
                    System.out.print("Nombre de la rutina: ");
                    String nombre = sc.nextLine();
                    System.out.print("Descripción de la rutina: ");
                    String descripcion = sc.nextLine();
                    gestor.crearRutina(nombre, descripcion);
                    break;

                case 2:
                    gestor.listarRutinas();
                    System.out.print("Introduce el ID de la rutina: ");
                    int idRutina = sc.nextInt();
                    sc.nextLine();

                    if (gestor.buscarRutinaPorId(idRutina) != null) 
                    {
                        gestor.mostrarCatalogoEjercicios();
                        System.out.print("Selecciona el ID del ejercicio: ");
                        int idEjercicio = sc.nextInt();
                        System.out.print("Número de series: ");
                        int series = sc.nextInt();
                        System.out.print("Número de repeticiones: ");
                        int reps = sc.nextInt();
                        sc.nextLine();

                        gestor.agregarEjercicioARutina(idRutina, idEjercicio, series, reps);
                    } 
                    else 
                    {
                        System.out.println("La rutina indicada no existe.");
                    }
                    break;

                case 3:
                    gestor.listarRutinas();
                    System.out.print("Introduce el ID de la rutina a consultar: ");
                    int idConsulta = sc.nextInt();
                    sc.nextLine();
                    gestor.consultarRutinaDetallada(idConsulta);
                    break;

                case 4:
                    salir = true;
                    System.out.println("¡Hasta luego!");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }
        }
        sc.close();
    }
}