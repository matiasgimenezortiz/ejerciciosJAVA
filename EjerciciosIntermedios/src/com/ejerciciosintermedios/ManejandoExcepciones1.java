package com.ejerciciosintermedios;
/**
 * Ejercicio para manejar excepción de indice de arreglo fuera del alcance
 */

import javax.swing.*;
import java.awt.*;

public class ManejandoExcepciones1 {
    public static void main(String[] args) {
        String[] nombres = {"Laura","Pedro","Tigre","Juan","Matias"};
        int posicion=0;
        do {
            try{
                posicion = Integer.parseInt(JOptionPane.showInputDialog("A qué posición desea acceder?"));
                JOptionPane.showMessageDialog(null,"El nombre en la posición "+posicion+" es: "+nombres[posicion-1]);
            } catch (ArrayIndexOutOfBoundsException e) {
                JOptionPane.showMessageDialog(null,"La posición ingresada no existe. Besos!");
            }
        }while (posicion>5||posicion<1);

        JOptionPane.showMessageDialog(null,"Programa finalizado!");
    }
}
