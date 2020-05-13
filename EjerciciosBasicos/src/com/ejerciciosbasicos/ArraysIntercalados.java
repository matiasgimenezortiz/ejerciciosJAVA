package com.ejerciciosbasicos;

import java.util.Scanner;

/**
 * Se carga un array con diez valores.
 * Se los muestra intercaladamente.En el siguiente orden: el primero, el ultimo, el segundo,
 * el penultimo, el tercero...
 */

public class ArraysIntercalados {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese los diez números para el arreglo: ");

        for (int i=0;i<10;i++){
            System.out.println("Ingrese el valor para la posición: "+ (i+1));
            numeros[i]= sc.nextInt();
        }

        System.out.println("Se mostraran los números ingresados en el array con un orden medio raro:");

        int j=9;
        for (int i=0;i<5;i++){
            System.out.print(numeros[i]+" | "+numeros[j]+" | ");
            j--;
        }
    }
}
