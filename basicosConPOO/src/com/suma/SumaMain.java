package com.suma;

import javax.swing.*;

public class SumaMain {
    public static void main(String[] args) {
        int valor1,valor2,resultadoSuma;
        valor1=Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor, ingrese el primer valor a sumar:"));
        valor2=Integer.parseInt(JOptionPane.showInputDialog(null,"Por favor, ingrese el segundo valor a sumar:"));

        Sumar suma = new Sumar(valor1,valor2);
        resultadoSuma = suma.operar();

        JOptionPane.showMessageDialog(null,"El resultado de la suma es: "+resultadoSuma);

    }
}
