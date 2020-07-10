package com.curso;

import java.util.Random;

public abstract class Persona {
    private final String[] NOMBRES_VAGOS = {"Juan", "Pedro", "Gilberto", "Andres", "Marcos", "Pepe", "Carlos", "Gustavo"};
    private final String[] NOMBRES_CHICAS = {"Lucrecia", "Lucia", "Julia", "Ana", "Carolina", "Lorena", "Ayelen", "Giuliana"};
    private final String[] APELLIDOS = {"Lopez", "Gimenez", "Perez", "Benitez", "Loch", "Villalba", "Araujo"};
    private final char[] SEXO = {'M', 'F'};
    private int edad;
    private String nombre;
    private String apellido;
    private char sexo;
    private boolean presente;

    public Persona() {
        Random aleatorio = new Random();
        apellido = APELLIDOS[aleatorio.nextInt(7)];
        sexo = SEXO[aleatorio.nextInt(2)];
        if (sexo == 'M') {
            nombre = NOMBRES_VAGOS[aleatorio.nextInt(8)];
        } else {
            nombre = NOMBRES_CHICAS[aleatorio.nextInt(8)];
        }
    }

    public abstract void disponibilidad();

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isPresente() {
        return presente;
    }

    public void setPresente(boolean presente) {
        this.presente = presente;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }


}
