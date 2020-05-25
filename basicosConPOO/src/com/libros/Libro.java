package com.libros;

import javax.swing.*;

public class Libro {
    private long isbn;
    private String nombreLibro;
    private String autor;
    private int cantPaginas;

    public Libro(long isbn,String nombreLibro, String autor, int cantidadPaginas){
        setNombre(nombreLibro);
        setIsbn(isbn);
        setAutor(autor);
        setCantPaginas(cantidadPaginas);
    }

    public void setNombre(String nombreLibro){
        this.nombreLibro=nombreLibro;
    }
    public void setIsbn(long isbn){
        this.isbn=isbn;
    }
    public void setAutor(String autor){
        this.autor=autor;
    }
    public void setCantPaginas(int cantPaginas){
        this.cantPaginas=cantPaginas;
    }

    public long getIsbn() {
        return isbn;
    }

    public String getNombreLibro() {
        return nombreLibro;
    }

    public String getAutor() {
        return autor;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public String toString(){
        return "El nombre del libro es: "+getNombreLibro()
                +" del autor: "+getAutor()
                +" con ISBN: "+getIsbn()
                +" y tiene "+ getCantPaginas()+" paginas.";
    }
}
