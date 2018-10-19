/**
 Name: Alfred Mathew
 Platform: macOS Sierra, BlueJ
 Date: 09/22/17
 Program: InterestCalc
 
 Description: Inputs values for principal, rate, and time. It then calculates the Amount and interest of the principal. The output is rounded to 
 the hundreths place.
 What I learned: Rounding, calculating interest, and using exponents.
 Difficulties I faced: No significant challenges faced.
 **/
import java.util.*;
public class InterestCalc
{
    public static void main(String ar[])
    {
        InterestCalc obj = new InterestCalc();//object creation
        Scanner sc = new Scanner(System.in);//object of the scanner class
        double A,r;//amount and rate
        int P,n,t;//principal, times compounded per year, number of days
        //input
        System.out.print("Amount Saved ");
        P = sc.nextInt();
        System.out.print("Interest rate? ");
        r = sc.nextDouble();
        System.out.print("Number of times compounded per year? ");
        n = sc.nextInt();
        System.out.print("Number of days at interest? ");
        t = sc.nextInt();
        A = P * Math.pow((1.0 + ((0.01*r)/n)),((n*t)/365.0));//calculates amount
        A = obj.roundMethod(A);//rounds the amount
        double interest = obj.roundMethod(A-P);//rounds the interest
        System.out.println();//prints a blank line
        //output
        System.out.println("The interest earned is $"+interest);
        System.out.println("The total amount in savings is now $"+A);
    }
    double roundMethod(double a)//rounds to the thousandths place
    {
        double b = (int)(a*100+0.5)/100.0;
        return b;
    }
}
/**
 Program Output:
 
 
 Output 1:
 Amount Saved 5000
 Interest rate? 11.5
 Number of times compounded per year? 365
 Number of days at interest? 900

 The interest earned is $1638.96
 The total amount in savings is now $6638.96
 
 
 Output 2:
 Amount Saved 10000
 Interest rate? 16.5
 Number of times compounded per year? 365
 Number of days at interest? 90

 The interest earned is $415.14
 The total amount in savings is now $10415.14

 
 Output 3:
 Amount Saved 1500
 Interest rate? 8.5
 Number of times compounded per year? 365
 Number of days at interest? 365

 The interest earned is $133.06
 The total amount in savings is now $1633.06

 **/
