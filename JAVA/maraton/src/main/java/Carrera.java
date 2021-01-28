/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ricky
 */
public class Carrera {
    private int distance;
    private int round;
    private long date;
    
    public void Carrera() {
        this.distance = 0;
        this.round = 0;
        this.date = 0;
    }
    
    public void Carrera(int distance, int round, long date) {
        this.distance = distance;
        this.round = round;
        this.date = date;
    }
    
    public int getDistance() {
        return this.distance;
    }
    
    public void setDistance(int newDistance) {
        this.distance = newDistance;
    }
    
    public int getRound() {
        return this.round;
    }
    
    public void setRound(int newRound) {
        this.round = newRound;
    }
    
    public long getDate() {
        return this.date;
    }
    
    public void setDate(long newDate) {
        this.date = newDate;
    }
}
