package com.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio que carga un arreglo y determina si está ordenado o no.
 * En caso de estar ordenado, indica si está ordenado en forma creciente o decreciente
 */

public class OrdenDeArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorMenor = 0,contadorMayor = 0;
        int dimension = 0;
        int[] arreglo;

        //Se declara y se carga el arreglo
        System.out.println("Por favor, introduzca la dimensión del arreglo:");
        dimension = sc.nextInt();
        arreglo = new int[dimension];
        for (int i=0;i<dimension;i++){
            System.out.println("Por favor ingrese el valor para la posición "+(i+1)+" del arreglo:");
            arreglo[i]= sc.nextInt();
        }

        //Se controla si el arreglo está ordenado
        for(int i=0;i<dimension-1;i++){
            if(arreglo[i]<arreglo[i+1]){
                //Aqui se trata el caso en que el elemento actual es menor que el siguiente
                contadorMenor++;
            }
            if(arreglo[i]>arreglo[i+1]){
                //Aqui se trata el caso en que el elemento actual es mayor que el siguiente
                contadorMayor++;
            }
        }

        //Se declara si el elemento tiene algun orden
        if(contadorMenor==arreglo.length-1){
            System.out.println("El arreglo está ordenado de menor a mayor!");
        }else if(contadorMayor==arreglo.length-1) {
            System.out.println("El arreglo está ordenado de mayor a menor!");
        }
            else {
                System.out.println("El arreglo no tiene un orden");
            }
        }
    }

