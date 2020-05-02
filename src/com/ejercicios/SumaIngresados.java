package com.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio que pide se ingresen y se guardan números.
 * Se detendrá el registro cuando se ingrese un cero.
 * Se calcula la suma de todos los números ingresados y se muestra.
 */

public class SumaIngresados {
    public static void main(String[] args) {
        /**
         * Se inicializan variables.
         */
        int suma=0;
        int num=0;
        Scanner sc = new Scanner(System.in);

        /**
         * Se ingresan los valores, se los suma en un acumulador llamado "suma".
         * Se detiene los ingresos cuando llega un cero.
         */
        do {
            System.out.println("Ingrese un nuevo número a guardar: ");
            num= sc.nextInt();
            suma=suma+num;
        }while(num!=0);

        /**
         * Se muestra por pantalla el resultado de la suma de los números ingresados.
         */
        System.out.println("El resultado de la suma de esos números es: "+suma);
    }
}
