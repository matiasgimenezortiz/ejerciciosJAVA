package com.ejerciciosbasicos;

/**
 * Ejercicio que carga caracteres en una matriz.
 * Se declaran las variables  FILAS y COLUMNAS como FINAL
 * Matriz NO cuadrada.
 * La martiz se carga con caracteres empezando desde la 'a'.
 *
 */

public class MatrizChars {
    public static void main(String[] args) {
        //Se declaran las variables columnas y filas como variables.
        final int COLUMNAS = 5;
        final int FILAS = 3;

        //Se declara la matriz
        char[][] matriz = new char[FILAS][COLUMNAS];

        //Se carga la matriz
        cargarMatriz(matriz);

        //Se imprime la matriz
        imprimirMatriz(matriz);

    }

    public static void cargarMatriz(char[][] matriz) {
        char caracterActual = 'a';
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = caracterActual;
                caracterActual++;
            }
        }
    }

    public static void imprimirMatriz(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("\n");
        }
    }
}

