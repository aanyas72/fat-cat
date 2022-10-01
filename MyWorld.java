import mayflower.*;


public class MyWorld extends World {
    private Cat cat;
    private String[][] tiles;
    int numCandy;
    int colCandy1;
    int colCandy2;
    
    public MyWorld() 
    {
        setBackground("img/BG/BG.png");
        tiles = new String[6][8];
        numCandy = 0;
        colCandy1 = -1;
        colCandy2 = -1;
        
        Mayflower.showBounds(true);
        
        cat = new Cat();
        addObject(cat, 200, 380);
        
        buildWorld();
        
    }
    
    public void act() {
        while (numCandy < 2) {
            int randY = (int)(Math.random() * 750);
                addObject(new Candy(), randY, 0); 
                numCandy++;
        }
    }
    
    //after candy falls out of world (touches block) decrease number of candy
    
    
    
    public void buildWorld() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                tiles[i][j] = "";
            }
        }

        for (int i = 0; i < tiles[0].length; i++) {
            tiles[5][i] = "ground";
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