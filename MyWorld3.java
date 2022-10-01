import mayflower.*;

public class MyWorld3 extends World
{
    private Cat cat;
    private String[][] tiles;
    public MyWorld3()
    {
        setBackground("img/BG/BG.png");
        tiles = new String[6][8];
        
        Mayflower.showBounds(true);
        
        cat = new Cat();
        addObject(cat, 50, 400);
        
        buildWorld();
    }
    
    public void act()
    {
    }
    
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
            tiles[2][i] = "ground";
        }

        for (int i = 0; i < tiles.length; i++) {
            for (int j = 0; j < tiles[0].length; j++) {
                if (tiles[i][j].equals("ground")) {
                    addObject(new Block(), j * 128, i * 95);
                }
            }
        }
    }
}
