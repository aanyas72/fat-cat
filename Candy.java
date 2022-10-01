import mayflower.*;

/**
 * An object that the cat can pick up during the game. 
 * The more it collects, the more points it gets.
 *
 * @author Aanya and Najia
 * 
 */
public class Candy extends GravityObjectActor
{
    // pick the image of the candy, resize it, and set it
    public Candy()
    {
        MayflowerImage pic = new MayflowerImage("img/candy.png");
        pic.scale(0.15);
        setImage(pic);
    }

    public void act() {
        super.act();
    }
}
