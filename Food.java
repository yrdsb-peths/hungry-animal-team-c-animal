import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Food here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Food extends Actor implements Clickable
{
    private int speed;
    public Food(int speed){
        this.speed=speed;
    }
    public void act()
    {  
        int x= getX();
        int y = getY()+speed;
        setLocation(x, y);
        remove();
        makeSound();
    }
    public void remove(){
        MyWorld world= (MyWorld) getWorld();
        if(getY()>=world.getHeight()){
            world.gameOverCode();
            world.removeObject(this);
        }
    }
    public int setSpeed(int spd){
        return speed=spd;
    }
}

