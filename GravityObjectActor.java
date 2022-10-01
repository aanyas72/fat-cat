import mayflower.*;

/**
 * Write a description of class GravityObjectActor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GravityObjectActor extends Actor
{

    public void act() {
        setLocation(getX(), getY() + 1);
    }

    
}
