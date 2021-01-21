/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
import java.lang.Math;

public class CircunferenciaCentrada {
    private final static double PI = 3.1416;
    private double radio;
    private Punto centro;
    
    public CircunferenciaCentrada() {
        this.radio = 0.0;
        this.centro = new Punto();
    }
    
    public CircunferenciaCentrada(double radio, double coord_x, double coord_y) {
        this.radio = radio;
        this.centro = new Punto(coord_x, coord_y);
    }
    
    public double getRadio() {
        return this.radio;
    }
    
    public void setRadio(double nueva_radio) {
        this.radio = nueva_radio;
    }
    
    public double getDiametro (){
        return (2 * this.radio);
    }
    public void setDiametro (double nuevo_diametro){
        this.radio = nuevo_diametro / 2;
    }
    public double getLongitud (){
        return (this.radio * 2 * PI);
    }
    public void setLongitud (double nueva_longitud){
        this.radio = nueva_longitud / (2 * PI);
    }
    public double getArea (){
        return (this.radio * this.radio * PI);
    }
    public void setArea (double nuevo_area){
        this.radio = Math.sqrt (nuevo_area )/ PI;
    }
    public double getXCentro (){
        return (this.centro.getX());
    }
    public void setXCentro (double nueva_coord_x){
        this.centro.setX (nueva_coord_x);
    }
    public double getYCentro (){
        return this.centro.getY();
    }
    public void setYCentro (double nueva_coord_y){
        this.centro.setY (nueva_coord_y);
    }
    public void trasladarCircunferenciaCentrada (double trasl_x, double trasl_y){
        this.centro.setX(this.centro.getX() + trasl_x);
    this.centro.setY(this.centro.getY() + trasl_y);
    }
}
    
