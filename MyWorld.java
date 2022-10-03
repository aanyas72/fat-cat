import mayflower.*;
import java.util.ArrayList;

/**
 * The first level in the game!
 *
 * @author Aanya and Najia
 * 
 */
public class MyWorld extends World {
    private Cat cat;
    private String[][] tiles;
    //int numCandy;
    int numRocks;
    private ArrayList<Integer> candyPos;
    int resetTimer;
    //private ArrayList<Candy> candies;
    //int[] rockPos;
    
    /**
     * Constructor for the first level:
     * Add tiles and characters, then build the world.
     */
    public MyWorld() {
        setBackground("img/BG/BG.png");
        
        //numCandy = 0;
        numRocks = 0;
        //candies = new ArrayList<>();
        candyPos = new ArrayList<>();
        //rockPos = new int[5];
        resetTimer = 5000;
        
        cat = new Cat();
        addObject(cat, 200, 380);
        
        tiles = new String[6][8];
        buildWorld();
        
    }
    
    /**
     * Act method for the first level.
     * Randomly generate candy and rocks that will float down into the world.
     * They will not intersect and their speeds will vary.
     */
    public void act() {
        resetTimer--;
        
        while (candyPos.size() < 10) {
            int randY = (int)(Math.random() * 750);
            if (!candyPos.contains(randY) 
                    && !candyPos.contains(randY + 1) 
                    && !candyPos.contains(randY - 1)) {
                candyPos.add(randY);
                addObject(new Candy(randY), randY, 0); 
            }
        }
        
        //while (candies.size() < 10) {
        //    int randY = (int)(Math.random() * 750);
        //    boolean contains = false;
        //    for (Candy c : candies) {
        //        if (c.getCol() == randY) {
        //            contains = true;
        //        }
        //    }
            
        //    if (!contains) {
        //       candies.add(new Candy(randY));
        //    }
        //}
        
        //for (Candy c : candies) {
        //        if (c.isTouching(Block.class)) {
        //            contains = true;
        //        }
        //    }
        showText("Score: " + cat.getScore() + " Health: " + cat.getHealth(), 10, 30, Color.BLACK);
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