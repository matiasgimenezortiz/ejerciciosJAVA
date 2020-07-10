package com.cine;

public class Sala {
    private Butaca[][] butacas;
    private double precio;
    private Pelicula pelicula;

    public Sala(int filas, int columnas, double precio, Pelicula pelicula) {
        butacas = new Butaca[filas][columnas];
        this.precio = precio;
        this.pelicula = pelicula;
        rellenarButacas();
    }

    public Butaca[][] getButacas() {
        return butacas;
    }

    public void setButacas(Butaca[][] butacas) {
        this.butacas = butacas;
    }

    public void setButaca(Butaca butaca) {
        butacas[butacas.length - butaca.getFila()][butaca.getColumna() - 'A'] = butaca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    private void rellenarButacas() {
        int fila = butacas.length;

        for (int i = 0; i < butacas.length; i++) {
            for (int j = 0; j < butacas[i].length; j++) {
                butacas[i][j] = new Butaca(fila, (char) ('A' + j));
            }
            fila--;
        }
    }

    public boolean existeButacaLibre() {
        boolean hayUnaLibre = false;
        for (int i = 0; i < butacas.length; i++) {
            for (int j = 0; j < butacas[i].length; j++) {
                if (!butacas[i][j].isOcupado()) {
                    hayUnaLibre = true;
                    break;
                }
            }
        }
        return hayUnaLibre;
    }

    public void mostrarButacas() {
        System.out.println("Butacas libres son mostradas con letra L. Butacas ocupadas con letra O:");
        System.out.print("  | ");
        for (int tituloColumnas = 0; tituloColumnas < butacas.length; tituloColumnas++) {
            System.out.print((char) ('A' + tituloColumnas) + " | ");
        }

        System.out.println();
        for (int i = 0; i < butacas.length; i++) {
            System.out.print(butacas.length - i + " | ");
            for (int j = 0; j < butacas[i].length; j++) {
                if (butacas[i][j].isOcupado()) {
                    System.out.print("O | ");
                } else {
                    System.out.print("L | ");
                }
            }
            System.out.println();
        }
    }

    public boolean isButacaLibre(int fila, char columna) {
        return !butacas[butacas.length - fila][columna - 'A'].isOcupado();
    }
}
