package com.area;

public class Rectangulo {
    double base, altura, area;

    public Rectangulo(double lado1, double lado2){
        this.base = lado1;
        this.altura = lado2;
    }

    public double calcularArea(){
        area = base * altura / 2;
        return area;
    }
}
