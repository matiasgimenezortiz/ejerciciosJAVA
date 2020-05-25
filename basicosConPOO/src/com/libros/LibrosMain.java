package com.libros;

public class LibrosMain {
    public static void main(String[] args) {
        Libro libro1=new Libro(3456789,"Principios de Java","Pedro Gomez",456);
        Libro libro2=new Libro(582347802,"Programacion avanzada","Patricia Perez",455);

        System.out.println(libro1.toString());
        System.out.println(libro2.toString());

        System.out.println();

        if(libro1.getCantPaginas()>libro2.getCantPaginas()){
            System.out.println("El libro "+libro1.getNombreLibro()+" tiene más páginas que el otro");
        }else{
            System.out.println("El libro "+libro2.getNombreLibro()+ "tiene más páginas que el otro");
        }


    }
}
