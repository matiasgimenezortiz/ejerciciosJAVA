package com.curso;

public class Main {
    public static void main(String[] args) {
        Clase nuevaClase = new Clase();
        if (nuevaClase.sePuedeDarClase()) {
            nuevaClase.contarAprobados();
            nuevaClase.imprimirAprobados();
        }
        System.out.println("Fin del programa!");
    }
}
