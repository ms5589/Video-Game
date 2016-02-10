import greenfoot.*; 
import java.lang.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/** 
* <Part2.java> 
* <Sagar Mehta/ Thus 12:30-2:20> 
* 
* <Bullet class will move and will try to harm the object Fish> 
*/ 
public class Bullet extends Sea
{
    int countLife=0;
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
       
        move(-2);
        randomTurn(); 
        lookForHorse();
    }
    /* temp1 will return nothing and it will eat the object fish for touching five times
     * @param no parameters
       
       */
    public void temp1(Class clss)
    {
        
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null) {
            Greenfoot.delay(23); 
            countLife++;
            if(countLife==5){    
            
                getWorld().removeObject(actor);
                getWorld().addObject(new Gameover(), 300, getWorld().getHeight()/2);
                Greenfoot.stop();
            }
        }
    }
    /*lookForHorse method will look for the fish object
     * return nothing
     * @param no parameters
       */  
    
    public void lookForHorse(){
    
        if(canSee(Fish.class)){
            
            temp1(Fish.class);
            
        }
    }
        //turn(2);//getWorld().addObject( new Bullet(), 500,getWorld().getHeight()/2);// Add your action code here.
    /*randomTurn will make Bullet object to make random turns
     * return nothing
     * @param no parameters
       */    
    public void randomTurn()
        {
            if ( Greenfoot.getRandomNumber(100) < 10 )
            {
                turn( Greenfoot.getRandomNumber(91)-45 );
            }
        }
}
