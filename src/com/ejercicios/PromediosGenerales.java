package com.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio donde se ingresan 10 números y se muestran:
 * promedio de los positivos
 * promedio de los negativos
 * cantidad de ceros ingresados
 */

public class PromediosGenerales {
    public static void main(String[] args) {
        int cantidadPositivos=0,cantidadNegativos=0,cantidadCeros=0;
        double numero=0,sumaPositivos=0, sumaNegativos=0,promedioPositivos=0,promedioNegativos=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("El programa calculará promedios de números positivos, de negativos y contará cantidad de ceros ingresados.");
        System.out.println("Ingrese el primer número: ");
        for(int i=0; i<10;i++){
            numero = sc.nextDouble();
            if (numero>0){
                sumaPositivos+=numero;
                cantidadPositivos++;
            } else if(numero<0){
                sumaNegativos+=numero;
                cantidadNegativos++;
            }else{
                cantidadCeros++;
            }
            System.out.println("Ingrese otro número: ");
        }

        if (cantidadNegativos==0){
            System.out.println("No se han ingresado números negativos.");
        }else{
            promedioNegativos=sumaNegativos/cantidadNegativos;
            System.out.println("El promedio de números negativos es: "+promedioNegativos);
        }
        if(cantidadPositivos==0){
            System.out.println("No se han ingresado números positivos.");
        }else{
            promedioPositivos=sumaPositivos/cantidadPositivos;
            System.out.println("El promedio de números positivos es: "+promedioPositivos);
        }

        System.out.println("La cantidad de ceros ingresados es :"+cantidadCeros);
        System.out.println("Chauchis");


    }
}
