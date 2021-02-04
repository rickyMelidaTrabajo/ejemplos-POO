/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo Mendez
 */
public class Pelicula {
    private String titulo;
    private String director;
    private int duracion;
    
    //Atributos que van a representar la relacion de asociacion
    private Actor[] actores = new Actor[15];
    private int numeroActores;
    
    public Pelicula() {
        this.titulo = "";
        this.director = "";
        this.duracion = 0;
        this.numeroActores = 0;
    }
    
    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }
    
    public String getTitulo() {
        return this.titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getDirector() {
        return this.director;
    }
    
    public void setDirector(String director) {
        this.director = director;
    }
    
    public int getDuracion() {
        return this.duracion;
    }
    
    public void SetDuracion(int duracion) {
        this.duracion = duracion;
    }
    
    public void mostrarPelicula() {
        System.out.println("El nombre de la pelicula es " + this.getTitulo());
        System.out.println("El director es " + this.getDirector());
        System.out.println("La duracion de la pelicula es " + this.getDuracion());
        for(int i=0;i<this.numeroActores;i++) {
            System.out.println("En la pelicula trabaja ");
            this.actores[i].mostrarActor();
        }
    }
    
    public boolean isActor(Actor actor) {
        boolean encontrado = false;
        for(int i=0;i<this.numeroActores;i++) {
            if(actor.getNombre() == this.actores[i].getNombre() && actor.getNacimiento() == this.actores[i].getNacimiento()) {
                encontrado = true;
            }
        }
        return encontrado;
    }
    
    public void addActor(Actor actor) {
        if(this.numeroActores < 15){
            this.actores[this.numeroActores] = actor;
            this.numeroActores ++;
        }
    }
    
}
