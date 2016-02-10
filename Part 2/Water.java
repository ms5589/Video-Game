import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/** 
* <Part 2.java> 
* <Sagar Mehta / Thus 12:30-2:20> 
* 
* <This class will set the objects in the world the instruction in the world> 
*/ 

public class Water extends World
{

    GreenfootImage bg = getBackground();
    
    /**
     * Constructor for objects of class Water.
     * 
     */
    public Water()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        //Greenfoot.setWorld(new Water());
        developeSea();
        checkKey();
        showMessage(); 
        checkKey();
    }
    /*Mathod checkKey cheks for the keys, returns nothing
     * @param, no parameters
       */
    public void checkKey() {
    
    if (Greenfoot.isKeyDown("q")){
     GreenfootImage i = getBackground(); 
     
     i.setColor(Color.BLUE); 
 
     i.drawString("Try to eat Red and Purple balls\nRed= 2points\nPurple=1point\nCollect 50 points to win\nIf fish touches ground, dies\nPress 'q' to go back", 200, getHeight()/2); 
     checkQ();
     
    }
     
    }
    /*Mathod checkQ cheks for a key, returns nothing
     * @param, no parameters
       */
    public void checkQ(){
    if (Greenfoot.isKeyDown("q")){
    
     bg.setColor(Color.WHITE); 
 
     bg.drawString("Try to eat Red and Purple balls\nRed= 2points\nPurple=1point\nCollect 50 points to win\nIf fish touches ground, dies\nPress 'q' to go back", 200, getHeight()/2); 
     
     checkKey();
     }
     }
    /*Mathod showMessage will call the method to create the balls, returns nothing
     * @param, no parameters
     */
    public void showMessage() 
    { 
     
     
     
     bg.setColor(Color.BLUE); 
 
     //bg.drawString("Press 'I' for instruction\n", 200, getHeight()/2); 
     
     checkKey();
     for(int b=0; b<7; b++){
        
        createBall();
        
      }
    }
     /*Mathod createBall creates the balls, returns nothing
     * @param, no parameters
      */
    public void createBall() {
        
        addObject( new Bullet(), 500,340);
        
        }
    /*Mathod developeSea will develope the sea and put the objects into the world, returns nothing
     * @param, no parameters
     */ 
      
    public void developeSea(){
    addObject( new Ground(), 300,900);
    addObject( new Fish(), 50,getHeight()/2);
    Food[] f= new Food[10];
    
    int temp1=0;
    while(temp1<f.length){
     
        f[temp1]= new Food();
        temp1++;
    }
    
    for(int j=0; j<f.length; j++){
    addObject( f[j], Greenfoot.getRandomNumber(50)+425, Greenfoot.getRandomNumber(160));
    }
    Ball[] b = new Ball[15];
    int temp2=0;
    while(temp2<b.length){
    
        b[temp2]= new Ball();
        temp2++;
    }
    
    for(int k=0; k<b.length;k++){
    addObject( b[k],Greenfoot.getRandomNumber(54)+450, Greenfoot.getRandomNumber(160));
    }
    
    addObject( new Snake(), 500,getHeight()/2);
    }
}