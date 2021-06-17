package src.peliculas;

public class Pelicula{

private int id;
private String nombre;
private int anio;
private String categoria;



public Pelicula ( int id, String nombre, String categoria, int anio){
    this.id =  id;
    this.nombre =  nombre;
    this.categoria =  categoria;
    this.anio =  anio;
    

}

public Pelicula ( int id, String nombre,  String categoria){
    this( id, nombre, categoria, 0);

}

//Getters and Setters

public int getId (){
    return id;
}

public String getNombre (){
    return nombre;
}

public int getAnio (){
    return anio;
}

public String getCategoria (){
    return categoria;
}


public void setNombre ( String nombre){
    this.nombre = nombre;
}

public void setAnio ( int anio) {
    this.anio = anio;
}

public void setCategoria (String categoria){
    this.categoria = categoria;
}



public String getInformacion(){
        String resultado = "Id: "+id+" Nombre de la Pelicula: " + nombre+" Año: "+anio+" Categoria: "+categoria;
        return resultado;
    }

}