import mayflower.*;

/**
 * An object that the cat can pick up during the game. 
 * The more it collects, the more points it gets.
 *
 * @author Aanya and Najia
 * 
 */
public class Candy extends GravityObjectActor {
    private int col;
    
    /**
     * Constructor for the Candy class.
     * pick the image of the candy, resize it, and set it
     */ 
    
    public Candy(int col)
    {
        MayflowerImage pic = new MayflowerImage("img/candy.png");
        pic.scale(0.15);
        setImage(pic);
        
        super.setSpeed((Math.random() * 3) + 1.0);
        this.col = col;
    }

    public void act() {
        super.act();
    }
    
    public int getCol() {
        return col;
    }
}
