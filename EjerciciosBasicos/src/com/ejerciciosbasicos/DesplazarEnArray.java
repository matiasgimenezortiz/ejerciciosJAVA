package com.ejerciciosbasicos;

import java.util.Scanner;

/**
 * Ejercicio que carga un arreglo con diez valores.
 * Luego los desplaza un lugar hacia abajo.
 * Muestra el arreglo final.
 */

public class DesplazarEnArray {
    public static void main(String[] args) {
        int[] arregloInicial = new int[10];
        int[] arregloFinal = new int[10];
        Scanner sc = new Scanner(System.in);

        //carga el arreglo inicial
        System.out.println("Se cargará el arreglo con los diez valores.");
        for (int i=0; i<10;i++){
            System.out.println("Ingrese el valor para la posición: "+(i+1));
            arregloInicial[i]= sc.nextInt();
        }

        //Aquí se lo carga en otro arreglo, desplazado.
        for (int i=0; i<9; i++){
            arregloFinal[i+1]=arregloInicial[i];
        }
        arregloFinal[0]=arregloInicial[9];

        //Aquí se mostrará el arreglo final, con los desplazamientos
        System.out.println("El arreglo final queda así:");
        for (int i=0;i<10;i++){
            System.out.print(arregloFinal[i]+" | ");
        }
    }
}
