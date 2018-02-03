import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ins here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ins extends World
{

    int count = 0;
    /**
     * Constructor for objects of class Ins.
     * 
     */
    public Ins()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(850, 567, 1);  
    }
    
    
    public void act(){
        
        count++;
        
        if(count > 250){
            Greenfoot.setWorld(new MyWorld());
        }
        
    }
}
