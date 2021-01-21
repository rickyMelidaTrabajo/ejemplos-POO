//Fichero CircunferenciaCentrada.h
//El único detalle que debemos tener en cuenta es incluir la “declaración” de la
//clase “Punto” en la declaración de la clase “CircunferenciaCentrada”
#ifndef CIRCUNFERENCIA_CENTRADA_H
#define CIRCUNFERENCIA_CENTRADA_H 1
#include "Punto.h"
class CircunferenciaCentrada
{
    //Constantes
private:
    const static double PI = 3.1416;
    //Atributos
private:
    double radio;
    Punto centro;
    //Constructores de instancias
public:
    CircunferenciaCentrada();
    CircunferenciaCentrada(double, double, double);
    //Métodos de instancia
    double getRadio();
    void setRadio(double);
    double getDiametro();
    void setDiametro(double);
    double getLongitud();
    void setLongitud(double);
    double getArea();
    void setArea(double);
    double getXCentro();
    void setXCentro(double);
    double getYCentro();
    void setYCentro(double);
    void trasladarCircunferenciaCentrada(double, double);
};
#endif