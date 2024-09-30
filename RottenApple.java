import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RottenApple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RottenApple extends Food
{
    GreenfootSound gaggingSound = new GreenfootSound("gagging.mp3");
    public RottenApple(){
        super(2);
            
    }
    int i;
    public void remove(){
        MyWorld world= (MyWorld) getWorld();
        if(getY()>=world.getHeight()){
            world.removeObject(this);
            i=Greenfoot.getRandomNumber(3);
            if(i==2){
                world.createRottenApple();
            }else{
                world.createApple();
            }
            
        }
    }
    
    public void makeSound()
    {
        if(Greenfoot.mouseClicked(this))
        {
            gaggingSound.play();
        }
    }
}
