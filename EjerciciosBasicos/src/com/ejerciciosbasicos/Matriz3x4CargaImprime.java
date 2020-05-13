package com.ejerciciosbasicos;

/**
 * Ejercicio que carga valores en una matriz de 3x4.
 * Muestra la matriz por pantalla.
 */

public class Matriz3x4CargaImprime {
    public static void main(String[] args) {
        //definimos matriz de 3x4
        int[][] arreglo = new int[3][4];

        //llamamos a la función para cargar matriz
        cargaMatriz3x4(arreglo);

        //llamamos a la función para mostrar la matriz por pantalla
        mostrarMatriz3x4(arreglo);
    }

    public static void cargaMatriz3x4(int[][] arreglo){
        for (int i=0;i<arreglo.length;i++){
            for (int j=0;j<arreglo[i].length;j++){
                arreglo[i][j]=(int)(Math.random()*100);
            }
        }
    }

    public static void mostrarMatriz3x4(int[][] arreglo){
        for (int i=0;i<arreglo.length;i++){
            for (int j=0;j<arreglo[i].length;j++){
                System.out.print(" | "+arreglo[i][j]);
            }
            System.out.println(" | \n");
        }
    }
}
