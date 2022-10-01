import mayflower.*;

public class Ladder extends Actor
{
    public Ladder() {
        MayflowerImage ladder = new MayflowerImage("img/ladder.png");
        setImage(ladder);
        int x = getWidth();
        int y = getHeight();
        scale(x, y);
    }
    public void act() {
        
    }
}
