package com.barajas;

public class Carta {
    public static final String[] PALOS = {"Espadas", "Oros", "Copas", "Bastos"};
    public static final int LIMITE_CARTA_PALO = 12;
    private int numero;
    private String palo;

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    @Override
    public String toString() {
        return "Carta{" +
                "numero=" + numero +
                ", palo='" + palo + '\'' +
                '}';
    }
}
