import mayflower.*;

public class GameOverScreen extends World
{  
    public GameOverScreen()
    {
        setBackground("img/BG/BlackScreen.jpg");
        setTitle("Game Over, You Win!");
    }
    
    public void act() {
        
    }

    public void setTitle(String text) {
        showText(text, 30, 75, 100);
    }
}
