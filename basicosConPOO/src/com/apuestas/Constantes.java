package com.apuestas;

import java.util.Random;

public interface Constantes {
    public final int NUMERO_PARTIDOS = 4;

    public final int NUMERO_FECHAS = 4;
    public final double DINERO_INICIAL = 35;

    public final int RESULTADO_MINIMO = 0;
    public final int RESULTADO_MAXIMO = 3;

    public final double DINERO_CADA_FECHA = 1;

    public final Jugador[] JUGADORES = {
            new Jugador("Juan"),
            new Jugador("Pedro"),
            new Jugador("Pepe"),
            new Jugador("Alberto"),
            new Jugador("Carlos"),
            new Jugador("Ernesto")
    };

    public final Random aleatorio=new Random();
}

