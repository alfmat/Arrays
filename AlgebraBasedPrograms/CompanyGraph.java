/**
 Name: Alfred Mathew
 Platform: macOS High Sierra, BlueJ
 Date: 01/04/18
 Program: CompanyGraph
 
 Description: This program prints a graph based on a randomly generated number that
 represents a company's sales.
 What I learned: Using methods.
 Difficulties I faced: None Experienced.
 **/
import java.util.*;
public class CompanyGraph
{
    static int i = 0;//this global variable represents the day of the month
    public static void main(String ar[])
    {
        HistogramPrint obj = new HistogramPrint();//object of the class Prog310a2
        System.out.println("Day     "+"Daily     "+"Sales Graph");//prints the header of the graph
        for(i=2;i<=31;i++)//this for loop is used to print the graph
        {
            if(i==8||i==15||i==22||i==29)//this accounts for sundays
            {
                System.out.println();//formatting
                continue;//continues the condition check
            }
            int number = randGen();//method call
            if(i<10)//formatting
            System.out.print("   "+i+"     "+number+"     ");
            else//adjusts the white spaces before the day number
            System.out.print("  "+i+"     "+number+"     ");
            obj.histDisplay(number/1000);//this is a method call
            System.out.println();//formatting
        }
    }
    /**
     * This method is used to generate the random number that determines the length of 
     * the graph.
     * pre: none
     * post: Randomly generated number
     */
    public static int randGen()
    {
        Random rand = new Random();//object of the Random class
        int number=0;//this variable will store the randomly generated number
        if(i==2||i==9||i==16||i==23||i==30)//if the day is a monday
        number = rand.nextInt(20000)+30001;//minimum of 30,000
        else if(i==3||i==10||i==17||i==24||i==31)//if the day is a tuesday
        number = rand.nextInt(30000)+20001;//minimum of 20,000
        else if(i==7||i==14||i==21||i==28)//if the day is a saturday
        number = 10001+rand.nextInt(5000);//less than 15,000, minimum is 10,000
        else//for all other days
        number = rand.nextInt(40000)+10001;//minimum of 10,000
        return number;//returns the random number
    }
}
/**
 
 
Day     Daily     Sales Graph
   2     40284     ****************************************
   3     42099     ******************************************
   4     31074     *******************************
   5     16584     ****************
   6     21377     *********************
   7     11775     ***********

   9     32967     ********************************
  10     38891     **************************************
  11     49689     *************************************************
  12     47068     ***********************************************
  13     34555     **********************************
  14     14325     **************

  16     33514     *********************************
  17     39632     ***************************************
  18     15727     ***************
  19     49257     *************************************************
  20     24494     ************************
  21     14063     **************

  23     39011     ***************************************
  24     28140     ****************************
  25     32133     ********************************
  26     44359     ********************************************
  27     10715     **********
  28     13608     *************

  30     32339     ********************************
  31     41726     ***************************************** 
  
 
 **/
