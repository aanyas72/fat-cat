import mayflower.*;

public class TitleScreen extends World
{  
    public TitleScreen()
    {
        setBackground("img/BG/BlackScreen.jpg");
        setTitle("Welcome to Fat Cat! Press space to begin:");
    }
    
    public void act() {
        
    }
    
    public boolean changeScreen() {
        if (Mayflower.isKeyDown(Keyboard.KEY_SPACE)) {
            return true;
        } else {
            return false;
        }
    }

    
    public void setTitle(String text) {
        showText(text, 30, 75, 100);
    }
}
