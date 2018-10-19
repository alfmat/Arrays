/**
 Name: Alfred Mathew
 Platform: macOS High Sierra, BlueJ
 Date: 02/05/18
 Program: Game
 
 Description: This is the RPS game file
 What I learned: Creating objects.
 Difficulties I faced: None Experienced. 
 **/
import java.util.*;
public class Game
{
    /*
     * Variable Descriptions:
     * compThrow --> this stores the computer's throw
     * playerWins --> stores the number of times the player has won
     * playerThrow --> this stores the value of the player's throw
     */
    private int compThrow, playerWins, playerThrow, totalThrows,compWins;
    
    /*
     * Object Description
     * rand --> this is an object of the random class
     * sc --> this is an object of the Scanner class
     * player1 --> this represents the players
     */
    Random rand = new Random();
    Scanner sc = new Scanner(System.in);
    Player player1;
    
    
    /******************** Constructors ****************************/
    
    
    /**
     * Default Constructor
     * pre: none
     * post: variables are initialized
     */
    Game()
    {
        compThrow = 0;
        playerWins = 0;
        playerThrow = 0;
        totalThrows = 0;
        player1 = null;
        compWins=0;
    }
    
    /**
     * Normal Constructor
     * pre: none
     * post: variables are initialized
     */
    Game(String name)
    {
        compThrow = 0;
        playerWins = 0;
        playerThrow = 0;
        totalThrows = 0;
        player1 = new Player(name);
        compWins=0;
    }
    
    
    
    
    
    /************************* Methods *************************/
    
    
    
    
    
    /**
     * This method simulates the computer's throw
     * pre: none
     * post: computer's throw is stored
     */
    public void makeCompThrow()
    {
        compThrow = 1 + rand.nextInt(3);
    }
    
    /**
     * This method announces the final winner
     * pre: none
     * post: winner is announced
     */
    public void announceBigWinner()
    {
        System.out.println("Computer wins "+compWins+". "+player1.getName()+" wins "+playerWins);
    }
    
    /**
     * This method starts the game, Makes the user cast his/her throw
     * pre: none
     * post: the user has selected his/her move
     */
    public void initialize()
    {
        player1.makeThrow();
    }
    
    /**
     * This method announces the winners of individual games
     * pre: none
     * post: the winner of the game is shown to the user
     */
    public void announceWinner()
    {
        playerThrow = player1.getThrow();
        if(playerThrow==1&compThrow==2)
        {
            System.out.println(player1.getName()+" throws ROCK.");
            System.out.println("Computer throws PAPER.");
            System.out.println("Computer wins!");
            compWins++;
        }
        else if(playerThrow==2&compThrow==1)
        {
            System.out.println(player1.getName()+" throws ROCK.");
            System.out.println("Computer throws PAPER.");
            System.out.println(player1.getName()+" wins!");
            playerWins++;
        }
        else if(playerThrow==3&compThrow==1)
        {
            System.out.println(player1.getName()+" throws SCISSORS.");
            System.out.println("Computer throws ROCK.");
            System.out.println("Computer wins!");
            compWins++;
        }
        else if(playerThrow==2&compThrow==3)
        {
            System.out.println(player1.getName()+" throws PAPER.");
            System.out.println("Computer throws SCISSORS.");
            System.out.println("Computer wins!");
            compWins++;
        }
        else if(playerThrow==3&compThrow==2)
        {
            System.out.println(player1.getName()+" throws SCISSORS.");
            System.out.println("Computer throws PAPER.");
            System.out.println(player1.getName()+" wins!");
            playerWins++;
        }
        else if(playerThrow==1&compThrow==3)
        {
            System.out.println(player1.getName()+" throws ROCK.");
            System.out.println("Computer throws SCISSORS.");
            System.out.println(player1.getName()+" wins!");
            playerWins++;
        }
        else if(playerThrow==compThrow)
        {
            System.out.println("Computer and player had same Throw!");
            System.out.println("Tie!");
        }
    }
    
    
    
    
    /********************** Getters **********************/
    
    
    
    
    /**
     * Returns the computer's throw to the user
     * pre: none
     * post: the throw is returned to the user
     */
    public int getCompThrow()
    {
        return compThrow;
    }
    
    /**
     * Returns the computer's wins to the user
     * pre: none
     * post: the wins are returned to the user
     */
    public int getCompWins()
    {
        return compWins;
    }
    
    /**
     * Returns the player's wins to the user
     * pre: none
     * post: the wins are returned to the user
     */
    public int getPlayerWins()
    {
        return playerWins;
    }
    
    
}
