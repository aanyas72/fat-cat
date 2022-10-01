import mayflower.*;

/**
 * A hazard for the cat! Don't touch it, or else you'll lose a life!
 *
 * @author Aanya and Najia
 */
public class Lava extends Actor
{
    int world;

    /**
     * Lava constructor.
     * Set the image and the size.
     */
    public Lava(int world)
    {
        MayflowerImage pic = new MayflowerImage("img/lava.png");
        pic.scale(128,128);
        setImage(pic);
        this.world = world;
    }

    /**
     * Act method for the lava! 
     * If it touches the cat, the cat loses a life and gets set to its original position.
     */
    public void act()
    {
        if (isTouching(Cat.class)) {
            Object a = getOneIntersectingObject(Cat.class);
            Cat c = (Cat) a;
            World w = getWorld();
            c.decrHealth(10);
            
            if (world == 1) {
                c.setLocation(400,300);
            } else if (world == 2) {
                c.setLocation(50,375);
            } else {
                //c.setLocation(50,375);
            }
            
        }
    }
}
