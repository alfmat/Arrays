/**
 Name: Alfred Mathew
 Platform: macOS High Sierra, BlueJ
 Date: 02/11/18
 Program: StudentData
 
 Description: This program imports a file that contains the id numbers and scores of students
 on an exam. The program stores these data into two separate arrays. It then sorts the 
 arrays from highest score to lowest score and prints the scores along with their
 respective ID numbers as its output.
 What I learned: Sorting arrays
 Difficulties I faced: None Experienced.  
 **/
import java.io.*;
import java.util.*;
public class StudentData
{
    public static void main(String ar[])
    {
        /*
         * Object Descriptions:
         * sc --> Object of the Scanner class
         * obj --> Object of the EasyFormat class
         */
        Scanner sc = null;
        EasyFormat obj = new EasyFormat();
        
        /*
         * Variable Descriptions:
         * id --> this is an array consisting of 25 elements that stores the id numbers of the students
         * score --> this is an array consisting of 25 elements that stores the scores of the students
         * position --> this variable is used to identify positions within the array
         */
        int id[] = new int[25],score[] = new int[25],position;
        
        //importing the file
        try
        {
            sc = new Scanner (new File ("StudentData.dat"));
        }
        catch(FileNotFoundException e)
        {
            System.out.print("The file could not be found!");
            System.exit(0);//if the file is not located
        }
        
        //fills the arrays with data
        while(sc.hasNext())
        {
            for(position = 0;position<25;position++)
            {
                id[position] = sc.nextInt();
                score[position] = sc.nextInt();
            }
        }
        
        
        //calls on method to sort the arrays from highest score to lowest score
        //with their respective id numbers
        sortScores(score,id);
       
        //prints the header of the table
        System.out.println(obj.format("ID",15)+obj.format("Score",15));
        //this loop prints each line of the table
        for(position = 0;position<25;position++)
        System.out.println(obj.format(id[position],15)+obj.format(score[position],15));
        System.out.println("\nGreat Job, all the scores have been sorted!");
    }
    /**
     * This is used to sort the scores from highest to lowest along with the id numbers
     * pre: two arrays with the same number of elements
     * post: the arrays are sorted from highest to lowest
     */
    public static void sortScores(int number[],int id[])
    {
        int n = number.length;//acquires the length of the first array; assumes both are of same length
        
        /*
         * Variable Descriptions:
         * i --> loop control variable
         * j --> loop control variable
         * temp --> temporary storage for array elements while sorting
         */
        int i,j,temp;
        for (i = 0; i < n; ++i)//this one element of the array
        {
            for (j = i + 1; j < n; ++j) //element of the array after i
            {
                if (number[i] < number[j]) //if the first element is less than the second
                {
                    temp = number[i];//the lesser number is assigned to a temporary variable
                    number[i] = number[j];//this assigns the greater number to the first position
                    number[j] = temp;//the lesser number is assigned to a later position
                    
                    //the same process repeats here except with id numbers
                    temp = id[i];
                    id[i] = id[j];
                    id[j]=temp;
                }
            }
        }
    }
}
/**
 Program Output:
 
             ID          Score
              1            599
              4            560
              3            559
              2            513
            365            265
            306            262
            115            257
            311            256
            123            253
            325            246
            116            246
            323            245
            321            245
            113            243
            218            243
            302            242
            208            242
            112            239
            104            239
            110            238
            223            230
            213            229
            207            228
            203            224
            222            223

Great Job, all the scores have been sorted!
 
 **/
