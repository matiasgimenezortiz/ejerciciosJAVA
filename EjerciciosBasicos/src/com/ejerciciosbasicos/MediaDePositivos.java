package com.ejerciciosbasicos;

import java.util.Scanner;

/**
 * Este ejercicio calcula la media de los números positivos ingresados.
 * Deja de tomar números cuando sea ingresado un número no positivo.
 */

public class MediaDePositivos {
    public static void main(String[] args) {
        /**
         * Se inicializan las variables.
         */
        double numeroPositivo=0;
        double sumaPositivos=0;
        int cantidadPositivos=0;
        double mediaPositivos=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("El sistema dejará de tomar números cuando sea ingresado un número no positivo.");
        System.out.println("Ingrese un número positivo: ");
        numeroPositivo= sc.nextDouble();

        while(numeroPositivo>0){
            sumaPositivos+=numeroPositivo;
            cantidadPositivos++;
            System.out.println("Ingrese un nuevo número positivo: ");
            numeroPositivo= sc.nextDouble();
        }

        if (cantidadPositivos==0){
            System.out.println("No se ingresaron números positivos.");
        }else{
        mediaPositivos=sumaPositivos/cantidadPositivos;
        System.out.println("La media de los números positivos ingresados es: "+mediaPositivos);
        }

    }

}
