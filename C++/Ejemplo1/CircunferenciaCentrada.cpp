#include <cmath>
#include <iostream>
#include "CircunferenciaCentrada.h"
using namespace std;
//Constructores
CircunferenciaCentrada::CircunferenciaCentrada()
{
    this->radio = 0.0;
    this->centro = Punto(); //No es necesario, ya que, internamente,
    //en la propia cabecera del método,
    //se ha construido “this->centro”
};
CircunferenciaCentrada::CircunferenciaCentrada(double
                                                   radio,
                                               double
                                                   coord_x,
                                               double coord_y)
{
    this->radio = radio;
    this->centro = Punto(coord_x, coord_y);
    //Internamente ya se ha construido “this->centro” antes de entrar en el
    //cuerpo del constructor.
    //Bastaría con haber hecho “this->centro.setX(coord_x);” y
    //”this->centro.setY(coord_y);”
};

//Métodos
double CircunferenciaCentrada::getRadio()
{
    return this->radio;
};
void CircunferenciaCentrada::setRadio(double nuevo_radio)
{
    this->radio = nuevo_radio;
};
double CircunferenciaCentrada::getDiametro()
{
    return (2 * this->radio);
};
void CircunferenciaCentrada::setDiametro(double nuevo_diametro)
{
    this->radio = nuevo_diametro / 2;
};
double CircunferenciaCentrada::getLongitud()
{
    return (this->radio * 2 * PI);
};
void CircunferenciaCentrada::setLongitud(double nueva_longitud)
{
    this->radio = nueva_longitud / (2 * PI);
};
double CircunferenciaCentrada::getArea()
{
    return (this->radio * this->radio * PI);
};
void CircunferenciaCentrada::setArea(double nuevo_area)
{
    this->radio = sqrt(nuevo_area) / PI;
};
double CircunferenciaCentrada::getXCentro()
{
    return (this->centro.getX());
};
void CircunferenciaCentrada::setXCentro(double nueva_coord_x)
{
    this->centro.setX(nueva_coord_x);
};
double CircunferenciaCentrada::getYCentro()
{
    return this->centro.getY();
};
void CircunferenciaCentrada::setYCentro(double nueva_coord_y)
{
    this->centro.setY(nueva_coord_y);
};

void CircunferenciaCentrada::trasladarCircunferenciaCentrada(double trasl_x,
                                                             double trasl_y)
{
    this->centro.setX(this->centro.getX() + trasl_x);
    this->centro.setY(this->centro.getY() + trasl_y);
};