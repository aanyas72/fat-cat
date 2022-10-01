import mayflower.*;

public class AnimatedActor extends GravityActor
{
    private Animation animation;
    private Timer animationTimer;
    
    public AnimatedActor()
    {
       animationTimer = new Timer(100000000);
    }
    
    void setAnimation(Animation a) {
        animation = a;
    }

    public void act() {
        super.act();
        if (animation != null && animationTimer != null && animationTimer.isDone()) {
            MayflowerImage m = animation.getNextFrame();
            setImage(m);
            animationTimer.reset();
        }
    }
}
