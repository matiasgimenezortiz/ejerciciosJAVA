package com.ejerciciosbasicos;

import java.util.Scanner;

/**
 * Ejercicio que devuelve cual es el número mayor de los
 * cargados en un array.
 */

public class MayorDeUnArray {

    public static void main(String[] args) {
        int vector[]= new int[5];
        int mayor;
        System.out.println("Ingrese los 5 números para el arreglo: ");
        Scanner sc= new Scanner(System.in);
        /**
         * Aquí se carga el primer valor en el array
         * y se lo toma como maximo valor al momento
         */
        vector[0]=sc.nextInt();
        mayor=vector[0];

        /**
         * Aquí se cargan los demás valor al array
         * y se los va comparando con el actual mayor
         */
        for (int i=1;i<vector.length;i++){
            vector[i]=sc.nextInt();
            if (vector[i]>mayor)
                mayor=vector[i];
        }

        System.out.println("El número mayor ingresado es: "+mayor);
    }
}
