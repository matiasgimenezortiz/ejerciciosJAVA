package com.ejerciciosbasicos;

import java.util.Scanner;

/**
 * Ejercicio que elimina elementos repetidos de un arreglo
 */

public class EliminarEltosRepetidos {
    public static void main(String[] args) {
        int dimension,contadorRepetidos=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Por favor, ingrese la dimensión del arreglo que cargará: ");
        dimension=sc.nextInt();
        int[] arreglo=new int[dimension];


        for(int i=0;i<dimension;i++){
            System.out.println("Ingrese el número para la posición: "+(i+1));
            arreglo[i]=sc.nextInt();
        }

        //Elimina repetidos y los cuenta
        for(int i=0;i<dimension-contadorRepetidos;i++){
            for (int j=(i+1);j<dimension-contadorRepetidos;j++){
                if(arreglo[i]==arreglo[j]){
                    for(int k=(j+1);k<dimension-contadorRepetidos;k++){
                        arreglo[k-1]=arreglo[k];
                    }
                    contadorRepetidos++;
                    j--;
                }
            }
        }

        //Imprime arreglo sin repetidos
        System.out.println("El arreglo sin numeros repetidos es: ");
        for (int i=0;i<dimension-contadorRepetidos;i++){
            System.out.print(arreglo[i]+" | ");
        }
    }
}
