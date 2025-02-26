package org.example.clases;

import java.util.Arrays;

public class AppPartidos {
    public static void main(String[] args) {

        // crear varios jugadores para el equipo SENIOR
        Jugador j1 = new Jugador("Jugador1", 23, Equipos.SENIOR,  12, Posiciones.DELANTERO);
        Jugador j2 = new Jugador("Jugador2", 21, Equipos.SENIOR,  13, Posiciones.PORTERO);

        // crear al entrenador del equipo SENIOR
        Entrenador e1 = new Entrenador("Entrenador1", 50, Equipos.SENIOR, "23-11-2");

        // crear a los masajistas del club
        Masajista m1 = new Masajista("Nombre1", 34, "Dios", 12);

        // crear a algún acompañante para un par de jugadores
        Acompañante a1 = new Acompañante("Acompañante1", 12, j1, "Hermanos");
        Acompañante a2 = new Acompañante("Acompañante2", 23, j2, "Primos");

        // concentrarse()
        j1.concentrarse();
        j2.concentrarse();
        e1.concentrarse();
        m1.concentrarse();
        a1.concentrarse();
        a2.concentrarse();

        System.out.println();
        // entrenar()
        j1.entrenar();
        j2.entrenar();
        e1.entrenar();

        System.out.println();
        // darMasaje() a algún jugador
        m1.darMasaje(j1);

        System.out.println();
        // viajar() a Madrid
        j1.viajar("Madrid");
        j2.viajar("Madrid");
        e1.viajar("Madrid");
        m1.viajar("Madrid");
        a1.viajar("Madrid");
        a2.viajar("Madrid");

        System.out.println();
        // planificarEntrenamiento()
        e1.planificarEntrenamiento();

        System.out.println();
        // entrenar()
        j1.entrenar();
        j2.entrenar();
        e1.entrenar();

        System.out.println();
        // descansar()
        j1.descansar();
        j2.descansar();

        System.out.println();
        // calentar()
        j1.calentar();
        j2.calentar();

        System.out.println();
        // jugarPartido()
        j1.jugarPartido("FC Albacete");
        j2.jugarPartido("FC Azerbaijan");
        e1.jugarPartido("FC Perú");

        System.out.println();
        // animarEquipo()
        a1.animarEquipo();
        a2.animarEquipo();

        System.out.println();
        // hacerCambios()
        e1.hacerCambios(j1, j2);

        System.out.println();
        // marcarGol()
        j1.marcarGol();
        j2.marcarGol();

        System.out.println();
        // celebrarGol()
        j1.celebrarGol();
        j2.celebrarGol();
        e1.celebrarGol();
        m1.celebrarGol();
        a1.celebrarGol();
        a2.celebrarGol();

        System.out.println();
        // darMasaje() a varios jugadores
        m1.darMasaje(j1);
        m1.darMasaje(j2);

        System.out.println();
        // viajar() a Mutxamel
        j1.viajar("Mutxamel");
        j2.viajar("Mutxamel");
        e1.viajar("Mutxamel");
        m1.viajar("Mutxamel");
        a1.viajar("Mutxamel");
        a2.viajar("Mutxamel");

        System.out.println();
        // descansar()
        j1.descansar();
        j2.descansar();
    }
}
