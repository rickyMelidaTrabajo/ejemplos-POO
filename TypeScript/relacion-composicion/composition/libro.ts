import Pagina from "./pagina.ts";

export class Libro {		

    private title: string;
    private isbn: number;
    private autor: string;
    private yearPublication: number;
	
    //Atributos representando la relacion de composicion
    private paginas: Array<Paginas>;
    private numeroPaginas: number;

    constructor(title: string, isbn: number, autor: string, yearPublication: number) {
        this.title = title;
        this.isbn = isbn;
        this.autor = autor;
        this.yearPublication = yearPublication;
    	//Reservamos espacio en memoria para el objeto "array"
	this.paginas = new Paginas[999];
	//Reservamos espacio en memoria para las paginas
	for(let i=0; i<999;i++){
		this.paginas[i] = new Pagina("", 0);
	}
    }

    getTitle():string {
        return this.title;
    }

    setTitle(newTitle: string) {
        this.title = newTitle;
    }

    getIsbn(): number {
        return this.isbn;
    }

    setIsbn(newIsbn: number) {
    	this.isbn = newIsbn;
    }

    getAutor(): string {
        return this.autor;
    }

    setAutor(newAutor: string) {
        this.autor = newAutor;
    }

    getYearPublication(): number {
        return this.yearPublication;
    }

    setYearPublication(newYearPublication: number) {
        this.yearPublication = newYearPublication;
    }

    getNumeroPagina(): number {
    	return this.numeroPaginas;
    }

    addPage(newPage: Pagina) {
    	if(this.numeroPaginas < 999) {
		this.paginas[this.numeroPaginas] = newPage;
		this.numeroPaginas++;
	}
    }

    getPaginaNumero(pageNumber: number): Pagina {
	for(let i:number = 0; i < this.numeroPaginas; i++) {
		if(this.paginas[i].getNumero() == pageNumber) {
			return this.paginas[i];
		}
	}
	return null;
    }
}
