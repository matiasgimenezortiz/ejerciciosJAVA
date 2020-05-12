package com.ejerciciosbasicos;

import java.util.Scanner;

/**
 * Ejercicio que muestra le producto de una cierta cantidad de números impares.
 * La cantidad de números impares será definida por el usuario.
 * Los impares que se multiplicarán son los primeros desde 1.
 */

public class ProductoImpares {
    public static void main(String[] args) {
        long productoImpares =1;
        int cantidadImpares = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números impares que desea sean multiplicados:");
        cantidadImpares= sc.nextInt();
        while (cantidadImpares<1){
            System.out.println("La cantidad de impares es incorrecta, por favor intente nuevamente: ");
            cantidadImpares= sc.nextInt();
        }
        for(int i=0;i<cantidadImpares;i+=1){
            productoImpares*=((i*2)+1);
        }

        System.out.println("El resultado del producto de los primeros "+cantidadImpares+" es: "+productoImpares);


    }
}
