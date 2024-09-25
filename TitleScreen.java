import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * Title Screen
 * 
 * @author Henry Lee 
 * @version September 25, 2024
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label("The Elephant", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(titleLabel, 250, 100);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act()
    {
        //Start the game if user presses the space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Elephant elephant = new Elephant();
        Label label = new Label("Use \u2190 and \u2192 to Move", 50);
        Label label2 = new Label("Press <space> to Start", 50);
        addObject(elephant,461,92);
        addObject(label,300,200);
        addObject(label2,300,300);
    }
}
