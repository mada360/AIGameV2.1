/**
 * Created by Adam on 18/05/2015.
 */
public class Welcome {
    static String Name;
    public static void Welcome(){
        System.out.printf("What is your name? \n");
        Name = BIO.getString();
        System.out.printf("\n Hello %s and Welcome.\n \n",Name);

        //Story
        System.out.printf("You have travelled to a mysterious tomb, etched deep in the mountains of Aconcagua on a perilous quest in search of treasures beyond your wildest imagination. \n" +
                "The journey has been arduous and yet; has only just begun! \n" +
                "After entering the tomb an avalanche has encased you within, with nearly losing all hope, you could hear a faint wind, deeper into the tomb,\n" +
                "that means there is a gap to the outside\n" +
                "somewhere and you must find this exit to save your life. \n" +
                "You however, are not alone...  \n");

        //Rules and instructions
        System.out.printf("\nHere are the rules and instructions for my game: \n" +
                "To play simply select a number from the options presented to you in each turn.\n" +
                "After each turn the enemies will have their turn; they will try and find you using\n" +
                "their senses of sight, hearing and smell and so it's in your best interest to stay clear.\n \n" +
                "You will find treasure in your journey, treasure not just for wealth, but also to aid you in your escape.\n" +
                "To break line of sight, hide behind walls, to hide your scent briefly, traverse through water; as for sound... you'd best keep your distance!\n" +
                "\nGood luck %s, and have fun!\n",Name);

    }

}
