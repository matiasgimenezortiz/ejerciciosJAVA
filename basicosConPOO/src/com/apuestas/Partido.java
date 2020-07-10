package com.apuestas;

public class Partido implements Constantes, MetodosInterface {
    private String[] partidos;

    public Partido() {
        partidos = new String[NUMERO_PARTIDOS];
    }

    @Override
    public void generarResultados() {
        int pLocal, pVisitante;

        for (int i = 0; i < partidos.length; i++) {
            pLocal = aleatorio.nextInt(RESULTADO_MAXIMO + 1 - RESULTADO_MINIMO);
            pVisitante = aleatorio.nextInt(RESULTADO_MAXIMO + 1 - RESULTADO_MINIMO);

            partidos[i] = pLocal + " - " + pVisitante;

            System.out.println("El resultado del partido " + (i + 1) + " ha dado como resultado: " + partidos[i]);
        }
    }

    public String[] getPartidos() {
        return partidos;
    }
}
