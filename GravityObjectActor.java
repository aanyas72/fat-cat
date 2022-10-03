import mayflower.*;

/**
 * Write a description of class GravityObjectActor here.
 *
 * @author Aanya and Najia
 */
public class GravityObjectActor extends Actor
{
    private double speed;

    public void act() {
        setLocation(getX(), getY() + getSpeed());
    }
    
    public double getSpeed() {
        return speed;
    }
    
    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
