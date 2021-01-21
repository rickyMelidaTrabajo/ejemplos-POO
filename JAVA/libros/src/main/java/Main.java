/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class Main {
    //Fichero “Principal_EjemploLibroPagina.java”

    public static void main(String[] args) {
//Declaración y definición de objetos
        Libro el_quijote = new Libro("Don Quijote de la Mancha",
                1234567890, "Miguel de Cervantes", 1605);
        Paginas pagina1 = new Paginas("En un lugar de la Mancha, de cuyo nombre ...", 1);
        Paginas pagina2 = new Paginas("...no ha mucho tiempo que vivian hidalgo de los de lanza en astillero, adarga antigua, rocin flaco y galgo corredor ...", 2);
//Pasamos al objeto Libro los objetos del tipo Pagina
        el_quijote.anyadirPagina(pagina1);
        el_quijote.anyadirPagina(pagina2);
        for (int i = 1; i <= el_quijote.getNumeroPaginas(); i++) {
            System.out.println(el_quijote.getPaginaNumero(i).getContenido());
        }
    }

}
