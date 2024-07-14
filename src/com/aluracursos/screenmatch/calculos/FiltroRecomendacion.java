package com.aluracursos.screenmatch.calculos;

public class FiltroRecomendacion {
    
     public void  filtra(Clasificacion clasificacion){
        if (clasificacion.getClasificacion() >= 4){
            System.out.println("Lo mas popular!");
            } else if (clasificacion.getClasificacion() >= 2) {
                System.out.println("Muchos lo estan viendo!");

                } else {
                    System.out.println("Podría interesarte!");
                }
    }
}
