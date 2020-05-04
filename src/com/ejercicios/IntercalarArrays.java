package com.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio que carga dos arreglos con 10 posiciciones.
 * Carga un tercer arreglo con los valores de los otros arreglos, de manera intercalada.
 */

public class IntercalarArrays {
    public static void main(String[] args) {
        int[] arregloUno = new int[10];
        int[] arregloDos = new int[10];
        int[] arregloFinal = new int[20];
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduciremos los diez valores del primer arreglo:");
        for (int i=0; i<10;i++){
            System.out.println("Ingrese el valor de la posición "+(i+1)+" para el primer arreglo:");
            arregloUno[i]= sc.nextInt();
        }

        System.out.println("Introduciremos los diez valores del segundo arreglo:");
        for (int i=0; i<10;i++){
            System.out.println("Ingrese el valor de la posición "+(i+1)+" para el segundo arreglo:");
            arregloDos[i]= sc.nextInt();
        }

        System.out.println("Ahora rellenamos el tercer arreglo con los valores de los dos anteriores, intercalados.");
        for (int i = 0; i<10; i++){
            arregloFinal[(i*2)]=arregloUno[i];
            arregloFinal[((i*2)+1)]=arregloDos[i];
        }

        System.out.println("Mostrar arreglo final: ");
        for (int i=0; i<20;i++){
            System.out.println("El valor en la posición "+(i+1)+" es "+arregloFinal[i]);
        }
    }
}
