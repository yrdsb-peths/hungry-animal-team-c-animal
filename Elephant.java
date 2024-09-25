import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * This is a elephant that will act as the main character
 * 
 * @author Henry
 * @version Sep 24, 2024
 */
public class Elephant extends Actor
{
    GreenfootSound elephantSound = new GreenfootSound("elephantcub.mp3");
    GreenfootImage[] idleRight = new GreenfootImage[8];
    GreenfootImage[] idleLeft = new GreenfootImage[8];
    //Direction elephant is facing
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();

    public Elephant()
    {
        for(int i = 0; i < 8; i++)
        {
            idleRight[i] = new GreenfootImage("images/Elephant_animations/Elephant-Idle" + i + ".png");
            idleRight[i].scale(100,100);
        }
        for(int i = 0; i < 8; i++)
        {
            idleLeft[i] = new GreenfootImage("images/Elephant_animations/Elephant-Idle" + i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(100,100); 
        }
        setImage(idleRight[0]);
        animationTimer.mark();
    }
    
    /**
     * animates the elephant
     */
    int imageIndex = 0;
    public void animateElephant()
    {
        if(animationTimer.millisElapsed() < 100)
        {
            return;
        }
        animationTimer.mark();
        if(facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        }
        else
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
    }
    
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-5);
            facing = "left";
            
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(5);
            facing = "right";
            
        }
        if(getX()>600){
            setLocation(600,getY());
        }
        if(getX()<0){
            setLocation(0,getY());
        }
        //removes apple when touches elepahant
        eat();
        //Animates elephant
        animateElephant();
    }
    
    /**
     * Eats apple and creates a new one. Also increases score when eats apple.
     */
    public void eat()
    {
        if(isTouching(Apple.class))
        {
            removeTouching(Apple.class);
            MyWorld world = (MyWorld) getWorld();
            world.createApple();
            world.increaseScore();
            elephantSound.play();
        }
    }
}
