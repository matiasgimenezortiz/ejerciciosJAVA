package com.cine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pelicula nuevaPeli=new Pelicula("El silencio de los culpables",90,18,"Juan Chotalar");
        Espectador nuevoEspectador=new Espectador("Juan Perez",19,66);

        Sala salaNueva=new Sala(8,8,55,nuevaPeli);
        venderButaca(salaNueva,nuevoEspectador);
    }

    public static void venderButaca(Sala sala, Espectador espectador){
            if(espectador.tieneEdadMinima(sala.getPelicula())&&espectador.tieneDinero(sala)) {
                Scanner sc = new Scanner(System.in);
                sala.mostrarButacas();
                int filaElegida;
                char columnaElegida;

                if (sala.existeButacaLibre()) {
                    do {
                        System.out.println("Ingrese fila y columna elegidas:");
                        System.out.println("Fila: ");
                        filaElegida = sc.nextInt();
                        System.out.println("Columna: ");
                        columnaElegida = sc.next().toUpperCase().charAt(0);
                        if (!sala.isButacaLibre(filaElegida, columnaElegida)) {
                            System.out.println("La fila y/o columna elegidas está ocupada... intente nuevamente");
                        }
                    }
                    while (!sala.isButacaLibre(filaElegida, columnaElegida));

                    Butaca butacaNueva = new Butaca(filaElegida, columnaElegida);
                    butacaNueva.setEspectador(espectador);
                    sala.setButaca(butacaNueva);
                    espectador.setDinero(espectador.getDinero() - sala.getPrecio());
                    System.out.println("Felicidades, butaca vendida!");
                    sala.mostrarButacas();
                }
            }
            else
                if(!espectador.tieneEdadMinima(sala.getPelicula())){
                    System.out.println("Lo sentimos, no tiene la edad suficiente para ver esta pelicula");
                }
                else
                    if (!espectador.tieneDinero(sala)){
                        System.out.println("Lo sentimos, no tiene dinero suficiente...");
                    }
                }
            }