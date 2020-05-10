package com.ejercicios;

import java.util.Scanner;

/**
 * Ejericio que elimina un elemento de un arreglo.
 * Primero lo carga por teclado el usuario.
 * La dimensión del arreglo será establecida por el usuario.
 *
 */

public class EliminarUnElto {
    public static void main(String[] args) {
        //Se pide la dimensión del arreglo y se lo carga, con las declaraciones de variables.
        int dimension,posicion,aux;
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, ingrese cuántos valores agregará al arreglo:");
        dimension=sc.nextInt();
        int[] arreglo = new int[dimension];

        for (int i=0; i<dimension;i++){
            System.out.println("Por favor ingrese el valor para la posición "+(i+1)+" del arreglo:");
            arreglo[i]=sc.nextInt();
        }

        //Se elimina el elemento
        System.out.println("Por favor, ingrese la posición del arreglo que desea eliminar:");
        posicion=sc.nextInt();
        while(posicion>dimension){
            System.out.println("El posición está fuera del arreglo, por favor, intente nuevamente.");
            System.out.println("Por favor, ingrese la posición del arreglo que desea eliminar:");
            posicion=sc.nextInt();
        }

        for(int i=posicion;i<dimension;i++){
            arreglo[i-1]=arreglo[i];
        }

        //Imprime el arreglo final
        for(int i=0;i<dimension-1;i++){
            System.out.print(arreglo[i]+" | ");
        }

    }
}
