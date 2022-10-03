import mayflower.*;

public class Block extends Actor {
    public Block() {
        setImage("img/Tiles/2.png");
    }
    
    public void act() {
        if (isTouching(Candy.class)) {
            Object a = getOneIntersectingObject(Candy.class);
            Candy c = (Candy) a;
            int col = c.getCol();
            
            
        }
    }
}