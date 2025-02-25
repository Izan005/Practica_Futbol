package org.example.clases;

import java.util.Arrays;

public class AppPartidos {
    public static void main(String[] args) {
        Entrenador e1 = new Entrenador("Entrenador1", 50, Equipos.SENIOR, "23-11-2");
        Jugador j1 = new Jugador("Jugador1", 23, Equipos.SENIOR,  12, Posiciones.DELANTERO);
        Jugador j2 = new Jugador("Jugador1", 23, Equipos.SENIOR,  13, Posiciones.PORTERO);
        System.out.println(j1);
        e1.entrenar();
        Acompañante a1 = new Acompañante("Nombre1", 12, j1, "Hermanos");
        System.out.println(a1);
        Masajista m1 = new Masajista("Nombre1", 34, "Dios", 12);
        System.out.println(m1);
    }
}
