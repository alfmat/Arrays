/**
 Name: Alfred Mathew
 Platform: macOS High Sierra, BlueJ
 Date: 01/04/18
 Program: HistogramPrint
 
 Description: This program uses method overloading and prints a histogram based on 
 a user's input.
 What I learned: Overloading methods.
 Difficulties I faced: None Experienced.
 **/
import java.util.*;
public class HistogramPrint
{
    public static void main(String ar[])
    {
        HistogramPrint obj = new HistogramPrint();//object of the class
        Scanner sc = new Scanner (System.in);//object of the Scanner class
        System.out.print("Enter Value to Chart: ");
        /*
         * Variable Description:
         * value --> this collects the number of asteriks/characters to print for 
         * the histogram
         * choice --> this character is used to determine whether the user would like
         * to use a unique character in the histogram
         */
        double value = sc.nextDouble();
        System.out.print("Do you wish to supply the graphing character (Y/N) ");
        char choice = sc.next().charAt(0);
        if(choice == 'Y' || choice == 'y')//if the user says yes
        {
            System.out.print("Enter the character: ");
            char graphChar = sc.next().charAt(0);//accepts a character from the number
            obj.histDisplay(value,graphChar);//method call
        }
        else if(choice == 'N' || choice == 'n')//if the user says no
        {
            obj.histDisplay(value);//method call
        }
        else //if another character is entered
        {
            System.out.println("Wrong Input!");
            System.exit(0);//exits the program
        }
    }
    /**
     * This method constructs a histogram given a character and the number of times to print it.
     * pre: number>0
     * post: histogram using printed using the given character
     */
    public void histDisplay(double number, char print)
    {
        double original = number;//copies user input to a backup variable
        number = Math.round(number);//rounds the user input
        while(number>0)//method used to print the histogram
        {
            System.out.print(print);//prints the character given by the user
            number--;
        }
        System.out.print(original);//prints the original number entered by the user
    }
    /**
     * This method constructs a histogram using a number given by the user.
     * pre: number>0
     * post: Prints a histogram made of asteriks. The number of asteriks is equal to the user 
     * input.
     */
    public void histDisplay(double number)
    {
        double original = number;//copies user input to a backup variable
        number = Math.round(number);//rounds the user input
        while(number>0)//method used to print the histogram
        {
            System.out.print('*');//prints the asterik
            number--;
        }
        System.out.print(original);//prints the original number entered by the user
    }
}
/**
 Program Output:
 
Enter Value to Chart: 5.5
Do you wish to supply the graphing character (Y/N) y
Enter the character: @
@@@@@@5.5

Enter Value to Chart: 7
Do you wish to supply the graphing character (Y/N) n
*******7.0
 
Enter Value to Chart: 7.9
Do you wish to supply the graphing character (Y/N) y
Enter the character: ^
^^^^^^^^7.9

Enter Value to Chart: 8
Do you wish to supply the graphing character (Y/N) y
Enter the character: &
&&&&&&&&8.0
 
 **/
