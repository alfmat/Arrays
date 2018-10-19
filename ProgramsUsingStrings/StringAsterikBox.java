/**
 Name: Alfred Mathew
 Platform: macOS High Sierra, BlueJ
 Date: 12/05/17
 Program: StringAsterikBox
 
 Description: This program accepts a String from a user. It then proceeds to print
 the String in a box made of Asteriks. 
 What I learned: Using the length() method and the String class
 Difficulties I faced: None Experienced.
 
 **/
import java.util.Scanner;
public class StringAsterikBox 
{
    public static void main(String[] args) 
    { 
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a String: ");
            String text = input.nextLine();//inputs text from the user
            /*
             * Variable Descriptions:
             * text --> this is the input of the user
             * width --> this stores the width of the box
             * x --> control variable used for the while loop
             */
            int width = text.length() + 5, x = 0; 
            //note: 5 was added to the width to account for whitespaces and asteriks
            while(x < width)
            {
                System.out.print("*"); //print the top of the box
                x++;//increments the control variable
            }
            System.out.println();//prints a blank line
            /*
             * The following for loop accounts for the contents within the box
             */
            for(int y = 0; y < 3; y++)//prints the inner lines of the text box; y represents the line number
            {
                System.out.print("*");//prints the first asterik on the side of the box            
                //switch statement helps print whitespace
                switch(y) 
                {                    
                    case 0://this is for the first and third line
                    case 2:
                    x=0;
                    while(x<width-2)//width-2 accounts for the asteriks on the ends
                    {
                        System.out.print(" ");//prints the spaces
                        x++;
                    }
                    break;
                }
                if(y == 1)
                System.out.print(" " + text + "  "); //prints the text
                System.out.print("*\n");//jumps to the next line after printing the last asterik
            }    
            x= 0;//resets the loop control variable
            while(x<width)
            {
                System.out.print("*"); //prints the bottom of the box
                x++;
            }
    }
}
