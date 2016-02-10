import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/** 
* <Part2.java> 
* <Sagar Mehta/ Thus 12:30-2:20> 
* 
* <Ground class will be at the bottom of the world and if fish touches it game will end> 
*/ 
public class Ground extends Sea
{
    /**
     * Act - do whatever the Ground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     lookFish();   // Add your action code here.
    } 
    /*lookFish method will look for the fish and will try to remove the fish object
     * returns nothing
     * @param no parameters
     */
    public void lookFish()
    {
        if ( canSee(Fish.class) )
        {
             eat(Fish.class);
        Greenfoot.stop();
            }
    }
}
