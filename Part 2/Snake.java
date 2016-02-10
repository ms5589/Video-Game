import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/** 
* <Part2.java> 
* <Sagar Mehta/ Thus 12:30-2:20> 
* 
* <Snake class will just move randomly in the world> 
*/ 
public class Snake extends Sea
{
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       //turn(-1);
    
       move(-1);
       randomTurn();
    
} 
/* this method will allow snake to move randomly
 * returns nothing
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
    


