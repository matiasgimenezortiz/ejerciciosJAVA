package com.ejercicios;

import javax.swing.*;

/**
 * Ejercicio que recibira montos de sueldos y mostrará GRAFICAMENTE cual es el mayor.
 */

public class ContadorSueldos {
    public static void main(String[] args) {
        int cantidadSueldos = 0;
        float sueldo = 0,sueldoMaximo=0;

        cantidadSueldos = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese la cantidad de sueldos que ingresará: "));
        while (cantidadSueldos ==0){
            JOptionPane.showMessageDialog(null,"Debe ingresar al menos un sueldo.");
            cantidadSueldos = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese la cantidad de sueldos que ingresará: "));
        }

        sueldo = Float.parseFloat(JOptionPane.showInputDialog("Por favor, ingrese el sueldo número 1"));
        sueldoMaximo = sueldo;

        for (int i=2;i<=cantidadSueldos;i++){
            sueldo = Float.parseFloat(JOptionPane.showInputDialog("Por favor, ingrese el sueldo número: "+i));
            if (sueldo>sueldoMaximo){
                sueldoMaximo = sueldo;
            }
        }

        JOptionPane.showMessageDialog(null,"El sueldo mayor es "+sueldoMaximo);

    }
}
