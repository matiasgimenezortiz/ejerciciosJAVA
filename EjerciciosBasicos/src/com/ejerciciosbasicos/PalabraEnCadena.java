package com.ejerciciosbasicos;

import javax.swing.*;

public class PalabraEnCadena {
    //El siguiente ejercicio busca una palabra o frase dentro de una cadena dada
    static String cadena, palabra;

    public static void main(String[] args) {
        ingresarCadena();
        ingresarPalabra();
        boolean test = buscarPalabra(cadena, palabra);
        if (test){
            System.out.println("Se ha encontrado la palabra "+palabra+" en la cadena ingresada");
        }
        else{
            System.out.println("No se ha encontrado la palabra en la cadena");
        }
    }

    public static void ingresarCadena() {
        cadena = JOptionPane.showInputDialog(null, "Por favor, ingrese la cadena en la que se buscará: ");
    }

    public static void ingresarPalabra() {
        palabra = JOptionPane.showInputDialog(null, "Por favor, ingrese la palabra que se buscará en la cadena: ");
    }

    public static boolean buscarPalabra(String cadena, String palabra){
        return cadena.toLowerCase().matches("(.*)"+palabra.toLowerCase()+"(.*)");
    }
}
