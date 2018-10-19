/**
 Name: Alfred Mathew
 Platform: macOS High Sierra, BlueJ
 Date: 02/11/18
 Program: SortingPositiveNegative
 
 Description: This program imports two files. These files contain a mixture of positive
 and negative numbers. The program then stores the positive numbers and negative numbers found
 in the file into two separate arrays. It then prints these arrays to the user.
 What I learned: Using arrays
 Difficulties I faced: None Experienced. 
 **/
import java.util.*;
import java.io.*;
public class SortingPositiveNegative
{
    public static void main(String ar[])
    {
        /*
         * Object Descriptions:
         * sc1 & sc2 --> These are objects of the Scanner class that are used to read
         * data from the two files.
         * obj --> this is the object of the EasyFormat class that is used to format the output
         */
        Scanner sc1=null,sc2=null;
        EasyFormat obj = new EasyFormat();
        
        /*
         * Variable Descriptions:
         * PosNumbers --> this is the array that stores the positive numbers in the file
         * NegNumbers --> this is the array that stores the negative numbers in the file
         * countPos --> this stores the total number of positive numbers in the file, it is used
         * when declaring the array size.
         * countNeg --> this stores the total number of negative numbers in the file, it is used
         * when declaring the array size.
         * number --> this is the individual number imported from the file
         */
        int PosNumbers[],NegNumbers[],countPos=0,countNeg=0,number=0;
        
        
        try
        {
            sc1 = new Scanner (new File("SortingPositiveNegative1.dat"));  //imports file
        }
        catch(FileNotFoundException c)
        {
            System.out.println("File 1 Could not be located!");
            System.exit(0);//if the file is not found
        }
        
        /*
         * Loop Descriptions:
         * This loop helps find the number of positive and negative numbers in the file
         */
        while(sc1.hasNext())
        {
            if(sc1.nextInt()<0)
            countNeg++;
            else
            countPos++;
        }
        
        /*
         * Since the object has been used we declare the object to be null 
         */
        sc1 = null;
        
        
        /*
         * We create the object again to extract the numbers
         */
        try
        {
            sc1 = new Scanner (new File("SortingPositiveNegative1.dat"));  
        }
        catch(FileNotFoundException c)
        {
            System.out.println("File 1 Could not be located!");
            System.exit(0);
        }
        
        PosNumbers = new int[countPos];//declares the array
        countPos=0;//used to identify the elements in the array
        NegNumbers = new int[countNeg];//declares the array
        countNeg=0;//used to identify the elements in the array
        
        while(sc1.hasNext())
        {
            number = sc1.nextInt();//extracts the individual number from the file
            if(number<0)//if the number is less than 0
            {
                NegNumbers[countNeg] = number;//assigns the number to the negative number array
                countNeg++;//used to identify the element of the array
            }
            else//if the number is greater than 0
            {
                PosNumbers[countPos] = number;//assigns the number to the positive number array
                countPos++;//used to identify the element of the array
            }
        }
        
        //prints the header of the table
        System.out.println(obj.format("Positive",15)+obj.format("Negative",15));
        //sets the position variables to n-1 so that the position of the elements in the array
        //can be identified
        countPos--;
        countNeg--;
        
        /*
         * This loop prints the numbers in each row
         */
        while(countPos>=0||countNeg>=0)
        {
            if(countPos>=0)
            {
                System.out.print(obj.format(PosNumbers[countPos],15));
                countPos--;//prints the positive number
            }
            if(countNeg>=0)
            {
                System.out.print(obj.format(NegNumbers[countNeg],15));  
                countNeg--;//prints the negative number
            }
            System.out.println();//formatting
        }
        
        System.out.println("\n\n");//formatting
        
        
        //resets variables for use in second file
        countPos=0;
        countNeg=0;
        PosNumbers = null;
        NegNumbers = null;
        
        try
        {
            sc2 = new Scanner (new File("SortingPositiveNegative2.dat")); //imports file 
        }
        catch(FileNotFoundException c)
        {
            System.out.println("File 2 Could not be located!");
            System.exit(0);//if the file could not be found
        }
        
        /*
         * This loop finds the number of positive and negative numbers in the file
         */
        while(sc2.hasNext())
        {
            if(sc2.nextInt()<0)//if the number is negative
            countNeg++;
            else
            countPos++;
        }
        
        
        sc2 = null;//resets the object to null
        
        /*
         * Imports the file
         */
        try
        {
            sc2 = new Scanner (new File("SortingPositiveNegative2.dat"));  
        }
        catch(FileNotFoundException c)
        {
            System.out.println("File 2 Could not be located!");
            System.exit(0);//if the file is not found
        }
        
        //initializes the arrays to store the correct number of numbers
        
        PosNumbers = new int[countPos];
        countPos=0;//resets variable for assignment in next while loop
        NegNumbers = new int[countNeg];
        countNeg=0;
        
        //assigns the positive and negative numbers to the array
        while(sc2.hasNext())
        {
            number = sc2.nextInt();//stores the number
            if(number<0)//number is negative
            {
                NegNumbers[countNeg] = number;
                countNeg++;//assigned to the negative array
            }
            else//number is positive
            {
                PosNumbers[countPos] = number;
                countPos++;//assigned to the positive array
            }
        }
        
        //prints the header for the second table
        System.out.println(obj.format("Positive",15)+obj.format("Negative",15));
        
        //this adjusts the variable's position to n-1
        countPos--;
        countNeg--;
        
        //posPrint is used to identify when all positive numbers have been printed
        //this was done for formatting purposes
        boolean posPrint = false;
        while(countPos>=0||countNeg>=0)
        {
            if(countPos>=0)//if there are still numbers to print
            {
                System.out.print(obj.format(PosNumbers[countPos],15));
                countPos--;
            }
            else//if all the positive numbers have been printed
            posPrint=true;
            if(countNeg>=0)
            {
                if(posPrint)//when all the positive numbers have been printed
                System.out.print(obj.format("",15));//prints blank space
                
                //prints the negative number
                System.out.print(obj.format(NegNumbers[countNeg],15));  
                countNeg--;
                
            }
            System.out.println();//skips to the next line
        }
    }
}


/**
 Program Output:
 
       Positive       Negative
             33            -45
             54            -76
             39            -55
              9             -3
             55            -55
             64            -22
             34            -34
             21            -56
             19            -16
             22             -8
             54
             66
              3



       Positive       Negative
             45            -25
             76             -3
             55            -54
              3            -89
             55             -9
             22            -55
             34            -64
             56            -34
             10            -21
              8            -19
                           -22
                           -54
                           -66
                            -3
                            
                            
 **/
