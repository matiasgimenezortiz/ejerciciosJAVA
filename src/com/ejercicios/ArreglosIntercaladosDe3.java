package com.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio que carga 2 arreglos con 9 valores en cada uno.
 * Se agregaran intercaladamente 3 valores de cada arreglo, en un tercer arreglo.
 * Al final se muestra el tercer arreglo, que será un arreglo final.
 */

public class ArreglosIntercaladosDe3 {
    public static void main(String[] args) {
        int[] arregloUno = new int[9];
        int[] arregloDos = new int[9];
        int[] arregloFinal = new int[18];
        Scanner sc = new Scanner(System.in);

        //Se carga el primer arreglo
        for (int i=0; i<9;i++){
            System.out.println("Ingrese el valor de la posición "+(i+1)+" del primer arreglo:");
            arregloUno[i]=sc.nextInt();
        }

        //Se carga el segundo arreglo
        for (int i=0; i<9; i++){
            System.out.println("Ingrese el valor de la posición "+(i+1)+" del segundo arreglo:");
            arregloDos[i]=sc.nextInt();
        }

        //Se carga el tercer arreglo con 3 valores de cada arreglo, intercaladamente
        for (int i=0;i<3;i++){
            arregloFinal[(i*6)]=arregloUno[(i*3)];
            arregloFinal[((i*6)+1)]=arregloUno[((i*3)+1)];
            arregloFinal[((i*6)+2)]=arregloUno[((i*3)+2)];

            arregloFinal[((i*6)+3)]=arregloDos[(i*3)];
            arregloFinal[((i*6)+4)]=arregloDos[((i*3)+1)];
            arregloFinal[((i*6)+5)]=arregloDos[((i*3)+2)];
        }

        //Se mostrará el arreglo final
        System.out.println("Se muestra el arreglo final:");
        for (int i=0;i<18;i++){
            System.out.print(arregloFinal[i]+" | ");
        }
    }
}
