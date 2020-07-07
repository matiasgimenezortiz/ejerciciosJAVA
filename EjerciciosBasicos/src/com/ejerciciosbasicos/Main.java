package com.ejerciciosbasicos;

public class Main {
    public static void main(String[] args) {

        //Ejecución del reloj
        Reloj demano= new Reloj(23,59,59);
        demano.imprimirReloj();
        demano.incrementa();
        demano.imprimirReloj();

    }

}
