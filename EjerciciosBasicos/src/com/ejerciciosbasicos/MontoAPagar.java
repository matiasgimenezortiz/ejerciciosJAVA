package com.ejerciciosbasicos;

import javax.swing.*;

/**
 * Ejercicio que calcula monto a pagar de una compra.
 * Se solicita se ingrese cantidad de piezas a comprar.
 * Se solicita se ingrese costo por unidad.
 * Se calcula en base a cantidad y precio por unidad.
 * Se aplica 20% de descuento por cantidad mayor a 100 piezas.
 */

public class MontoAPagar {
    public static void main(String[] args) {
        int piezas = 0;
        double costoUnitario=0,costoTotal=0;

        piezas = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese la cantidad de piezas a comprar: "));
        costoUnitario= Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese el costo unitario de cada pieza: "));

        costoTotal=calcularCosto(piezas,costoUnitario);
        JOptionPane.showMessageDialog(null,"El costo total a pagar es: "+costoTotal);


    }
    public static double calcularCosto(int piezas,double costoUnitario){
        double costo = piezas*costoUnitario;
        if (piezas>=100){
            costo*=0.8;
        }
        return costo;
    }
}
