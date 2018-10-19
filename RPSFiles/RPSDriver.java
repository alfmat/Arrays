/**
 Name: Alfred Mathew
 Platform: macOS High Sierra, BlueJ
 Date: 02/05/18
 Program: RPSDriver
 
 Description: This is the driver program for the RPS game
 What I learned: Creating objects.
 Difficulties I faced: None Experienced. 
 **/
import java.util.*;
public class RPSDriver
{
    public static void main(String ar[])
    {
        /*
         * Object Descriptions:
         * sc --> object of the Scanner class
         * game --> object of the Game class
         */
        System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the player name: ");
        Game game = new Game(sc.next());
        System.out.print("Enter the number of rounds: ");
        /*
         * Variable Descriptions:
         * rounds --> this is the number of rounds the player wants to play
         * i --> loop control variable
         */
        int rounds = sc.nextInt(),i=1;
        System.out.println();//formatting
        while(i<=rounds)
        {
            /*
             * This loop contains a lot of method calls that call on the Game class
             */
            game.initialize();
            game.makeCompThrow();
            game.announceWinner();
            System.out.println();//formatting
            i++;//increments the control variable
        }
        System.out.println("\n");//formatting
        game.announceBigWinner();//announces the winner of the match
    }
}
/**
 Program Output:
 
Enter the player name: Alfred
Enter the number of rounds: 3

Enter your throw (1=Rock, 2=Paper, 3=Scissors): 2
Computer and player had same Throw!
Tie!

Enter your throw (1=Rock, 2=Paper, 3=Scissors): 3
Alfred throws SCISSORS.
Computer throws ROCK.
Computer wins!

Enter your throw (1=Rock, 2=Paper, 3=Scissors): 1
Computer and player had same Throw!
Tie!



Computer wins 1. Alfred wins 0

 **/
