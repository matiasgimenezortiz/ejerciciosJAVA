package com.ejerciciosbasicos;

import java.util.Scanner;

/**
 * Ejercicio que cuenta la cantidad de calificaciones de alumnos que aprobaron y cuantos reprobaron.
 * También contara alumnos con calificación excelente.
 */
public class Calificaciones {
    public static void main(String[] args) {
        int aprobados = 0, reprobados = 0, excelentes = 0;
        float calificacion = 0.0f;
        int i = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, ingrese cuantas calificaciones ingresará: ");
        int j = sc.nextInt();

        while (i<j){
            System.out.println("Por favor, ingrese la próxima calificación: ");
            calificacion = sc.nextFloat();

            if (calificacion>0){
                if (calificacion >=6 && calificacion <=10){
                    aprobados++;
                    if (calificacion == 10){
                        excelentes++;
                    }
                } else if (calificacion < 6){
                    reprobados++;
                }
                i++;
            } else {
                System.out.println("Usted ha ingresado una calificación incorrecta! Intente nuevamente!");
            }
        }

        System.out.println("Detalles de las calificaciones ingresadas: ");
        System.out.println("La cantidad de alumnos aprobados es: "+aprobados);
        System.out.println("La cantidad de alumnos aprobados con calificación excelente es: "+excelentes);
        System.out.println("La cantidad de alumnos reprobados es: "+reprobados);
        System.out.println("Cambio y fuera!");
    }
}
