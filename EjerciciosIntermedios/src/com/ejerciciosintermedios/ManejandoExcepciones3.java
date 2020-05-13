package com.ejerciciosintermedios;

import javax.swing.*;
import java.util.InputMismatchException;

/**
 * Ejercicio para trabajar la excepción en que se ingresa un valor distinto de númerico
 * en una variable numérica.
 */

public class ManejandoExcepciones3 {
    public static void main(String[]args){
        int numero1=0,numero2=0,suma=0;
        Exception excepcion =null;

        do{
            try{
                numero1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer valor para sumar: "));
                numero2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor: "));
                suma=numero1+numero2;
                JOptionPane.showMessageDialog(null,"El resultado es: "+suma);
                excepcion=null;
            }catch (Exception e){
                JOptionPane.showMessageDialog(null,"Usted introdujo un valor NO numerico, intente nuevamente.");
                excepcion=e;
            }
        }while (excepcion!=null);
    }
}
