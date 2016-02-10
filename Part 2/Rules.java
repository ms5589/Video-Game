import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.*;

/** 
* <Part 2.java> 
* <Sagar Mehta / Thus 12:30-2:20> 
* 
* <This class will show/print the instruction in the world> 
*/ 

public class Rules extends World
{

    /**
     * Constructor for objects of class Rules.
     * 
     */
    public Rules()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
     super(600, 400, 1); 
     GreenfootImage i = getBackground(); 
     i.setFont(new Font("Impact", Font.BOLD,18));
     i.setColor(Color.BLACK); 
 
     
     i.drawString("Try to eat \"Yellow\" and \"Blue\" balls",60,80); 
     i.drawString("Yellow= 2points",60,110); 
     i.drawString("Blue= 1point",60,140);
     i.drawString("Red is danger (Hint: Don't touch more than 5 times)",60,170);
     i.drawString("Collect  \"30\" points to win",60,200); 
     i.drawString("If Sea-horse touches the ground, dies",60,230);
     i.drawString("(Use arrow keys to operate)",60,250);
     i.drawString("Click \"RUN\" and Hit \"SPACE\" to start the game",60,280); 
    }
    /*Method act returns nothing (void type) and it class the method check rules 
     * @param ( no parameters)
     */
    public void act(){
    
        checkRules();
    }
    /* Method checkRules will call the another world 
     * @param no parameters
     * returns nothing (void type)
       
     */
    public void checkRules(){
        String check= Greenfoot.getKey();
        
    if (check != null && "space".equals(check))
    {
      Greenfoot.setWorld(new Water());
        
     }
    }
}