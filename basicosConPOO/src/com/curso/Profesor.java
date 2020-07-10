package com.curso;

import java.util.Random;

public class Profesor extends Persona {
    Random aleatorio = new Random();
    private String materia;

    public Profesor() {
        super();
        super.setEdad(aleatorio.nextInt(42) + 23); //Edad minima 23 años. Edad máxima 65 años (23+42)
        materia = Clase.MATERIAS[aleatorio.nextInt(3)];
        disponibilidad();
    }

    @Override
    public void disponibilidad() {
        int probabilidad = aleatorio.nextInt(100);
        super.setPresente(probabilidad > 20);
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
