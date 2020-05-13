package com.ejerciciosintermedios;

import javax.swing.*;

/**
 * Ejercicio para manejar excepción de divisón por cero
 */

public class ManejandoExcepciones2 {
    public static void main(String[] args){
        int numerador,denominador=0;
        double divison;

        do{
            try{
                numerador=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numerador de la divison:"));
                denominador=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el denominador de la divison:"));
                JOptionPane.showMessageDialog(null,"La división que usted desea hacer es: "+numerador+"/"+denominador);
                divison=numerador/denominador;
                JOptionPane.showMessageDialog(null,"El resultado de la divisón es: "+divison);

            } catch (ArithmeticException e){
                divison=0;
                JOptionPane.showMessageDialog(null,"Error en división: "+e.getMessage()+". Intente nuevamente.");
            }
        }while (denominador==0);

    }
}
