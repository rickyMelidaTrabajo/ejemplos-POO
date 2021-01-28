#include <cstring>
#include <iostream>
#include "Pelicual.h"

using namespace std;

Pelicula::Pelicula() {
	strcpy(this->titulo, "");
	strcpy(this->director, "");
	this->duracion = 0;
	this->numeroActores = 0;
}

Pelicula::Pelicula(char titulo[], char director[], int duracion) {
	strcpy(this->titulo, titulo);
	strcpy(this->director, director);
	this->duracion = duracion;
	this->numeroActores = 0;
}

char* Pelicula::getTitulo() {
	return this->titulo;
}

void Pelicula::setTitulo(char nuevo_titulo[]) {
	strcpy(this->titulo, nuevo_titulo);
}

char* Pelicula::getDirector() {
	return this->director;
}

void Pelicula::setDirector(char nuevo_director[]) {
	strcpy(this->director, nuevo_director);
}

int Pelicula::getDuracion() {
	return this->duracion;
}

void Pelicula::setDuracion(int nueva_duracion) {
	this->duracion = nueva_duracion;
};

void Pelicula::mostrarPelicula() {
	cout<<"El nombre de la pelicula es "<<this->getTitulo()<<endl;
	cout<<"Su director es "<<this->getDirector()<<endl;
	cout<<"la duracion de la pelicula es "<<this->getDuracion()<<endl;
	for(int i = 0;i<this->numeroActores;i++){
		cout<<"En la peli trabaja: "<<endl;
		this->actores[i].mostrarActor();
	}
};

bool Pelicula::isActor(Actor actor) {
	bool encontrado = false;
	for(int i=0;i < numeroActores; i++) {
		if(strcmp(actor.getNombre(), this->actores[i].getNombre()) == 0&& actor.getNacimiento() == this->actores[i].getNacimiento){
			encontrado = true;
		}
	}
	return encontrado;
};

void Pelicula::introduceActor(Actor actor) {
	if(this->numeroActores < 15) {
		this->actores[this->numeroActores] = actor;
		this->numeroActores++;
	}
};
