import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/** 
* <Part2.java> 
* <Sagar Mehta/ Thus 12:30-2:20> 
* 
* <Food class will earn the points to the fish object and help them to win the game> 
*/ 
public class Food extends Sea
{
    /**
     * Act - do whatever the Food wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       randomTurn();
       turnAtEdge(); 
       move(-4);// Add your action code here.
    }  
    /*method will allow to make random turns
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
    /*method will allow object to turn at the edge
     * returns nothing
     * @param no parameters
       */
    public void turnAtEdge()
        {
           if ( atWorldEdge() )
           {
               turn(17);
            } 
    } 
}
