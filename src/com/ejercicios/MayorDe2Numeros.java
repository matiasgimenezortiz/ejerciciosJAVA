package com.ejercicios;

import java.util.Scanner;

/**
 * Ejercicio que implementa un método que recibe como argumento dos números enteros y devuelve el mayor
 *
 */

public class MayorDe2Numeros {
    public static void main(String[] args) {
        int numeroUno,numeroDos,numeroMayor;
        Scanner sc=new Scanner(System.in);
        System.out.println("Por favor ingrese el primer número: ");
        numeroUno=sc.nextInt();
        System.out.println("Por favor ingrese el segundo número: ");
        numeroDos=sc.nextInt();

        numeroMayor= numeroMaximo(numeroUno,numeroDos);
        System.out.println("El número mayor es: "+numeroMayor);
    }

    static int numeroMaximo(int numeroUno,int numeroDos){
        if(numeroUno>numeroDos){
            return numeroUno;
        }else{
            return numeroDos;
        }
    }
}
