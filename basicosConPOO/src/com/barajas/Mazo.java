package com.barajas;

public class Mazo {
    private Carta[] cartas;
    private int posSigCarta; //determina cual es la posicion de la siguiente carta
    public static final int NUM_CARTAS=40;

    public Mazo(){
        this.cartas=new Carta[NUM_CARTAS];
        this.posSigCarta=0;
        crearMazo();
    }

    private void crearMazo(){

        String[] palos= Carta.PALOS;

        for(int i=0;i<palos.length;i++){
            for(int j=0;j<Carta.LIMITE_CARTA_PALO;j++){
                if (!(j==7 || j==8)){
                    if
                }
            }
        }
    }



}
