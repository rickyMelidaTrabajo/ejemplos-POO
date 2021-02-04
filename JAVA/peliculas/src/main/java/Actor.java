/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo Mendez
 */
public class Actor {
    private String nombre;
    private int nacimiento;
    String mostrarActor;
    
    public Actor() {
        this.nombre = "";
        this.nacimiento = 0;
    }
    
    public Actor(String nombre, int nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }
    
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getNacimiento() {
        return this.nacimiento;
    }
    
    public void setNacimiento(int nacimiento) {
        this.nacimiento = nacimiento;
    }
    
    public void mostrarActor() {
        System.out.println("El nombre del autor es " + this.getNombre());
        System.out.println("Su anyo de nacimiento es " + this.getNacimiento());
    }
}
