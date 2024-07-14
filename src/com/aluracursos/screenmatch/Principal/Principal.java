package com.aluracursos.screenmatch.Principal;

import com.aluracursos.screenmatch.calculos.CalculadoraDeTiempo;
import com.aluracursos.screenmatch.calculos.FiltroRecomendacion;
import com.aluracursos.screenmatch.modelos.Episodio;
import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println(miPelicula.getTotalDelasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Serie casaDragon = new Serie("Casa de los dragones",2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();

        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.setDuracionEnMinutos(180);

        CalculadoraDeTiempo calculadora =  new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        calculadora.incluye(otraPelicula);
        System.out.println("Tiempo para ver tus titulos favoritos: " + calculadora.getTiempoTotal() + " minutos");

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setNombre("La casa de papel periodico");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(50);


        filtroRecomendacion.filtra(episodio);
//*************************************************************************
        var peliculaDeMiguel = new Pelicula("Wall-e", 2001);
        peliculaDeMiguel.setDuracionEnMinutos(125);

        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>(); // el primer dato entre llaves definen el tipo de datos que podemos aceptar
        listaDePeliculas.add(peliculaDeMiguel);
        listaDePeliculas.add(miPelicula);
        listaDePeliculas.add(otraPelicula);

        System.out.println("Tamaño de la lista" + listaDePeliculas.size());
        System.out.println("La primera pelicula es " + listaDePeliculas.getFirst());
        System.out.println("La primera pelicula es " + listaDePeliculas.get(0).getNombre());

        System.out.println("toString de La Pelicul:" + listaDePeliculas.get(0).toString()); //nos da la ubicacion del objeto en la memoria del equipo









    }
}
