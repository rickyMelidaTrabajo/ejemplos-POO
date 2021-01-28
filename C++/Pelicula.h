#ifndef PELICULA_H
#define PELICULA_H 1

#include "Actor.h"

class Pelicula {

	//Atributos de instancia
	private:
		char titulo[30];
		char director[30];
		int duracion;
	
	//Atributos que van a representar la relacion de asociacion
	Actor actores[15];
	int numeroActores;

	public:
	//Constructores
		Pelicula();
		Pelicula(char[], char[], int);
	//Metodos de instancia
		char* getTitulo();
		void setTitulo(char[]);
		char* getDirector();
		void setDirector(char[]);
		int getDuracion();
		void setDuracion(int);
		void mostrarPelicula();
		bool isActor(Actor);
		void introduceActor(Actor);
};

#endif
