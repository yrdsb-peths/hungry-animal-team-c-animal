import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Food
{
    GreenfootSound appleChewSound = new GreenfootSound("applechew.mp3");
    public Apple(){
        super(2);
    }
    
    public void makeSound()
    {
        if(Greenfoot.mouseClicked(this))
        {
            appleChewSound.play();
        }
    }
    
}
