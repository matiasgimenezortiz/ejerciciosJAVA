package com.apuestas;

import java.util.Arrays;

public class Jugador implements Constantes, MetodosInterface {
    private String nombre;
    private double dinero;
    private int apuestasGanadas;
    private String[] resultados;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.dinero = DINERO_INICIAL;
        this.apuestasGanadas = 0;
        this.resultados = new String[NUMERO_PARTIDOS];
    }

    public void reiniciarResultados() {
        for (int i = 0; i < resultados.length; i++) {
            resultados[i] = "";
        }
    }

    public boolean puedeApostar() {
        return (dinero >= DINERO_CADA_FECHA);
    }

    public void pagarApuesta() {
        dinero -= DINERO_CADA_FECHA;
        System.out.println("El jugador: " + nombre + " ha apostado " + DINERO_CADA_FECHA + " euros y le quedan: " + dinero);
    }

    public void ganaApuesta(double sumaApuestas) {
        dinero += sumaApuestas;
        System.out.println("El jugador: " + nombre + " ha ganado " + sumaApuestas + " euros y le quedan: " + dinero);
    }

    @Override
    public String toString() {
        return "El jugador " + nombre +
                ", tiene $" + dinero +
                ", ha ganado " + apuestasGanadas +
                " apuestas";
    }

    @Override
    public void generarResultados() {
        int pLocal, pVisitante;

        for (int i = 0; i < resultados.length; i++) {
            pLocal = aleatorio.nextInt(RESULTADO_MAXIMO - RESULTADO_MINIMO);
            pVisitante = aleatorio.nextInt(RESULTADO_MAXIMO - RESULTADO_MINIMO);

            resultados[i] = pLocal + " - " + pVisitante;

            System.out.println("El jugador: " + nombre + " ha elegido como resultado: " + resultados[i]);
        }
        System.out.println("");
    }

    public boolean haAcertadoApuesta(String[] resultadosPartidos) {

        for (int i = 0; i < resultados.length; i++) {
            if (!resultados[i].equals(resultadosPartidos[i])) {
                return false;
            }
        }
        return true;
    }

}
