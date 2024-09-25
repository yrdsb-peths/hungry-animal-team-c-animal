import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Apple here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Apple extends Actor
{
    public int speed;
    
    /**
     * Act - do whatever the Apple wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        int x= getX();
        int y = getY()+speed;
        setLocation(x, y);
        
        MyWorld world= (MyWorld) getWorld();
        if(getY()>=world.getHeight()){
            world.gameOverCode();
            world.removeObject(this);
        }
    }
    public void setSpeed(int spd)
    {
        speed=spd;
    }
}
