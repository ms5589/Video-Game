import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/** 
* <Part2.java> 
* <Sagar Mehta/ Thus 12:30-2:20> 
* 
* <Ball class will move and also turn at the edge of the world> 
*/ 

public class Ball extends Sea
{
    /**
     * Act - do whatever the Ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private double x = 0;
    private double y = 0;
    /* act method will return nothing and it will call some methods to act the object
     * @param no parameters
       
     */
    public void act() 
    {
         move(-3);
         randomTurn();
         turnAtEdge();
     } 

     /*method randomTurn will return nothing, and it will allow ball object to make random turns
      * @param no parameters
      * 
      */
     public void randomTurn()
        {
            if ( Greenfoot.getRandomNumber(100) < 10 )
            {
                turn( Greenfoot.getRandomNumber(91)-45 );
            }
        }
     /*method turnAtedge will allow object to turn at the world edge
      * returns nothing
      * @param no parameters
      * 
      */
     public void turnAtEdge()
     {
           if ( atWorldEdge() )
           {
               turn(17);
            } 
     } 
    }  
    
   

    
    
