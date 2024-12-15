package src;
import com.sun.jdi.CharType;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        //arreglos para definir los alojamientos
        String[] nombreAlojamiento = {
                // Hoteles
                "Hotel Plaza Real",
                "Hotel Mar y Sol",
                "Hotel Costa Azul",
                // Apartamentos
                "Apartamento Los Pinos",
                "Apartamento Vista al Mar",
                "Apartamento El Edén",
                // Fincas
                "Finca La Esperanza",
                "Finca El Refugio",
                "Finca San Pedro",
                // Días de Sol
                "Día de Sol Playa Blanca",
                "Día de Sol Paraíso Natural",
                "Día de Sol Los Delfines"
        };

        String[] ciudadAlojamiento = {"cartagena","cartagena","santa marta","santa marta","cartagena","santa marta","cartagena","cartagena","santa marta","cartagena","santa marta","cartagena"};
        String[] tipoAlojamiento ={"hotel","hotel","hotel","apartamento","apartamento","apartamento","finca","finca","finca","dia de sol","dia de sol","dia de sol"};
        double[] calificacionAlojamiento ={4.5, 3.8, 4.2, 4.0, 3.5, 4.7, 4.3, 5.0, 3.9, 4.8, 4.1, 3.6};

        int[][] cantHabitacionesAlojamiento = {
                // Hoteles: [Sencilla, Doble, Gold, Premium, Suite Presidencial]
                {17, 22, 33, 10, 7},  // Hotel Plaza Real
                {12, 18, 25, 8, 5},   // Hotel Mar y Sol
                {20, 30, 40, 12, 10}, // Hotel Costa Azul

                // Apartamentos: [Sencilla, Doble, Gold, Premium, Penthouse]
                {1, 1, 1, 1, 0},   // Apartamento Los Pinos
                {2, 0, 0, 3, 0},    // Apartamento Vista al Mar
                {0, 1, 1, 1, 3},     // Apartamento El Edén

                // Fincas: [Sencilla, Doble, Gold, Premium, Suite]
                {5, 8, 10, 3, 2},     // Finca La Esperanza
                {7, 10, 15, 4, 3},    // Finca El Refugio
                {4, 6, 8, 2, 1},      // Finca San Pedro

                // Días de Sol: [Acceso Básico, Familiar, Gold, Premium, VIP]
                {30, 40, 50, 25, 20}, // Día de Sol Playa Blanca
                {20, 30, 35, 15, 10}, // Día de Sol Paraíso Natural
                {25, 35, 45, 20, 15}  // Día de Sol Los Delfines
        };

        int[] precioAlojamientos = {150000,100000,80000,50000};

        //habitaciones
        String[][] habitaciones = {
                // Hoteles
                {"hotel", "sencilla", "La habitación sencilla tiene una cama individual, aire acondicionado, TV de pantalla plana y baño privado.", "No incluye nada", "150000"},
                {"hotel", "doble", "La habitación doble tiene dos camas individuales, aire acondicionado, TV de pantalla plana y baño privado.", "Desayuno incluido", "200000"},
                {"hotel", "gold", "La habitación Gold cuenta con una cama king-size, vista al mar, aire acondicionado, cafetera, TV de pantalla plana y bañera.", "Desayuno y almuerzo incluidos", "300000"},
                {"hotel", "premium", "La habitación Premium ofrece una cama king-size, balcón privado, acceso al spa, cafetera, minibar y aire acondicionado.", "Todo incluido (desayuno, almuerzo, cena y acceso a piscina)", "450000"},
                {"hotel", "suite presidencial", "La suite presidencial cuenta con dos habitaciones, sala de estar, cocina equipada, jacuzzi, y vista panorámica.", "Todo incluido y servicio personalizado 24/7", "700000"},

                // Apartamentos
                {"apartamento", "sencilla", "La habitación sencilla tiene una cama individual, ventilador, TV de pantalla plana y baño compartido.", "No incluye nada", "100000"},
                {"apartamento", "doble", "La habitación doble tiene una cama matrimonial, aire acondicionado, cocina pequeña y balcón.", "No incluye nada", "150000"},
                {"apartamento", "gold", "El apartamento Gold tiene dos habitaciones, cocina equipada, sala de estar y balcón con vista a la ciudad.", "No incluye nada", "250000"},
                {"apartamento", "premium", "El apartamento Premium cuenta con tres habitaciones, cocina equipada, sala de estar amplia y balcón con vista al mar.", "No incluye nada", "350000"},
                {"apartamento", "penthouse", "El Penthouse incluye tres habitaciones, terraza privada, jacuzzi y una vista 360° de la ciudad.", "No incluye nada", "500000"},

                // Fincas
                {"finca", "sencilla", "La habitación sencilla tiene una cama individual, ventilador, y baño compartido.", "No incluye nada", "80000"},
                {"finca", "doble", "La habitación doble tiene una cama matrimonial, ventilador, baño privado y acceso a jardín.", "No incluye nada", "120000"},
                {"finca", "gold", "La habitación Gold cuenta con dos camas matrimoniales, baño privado y acceso a piscina.", "No incluye nada", "200000"},
                {"finca", "premium", "La habitación Premium ofrece una cama king-size, sala de estar y balcón con vista a las montañas.", "Desayuno incluido", "300000"},
                {"finca", "suite", "La suite incluye dos habitaciones, sala de estar, jacuzzi y vista panorámica.", "Desayuno y actividades al aire libre incluidas", "400000"},

                // Días de Sol
                {"dia de sol", "acceso basico", "Acceso al alojamiento con zonas de descanso y piscinas disponibles.", "Refrigerio incluido", "50000"},
                {"dia de sol", "familiar", "Acceso al alojamiento con áreas infantiles, piscina y zonas de picnic.", "Almuerzo incluido", "80000"},
                {"dia de sol", "gold", "Acceso al alojamiento con actividades guiadas, piscina y zonas de relax.", "Almuerzo y refrigerio incluidos", "120000"},
                {"dia de sol", "premium", "Acceso al alojamiento con todas las actividades disponibles, piscina y spa.", "Almuerzo, refrigerio y actividades recreativas", "180000"},
                {"dia de sol", "vip", "Acceso exclusivo a zonas privadas, spa, actividades personalizadas y almuerzo gourmet.", "Todo incluido (almuerzo, refrigerio y actividades premium)", "250000"}
        };


        menu(nombreAlojamiento,ciudadAlojamiento,tipoAlojamiento,calificacionAlojamiento,cantHabitacionesAlojamiento,precioAlojamientos,habitaciones);

    }



    public static void menu(String[] nombreAlojamiento,String[] ciudadAlojamiento,String[] tipoAlojamiento,double[] calificacionAlojamiento,int[][] cantHabitacionesAlojamiento,int[] precioAlojamientos,String[][] habitaciones){
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("=== Menú Principal ===");
            System.out.println("1. Buscar Alojamientos");
            System.out.println("2. opcion");
            System.out.println("3. Reservar");
            System.out.print("Elige una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    formularioOpcion1(nombreAlojamiento,ciudadAlojamiento,tipoAlojamiento,calificacionAlojamiento,cantHabitacionesAlojamiento,precioAlojamientos,habitaciones);
                    break;
                case 2:
                    System.out.println("Seleccionaste la opcion 2");
                    break;
                case 3:
                    formularioReserva(nombreAlojamiento,ciudadAlojamiento,tipoAlojamiento,calificacionAlojamiento,cantHabitacionesAlojamiento,precioAlojamientos,habitaciones);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intenta de nuevo.");
            }
            System.out.println();
        } while (opcion != 3);

        scanner.close();
    }

    public static void formularioReserva(String[] nombreAlojamiento, String[] ciudadAlojamiento, String[] tipoAlojamiento, double[] calificacionAlojamiento, int[][] cantHabitacionesAlojamiento, int[] precioAlojamientos,String[][] habitaciones){
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Formulario de Reserva ===");
        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = scanner.nextLine();

        System.out.print("Ingrese su email: ");
        String email = scanner.nextLine();

        System.out.print("Ingrese su nacionalidad: ");
        String nacionalidad = scanner.nextLine();

        System.out.print("Ingrese su número de teléfono: ");
        String telefono = scanner.nextLine();

        System.out.print("Ingrese su hora aproximada de llegada: ");
        String horaLlegada = scanner.nextLine();

        System.out.print("Ingrese el nombre del alojamiento: ");
        String alojamiento = scanner.nextLine();

        System.out.print("Ingrese el tipo de habitación (0: sencilla, 1: doble, etc.): ");
        int tipoHabitacion = scanner.nextInt();

        System.out.print("Ingrese la cantidad de habitaciones: ");
        int cantidadHabitaciones = scanner.nextInt();
        

    }

    public static void formularioOpcion1(String[] nombreAlojamiento, String[] ciudadAlojamiento, String[] tipoAlojamiento, double[] calificacionAlojamiento, int[][] cantHabitacionesAlojamiento, int[] precioAlojamientos,String[][] habitaciones) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("En que ciudad quiere buscar alojamiento?: ");
        String ciudad = scanner.nextLine();

        System.out.print("Que tipo de alojamiento busca? (hotel, apartamento, finca, dia de sol): ");
        String alojamiento = scanner.nextLine();

        System.out.print("Ingrese el dia de inicio del hospedaje (1-31): ");
        int diaInicio = scanner.nextInt();
        scanner.nextLine(); // Limpia el buffer de nueva línea

        System.out.print("Ingrese el dia de finalización del hospedaje (1-31): ");
        int diaFinalizacion = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese la cantidad de adultos: ");
        int cantAdultos = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Ingrese la cantidad de niños: ");
        int cantNinos = scanner.nextInt();
        scanner.nextLine();

        int tipoHabitacion=0;

        if (alojamiento.equals("hotel")) {
            System.out.print("Ingrese el tipo de habitacion que busca (sencilla[0], doble[1], gold[2], premium[3], suite presidencial[4]): ");
            tipoHabitacion = scanner.nextInt();
        } else if (alojamiento.equals("apartamento")) {
            System.out.print("Ingrese el tipo de habitacion que busca (sencilla[0], doble[1], gold[2], premium[3], penthouse[4]): ");
            tipoHabitacion = scanner.nextInt();
        } else if (alojamiento.equals("finca")) {
            System.out.print("Ingrese el tipo de habitacion que busca (sencilla[0], doble[1], gold[2], premium[3], suite[4]): ");
            tipoHabitacion = scanner.nextInt();
        } else if (alojamiento.equals("dia de sol")) {
            System.out.print("Ingrese el tipo de habitacion que busca (sencilla[0], doble[1], gold[2], premium[3], vip[4]): ");
            tipoHabitacion = scanner.nextInt();
        }

        System.out.print("Ingrese el numero de habitaciones que busca: ");
        int numHabitaciones = scanner.nextInt();
        scanner.nextLine();

        // Aquí puedes seguir procesando los datos ingresados por el usuario.
        System.out.println("\n=== Datos Capturados ===");
        System.out.println("Ciudad: " + ciudad);
        System.out.println("Tipo de Alojamiento: " + alojamiento);
        System.out.println("Día Inicio: " + diaInicio);
        System.out.println("Día Finalización: " + diaFinalizacion);
        System.out.println("Cantidad de Adultos: " + cantAdultos);
        System.out.println("Cantidad de Niños: " + cantNinos);
        System.out.println("Tipo de Habitación: " + tipoHabitacion);
        System.out.println("Número de Habitaciones: " + numHabitaciones);

        System.out.println("-------------------");

        buscarHoteles(ciudad,alojamiento,diaInicio,diaFinalizacion,cantAdultos,cantNinos,tipoHabitacion,numHabitaciones,nombreAlojamiento,ciudadAlojamiento,tipoAlojamiento,calificacionAlojamiento,cantHabitacionesAlojamiento,precioAlojamientos,habitaciones);
    }


    public static void buscarHoteles(String ciudad, String alojamiento, int diaInicio, int diaFinalizacion, int cantAdultos, int cantNinos, int tipoHabitacion, int numHabitaciones, String[] nombreAlojamiento, String[] ciudadAlojamiento, String[] tipoAlojamiento, double[] calificacionAlojamiento, int[][] cantHabitacionesAlojamiento, int[] precioAlojamientos, String[][] habitaciones) {

        System.out.println("Buscando alojamientos...");
        //String[][] alojamientosDisponibles = new String[12][12];

        if (alojamiento.equals("dia de sol")) {
            mostrarAlojamientosConDiaDeSol(ciudad, nombreAlojamiento, ciudadAlojamiento, tipoAlojamiento, habitaciones, alojamiento);
            return;
        }

        // Lógica general para buscar alojamientos según los parámetros
        for (int i = 0; i < cantHabitacionesAlojamiento.length; i++) {
            if (cantHabitacionesAlojamiento[i][tipoHabitacion] >= numHabitaciones && ciudad.equals(ciudadAlojamiento[i]) && alojamiento.equals(tipoAlojamiento[i])) {

                double precioBaseHabitacion = obtenerPrecioBase(alojamiento, precioAlojamientos);
                double[] preciosTotales = CalcularTotalYDescuentosOAumentos(precioBaseHabitacion, diaInicio, diaFinalizacion, numHabitaciones);

                System.out.println("Alojamiento: " + nombreAlojamiento[i]);
                System.out.println("Calificación: " + calificacionAlojamiento[i]);
                System.out.println("Precio por noche: " + preciosTotales[0]);
                System.out.println("Precio total (días): " + preciosTotales[1]);
                System.out.println("-------------------");
            }
        }
    }


    private static void mostrarAlojamientosConDiaDeSol(String ciudad, String[] nombreAlojamiento, String[] ciudadAlojamiento, String[] tipoAlojamiento, String[][] habitaciones,String alojamiento) {
        System.out.println("Alojamientos con servicio de día de sol en " + ciudad + ":");
        for (int i = 0; i < ciudadAlojamiento.length; i++) {
            if(ciudad.equals(ciudadAlojamiento[i])){
                for(int j=0; j < habitaciones.length; j++){
                    if (habitaciones[j][0].equals("dia de sol") && alojamiento.equals(tipoAlojamiento[i])) {
                        System.out.println("Nombre: " + nombreAlojamiento[i]);
                        System.out.println("Tipo: " + tipoAlojamiento[i]);
                        System.out.println("Actividades: " + habitaciones[j][2]);
                        System.out.println("Incluye almuerzo/refrigerio: " + habitaciones[j][3]);
                        System.out.println("Precio: " + habitaciones[j][4]);
                        System.out.println("-------------------");
                        break;
                    }
                }
            }
        }
    }

    private static double obtenerPrecioBase(String tipoAlojamiento, int[] precioAlojamientos) {
        switch (tipoAlojamiento) {
            case "hotel":
                return precioAlojamientos[0];
            case "apartamento":
                return precioAlojamientos[1];
            case "finca":
                return precioAlojamientos[2];
            default:
                return 0;
        }
    }

    public static double[] CalcularTotalYDescuentosOAumentos(double precioBaseHabitacion,int diaInicio, int diaFinalizacion,int numHabitaciones){
        double precioTotal=0;
        double descuentoOAumento = 0;

        precioTotal = precioBaseHabitacion * numHabitaciones;

        if (diaInicio >= 26 && diaFinalizacion <= 31) {
            descuentoOAumento = precioTotal * 0.15;
            descuentoOAumento = precioTotal + descuentoOAumento;
        } else if (diaInicio >= 10 && diaFinalizacion <= 15){
            descuentoOAumento = precioTotal * 0.1;
            descuentoOAumento = precioTotal + descuentoOAumento;
        }else if (diaInicio >= 5 && diaFinalizacion <= 10){
            descuentoOAumento = precioTotal * 0.08;
            descuentoOAumento = precioTotal - descuentoOAumento;
        }

        double[] total = {precioTotal,descuentoOAumento};

        return total;

    }

}
