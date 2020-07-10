package com.area;

import javax.swing.*;

public class RectanguloMain {
    public static void main(String[] args) {
        double lado1, lado2, area;
        Rectangulo areaRectangulo;

        lado1 = Double.parseDouble(JOptionPane.showInputDialog("Por favor, ingrese el primer lado del rectangulo:"));

        lado2 = Double.parseDouble(JOptionPane.showInputDialog("Por favor, ingrese el segundo lado del rectangulo:"));

        areaRectangulo = new Rectangulo(lado1, lado2);
        area = areaRectangulo.calcularArea();

        JOptionPane.showMessageDialog(null, "El area del rectangulo es: " + area);

    }
}
