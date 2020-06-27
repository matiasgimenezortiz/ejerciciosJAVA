package com.ejerciciosbasicos;

import java.util.Scanner;

public class SumaEltosArray {
    //Ejercicio que imprime por separado aquellos dos elementos de un array que sumados dan como resultado
    //un valor igual uno ingresado por el usuario

    static int[] arreglo = new int[10];
    static int numero;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        cargarMatriz();
        recibirNumero();
        imprimirNumeros();
    }

    public static void recibirNumero(){
        System.out.println("Por favor, ingrese el valor a comparar: ");
        numero = sc.nextInt();
    }

    public static void cargarMatriz(){
        System.out.println("Por favor, ingrese los 10 valores de la matriz: ");
        for (int i=0; i<10;i++){
          arreglo[i] =sc.nextInt();
        }
        System.out.println("La matriz totalmente cargada es: "+ arreglo);
    }

    public static void imprimirNumeros(){
        for(int i=0; i<arreglo.length; i++){
            for(int j=1;j<arreglo.length;j++){
                if(arreglo[i]+arreglo[j]==numero){
                    System.out.println(arreglo[i]+" "+arreglo[j]);
                }
            }
        }
    }

}
