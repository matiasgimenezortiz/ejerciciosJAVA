package com.ejerciciosbasicos;

/**
 * Ejercicio que carga una matriz irregular.
 * Carga con ceros y unos.
 * Los unos van en las orillas de la matriz.
 * Los ceros van en el resto de la matriz
 */

public class MatrizConOrillas {
    public static void main(String[] args) {
        //Se declara e inicializa las dimensiones de la matriz
        final int FILAS = 4;
        final int COLUMNAS =5;

        //Se declara e inicializa la matriz
        int[][] matriz = new int[FILAS][COLUMNAS];

        //Se llama al metodo que cargara la matriz
        cargaMatriz(matriz);

        //Se llama al método que imprime la matriz
        imprimeMatriz(matriz);
    }

    public static void cargaMatriz(int[][] matriz){
        for (int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                if ((i==0)|(i==matriz.length-1)|(j==0)|(j==matriz[i].length-1)){
                    matriz[i][j]=1;
                }else{
                    matriz[i][j]=0;
                }
            }
        }
    }

    public static void imprimeMatriz(int[][] matriz) {
        for (int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz[i].length;j++){
                System.out.print(matriz[i][j]+"  ");
            }
            System.out.println("\n");
        }
    }
}
