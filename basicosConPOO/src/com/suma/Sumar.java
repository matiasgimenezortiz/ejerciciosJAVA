package com.suma;

public class Sumar {
    private int val1, val2;

    public Sumar(int val1, int val2){
        this.val1= val1;
        this.val2= val2;
    }

    public int operar(){
        int resultado;
        resultado = val1 + val2;
        return resultado;
    }

}
