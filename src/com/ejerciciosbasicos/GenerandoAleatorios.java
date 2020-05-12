package com.ejerciciosbasicos;

/**
 * Ejercicio que muestra como utilizar la clase Math para generar números aleatorios.
 * Los cargará en un arreglo de diez valores.
 */

public class GenerandoAleatorios {
    public static void main(String[] args) {
        int[] arreglo = new int[10];
        System.out.println("Números aleatorios entre 1 y 100.");
        for (int i=0;i<arreglo.length;i++){
            arreglo[i]=(int)Math.random(); //devuelve un valor entre 0 y 1.
            arreglo[i]*=100;//Lo multiplico por 100 para que el valor este comprendido entre 1 y 100
        }
    }
}
