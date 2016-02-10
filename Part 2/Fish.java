import greenfoot.*; 
import java.awt.Color; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/** 
* <Part2.java> 
* <Sagar Mehta/ Thus 12:30-2:20> 
* 
* <Fish class will be user operated and will try to earn the points by eating the food and ball class> 
*/ 
public class Fish extends Sea
{
    /**
     * Act - do whatever the Fish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
    */
   
    private static final double WALKING_SPEED = 1.0 ;
    int count=0;
    double dy=0;
    double gravity =0.5;
    double upSpeed=-9;
    int foodCount=0;
    int ballCount=0;
    
   /*
      */
    public void act() 
    {
       
        //move();
        
        random();
        checkKeypress();//showMessage();
        lookForFood();
        lookForBall();
        lookForGround();
        

        // Add your action code here.
    }    
   /* method random will allow  location for the fish class
    * returns nothing
    * @param no parameters
    */ 
   public void random(){
    setLocation( getX(), (int)(getY()+dy));
    dy= dy+gravity;
    }
   /*move method will allow object to move 
    * returns nothing
    * @param no parameters
    */ 
   public void move(){
    double angle= Math.toRadians(getRotation());
    int x= (int) Math.round(getY()+Math.cos(angle)*WALKING_SPEED);
    int y= (int) Math.round(getX()+Math.sin(angle)*WALKING_SPEED);
    //checkKeypress();
    }
   /*lookForFood method will allow to eat food  
    * returns nothing
    * @param no parameters
    */ 
   public void lookForFood(){
    if ( canSee(Food.class) )
        {
             temp(Food.class);
             foodCount=foodCount+2;
             
        }
        
    }
   /*move method will allow to eat balls 
    * returns nothing
    * @param no parameters
    */ 
   public void lookForBall(){
    
        if(canSee(Ball.class)){
            temp(Ball.class);
            ballCount=ballCount+1;
        }
    }
   
   /*move method will eat the object itself on touching the ground 
    * returns nothing
    * @param no parameters
    */ 
   public void lookForGround(){
    
        if(canSee(Ground.class)){
            temp(Ground.class);
             Greenfoot.playSound("Blast.wav");
            getWorld().addObject(new Gameover(), 300, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
     }
   
   /* move method will allow object to turn 
    * returns nothing
    * @param no parameters
    */  
   public void turn(int angle){
        setRotation(getRotation()+angle);
    }
   
   /* move method will allow object to eat the object 
    * returns nothing
    * @param no parameters
    */ 
   public void eat(Class clss){
     
       Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null) 
        {
            //getWorld()
            count++;
            if(count==2){
            //Greenfoot.playSound("victory.wav");
            }
        }
   }

   /* move method will allow object to move in the world by pressing the keys
    * returns nothing
    * @param no parameters
    */
    public void checkKeypress(){
    
      
        if (Greenfoot.isKeyDown("up")) {
        dy= upSpeed;
        }
        
        if((foodCount+ballCount==30 ) ||(foodCount+ballCount > 30 )){
            Greenfoot.playSound("victory.wav");
            getWorld().addObject(new Win(), 300, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
        /* if( getY() > getWorld().getHeight()){
        
         GreenfootImage image = new GreenfootImage (600, 400);  
       
        image.drawString("Food:"+foodCount+"Ball:"+ballCount+"Total"+(foodCount+ballCount), 60, 100);  
      
        setImage(image);  
        
            //getWorld().addObject(new Gameover(),100,100);
        System.out.print("Food:"+foodCount+"Ball:"+ballCount+"Total"+(foodCount+ballCount)); */
        //Greenfoot.stop();
        
        //move(-5);
        //setRotation(90);
     
    
    
     if (Greenfoot.isKeyDown("right")){
        move(5);
        }
    
    
        if (Greenfoot.isKeyDown("left")){
       move(-10);
     }
    
    
    
     if (Greenfoot.isKeyDown("down")){
       dy=9;
     }
     
     }
   /*move method will allow object to turn at the edge 
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
     
  

