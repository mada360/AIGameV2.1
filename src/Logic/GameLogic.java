package Logic;

import Tiles.Tile;

/**
 * Created by Adam on 18/05/2015.
 */
public class GameLogic {
    static int mapSize = 15;


    //Map variables
    static Tile[] mapX = new Tile[mapSize];
    static Tile[] mapY = new Tile[mapSize];

    static Tile map[][] = {mapX, mapY};

    private static int playerX, playerY = 0;

    static boolean north, south, east, west;


    public GameLogic(){

    }

    public static void gameLogic(){
        System.out.println("Player x = " + playerX + "Player y = " + playerY );
        if(playerY < mapSize){
            north = true;}
        else{
            north = false;
        }

        if(playerX < mapSize){
            east = true;}
        else{
            east = false;
        }

        if(playerY > 0){
            south = true;}
        else{
            south = false;
        }

        if(playerX > 0){
            west = true;}
        else{
            west = false;
        }

        //Enemies
        System.out.println();

        //Misc
        System.out.println();
        System.out.print("You can see ");
        if(!PlayerLogic.getInterests()){
            System.out.println("nothing of interest. ");
        }else{
            System.out.println("something of interest. ");
        }
    }

    public static int getMapSize() {
        return mapSize;
    }

    public static void setMapSize(int mapSize) {
        GameLogic.mapSize = mapSize;
    }

    public static Tile[] getMapX() {
        return mapX;
    }

    public static void setMapX(Tile[] mapX) {
        GameLogic.mapX = mapX;
    }

    public static Tile[] getMapY() {
        return mapY;
    }

    public static void setMapY(Tile[] mapY) {
        GameLogic.mapY = mapY;
    }

    public static Tile[][] getMap() {
        return map;
    }

    public static void setMap(Tile[][] map) {
        GameLogic.map = map;
    }

    public static int getPlayerX() {
        return playerX;
    }

    public static void setPlayerX(int playerX) {
        GameLogic.playerX = playerX;
    }

    public static int getPlayerY() {
        return playerY;
    }

    public static void setPlayerY(int playerY) {
        GameLogic.playerY = playerY;
    }

    public static boolean isNorth() {
        return north;
    }

    public static void setNorth(boolean north) {
        GameLogic.north = north;
    }

    public static boolean isSouth() {
        return south;
    }

    public static void setSouth(boolean south) {
        GameLogic.south = south;
    }

    public static boolean isEast() {
        return east;
    }

    public static void setEast(boolean east) {
        GameLogic.east = east;
    }

    public static boolean isWest() {
        return west;
    }

    public static void setWest(boolean west) {
        GameLogic.west = west;
    }
}
