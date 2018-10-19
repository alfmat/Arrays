/**
 Name: Alfred Mathew
 
 Date: 09/14/17

 
 Description: The program accepts 4 numbers. It then calculates the sum
              and average, and then displays it.
 Difficulties Faced: No significant difficulties faced.
 What I learned: Implementation of typecasting and concatenation in a program.
 **/
public class AverageAndSum
{
    public static void main(String args[])//main method
    {
        int a=475,b=821,c=369,d=562, e=a+b+c+d;//Variable e contains the sum.
        double x= (double)(a+b+c+d)/4;//Variable x stores the average.  
        //The integers are converted to double to maintain precision.
        System.out.println("Thank you for entering your four numbers!  Your results are:");
        System.out.println();//Prints a blank line
        System.out.println("The sum of the four numbers is "+e+" and the average is "+x);
    }
}
/**
 Program Output:
 
 Thank you for entering your four numbers!  Your results are:

 The sum of the four numbers is 2227 and the average is 556.75
 **/
