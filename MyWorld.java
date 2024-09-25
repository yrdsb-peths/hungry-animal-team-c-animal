import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class MyWorld extends World
{
    int level=1;
    Label scoreLabel;
    public int score=0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300); 
        
        scoreLabel= new Label(0,80);
        addObject(scoreLabel, 50, 50);
        
        
        createApple();
    }
    
    public void gameOverCode() 
    {
        Label gameOverLabel = new Label ("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
    }
    public void increaseScore(){
        score++;
        scoreLabel.setValue(score);
        if(score % 5 ==0){
            level++;
        }
    }
    public void createApple()
    {
        Apple apple = new Apple();
        apple.setSpeed(level);
        int x = Greenfoot.getRandomNumber(600);
        int y = Greenfoot.getRandomNumber(1);
        addObject(apple, x, y); 
    }
}
