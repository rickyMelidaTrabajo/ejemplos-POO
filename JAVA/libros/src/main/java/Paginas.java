/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class Paginas {
    //Atributos de instancia

    private String contenido;
    private int numero;
//Constructores

    public Paginas(String contenido, int numero) {
        this.contenido = new String(contenido);
        this.numero = numero;
    }
//Metodos de instancia

    public String getContenido() {
        return this.contenido;
    }

    public void setContenido(String nuevo_contenido) {
        this.contenido = nuevo_contenido;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int nuevo_numero) {
        this.numero = nuevo_numero;
    }
}
