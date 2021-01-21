#ifdef PUNTO_H
#define PUNTO_H

class Punto
{
    //Atributos de instancia
private:
    double coord_x;
    double coord_y;


    //Constructores de instancia
public:
    Punto();
    Punto(double, double);

    //Métodos de instancia
    double getX();
    void setX(double);
    double getY();
    void setY(double)
};

#endif
