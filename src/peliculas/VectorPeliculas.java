package src.peliculas;

import src.tienda.*;

public class VectorPeliculas {

    private Pelicula[] peliculas = new Pelicula[50];
    private int siguienteCodigo;


    public VectorPeliculas(){
        siguienteCodigo = 1;

    }

    // AGREGAR PELICULAS

    public void agragarPeliculas ( String nombre, int anio, String categoria){

        if ( siguienteCodigo > 50){
            System.out.println (" El limite de las peliculas alcanzadas");
        } 
        else{
            peliculas[ (siguienteCodigo -1) ] = new Pelicula( siguienteCodigo, nombre, categoria, anio); 
        }
              siguienteCodigo++;
    }

    public void agregarPeliculas(){
        String nombre = IngresoDatos.getTexto("Ingrese el nombre de la peliculas: ");
        int anio = IngresoDatos.getEntero("Ingrese el año de la Pelicula: ", false);
        String categoria =  IngresoDatos.getTexto(" Ingrese la categoria de la pelicula;");
        agragarPeliculas (  nombre,  anio,  categoria);
    }


    public void mostrarPeliculas (){
        System.out.println("\nPELICULAS MEMORABILIA\n");
        for ( int i = 0;  i < (siguienteCodigo-1 ); i++){
             System.out.println("-"+ i +") "+ peliculas[i].getInformacion());
        }

        
        System.out.println("\n " );
    }
        
    
    //Ordenamiento
    public void ordenarPorNombreP(boolean ascendente){
        boolean cambioP = true;

        for (int i = 1; i < (siguienteCodigo-1); i++) {
            for (int j = 0; j < (siguienteCodigo-1-i); j++) {
                //  String.compareTo(String)
                //   [-oo , + oo]
                if (ascendente){
                    cambioP= (peliculas[j].getNombre().compareTo(peliculas[j+1].getNombre()) > 0 );
                }
                else{
                    cambioP= (peliculas[j].getNombre().compareTo(peliculas[j+1].getNombre()) < 0 );
                }
                if(cambioP ){
                    //clientes i va antes que clientes j <0 descendente
                    Pelicula aux = peliculas[j];
                    peliculas[j] = peliculas[j+1];
                    peliculas[j+1]= aux;
                }
            }
        }

    }








}

