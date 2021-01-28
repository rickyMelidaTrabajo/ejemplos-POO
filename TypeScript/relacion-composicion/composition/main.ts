import Pagina from "./pagina.ts";
import Libro from "./libro.ts";

let el_quijote = new Libro("Don Quijote de la mancha", 1234567890, "Miguel de Cervantes", 1605);
let pagina1 = new Pagina("En un lugar de la Mancha, de cuyo nombre ...", 1);
let pagina2 = new Pagina("... no ha mucho tiempo que vivian hidalgo de los de lanza en astillero, adarga antigua, rocin flaco y galgo corredor ...", 2);

el_quijote.anyadirPagina();
