import Logic.EnemyLogic;
import Logic.GameLogic;

/**
 * Created by Adam on 18/05/2015.
 */
public class Game {
    //In game variables

    static int speed = 3;

    static boolean running = false;
    static int input;


    public Game(){
        game();
    }

    public static void game() {
        running = true;
        while(running){
            int moves = speed;

            while(moves > 0){

                //Exit case
                if(input == 9){
                    running = false;
                    break;
                }

                System.out.printf("\n You have  %d move(s) left \n", moves);
                moves--;

                System.out.printf("\n What is your next move?");
                //Run the game logic for movement etc...
                GameLogic.gameLogic();

                //Movement
                System.out.print("You can move ");
                if(GameLogic.isNorth()) System.out.print("North, ");
                if(GameLogic.isSouth()) System.out.print("South, ");
                if(GameLogic.isEast()) System.out.print("East, ");
                if(GameLogic.isWest()) System.out.print("West, ");

                System.out.printf("\n 1 - Move North \n 2 - Move East \n 3 - Move South \n 4 - Move West \n 5 - Attack \n 6 - Search \n 7 - Do nothing ");
                System.out.printf("\n 9 - Quit?");
                input = BIO.getInt();

                //Movement and actions
                int playerX = GameLogic.getPlayerX();
                int playerY = GameLogic.getPlayerY();
                GameLogic.gameLogic();
                boolean validAction = false;
                while(!validAction) {
                    switch (input) {
                        case 1:
                            if(GameLogic.isNorth()){
                                playerY++;
                                GameLogic.setPlayerY(playerY);
                                System.out.printf("\n You moved North. \n");
                                validAction = true;
                            }else{
                                notValid();
                            }
                            break;
                        case 2:
                            if(GameLogic.isEast()) {
                                playerX++;
                                GameLogic.setPlayerX(playerX);
                                System.out.printf("\n You moved East. \n");
                                validAction = true;
                            }else{
                                notValid();
                            }
                            break;
                        case 3:
                            if(GameLogic.isSouth()) {
                                playerY--;
                                GameLogic.setPlayerY(playerY);
                                System.out.printf("\n You moved South. \n");
                                validAction = true;
                            }else{
                                notValid();
                            }
                            break;
                        case 4:
                            if(GameLogic.isWest()) {
                                playerX--;
                                GameLogic.setPlayerX(playerX);
                                System.out.printf("\n You moved South. \n");
                                validAction = true;
                            }else{
                                notValid();
                            }
                            break;
                        case 5:
                            System.out.printf("\n Not valid");
                            notValid();
                            break;
                        case 6:
                            System.out.printf("\n Not valid");
                            notValid();
                            break;
                        case 7:
                            System.out.printf("\n You did absolutely nothing");
                            validAction = true;
                            break;
                        case 8:
                            System.out.printf("\n Not valid");
                            break;
                        case 9:
                            System.out.printf("\n QUIT!!");
                            running = false;
                            validAction = true;
                            break;
                        case 10:
                            System.out.printf("\n Not valid");
                            break;
                        default:
                            notValid();

                    }
                }
            }
            if(input != 9)EnemyLogic.enemyLogic();
        }
    }

    private static void notValid(){
        System.out.printf("\n Please select a valid option \n ");
        input = BIO.getInt();
    }

}
