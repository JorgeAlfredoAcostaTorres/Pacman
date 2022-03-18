import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PacmanWorld extends World
{
    private static final int WIDTH_WALL = 28;
    private static final int HEIGHT_WALL = 28;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public PacmanWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Wall wall = new Wall();

        for(int x = 50; x <= 550; x += WIDTH_WALL) {
            wall = new Wall();
            addObject(wall, x, 30);
            wall = new Wall();
            addObject(wall, x, 350);
        }

        for(int y = 58; y <= 200; y += HEIGHT_WALL) {
            wall = new Wall();
            addObject(wall, 50, y);
            wall = new Wall();
            addObject(wall, 526, y);
        }

        Strawberry strawberry = new Strawberry();
        addObject(strawberry,525,292);
        Strawberry strawberry2 = new Strawberry();
        addObject(strawberry2,52,285);
        Strawberry strawberry3 = new Strawberry();
        addObject(strawberry3,426,74);
        Cherry cherry = new Cherry();
        addObject(cherry,426,290);
        Cherry cherry2 = new Cherry();
        addObject(cherry2,172,155);
        Cherry cherry3 = new Cherry();
        addObject(cherry3,327,79);
        Cherry cherry4 = new Cherry();
        addObject(cherry4,318,216);
        BigBall bigBall = new BigBall();
        addObject(bigBall,338,273);
        BigBall bigBall2 = new BigBall();
        addObject(bigBall2,283,122);
        BigBall bigBall3 = new BigBall();
        addObject(bigBall3,165,67);
        BigBall bigBall4 = new BigBall();
        addObject(bigBall4,126,278);
        BigBall bigBall5 = new BigBall();
        addObject(bigBall5,465,146);
        SmallBall smallBall = new SmallBall();
        addObject(smallBall,489,235);
        SmallBall smallBall2 = new SmallBall();
        addObject(smallBall2,371,231);
        SmallBall smallBall3 = new SmallBall();
        addObject(smallBall3,380,155);
        SmallBall smallBall4 = new SmallBall();
        addObject(smallBall4,39,223);
        SmallBall smallBall5 = new SmallBall();
        addObject(smallBall5,278,194);
        SmallBall smallBall6 = new SmallBall();
        addObject(smallBall6,196,261);
        SmallBall smallBall7 = new SmallBall();
        addObject(smallBall7,219,122);
        SmallBall smallBall8 = new SmallBall();
        addObject(smallBall8,487,67);
        SmallBall smallBall9 = new SmallBall();
        addObject(smallBall9,250,69);
        SmallBall smallBall10 = new SmallBall();
        addObject(smallBall10,263,308);
        SmallBall smallBall11 = new SmallBall();
        addObject(smallBall11,107,204);
        SmallBall smallBall12 = new SmallBall();
        addObject(smallBall12,194,198);

        Banana banana = new Banana();
        addObject(banana,309,151);
        Balloon balloon = new Balloon();
        addObject(balloon,424,213);

        PacmanHud hud = new PacmanHud();
        addObject(hud, 0, 0);

        Pacman pacman = new Pacman(hud);
        addObject(pacman, 110, 90);
    }
}
