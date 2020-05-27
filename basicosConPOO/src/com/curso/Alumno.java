package com.curso;

import java.util.Random;

public class Alumno extends Persona{
    private float calificacion;
    Random aleatorio=new Random();

    public Alumno(){
        super();
        super.setEdad(aleatorio.nextInt(12)+6);//Edad mínima 6 años
        calificacion=aleatorio.nextInt(9)+1;
        disponibilidad();
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public void disponibilidad(){
        int probabilidad=aleatorio.nextInt(100);
        super.setPresente(probabilidad > 50);
    }
}
