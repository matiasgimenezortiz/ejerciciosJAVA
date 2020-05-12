package com.ejerciciosbasicos;

import javax.swing.*;

/**
 * Ejercicio que carga valores de manera aleatoria en un arreglo.
 * Valores entre 1 y 100.
 * Devuelve cual es el menor valor de los cargados en el arreglo.
 */

public class MenorEnArreglo {
    public static void main(String[] args) {
        int menor;
        int[] arreglo = new int[10];

        //Se carga el arreglo con valores entre 1 y 100
        JOptionPane.showMessageDialog(null,"Se cargará un arreglo con valores de manera aleatoria.");
        for (int i=0;i<arreglo.length;i++){
            arreglo[i]=(int)(Math.random()*100);
        }

        //Se obtiene el menor valor del arreglo.
        menor = obtenerMenor(arreglo);
        JOptionPane.showMessageDialog(null,"El valor menor del arreglo es: "+menor);

    }

    public static int obtenerMenor(int[] arreglo){
        int menor2 = arreglo[0];
        for (int i=0;i<arreglo.length;i++){
            if (arreglo[i]<menor2){
                menor2=arreglo[i];
            }
        }
        return menor2;
    }
}
