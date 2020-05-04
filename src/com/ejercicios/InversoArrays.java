package com.ejercicios;

import javax.swing.*;

/**
 * Ejericio que recibe 5 números, los almacena en un array y los devuelve en ordn inverso.
 */

public class InversoArrays {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        JOptionPane.showMessageDialog(null,"Por favor, ingrese 5 valores para el arreglo.");

        for (int i=0; i<=4;i++){
            numeros[i]=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el valor para la ubicación "+(i+1)+" del array:"));
        }

        JOptionPane.showMessageDialog(null,"Ahora mostraremos los números cargados en orden inverso.");

        for(int i=4;i>=0;i--) {
            JOptionPane.showMessageDialog(null, "El número ingresado en la posición " + (i+1) + " es: "+ numeros[i]);
        }
    }
}
