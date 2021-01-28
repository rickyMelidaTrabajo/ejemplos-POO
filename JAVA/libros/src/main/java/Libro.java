/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class Libro {
    //Atributos

    private String titulo;
    private long isbn;
    private String autor;
    private int anyoPublicacion;
//Atributos representando la relación de composición
    private Paginas[] paginas;
    private int numeroPaginas;
//Constructores

    public Libro(String titulo, long isbn, String autor, int anyoPublicacion) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.anyoPublicacion = anyoPublicacion;
        //Reservamos espacio en memoria para el objeto “array”:
        this.paginas = new Paginas[999];
        //Reservamos espacio en memoria para las páginas:
        for (int i = 0; i < 999; i++) {
            this.paginas[i] = new Paginas("", 0);
        }
        this.numeroPaginas = 0;
    }
//Metodos de instancia

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public long getIsbn() {
        return this.isbn;
    }

    public void setIsbn(long nuevo_isbn) {
        this.isbn = nuevo_isbn;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String nuevo_autor) {
        this.autor = nuevo_autor;
    }

    public int getAnyoPublicacion() {
        return this.anyoPublicacion;
    }

    public void setAnyoPublicacion(int nuevo_anyoPublicacion) {
        this.anyoPublicacion = nuevo_anyoPublicacion;
    }
//Métodos para trabajar con la clase compuesta

    public int getNumeroPaginas() {
        return this.numeroPaginas;
    }

    public void anyadirPagina(Paginas nueva_pagina) {
        if (this.numeroPaginas < 999) {
            this.paginas[this.numeroPaginas] = nueva_pagina;
            this.numeroPaginas++;
        }
    }

    public Paginas getPaginaNumero(int numero_pagina) {
        for (int i = 0; i < this.numeroPaginas; i++) {
            if (this.paginas[i].getNumero() == numero_pagina) {
                return this.paginas[i];
            }
        }
        return null;
    }
}

