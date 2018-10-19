/**
 Name: Alfred Mathew
 Platform: macOS High Sierra, BlueJ
 Date: 09/25/17
 Program: MonthlyPayment
 
 Description: The program inputs values of amount, rate, and time period from a user.
 It then tells the user the total amount and interest paid. It also calculates and displays
 the monthly amount to be paid.
 What I learned: I gained experience in Testing and Debugging. This program also helped
 me deepen my knowledge of taking inputs on the same line as outputs.
 Difficulties I faced: I initially rounded the numbers too early in my calculations.
 This led to faulty answers, which I corrected by leaving the numbers unrounded.
 **/
import java.util.*;
public class MonthlyPayment
{
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);//object of the scanner class
        MonthlyPayment obj = new MonthlyPayment();//object of the class is created
        double MP,totInterest,totPayment,amt,rate,timeYears,timeMonths;//initialization
        //the following statements facilitate the collection of information from the user.
        System.out.print("The amount I wish to borrow is? ");
        amt = sc.nextDouble();
        System.out.print("The loan rate I can get is? ");
        rate = sc.nextDouble();
        System.out.print("The number of years it will take me to pay off the loan is? ");
        timeYears = sc.nextDouble();
        timeMonths = timeYears*12.0;//converts the time in years to months
        //the next statement calculates the monthly payment
        MP = amt*(rate/1200.0)*((Math.pow(1 + (rate/1200.0),timeMonths))/(Math.pow(1+(rate/1200.0),timeMonths)-1));
        totInterest = (MP*timeMonths)-amt;//calculates total interest
        totPayment = amt+totInterest;//calculates total payment
        System.out.println();//prints a blank line
        //These statements display the result of the calculations after rounding.
        System.out.println("My monthly payments will be $"+obj.roundMethod(MP));
        System.out.println("Total Interest Paid is $"+obj.roundMethod(totInterest));
        System.out.println("Total Amount paid is $"+obj.roundMethod(totPayment));
    }
    double roundMethod(double a)//Method used for rounding to the hundreths place
    {
        double b = (int)(a*100+0.5)/100.0;
        return b;
    }
}
/**
 Output:
 
 Test Case #1:
 
 The amount I wish to borrow is? 7500
 The loan rate I can get is? 14.5
 The number of years it will take me to pay off the loan is? 3

 My monthly payments will be $258.16
 Total Interest Paid is $1793.66
 Total Amount paid is $9293.66
 
 
 
 
 Test Case #2:
 
 The amount I wish to borrow is? 7500
 The loan rate I can get is? 14.5
 The number of years it will take me to pay off the loan is? 4

 My monthly payments will be $206.83
 Total Interest Paid is $2428.06
 Total Amount paid is $9928.06
 
 
 
 Test Case #3:
 
 The amount I wish to borrow is? 7500
 The loan rate I can get is? 7.5
 The number of years it will take me to pay off the loan is? 3

 My monthly payments will be $233.3
 Total Interest Paid is $898.68
 Total Amount paid is $8398.68
 
 
 
 
 
 My Test Cases:
 
 Test Case #1:
 
 The amount I wish to borrow is? 7500
 The loan rate I can get is? 20
 The number of years it will take me to pay off the loan is? 2

 My monthly payments will be $381.72
 Total Interest Paid is $1661.24
 Total Amount paid is $9161.24
 
 
 
 
 Test Case #2:
 
 The amount I wish to borrow is? 9000
 The loan rate I can get is? 15
 The number of years it will take me to pay off the loan is? 3

 My monthly payments will be $311.99
 Total Interest Paid is $2231.57
 Total Amount paid is $11231.57
 
 **/
