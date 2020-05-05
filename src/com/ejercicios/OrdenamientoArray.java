package com.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio en el que se ingresan 5 valores. Se almacenan en un arreglo de 10 lugares.
 * Se ordenan en orden creciente.
 * Se insertará luego un valor extra, el cual se acomodará en el arreglo respetando el mismo orden creciente.
 */

public class OrdenamientoArray {
    public static void main(String[] args) {
        int[] arregloOriginal = new int[10];
        Scanner sc = new Scanner(System.in);
        int numero,posicion,anterior,siguiente;

        //Se cargara el arreglo con los primeros 5 valores
        System.out.println("Por favor, ingrese los 5 valores para el arreglo, en orden creciente: ");
        for (int i=0;i<5;i++){
            arregloOriginal[i]= sc.nextInt();
        }

        //Se ingresa el siguiente valor que se acomodará en el arreglo

        System.out.println("Por favor, ingrese ahora el valor que se desea agregar al arreglo:");
        numero=sc.nextInt();

        posicion=0;
        while ((arregloOriginal[posicion]<numero) && (posicion<5)){
            posicion++;
        }

        anterior=numero;

        for(int i=posicion; i<arregloOriginal.length;i++){
            siguiente = arregloOriginal[i];
            arregloOriginal[i]=anterior;
            anterior=siguiente;
        }

        for (int i=0;i<arregloOriginal.length;i++) {
            System.out.print(arregloOriginal[i]+" | ");
        }
    }
}
