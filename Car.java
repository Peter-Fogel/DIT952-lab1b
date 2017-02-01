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
public abstract class Car implements Movable {
    
    public enum Direction{UP,RIGHT,DOWN,LEFT};
    public Direction dir=Direction.RIGHT;
    protected int x = 0, y = 0;
    protected boolean turboOn;
    protected int nrDoors; // Number of doors on the car
    protected double enginePower; // Engine power of the car
    protected double currentSpeed; // The current speed of the car
    protected Color color; // Color of the car
    protected String modelName; // The car model name
 
    /**Returns the numbers of doors of the car*/
    public int getNrDoors(){
      return nrDoors;
    }

    /**Returns the engine power of the car */
    public double getEnginePower(){
      return enginePower;
    }

    /**Returns the current speed of the car.*/
    public double getCurrentSpeed(){
      return currentSpeed;
    }

    /**Returns the colour of the car*/
    public Color getColor(){
      return color;
    }

    /**Used to set the color of the car*/
    public void setColor(Color clr){
      color = clr;
    }

    /**Sets current speed to 0.1*/
    public void startEngine(){
      currentSpeed = 0.1;
    }

    /**Sets current speed to 0*/
    public void stopEngine(){
      currentSpeed = 0;
    }    

    /**Should be implemented in all subclasses to Car to reflect the speed factor of that particular model.*/
    abstract public double speedFactor();

    /**Should be implemented in all subclasses to Car to decrement the speed of that particular model.*/
    abstract public void incrementSpeed(double amount);

    /**Should be implemented in all subclasses to Car to increment the speed of that particular model.*/
    abstract public void decrementSpeed(double amount);
    
    /**Gas can only increase the currentSpeed given an amount within [0,1]*/
    public void gas(double amount){
        if(amount<0 || amount>1)
        {
            
            throw new IllegalArgumentException("Outside of [0,1]");
        }
        incrementSpeed(amount);
    }
    
    /**brake can only decrease the currentSpeed given an amount within [0,1]*/
    public void brake(double amount){
        if(amount<0 || amount>1)
        {
            throw new IllegalArgumentException("Outside of [0,1]");
        }
        decrementSpeed(amount);
    }

    /**Moves the car towards the right direction*/
    @Override    
    public void move() {
      if(dir==Direction.LEFT){
        x-=currentSpeed;
      }

      else if(dir==Direction.UP){
        y+=currentSpeed;  
      }
       
      else if(dir==Direction.RIGHT){
        x+=currentSpeed; 
      }
          
      else if(dir==Direction.DOWN){
        y-=currentSpeed;
      }
    }

    /**Changes the direction 90 degrees to the left*/
    @Override
    public void turnLeft() {
      
      if(dir==Direction.LEFT){
        dir=Direction.DOWN;
      }

      else if(dir==Direction.UP){
        dir=Direction.LEFT;  
      }
       
      else if(dir==Direction.RIGHT){
        dir=Direction.UP; 
      }
          
      else if(dir==Direction.DOWN){
        dir=Direction.RIGHT;
      }
    }

    /**Changes the direction 90 degrees to the right*/
    public void turnRight(){
      if(dir==Direction.LEFT){
        dir=Direction.UP;
      }

      else if(dir==Direction.UP){
        dir=Direction.RIGHT;  
      }
       
      else if(dir==Direction.RIGHT){
        dir=Direction.DOWN; 
      }
          
      else if(dir==Direction.DOWN){
        dir=Direction.LEFT;
      }
    }
}