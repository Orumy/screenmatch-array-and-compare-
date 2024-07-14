package com.aluracursos.screenmatch.Principal;

import com.aluracursos.screenmatch.modelos.Pelicula;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Titulo;

import javax.swing.text.StyledEditorKit;
import java.util.*;

public class PrincipalConListas {
    public static void main(String[] args) {

        Pelicula miPelicula = new Pelicula("Encanto", 2021);
        miPelicula.evalua(9);
        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.evalua(6);
        var peliculaDeMiguel = new Pelicula("Wall-e", 2001);
        peliculaDeMiguel.evalua(10);

        Serie casaDragon = new Serie("Casa de los dragones",2022);

        Pelicula p1 = peliculaDeMiguel; //esto no crea una nueva instancia , si no otra ruta que tambien hace referencia al mismo objeto en la memoria

//        ArrayList<Titulo> lista = new ArrayList<>(); // el primer dato entre llaves definen el tipo de datos que podemos aceptar
//        lista.add(miPelicula);
//        lista.add(otraPelicula);
//        lista.add(peliculaDeMiguel);
//        lista.add(casaDragon);

        List<Titulo> lista = new LinkedList<>(); //la interfaz list genera un modelos estandar de trabajo con los metodos ya creados
        lista.add(miPelicula);
        lista.add(otraPelicula);
        lista.add(peliculaDeMiguel);
        lista.add(casaDragon);

        for (Titulo item: lista){// no exite el comando directo
            System.out.println(item.getNombre());
            if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 3 ){ //Al agregar Pelicula  pelicula , crea una instancia de casting para evaluar
               System.out.println(pelicula.getClasificacion());
           }

//            if (item instanceof Pelicula){ //evalua si el dato es tipo Pelicula y si no lo ignora
//                Pelicula pelicula = (Pelicula) item;
//                System.out.println(pelicula.getClasificacion());
//            }
        }
        ArrayList<String> listDeArtistas = new ArrayList<>();// crea una lista de elementos
        listDeArtistas.add("Penelope Cruz");
        listDeArtistas.add("Antonio Banderas");
        listDeArtistas.add("Ricardo Darin");

        System.out.println("Lista de artistas sin ordenar" + listDeArtistas);

        Collections.sort(listDeArtistas); //el metodo sort ordena la lista  alfabeticamente
        System.out.println("Lista de artistas ordenada:" + listDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista ordenada de titulos" + lista);

        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println(lista);

    }
}
