#include <cstdlib>
#include <iostream>
#include "Actor.h"
#include "Pelicula.h"

using namespace std;

int main() {

	Pelicula la_guerra("La guerra de las Galaxias", "George Lucas", 121);
	Actor mark("Mark Hamill", 1951);
	Actor harrison("Harrison Ford", 1942);
	Actor carrie("Carrie Fisher", 1956);
	Actor alec("Alec Guinness", 1914);

	la_guerra.introduceActor(mark);
	la_guerra.introduceActor(harrison);
	la_guerra.introduceActor(carrie);
	la_guerra.introduceActor(alec);

	la_guerra.mostrarPelicula();

	cout<<"Alec Guinness trabajo en "<<la_guerra.getTitulo()<<"??"<<endl;
	cout<<"La respuesta es "<<la_guerra.isActor(alec)<<endl;

	system("PAUSE");
	return 0;
}
