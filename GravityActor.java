import mayflower.*;

public class GravityActor extends Actor {
    public void act() {
        
        if (isBlocked()) {
            setLocation(getX(), getY() - 1);
        }
        
        setLocation(getX(), getY() + 1);
    }
    
    public boolean isBlocked() {
        return isTouching(Block.class);
    }
    
    public boolean isFalling() {
        boolean ret;
        setLocation(getX(), getY() + 1);
        ret = isTouching(Block.class);
        setLocation(getX(), getY() - 1);
        return !ret;
    }
    
    public boolean isClimbing() {
        if (isTouching(Ladder.class)){ 
            return true;
        }
        return false;
    }
}