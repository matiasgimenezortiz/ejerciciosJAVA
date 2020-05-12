package com.ejerciciosbasicos;

/**
 * Ejercicio que carga una matriz 3x3 con valores multiplos de 5.
 * Multiplos de 5, de menor a mayor.
 */

public class MatrizCarga5en5 {
    public static void main(String[] args) {
        //Se declara la matriz
        int[][] matriz = new int[3][3];

        //Se llama a la función que carga la matriz
        cargaMatriz3x3(matriz);

        //Se llama a la función que imprime la matriz
        imprimeMatriz3x3(matriz);
    }

    public static void cargaMatriz3x3(int[][] matriz){
        int numero = 5;
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                matriz[i][j]=numero;
                numero+=5;
            }
        }
    }

    public static void imprimeMatriz3x3(int[][] matriz){
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("\n");
        }
    }
}
