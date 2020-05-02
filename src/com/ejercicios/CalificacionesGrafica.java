package com.ejercicios;

import javax.swing.*;

/**
 * Ejercicio que recibe calificaciones de estudiantes. Utiliza librerías gráficas.
 *
 */

public class CalificacionesGrafica {
    public static void main(String[] args) {
        int aprobados = 0, reprobados = 0, excelentes = 0;
        float calificacion = 0.0f;
        int i=0;

        int j = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese cuantas calificaciones ingresará: "));
        while (j<=0){
            JOptionPane.showMessageDialog(null,"Debe ingresar al menos una calificación");
            j = Integer.parseInt(JOptionPane.showInputDialog("Por favor, ingrese cuantas calificaciones ingresará: "));
        }

        while(i<j){
        calificacion = Float.parseFloat(JOptionPane.showInputDialog("Por favor ingrese la calificación: "+(i+1)));
            if (calificacion>0 && calificacion<=10){
                if (calificacion >=6){
                    aprobados++;
                    if (calificacion == 10){
                        excelentes++;
                    }
                } else if (calificacion < 6){
                    reprobados++;
                }
                i++;
            } else {
                JOptionPane.showMessageDialog(null,"Usted ha ingresado una calificación incorrecta! Intente nuevamente!");
            }
        }

        JOptionPane.showMessageDialog(null,"Detalles de las calificaciones ingresadas: "+"\n"
                +"La cantidad de alumnos aprobados es: "+aprobados+"\n"
                +"La cantidad de alumnos aprobados con calificación excelente es: "+excelentes+"\n"
                +"La cantidad de alumnos reprobados es: "+reprobados);
    }
}