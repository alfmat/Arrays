/**
 Name: Alfred Mathew
 Platform: macOS High Sierra, BlueJ
 Date: 02/03/18
 Program: Player
 
 Description: This program represent the player in a game of rock, paper, scissors
 What I learned: Creating Constructors.
 Difficulties I faced: None Experienced. 
 **/
import java.util.*;
public class Player
{
    /*
     * Variable Descriptions:
     * playerName --> this is the name of the player
     * playerThrow --> this is the user's throw
     */
    private String playerName;
    private int playerThrow;
    /*
     * Object Descriptions
     * sc --> object of the scanner class
     */
    Scanner sc = new Scanner(System.in);
    /**
     * Default Constructor
     * pre: none
     * post: initialized variables
     */
    Player()
    {
        playerThrow = 0;
        playerName = null;
    }
    
    /**
     * Normal Constructor
     * pre: none
     * post: initialized variables
     */
    Player(String name)
    {
        playerThrow = 0;
        playerName = name;
    }
    
    /**
     * Prompt's the player to make a throw
     * pre: none
     * post: The player's throw is stored
     */
    public void makeThrow()
    {
        System.out.print("Enter your throw (1=Rock, 2=Paper, 3=Scissors): ");
        playerThrow = sc.nextInt();
        if(playerThrow<1||playerThrow>3)
        System.out.println("Entry error: Please Try Again\n");
    }
    
    
    
    
    /******************* Setters *************************/
    
    
    
    /**
     * Sets the player's name
     * pre: none
     * post: the throw is returned
     */
    public void setName(String name)
    {
        playerName = name;
    }
    
    
    
    
    
    /***************** Getters ************************/
    
    
    
    /**
     * Provides the user's throw
     * pre: none
     * post: the throw is returned
     */
    public int getThrow()
    {
        return playerThrow;
    }
    
    /**
     * Provides the player's name
     * pre: none
     * post: the player name is returned
     */
    public String getName()
    {
        return playerName;
    }
}
