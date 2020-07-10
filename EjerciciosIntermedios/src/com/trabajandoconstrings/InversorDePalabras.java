package com.trabajandoconstrings;

import javax.swing.*;

public class InversorDePalabras {
    public static void main(String[] args) {
        String frase = "";
        String invertida="";

        frase = JOptionPane.showInputDialog("Por favor, ingrese la frase que quiere invertir");
        for(int i=frase.length();i>0;i--){
            invertida=invertida + frase.charAt(i-1);
        }
        JOptionPane.showMessageDialog(null,"La frase invertida es: "+invertida);
    }
}
