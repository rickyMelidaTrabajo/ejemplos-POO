#include "Punto.h";

Punto::Punto()
{
    this->coord_x = 0.0;
    this->coord_y = 0.0;
};
Punto::Punto(double coord_x, double coord_y)
{
    this->coord_x = coord_x;
    this->coord_y = coord_y;
};
double Punto::getX()
{
    return this->coord_x;
};
void Punto::setX(double nueva_coord_x)
{
    this->coord_x = nueva_coord_x;
};
double Punto::getY()
{
    return this->coord_y;
};
void Punto::setY(double nueva_coord_y)
{
    this->coord_y = nueva_coord_y;
};