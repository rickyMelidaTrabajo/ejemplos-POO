#include <cstring>
#include <iostream>
#include "Actor.h"

using namespace std;

Actor::Actor() {

	strcpy(this->nombre, "");
	this->nacimiento = 0;
};

Actor::Actor(char nombre[], int nacimiento) {
	strcpy(this->nombre, nombre);
	this->nacimiento = nacimiento;
};

char* Actor::getNombre() {
	return this->nombre;
}

void Actor::setNombre(char nombre[]){
	strcpy(this->nombre, nombre);
};

int Actor::getNacimiento() {
	return this->nacimiento;
}

void Actor::setNacimiento(int nacimiento) {
	this->nacimiento = nacimiento;
}

void Actor::mostrarActor() {
	cout<<"El nombre del Actor es "<<this->getNombre()<<endl;
	cout<<"Su anyo de nacimiento es "<<this->getNacimiento()<<endl;
	cout<<endl;
}
