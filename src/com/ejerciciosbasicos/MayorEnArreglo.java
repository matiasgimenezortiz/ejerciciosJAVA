package com.ejerciciosbasicos;

import javax.swing.*;

/**
 * Ejercicio que calcula cual es el número mayor de un arreglo de 6 valores.
 * El arreglo se carga con valores aleatorios, entre 0 y 100.
 */

public class MayorEnArreglo {
    public static void main(String[] args) {
        int mayor;
        int[] arreglo = new int[6];

        JOptionPane.showMessageDialog(null,"Se cargara el arreglo con valores aleatorios entre 1 y 100.");
        for (int i=0;i<arreglo.length;i++){
            arreglo[i] = (int)(Math.random()*100);
        }

        mayor =obtenerMayor(arreglo);
        JOptionPane.showMessageDialog(null,"El mayor del arreglo cargado es: "+mayor);

    }

    public static int obtenerMayor(int[] arreglo){
        int mayor;
        mayor=arreglo[0];
        for (int i=0;i<arreglo.length;i++){
            if (arreglo[i]>mayor){
                mayor=arreglo[i];
            }
        }
        return mayor;
    }
}
