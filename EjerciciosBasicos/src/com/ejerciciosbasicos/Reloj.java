package com.ejerciciosbasicos;

public class Reloj {
    int hora, minutos, segundos;

    public Reloj(){
        setHora(0);
        setMinutos(0);
        setSegundos(0);
    }

    public Reloj(int hora,int minutos, int segundos){
        setHora(hora);
        setMinutos(minutos);
        setSegundos(segundos);
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public void incrementa(){
        setSegundos(segundos+1);
        if (segundos==60){
            segundos=0;
            setMinutos(minutos+1);
            if (minutos==60){
                minutos=0;
                setHora(hora+1);
                if (hora==24){
                    hora=0;
                }
            }
        }
    }

    public void decrementa(){
        setSegundos(segundos-1);
        if (segundos==-1){
            segundos=0;
            setMinutos(minutos-1);{
                if(minutos==-1){
                    minutos=0;
                    setHora(hora-1);
                    if (hora==-1){
                        hora =23;
                    }
                }
            }
        }
    }

    public int getHora() {
        return hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void imprimirReloj(){
        System.out.println("El reloj marca las: "+getHora()+" horas, "+getMinutos()+" minutos, "+getSegundos()+" segundos.");
    }
}
