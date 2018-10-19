/**
 Name: Alfred Mathew
 Platform: macOS Sierra, BlueJ
 Date: 09/19/17
 Program: QuadEquationSolver
 
 Description: The program is used to calculate the roots of a quadratic equation. It inputs the values of a,b, & c for the quadratic equation
 ax^2+bx+c. 
 What I learned: Calculating the roots of a quadratic equations. Input of double data types on the same line
 Difficulties I faced: Inputting values all on the same line. I forgot that a white space delimits the area for the Scanner class to read.
 **/
import java.util.*;//Util package of java
public class QuadEquationSolver
{
    public static void main(String ar[])
    {
        System.out.println("Quadratic Equation Solver");
        Scanner sc = new Scanner(System.in);//object of Scanner class
        System.out.print("Enter A, B, C [all on one line] ");
        double a,b,c,d;
        a = sc.nextDouble();//input
        b = sc.nextDouble();
        c = sc.nextDouble();
        d = Math.pow(b,2)-(4*a*c); //b^2-4*a*c "the discriminant" helps us to determine the nature of the roots
        //output
        if (d<0)
        {
            System.out.println("The roots are imaginary");
        }
        else
        {
            double x = (-b + Math.sqrt(d))/(2*a);//equation for calculating the roots
            double y = (-b - Math.sqrt(d))/(2*a);
            System.out.println("The roots are: "+y+","+x);
        }
    }
}
/**
 Program Output #1:
  
 Quadratic Equation Solver
 Enter A, B, C [all on one line] 1 5 6
 The roots are: -3.0,-2.0
 
 
 
 Program Output #2:
 
 Quadratic Equation Solver
 Enter A, B, C [all on one line] 1 1 -2
 The roots are: -2.0,1.0
 
 
 
 Program Output #3:
 
 Quadratic Equation Solver
 Enter A, B, C [all on one line] 1 1 -6
 The roots are: -3.0,2.0

 **/
