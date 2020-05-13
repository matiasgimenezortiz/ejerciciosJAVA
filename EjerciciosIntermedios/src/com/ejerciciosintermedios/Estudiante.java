package com.ejerciciosintermedios;

/**
 * Clase que se utilizará para crear alumnos, con atributos, setters y getters.
 */

public class Estudiante {
    private String nombre;
    private int edad;
    private boolean aprobado;

    public Estudiante(String nombre,int edad, boolean aprobado){
        ponerNombre(nombre);
        ponerEdad(edad);
        ponerAprobado(aprobado);
    }

    public void ponerNombre (String nombre){
        this.nombre=nombre;
    }

    public void ponerEdad (int edad){
        this.edad=edad;
    }

    public void ponerAprobado (boolean aprobado){
        this.aprobado=aprobado;
    }

    public String preguntarNombre(){
        return nombre;
    }

    public int preguntarEdad(){
        return edad;
    }

    public boolean preguntarAprobado(){
        return aprobado;
    }
}
