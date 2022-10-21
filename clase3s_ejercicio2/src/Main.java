
/* Hacé un programa que te permita jugar a “Piedra, papel o tijera”. En primer lugar, la
        aplicación solicita el nombre de cada gamer, después empieza el juego. El juego consiste
        en pedir qué opción elije cada uno y sumar puntos al winner —si lo hay—. Definí y utilizá
        una función llamada cualGana con dos parámetros con las jugadas de cada uno, que
        devuelve 0 en caso de empate, 1 si gana el primero, 2 si gana el segundo. El juego termina
        cuando el primero elije “*” como indicador de final. */

import java.util.Scanner;

public class Main {

    public static int cualGana(String eleccion1, String eleccion2) {
        if ((eleccion1.equals("piedra") && eleccion2.equals("tijera")) ||
                (eleccion1.equals("tijera") && eleccion2.equals("papel")) ||
                (eleccion1.equals("papel") && eleccion2.equals("piedra"))) {
            return 1;
        } else if ((eleccion2.equals("piedra") && eleccion1.equals("tijera")) ||
                (eleccion2.equals("tijera") && eleccion1.equals("papel")) ||
                (eleccion2.equals("papel") && eleccion1.equals("piedra"))
        ) {
            return 2;
        } else if (eleccion1.equals(eleccion2)) {
            return 0;
        }
        return 3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int puntosJugador1 = 0;
        int puntosJugador2 = 0;
        String eleccion1 = "";

        System.out.println("Ingrese nombre del primer jugador");
        String nombre1 = scanner.nextLine();
        System.out.println("Ingrese nombre del segundo jugador");
        String nombre2 = scanner.nextLine();

        System.out.println("Comienza el juego");

        System.out.println("Ingrese la jugada del jugador 1");
        eleccion1 = scanner.nextLine();
        System.out.println("Ingrese la jugada del jugador 2");

        do {
            String eleccion2 = scanner.nextLine();
            int resultado = cualGana(eleccion1, eleccion2);
            if (resultado == 1) {
                puntosJugador1++;
            } else if (resultado == 2) {
                puntosJugador2++;
            } else if (resultado == 0) {
                System.out.println("hubo un empate");
            } else if (resultado == 3) {
                System.out.println("ocurrio un error");
            }

            System.out.println("Ingrese la jugada del jugador 1");
            eleccion1 = scanner.nextLine();
            System.out.println("Ingrese la jugada del jugador 2");

        }
        while (!eleccion1.equals("*"));

        if (puntosJugador1 > puntosJugador2) {
            System.out.println("Gano el jugador 1");
        } else if (puntosJugador1 < puntosJugador2) {
            System.out.println("Gano el jugador 2");
        } else {
            System.out.println("ambos jugadores terminaron con el mismo puntaje");
        }


    }
}