import mayflower.*;

public class Ninja extends AnimatedActor
{
    private Animation walk;

    public Ninja() 
    {
        String[] imgs = new String[10];
        for (int i = 0; i < imgs.length; i++) {
            imgs[i] = String.format("img/ninjagirl/Attack__00" + i + ".png");
        }

        walk = new Animation(50000000, imgs);
        setAnimation(walk);
        
        walk.scale(50, 200);

    }

    public void act()
    {
        super.act();
    }
}