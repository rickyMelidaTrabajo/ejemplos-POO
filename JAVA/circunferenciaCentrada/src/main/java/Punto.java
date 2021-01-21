/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class Punto {
    private double coord_x;
    private double coord_y;
    
    public Punto() {
        this.coord_x = 0.0;
        this.coord_y = 0.0;
    }
    
    public Punto(double coord_x, double coord_y) {
        this.coord_x = coord_x;
        this.coord_y = coord_y;
    }
    
    double getX() {
        return this.coord_x;
    }
    
    void setX(double nueva_coord_x) {
        this.coord_x = nueva_coord_x;
    }
    
    double getY(){
        return this.coord_y;
    }
    
    void setY(double nueva_coord_y) {
        this.coord_y = nueva_coord_y;
    }
    
}
