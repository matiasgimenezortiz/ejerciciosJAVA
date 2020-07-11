package com.curso;

import java.util.Random;

public class Clase {
    public static final String[] MATERIAS = {"Matematicas", "Filosofia", "Fisica"};
    private final int MAX = 20;//Cantidad máxima de alumnos
    Alumno[] alumnos;
    Profesor profe;
    String materia;
    int cantAlumnos = 0; //Cantidad de alumnos que asistieron a clase
    int cantAprobadosVarones = 0;//Cantidad de alumnos aprobados
    int cantAprobadasChicas = 0;//Cantidad de alumnas aprobadas
    Random aleatorio = new Random();
    private int id;

    public Clase() {
        id = 1;
        profe = new Profesor();
        alumnos = new Alumno[MAX];
        creaAlumnos();
        materia = MATERIAS[aleatorio.nextInt(3)];

    }

    private void creaAlumnos() {
        for (int i = 0; i < alumnos.length; i++) {
            alumnos[i] = new Alumno();
        }
        cuentaAsistenciasAlu();
    }

    private void cuentaAsistenciasAlu() {
        for (Alumno alumno : alumnos) {
            if (alumno.isPresente()) {
                cantAlumnos++;
            }
        }
    }

    public boolean sePuedeDarClase() {
        if (!profe.isPresente()) {
            System.out.println("El profesor no está disponible, no se puede dar clase...");
            return false;
        } else if (!profe.getMateria().equals(materia)) {
            System.out.println("La materia de la clase y del profesor son distintas, no se puede dar clase...");
            return false;
        } else if (cantAlumnos < (MAX / 2)) {
            System.out.println("La cantidad de alumnos presentes es menor a la mitad, no se puede dar clase...");
            return false;
        } else
            System.out.println("Las condiciones para dar clases están dadas!");
        return true;
    }

    public void contarAprobados() {
        for (Alumno alumno : alumnos) {
            if (alumno.getCalificacion() >= 6) {
                if (alumno.getSexo() == 'M') {
                    cantAprobadosVarones++;
                } else
                    cantAprobadasChicas++;
            }
        }
    }

    public void imprimirAprobados() {
        System.out.println("Cantidad de aprobados varones: " + cantAprobadosVarones + " y aprobadas mujeres: " + cantAprobadasChicas);
        for (Alumno alumno : alumnos) {
            if (alumno.getCalificacion() >= 6) {
                System.out.println("El alumno:" + alumno.getNombre() + " " + alumno.getApellido() + " ha aprobado con nota: " + alumno.getCalificacion());
            }
        }
    }
}
