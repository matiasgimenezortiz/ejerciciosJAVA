package com.ejercicios;

import java.util.Scanner;

/**
 * Este ejercicio toma la cantidad de piezas que compra un cliente.
 * Según la cantidad de piezas, deberá pagar cierto monto.
 * Costo estándar: $5 por cada pieza
 * Costo para más de 50 piezas: $4,5
 * Costo para más de 100 piezas: $4
 */

public class CostoPan {
    public static void main(String[] args) {
        /**
         * Defino e inicializo las variables que guardaran
         * cantidad de piezas a comprar, costos unitarios y total
         */
        int cantPiezas=0;
        double costoUnitario=5;
        double costoTotal=0;

        /**
         * Se solicita se ingrese la cantidad de piezas a comprar
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de piezas a comprar: ");
        cantPiezas= sc.nextInt();

        /**
         * Se calcula la cantidad de piezas a comprar
         */
        if (cantPiezas >50 && cantPiezas<=100){
            costoUnitario=4.5;
        }
        else if (cantPiezas>100){
            costoUnitario=4;
        }
        costoTotal=costoUnitario*cantPiezas;

        /**
         * Muestra costo total a pagar
         */
        System.out.println("El costo total a pagar es: $"+costoTotal);
    }
}
