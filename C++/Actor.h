#ifndef ACTOR_H
#define ACTOR_H1

class Actor {

	private:
		char nombre[30];
		int nacimiento;

	public:
		Actor();
		Actor(char [], int);
		char* getNombre();
		void setNombre(char[]);
		int getNacimiento();
		void setNacimiento(int);
		void mostrarActor();
};

#endif
