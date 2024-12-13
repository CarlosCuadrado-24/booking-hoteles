package src;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        //arreglos para definir los alojamientos
        String[] nombreAlojamiento = {};
        String[] ciudadAlojamiento = {};
        String[] tipoAlojamiento ={};
        float[] calificacionAlojamiento ={};
        int[] precioNocheAlojamiento = {};
        int[] habitacionesAlojamiento = {};

        //habitaciones
         String[] habitaciones = {};

        menu(nombreAlojamiento,ciudadAlojamiento,tipoAlojamiento,calificacionAlojamiento,precioNocheAlojamiento,habitacionesAlojamiento,habitaciones);

    }



    public static void menu(String[] nombreAlojamiento,String[] ciudadAlojamiento,String[] tipoAlojamiento,float[] calificacionAlojamiento,int[] precioNocheAlojamiento,int[] habitacionesAlojamiento,String[] habitaciones){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== Menú Principal ===");
            System.out.println("1. opcion");
            System.out.println("2. opcion");
            System.out.println("3. opcion");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Seleccionaste la opcion 1");
                    break;
                case 2:
                    System.out.println("Seleccionaste la opcion 2");
                    break;
                case 3:
                    System.out.println("Seleccionaste la opcion 3");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }
            System.out.println();
        } while (opcion != 3);

        scanner.close(); // Cierra el scanner para liberar recursos
    }




}
