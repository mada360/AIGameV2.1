package Logic;

/**
 * Created by Adam on 18/05/2015.
 */
public class PlayerLogic {
    static boolean interests;

    public PlayerLogic(){

    }

    private static void somethingToSee(){
        if(0 != 1){
            interests = false;
        }else{
            interests = true;
        }
    }

    public static boolean getInterests() {
        return interests;
    }

    public static void setInterests(boolean interests) {
        PlayerLogic.interests = interests;
    }
}
