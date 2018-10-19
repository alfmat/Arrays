/**
 Name: Alfred Mathew
 Platform: macOS High Sierra, BlueJ
 Date: 02/20/18
 Program: ArrayRandomNum
 
 Description: This program generates 20 random numbers from 1-30 and stores them in an array.
 While doing so, it makes sure that the random number generated is not already in the
 array. It then prints the array in ascending order to the user.
 What I learned: Sorting and printing arrays
 Difficulties I faced: None Experienced.  
 **/
import java.util.*;
public class ArrayRandomNum
{
    public static void main(String ar[])
    {
        /*
         * Variable Descriptions:
         * number --> this stores the randomly generated number
         * 
         * position --> this is the memory location in the array in which we will 
         * store the number.
         * 
         * array --> this is the array that stores the randomly generated values
         * 
         * repeat --> this variable is used to help identify when a number has been repeated
         */
        int number=0,position=0,array[] = new int[20];
        boolean repeat = false;
        
        /*
         * Object Descriptions:
         * obj --> this is the object of the Random class that will be used to generate random 
         * numbers
         * 
         * easy --> this is the object of the EasyFormat class that will be used to format
         * the output.
         */
        Random obj = new Random();
        EasyFormat easy = new EasyFormat();
        
        /*
         * This for loop will generate and store the numbers in the array
         */
        for(position=0;position<20;)
        {
            //generates a random number from 1-30
            number = 1+obj.nextInt(30);
            /*
             * The nested loop checks to see if the number has been repeated
             */
            for(int j=0;j<20;j++)
            {
                if(number==array[j])
                repeat=true;
            }
            
            //if the number is repeated, the primary loop is executed again 
            //to get a new number
            if(repeat==true)
            {
                repeat = false;
                continue;                
            }
            
            //the number is stored and we move on to the next memory location in the array
            array[position] = number;
            position++;
        }
        
        //sorts the array in ascending order
        sortArray(array);        
        //prints a title for the header
        System.out.println("The Random Numbers are: ");
        
        /*
         * this for loop prints the numbers in tabular format
         */
        for(int i=0;i<20;i++)
        {
            System.out.print(easy.format(array[i],10));
            if((i+1)%5==0)
            System.out.println();
        }
    }
    
    /**
     * This method sorts the array in ascending order
     * pre: none
     * post: sorted array in ascending order
     */
    private static void sortArray(int array[])
    {
        /*
         * Variable Descriptions:
         * temp --> variable that temporarily stores values while sorting the array
         * 
         * i --> loop control variable
         * 
         * j --> loop control variable
         * 
         * array --> user given array
         */
        int temp=0;
        for(int i = 0;i<array.length;i++)//first number in array
        {
            for(int j = i+1;j<array.length;j++)//second number in array
            {
                if(array[i]>array[j])//if first is greater than second
                {
                    temp = array[j];//assigns the lesser number to the temporary variable
                    array[j] = array[i];//the lesser number is assigned to the first memory location
                    array[i] = temp;//the higher number is assigned to the next memory location
                }
            }
        }
    }
}

/**
 
 Program Output:
 
 #1:
 The Random Numbers are: 
         1         2         3         5         7
         8        10        12        13        15
        17        18        21        22        23
        26        27        28        29        30
 
  
        
        
  #2:
  The Random Numbers are: 
         2         3         5         7         8
         9        10        12        14        15
        17        20        23        24        25
        26        27        28        29        30
        
    
  #3:
  The Random Numbers are: 
         1         2         3         5         7
         8         9        12        13        14
        15        16        18        19        21
        22        23        24        27        28
        
        
        
 **/
