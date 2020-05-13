package com.ejerciciosbasicos;

import java.util.Scanner;

/**
 * Ejercicio que carga un arreglo de 10 valores y los ordena.
 * La carga la hace le usuario con valores enteros.
 */

public class OrdenarArreglo {
    public static void main(String[] args) {
        //Declara el arreglo y Scanner
        int[] arreglo = new int[10];
        Scanner sc = new Scanner(System.in);

        //Carga del arreglo
        for (int i=0;i<10;i++){
            System.out.println("Por favor, ingrese el valor para la posición: "+(i+1));
            arreglo[i]= sc.nextInt();
        }

        imprimirArreglo(arreglo); //Imprime el arreglo sin ordenar
        ordenarArreglo(arreglo);
        imprimirArreglo(arreglo); //Imprime el arreglo ordenado supuestamente
    }

    public static void imprimirArreglo(int[] arreglo){
        for(int i=0; i<arreglo.length; i++){
            System.out.print(arreglo[i]+" | ");
        }
        System.out.println("\n");
    }

    public static void ordenarArreglo(int[] arreglo){
        int contadorIntercambio =0;
        int aux;

        for(boolean ordenado=false;!ordenado;){
            for(int i=0;i<arreglo.length-1;i++){
                if(arreglo[i]>arreglo[i+1]){
                    aux=arreglo[i];
                    arreglo[i]=arreglo[i+1];
                    arreglo[i+1]=aux;
                    contadorIntercambio=1;
                }
            }
            if(contadorIntercambio==0){
                ordenado=true;
            }
            contadorIntercambio=0;
        }
    }
}
