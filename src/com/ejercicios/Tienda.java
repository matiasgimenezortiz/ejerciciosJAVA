package com.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio que carga las ventas de un mes de un negocio.
 * Luego cuenta y muestra cuantas ventas fueron de mas de $2k.
 */

public class Tienda {
    public static void main(String[] args)
    {
        double ventas[] = new double[30];
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, ingrese las ventas: ");
        for(int i=0; i<ventas.length;i++)
        {
            System.out.println("Ingrese abajo la venta número "+(i+1)+":");
            ventas[i]=(sc.nextDouble());
        }
        int k =0;
        int cantventas = 0; //C
        while (k<ventas.length)
        {
            if (ventas[k]>2000)
            {
                System.out.println("La venta "+k+" fue de más de $2k, más precisamente de $"+ventas[k]);
                cantventas++;
            }
            k++;
        }
        System.out.println("La cantidad de ventas mayores a $2K del corriente mes fue de: "+cantventas);
    }
}
