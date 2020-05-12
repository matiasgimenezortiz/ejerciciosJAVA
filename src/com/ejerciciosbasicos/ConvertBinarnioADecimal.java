package com.ejerciciosbasicos;

import java.util.Scanner;

/**
 * Ejercicio que convierte un número binario en decimal
 * El número debe estar comprendido entre 0 y 255
 */

public class ConvertBinarnioADecimal {
    public static void main(String[] args) {
        //Se define el método de entrada del valor en decimal
        Scanner sc = new Scanner(System.in);

        //Definimos un array donde guardaremos el valor en binario
        int[] binario=new int[8];

        int numero;

        //Se ingresa el número decimal
        System.out.println("Por favor, ingrese el número en sistema decimal. El mismo debe estar entre 0 y 255");
        numero=sc.nextInt();
        while(numero<0 ||numero>255){
            System.out.println("Número incorrecto, intente nuevamente:");
            numero=sc.nextInt();

        }

        //Se llama a metodo que lo transforma en binario
        binario=convertirBinario(numero);

        //Se imprime el número en binario
        for (int i=0;i<binario.length;i++){
            System.out.print(binario[i]);
        }
    }

    public static int[] convertirBinario(int numero){
        int[] arreglo = new int[8];
        int posicion=7,resto=0;
        if (numero==0) {
            arreglo[posicion]=0;
        }else
            while (numero!=0){
                resto=numero%2;
                arreglo[posicion]=resto;
                posicion--;
                numero/=2;
            }
        return arreglo;
    }

}
