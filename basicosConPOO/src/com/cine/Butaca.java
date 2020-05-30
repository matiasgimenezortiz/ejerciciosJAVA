package com.cine;

public class Butaca {
    private char columna;
    private int fila;
    private Espectador espectador;

    public Butaca( int fila,char columna) {
        this.columna = columna;
        this.fila = fila;
        this.espectador = null;
    }

    public char getColumna() {
        return columna;
    }

    public void setColumna(char columna) {
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    public boolean isOcupado(){
        return espectador!=null;
    }
}
