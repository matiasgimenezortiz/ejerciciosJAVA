package com.raices;

import javax.swing.*;

public class Raices {
    private double a, b, c, raizUno, raizDos;
    private boolean dosRaices = false, tieneSolucion = false;

    public Raices(double a, double b, double c) {
        setA(a);
        setB(b);
        setC(c);
    }

    private void setA(double a) {
        this.a = a;
    }

    private void setB(double b) {
        this.b = b;
    }

    private void setC(double c) {
        this.c = c;
    }

    private double getDiscriminante() {
        return (Math.pow(b, 2) - (4 * a * c));
    }

    private double obtenerRaizUno() {
        return ((-b) + Math.sqrt(getDiscriminante())) / (2 * a);
    }

    private double obtenerRaizDos() {
        return ((-b) - Math.sqrt(getDiscriminante())) / (2 * a);
    }

    public void calcularRaices() {
        if (getDiscriminante()>=0) {
            raizUno = obtenerRaizUno();
            if (getDiscriminante()>0) {
                raizDos = obtenerRaizDos();
                System.out.println("La ecuación tiene dos raices:");
                System.out.println("Las raices son: " + raizUno + " y " + raizDos);

            }else{
                System.out.println("La ecuación tiene solo una raiz:");
                System.out.println("La raiz es: " + raizUno);
            }
        } else {
            System.out.println("La ecuación no tiene solución real...");
        }
    }
}
