class Libro {
    private title: string;
    private isbn: number;
    private autor: string;
    private yearPublication: number;

    constructor(title: string, isbn: number, autor: string, yearPublication: number) {
        this.title = title;
        this.isbn = isbn;
        this.autor = autor;
        this.yearPublication = yearPublication;
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

}