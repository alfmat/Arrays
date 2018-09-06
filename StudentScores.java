/**
 Name: Alfred Mathew
 Platform: macOS High Sierra, BlueJ
 Date: 02/11/18
 Program: StudentScores
 
 Description: This program imports a file and creates two arrays that store
 id numbers and scores. The average, sum, and difference between an individual score
 and the average score is displayed to the user.
 What I learned: Using arrays
 Difficulties I faced: None Experienced.  
 **/
import java.util.*;
import java.io.*;
public class StudentScores
{
    public static void main(String ar[])
    {
        /*
         * Object Descriptions:
         * sc --> object of the Scanner class
         * obj --> object of the EasyFormat class
         */
        Scanner sc = null;
        EasyFormat obj = new EasyFormat();
        try
        {
            //imports the file
            sc = new Scanner (new File("Prog402a.dat"));
        }
        catch(FileNotFoundException e)//if the file is not found
        {
            System.out.println("File not found!");
            System.exit(0);//exits the program
        }
        /*
         * Variable Descriptions:
         * index --> this represents the array index
         * average --> this is the average of the elements of the array
         * id --> array that stores the id numbers
         * score --> array that stores all the scores
         */
        int index;
        double average=0;
        int id[] = new int[20],score[] = new int[20];
        /*
         * this loop imports the id and the score from the file to store in their
         * respective arrays
         */
        for(index=0;index<20;index++)
        {
            id[index] = sc.nextInt();//stores the id to the array
            score[index] = sc.nextInt();//stores the score in the array
        }
        average = avg(score);//stores the average score for further use
        //output
        System.out.println("Finished reading file.");
        System.out.println("Sum = "+sum(score));
        System.out.println("Average = "+average);
        System.out.println("Count = 20\n");
        
        //header for table with individual ids and scores
        System.out.println(obj.format("ID",15)+obj.format("Score",15)+obj.format("Difference",15));
        /*
         * this loop prints the id and score along with the difference between the score and 
         * the average
         */
        for(index=0;index<20;index++)
        System.out.println(obj.format(id[index],15)+obj.format(score[index],15)+obj.format(round(average-score[index]),15));
    }
    /**
     * This method calculates the sum of the elements of an array
     * pre: array with number of elements>0
     * post: the calculated sum of the elements is returned
     */
    private static int sum(int x[])
    {
        int j, sum=0;
        /*
         * this loop extracts each digit from the array and adds it to a variable called
         * "sum" which is then returned to the user
         */
        for(j=0;j<x.length;j++)
        sum+=x[j];
        return sum;
    }
    /**
     * This method calculates the average of the elements of an array
     * pre: array with number of elements>0
     * post: the calculated average of the elements is returned
     */
    private static double avg(int x[])
    {
        int sum = sum(x);//the sum of the elements is stored in a local variable
        double average = (double)sum/x.length;//average is computed
        return average;
    }
    /**
     * This method rounds a value to two decimal places
     * pre: none
     * post: the calculated rounded value is returned
     */
    private static double round(double a)
    {
        a = (int)(a*100+0.5)/100.0;//rounds to two decimal places
        return a;
    }
}
/**
 Program Output:
 
Finished reading file.
Sum = 4853
Average = 242.65
Count = 20

             ID          Score     Difference
            115            257         -14.34
            123            253         -10.34
            116            246          -3.34
            113            243          -0.34
            112            239           3.65
            104            239           3.65
            110            238           4.65
            218            243          -0.34
            208            242           0.65
            222            223          19.65
            223            230          12.65
            213            229          13.65
            207            228          14.65
            203            224          18.65
            305            265         -22.34
            306            262         -19.34
            311            256         -13.34
            325            246          -3.34
            321            245          -2.34
            323            245          -2.34

            
 **/
