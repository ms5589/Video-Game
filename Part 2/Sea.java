import greenfoot.*;
import java.awt.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/** 
* <Part 2.java> 
* <Sagar Mehta / Thus 12:30-2:20> 
* 
* <This class will define the different methods such as act, turn and turn at the edge> 
*/ 

public class Sea extends Actor
{
    /**
     * Act - do whatever the Sea wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int WALKING_SPEED=5;
    public int x=0;
    public void act() 
    {
       // Add your action code here.
    }     
    /*Method atWorldEdge will return the boolean and will allow object to turn back at the edge
     * @param no parameters
       */
    public boolean atWorldEdge()
    {
        if(getX() < 20 || getX() > getWorld().getWidth() - 20)
            return true;
        if(getY() < 20 || getY() > getWorld().getHeight() - 20)
            return true;
        else
            return false;
    }
    
    
    /**
     * Constructor for Planets - nothing to do.
     */
    public Sea()
    {
    }

    /**
     * Act - empty method. Planets have no default action.
     */
    
    
    /**
     * Turn 'angle' degrees towards the right (clockwise).
     */
    public void turn(int angle)
    {
        setRotation(getRotation() + angle);
    }
    

    /**
     * Move forward in the current direction.
     */
    public void move()
    {
        double angle = Math.toRadians( getRotation() );
        int x = (int) Math.round(getX() + Math.cos(angle) * WALKING_SPEED);
        int y = (int) Math.round(getY() + Math.sin(angle) * WALKING_SPEED);
        
        setLocation(x, y);
    }

    
    /**
     * Test if we are close to one of the edges of the world. Return true is we are.
     */
    
    
    
    /**
     * Return true if we can see an object of class 'clss' right where we are. 
     * False if there is no such object here.
     */
    public boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }

    
    /**
     * Try to eat an object of class 'clss'. This is only successful if there
     * is such an object where we currently are. Otherwise this method does
     * nothing.
     */
    
    public void eat(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null) 
        {
            getWorld().removeObject(actor);
            
        }
    }
    
    /*Method temp will return nothing and will allow object to eat another object
    * @param no parameters
    */
      
    public void temp(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null) {
            
            //actor.setImage("explosion-big.png");  
            //Greenfoot.playSound("Explosion.wav");
            //Greenfoot.delay(85);
            getWorld().removeObject(actor);
            
          }
    }
    
}
