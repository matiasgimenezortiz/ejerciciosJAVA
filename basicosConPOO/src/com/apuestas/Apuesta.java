package com.apuestas;

public class Apuesta implements Constantes{
    private double apuestaTotal;

    public Apuesta(){
        apuestaTotal=0;
    }

    public void aumentarApuestaTotal(double dinero){
        apuestaTotal+=dinero;
    }

    public void vaciarApuestaTotal(){
        apuestaTotal=0;
    }

    public void fechas(){

        Partido resultados=new Partido();
        String partidos[];

        for(int i=0;i<NUMERO_FECHAS;i++){
            //APUESTA
            for(int j=0;j<JUGADORES.length;j++){
                if(JUGADORES[j].puedeApostar()){
                    JUGADORES[j].pagarApuesta();
                    JUGADORES[j].generarResultados();
                    aumentarApuestaTotal(DINERO_CADA_FECHA);
                }else{
                    JUGADORES[j].reiniciarResultados();
                }
            }
            //PARTIDO
            resultados.generarResultados();
            partidos=resultados.getPartidos();


            //COMPROBACION
            for(int j=0;j<JUGADORES.length;j++){
                if(JUGADORES[j].haAcertadoApuesta(partidos)){
                    JUGADORES[j].ganaApuesta(apuestaTotal);
                    vaciarApuestaTotal();
                }
            }
            System.out.println("");
            System.out.println("");

            System.out.println(toString());

            System.out.println("");
            System.out.println("");
        }

        for(int i=0;i<JUGADORES.length;i++){
            System.out.println(JUGADORES[i]);
        }

    }



    @Override
    public String toString() {
        return "En la apuesta total hay: $" +apuestaTotal+" pesitos argentinos!";
    }


}
