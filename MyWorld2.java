import mayflower.*;

/**
 * The second level in the game!
 *
 * @author Aanya and Najia
 * 
 */
public class MyWorld2 extends World
{
    private Cat cat;
    private String[][] tiles;
    
    /**
     * Constructor for the second level:
     * Add tiles and characters, then build the world.
     */
    public MyWorld2()
    {
        setBackground("img/BG/BG.png");
        tiles = new String[6][8];
        
        Mayflower.showBounds(true);
        
        cat = new Cat();
        addObject(cat, 50, 375);
        
        buildWorld();
        showText("Score: " + cat.getScore() + " Health: " + cat.getHealth(), 10, 30, Color.BLACK);
    }
    
    public void act()
    {
    }
    
    /**
     * Build the second level - 
     * create the ground, add the lava, and add candy for the cat to collect.
     */
    public void buildWorld() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                tiles[i][j] = "";
            }
        }

        for (int i = 0; i < tiles[0].length; i += 2) {
            tiles[5][i] = "ground";
        }
        for (int i = 1; i < tiles[0].length; i += 2) {
            tiles[5][i] = "lava";
        }
        
        for (int i = 1; i < tiles[0].length; i += 2) {
            tiles[1][i] = "ground";
        }

        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles[0].length; j++) {
                if (tiles[i][j].equals("ground")) {
                    addObject(new Block(), j * 128, i * 95);
                }
            }
        }
        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles[0].length; j++) {
                if (tiles[i][j].equals("lava")) {
                    addObject(new Lava(2), j * 128, i * 95);
                }
            }
        }
        
        //do {
        //   int xPos = Math.random(); // 6 options
        //   int yPos = Math.random(); // 2 options
        //} while {
            
        //}
        
        addObject(new Ladder(), 50, 125);
        // addObject(new Lava(), 200, 200);
    }
}
