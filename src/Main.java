import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         String[][] matriz = inicializarCartasJuego(crearMatrizCartas());
         menu(matriz);
    }


        public static void menu (String[][] matriz) {
            int opcion = 0;
            do{
            System.out.println("Deseas volver a jugar?");
            System.out.println("1. Iniciar Juego");
            System.out.println("2.Salir");
            System.out.print("Ingrese opcion: ");
            opcion = seleccionador(leerNumero(), matriz);} while ( opcion != 2);


        }
        public static int leerNumero () {
            Scanner teclado = new Scanner(System.in);
            return teclado.nextInt();
        }
        public static String[][] agregarCartas (String[][] matriz, String nombreCarta, String puntaje){
            for (int i = 0; i < matriz.length; i++) {
                if (matriz[0][i] == null) {
                    matriz[0][i] = nombreCarta;
                    matriz[1][i] = puntaje;
                }
            }
            return matriz;
        }
        public static int seleccionador ( int opcion, String[][] matriz){
            if (opcion == 1) {
                jugar();

            } else if (opcion == 2) {
                System.out.print("Gracias por jugar!");

            } else {
                System.out.print("Ingrese opcion valida: ");
                seleccionador(leerNumero(),matriz);
            }return opcion;

        }
        public static String[][] crearMatrizCartas () {
            return new String[2][12];
        }
        public static String[][] inicializarCartasJuego (String[][]matriz){
            agregarCartas(matriz, "A", "11");
            agregarCartas(matriz, "J", "10");
            agregarCartas(matriz, "Q", "10");
            agregarCartas(matriz, "K", "10");
            agregarCartas(matriz, "2", "2");
            agregarCartas(matriz, "3", "3");
            agregarCartas(matriz, "4", "4");
            agregarCartas(matriz, "5", "5");
            agregarCartas(matriz, "6", "6");
            agregarCartas(matriz, "7", "7");
            agregarCartas(matriz, "8", "8");
            agregarCartas(matriz, "9", "9");
            return matriz;
        }
        public static void jugar(String[][] matriz) {
            int pJugador1 = obtenerpuntaje();
            int pJugador2 = obtenerPuntaje();
            if (pJugador2 <= 20 && pJugador1 < pJugador2) {
                System.out.println("Jugador 2 es el ganador con " + pJugador2 + "puntos");
            } else if (pJugador1 <= 20 && pJugador2 < pJugador1) {
                System.out.println("Jugador 1 es el ganador con " + pJugador1 + " puntos");
            } else {
                System.out.println("No hubo ganador, vuelvan a jugar :)");
            }
        }
        public static int obtenerCartas(String[][] matriz){

        }


}

