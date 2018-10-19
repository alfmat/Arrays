/**
 Name: Alfred Mathew
 Platform: macOS High Sierra, BlueJ
 Date: 11/15/17
 Program: WordLengthPrinter
 
 Description: This program finds the length of a word entered and then it prints the 
 word that many times. It prints the name on a new line each time. It also displays the 
 number of times that the program printed the name to the user. It uses a while loop to 
 print the names.
 What I learned: Using the length() function in java.
 Difficulties I faced: None Experienced. 
 **/
import java.util.*;
public class WordLengthPrinter
{
    public static void main(String ar[])
    {
        Scanner sc = new Scanner (System.in);//creates an object of the Scanner class
        System.out.print("Enter a word: ");//asks user for input
        String word = sc.nextLine();//accepts the word from the user as a String
        int length = word.length();//this stores the length of the word inputted by the user
        System.out.println("The length of your word is "+length+" characters");
        System.out.println();//this prints a blank line
        while(length>0)//this loop prints the word
        {
            System.out.println(word);//prints the word
            length--;//decrements the length
        }
        System.out.println("\n");//leaves a line
        System.out.print("So I printed it "+word.length()+" times");//prints the number of times
        //the word was printed
    }
}
/**
 Program Output:

Enter a word: Howdy
The length of your word is 5 characters

Howdy
Howdy
Howdy
Howdy
Howdy


So I printed it 5 times




Enter a word: Bingo
The length of your word is 5 characters

Bingo
Bingo
Bingo
Bingo
Bingo


So I printed it 5 times




Enter a word: College
The length of your word is 7 characters

College
College
College
College
College
College
College


So I printed it 7 times

 **/
