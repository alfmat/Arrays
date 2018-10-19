/**
 Name: Alfred Mathew
 Platform: macOS Sierra, BlueJ
 Date: 09/22/17
 Program: BattingAvg
 
 Description: The program inputs information about a player and calculates the batting
 average and on base percentage of the player.
 What I learned: Rounding to the thousandths place. Casting integers to double type.
 Difficulties I faced: None Experienced.
 **/
import java.util.*;
public class BattingAvg
{
    public static void main(String arg[])
    {
        BattingAvg obj = new BattingAvg();//object creation
        Scanner sc = new Scanner (System.in);//object of the scanner class
        //input statements
        System.out.print("Enter Player's Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Number of Times at bat: ");
        int a = sc.nextInt();
        System.out.print("Enter Number of Hits: ");
        int b = sc.nextInt();
        System.out.print("Enter Number of Walks: ");
        int c = sc.nextInt();
        double atbat = (double)a, hits = (double)b, walks = (double)c;//casting to double
        //the following statements calculate batting average and on base percentage
        //rounded to the thousandths place
        double battingAvg = obj.roundMethod((hits)/(atbat-walks)), 
        onBase = obj.roundMethod((hits+walks)/atbat);
        System.out.println();//prints a blank line
        //output statements
        System.out.println("Player "+name+" has a");
        System.out.println("batting average of "+battingAvg+" and");
        System.out.println("an On Base Percentage of "+onBase);
    }
    double roundMethod(double a)//method used to round to the thousandths place
    {
        double b = (int)(a*1000+.5)/1000.0;
        return b;
    }
}
/**
 Program Output:
 
 Enter Player's Name: Alfred
 Enter Number of Times at bat: 76
 Enter Number of Hits: 43
 Enter Number of Walks: 20

 Player Alfred has a
 batting average of 0.768 and
 an On Base Percentage of 0.829
 
 **/
