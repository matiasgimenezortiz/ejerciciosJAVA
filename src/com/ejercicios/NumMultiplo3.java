package com.ejercicios;

import javax.swing.*;
import java.util.Scanner;

/**
 * Ejercicio que muestra identificar multiplos del número 3.
 * El número ha identificar será ingresado por teclado.
 */

public class NumMultiplo3 {
    public static void main(String[] args) {
        //Se ingresa el número a verificar
        int numero;
        numero = Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor, ingrese el número a identificar:"));

        if (numero%3==0){
            JOptionPane.showMessageDialog(null,"El número ingresado ES múltiplo de 3!");
        }else
        {
            JOptionPane.showMessageDialog(null,"El número ingresado NO ES múltiplo de 3!");

        }
    }
}

