package Tiles;

/**
 * Created by Adam on 18/05/2015.
 */
abstract public class Tile {


    private static int smell, sight;
    private static boolean triggered = false;
    private static boolean walkable = true;

    public Tile(){

    }

    public static boolean isTriggered() {
        return triggered;
    }

    public static void setTriggered(boolean triggered) {
        Tile.triggered = triggered;
    }

    public static boolean isWalkable() {
        return walkable;
    }

    public static void setWalkable(boolean walkable) {
        Tile.walkable = walkable;
    }
}
