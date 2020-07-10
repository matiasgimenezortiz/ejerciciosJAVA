package com.barajas;

import java.util.Random;

public class Mazo {
    public static final int NUM_CARTAS = 40;
    private Carta[] mazo;
    private int posSigCarta; //determina cual es la posicion de la siguiente carta

    public Mazo() {
        this.mazo = new Carta[NUM_CARTAS];
        this.posSigCarta = 0;
        crearMazo();
    }

    private void crearMazo() {
        String[] palos = Carta.PALOS;

        for (int i = 0; i < palos.length; i++) {
            for (int j = 0; j < Carta.LIMITE_CARTA_PALO; j++) {
                if (!(j == 7 || j == 8)) {
                    if (j >= 9) {
                        mazo[(i * (Carta.LIMITE_CARTA_PALO - 2)) + (j - 2)] = new Carta(j + 1, palos[i]);
                    } else {
                        mazo[(i * (Carta.LIMITE_CARTA_PALO - 2)) + j] = new Carta(j + 1, palos[i]);
                    }
                }
            }
        }
        barajar();
    }

    public void barajar() {
        int posAleatoria = 0;
        Random aleatorio = new Random();
        Carta aux;

        for (int i = 0; i < mazo.length; i++) {
            posAleatoria = aleatorio.nextInt(39);
            aux = mazo[i];
            mazo[i] = mazo[posAleatoria];
            mazo[posAleatoria] = aux;
        }
        this.posSigCarta = 0;
    }

    public Carta siguienteCarta() {
        Carta aux = null;

        if (posSigCarta == NUM_CARTAS) {
            System.out.println("Ya no hay más cartas en el mazo. Baraja de nuevo!");
        } else {
            aux = mazo[posSigCarta++];
        }

        return aux;
    }

    public Carta[] darCartas(int numeroDeCartas) {
        if (numeroDeCartas > cartasDisponiblesEnMazo()) {
            System.out.println("No hay suficientes cartas en el mazo...");
            return null;
        } else {
            Carta[] cartas = new Carta[numeroDeCartas];

            for (int i = 0; i < numeroDeCartas; i++) {
                cartas[i] = siguienteCarta();
                imprimirCarta(cartas[i]);
            }
            return cartas;
        }
    }

    public int cartasDisponiblesEnMazo() {
        return NUM_CARTAS - posSigCarta;
    }

    public void mostrarCartasMesa() {
        if (cartasDisponiblesEnMazo() == NUM_CARTAS) {
            System.out.println("No se ha sacado ninguna carta...");
        } else {
            for (int i = 0; i < posSigCarta; i++) {
                System.out.println(mazo[i] + " | ");
            }
        }
    }

    public void mostrarCartasMazo() {
        if (cartasDisponiblesEnMazo() == 0) {
            System.out.println("Ya no quedan cartas disponibles en el mazo...");
        } else {
            for (int i = posSigCarta; i < NUM_CARTAS; i++) {
                System.out.println(mazo[i] + " | ");
            }
        }
    }

    public void imprimirCarta(Carta c) {
        System.out.println(c);
    }
}
