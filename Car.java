package dit952.lab.b;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package dit952.lab1;

import java.awt.Color;

/**
 *Car is intended to be used as a base for implementing different car models.
 */
public abstract class Car extends Vehicle implements Movable {
    
    
   
    protected boolean turboOn;
    protected int nrDoors; // Number of doors on the car
    protected Color color; // Color of the car
    protected String modelName; // The car model name
    protected int size;
    /**Returns the numbers of doors of the car*/
    public int getNrDoors(){
      return nrDoors;
    }



    /**Returns the colour of the car*/
    public Color getColor(){
      return color;
    }

    /**Used to set the color of the car*/
    public void setColor(Color clr){
      color = clr;
    }

   public int getSize(){
       return size;
   }

   //TODO speedfactor



   
}