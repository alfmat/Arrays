/**
 Name: Alfred Mathew
 Platform: macOS High Sierra, BlueJ
 Date: 12/19/17
 Program: TrianglePrinter
 
 Description: The program prints three types of trianlges based on a user input
 it prints the number of rows based on the user's specifications.
 What I learned: Using methods.
 Difficulties I faced: None Experienced.
 **/
import java.util.*;
public class TrianglePrinter
{
    static Scanner sc = new Scanner (System.in);//object of the Scanner class
    static int rows;//this is the number of rows given by the user
    public static void main(String args[])
    {
        //these are the options given to the user
        System.out.println("Types of Triangles:");
        System.out.println("\t1. Left\n\t2. Right\n\t3. Center\n");
        System.out.print("Enter a number of Triangle Type (1-3): ");
        int type = sc.nextInt();//this accepts the type of triangle from the user
        System.out.print("How many rows?: ");
        rows = sc.nextInt();//accepts the number of rows
        System.out.println();//formatting
        switch(type)
        {
            case 1:
            leftTriangle();//calls the leftTriangle() method
            break;
            case 2:
            rightTriangle();//calls the rightTriangle() method
            break;
            case 3:
            centerTriangle();//calls the centerTriangle() method
            break;
            default://in the event of a bad input
            System.out.println("Wrong input");
        }
    }
    /**
     * Prints a right-triangle aligned to the left
     * pre: no of rows
     * post: the triangle is printed with the correct number of rows
     */
    static void leftTriangle()
    {
        for(int i = 1;i <= rows; i++)//prints the rows
        {
            for(int j = 1; j<=i; j++)//prints the asteriks
            System.out.print("*");
            System.out.println();//formatting
        }
    }
    /**
     * This method prints a right-triangle aligned to the right
     * pre: number of rows
     * post: the right-triangle is printed aligned to the right
     */
    static void rightTriangle()
    {
        for(int i = 1; i <= rows; i++)//prints the rows
        {
            for(int j = rows-1; j >= i; j--)//prints the number of spaces before the asterik
            System.out.print(" ");
            for(int k = 1; k <= i; k++)//prints the individual asteriks
            System.out.print("*");
            System.out.println();//formatting
        }
    }
    /**
     * This method prints the a triangle aligned to the center
     * pre: the number of rows
     * post: prints a triangle aligned to the center 
     */
    static void centerTriangle()
    {
        int i,j,k;
        for(i=1; i<=rows; i++)//prints the number of rows
        {
            for(j=rows-1; j>=i; j--)//prints the spaces before the asterik
            System.out.print(" ");
            for(k=1; k<=(2*i-1); k++)//prints the asteriks
            System.out.print("*");
            System.out.println();//formatting
        }
    }
}
/**
 Program Output:

Output #1:
Types of Triangles:
	1. Left
	2. Right
	3. Center

Enter a number of Triangle Type (1-3): 2
How many rows?: 6

     *
    **
   ***
  ****
 *****
******


Output #2:
Types of Triangles:
	1. Left
	2. Right
	3. Center

Enter a number of Triangle Type (1-3): 1
How many rows?: 8

*
**
***
****
*****
******
*******
********


Output #3:
Types of Triangles:
	1. Left
	2. Right
	3. Center

Enter a number of Triangle Type (1-3): 3
How many rows?: 6

     *
    ***
   *****
  *******
 *********
***********


**/
