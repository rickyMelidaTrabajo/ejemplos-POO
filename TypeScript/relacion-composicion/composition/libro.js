var Libro = /** @class */ (function () {
    function Libro(title, isbn, autor, yearPublication) {
        this.title = title;
        this.isbn = isbn;
        this.autor = autor;
        this.yearPublication = yearPublication;
    }
    Libro.prototype.getTitle = function () {
        return this.title;
    };
    Libro.prototype.setTitle = function (newTitle) {
        this.title = newTitle;
    };
    Libro.prototype.getIsbn = function () {
        return this.isbn;
    };
    Libro.prototype.getAutor = function () {
        return this.autor;
    };
    Libro.prototype.setAutor = function (newAutor) {
        this.autor = newAutor;
    };
    Libro.prototype.getYearPublication = function () {
        return this.yearPublication;
    };
    Libro.prototype.setYearPublication = function (newYearPublication) {
        this.yearPublication = newYearPublication;
    };
    return Libro;
}());
