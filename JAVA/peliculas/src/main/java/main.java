/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ricardo Mendez
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pelicula la_guerra = new Pelicula("La guerra de las galaxias", "George Lucas", 121);
        Actor mark = new Actor("Mark Hamil", 1942);
        Actor harrison = new Actor("Harrison Ford", 1942);
        Actor carrie = new Actor("Carrie Fisher", 1956);
        Actor alec = new Actor("Alec Guinness", 1914);
        
        la_guerra.addActor(mark);
        la_guerra.addActor(harrison);
        la_guerra.addActor(carrie);
        //la_guerra.addActor(alec);
        
        //la_guerra.mostrarPelicula();
        
        System.out.println("Trabajo Alec Guinness en " + la_guerra.getTitulo() + "??");
        System.out.println("La respuesta es " + la_guerra.isActor(alec));
    }
    
}
