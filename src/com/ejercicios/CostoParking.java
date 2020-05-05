package com.ejercicios;

import javax.swing.*;

/**
 * Ejercicio que calcula el costo de un estacionamiento.
 * Hasta 3 horas cuesta $20 cada hora.
 * Pasadas las 3 horas cuesta $15 cada hora extra, es decir, a partir de la cuarta hora.
 * Hasta un día cuesta $250.
 * Si está más de un día costará $250 por el primer día y luego $15 cada hora.
 */

public class CostoParking {
    public static void main(String[] args) {
        int cantHoras =0;
        float costoTotal=0;
        float dias=0;
        int restoHoras;

        cantHoras=Integer.parseInt(JOptionPane.showInputDialog("Por favor ingrese la cantidad de horas total a cobrar: "));
        dias = cantHoras/24;
        restoHoras = cantHoras%24;
        costoTotal=calcularCostoTotal(dias,restoHoras);

        JOptionPane.showMessageDialog(null,"El vehículo estuvo estacionado "+dias+" dias y "+restoHoras+" horas"+
                "\n"+"El costo total del parking es: "+costoTotal);
    }

    public static float calcularCostoTotal(float dias, int restoHoras){
        float costo = 0;
        if (dias>0){
            costo = (250*dias) + (restoHoras*15);
        } else if (restoHoras>3){
            costo = (60)+((restoHoras-3)*15);
            if (costo>=250){
                costo=250;
            }
            } else {
                costo = restoHoras*20;
            }
        return costo;
    }
}
