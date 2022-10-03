import mayflower.*;

public class Cat extends MovableAnimatedActor
{
    private int score;
    private int health;
    private int level;
    
    private Animation idleRight;
    private Animation walkRight;
    private Animation walkLeft;
    private Animation fallRight;
    private Animation fallLeft;
    private Animation idleLeft;
    private Animation climb;

    public Cat() 
    {
        score = 0;
        health = 100;
        level = 1;
        
        String[] idleImgs = new String[10];
        for (int i = 0; i < idleImgs.length; i++) {
            idleImgs[i] = String.format("img/cat/Idle (%d).png", i + 1);
        }
        String[] walkImgs = new String[10];
        for (int i = 0; i < walkImgs.length; i++) {
            walkImgs[i] = String.format("img/cat/Walk (%d).png", i + 1);
        }
        String[] fallImgs = new String[8];
        for (int i = 0; i < fallImgs.length; i++) {
            fallImgs[i] = String.format("img/cat/Fall (%d).png", i + 1);
        }

        idleRight = new Animation(50000000, idleImgs);
        idleRight.scale(100, 87);
        idleRight.setBounds(18, 5, 54, 80);
        
        
        idleLeft = new Animation(50000000, idleImgs);
        idleLeft.scale(100, 87);
        idleLeft.mirrorHorizontally();
        idleLeft.setBounds(28, 5, 54, 80);
        
        walkRight = new Animation(50000000, walkImgs);
        walkRight.scale(100, 87);
        walkRight.setBounds(18, 5, 54, 80);
        
        walkLeft = new Animation(50000000, walkImgs);
        walkLeft.scale(100, 87);
        walkLeft.mirrorHorizontally();
        walkLeft.setBounds(28, 5, 54, 80);
        
        
        fallRight = new Animation(50000000, fallImgs);
        fallRight.scale(100, 87);
        fallRight.setBounds(18, 5, 54, 80);

        fallLeft = new Animation(50000000, fallImgs);
        fallLeft.mirrorHorizontally();
        fallLeft.scale(100, 87);
        fallLeft.setBounds(28, 5, 54, 80);
        
        setIdleRightAnimation(idleRight);
        setIdleLeftAnimation(idleLeft);
        setWalkRightAnimation(walkRight);
        setWalkLeftAnimation(walkLeft);
        setFallLeftAnimation(fallLeft);
        setFallRightAnimation(fallRight);
        

    }
    
    public int getScore() {
        return score;
    }
    
    public int getHealth() {
        return health;
    }
    
    public void increaseScore(int n) {
        score += n;
        updateText();
    }
    
    public void decrHealth(int n) {
        health -= n;
        updateText();
    }
    
    public void increaseLvl(int n) {
        level += n;
    }

    public void act()
    {
        super.act();
        
        if (health == 0) {
            GameOverScreen w = new GameOverScreen();
            Mayflower.setWorld(w);
        }
    }
    
    private void updateText() {
        World w = getWorld();
        w.removeText(10, 30);
        w.showText("Score: " + score + " Health: " + health, 10, 30, Color.BLACK);
    }
}