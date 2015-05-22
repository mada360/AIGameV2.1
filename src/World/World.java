package World; /**
 * Created by mada360 on 22/05/15.
 */
import Logic.GameLogic;
import Utils.Utils;

public class World {
    private static int width, height = GameLogic.getMapSize();
    private int[][] tiles;
    private int playerX = GameLogic.getPlayerX();
    private int playerY = GameLogic.getPlayerY();

    public World(){

    }

    public void loadWorld(String path){
        String file = Utils.loadFileAsString(path);
        String[] tokens = file.split("\\s+");

        tiles = new int[width][height];
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                tiles[x][y] = Utils.parseInt(tokens[(x + y * width)]);
            }
        }
    }

    public void drawWorld(){
        for(int y = 0; y < height; y++){
            for(int x = 0; x < width; x++){
                if(x == playerX && y == playerY){
                    //This is for the console display only, the array is unaffected for when graphics are implemented.
                    System.out.print("P");
                }else {
                    System.out.print(tiles[x][y]);
                }
            }
            System.out.println();
        }
    }

}
