/**
 Name: Alfred Mathew
 Platform: macOS High Sierra, BlueJ
 Date: 09/26/17
 Program: PowerConsumption
 
 Description: The program inputs the amount (in kwh) of electricity consumed and calculates the amount to be 
 paid for that month. It give a complete description of the bill, this includes the amount paid in city taxes 
 and the surcharge amount.
 What I learned: Storing multiple constants and using them in a program.
 Difficulties I faced: None Experienced.
 **/
import java.util.*;
public class PowerConsumption
{
    public static void main(String ar[])
    {
        Scanner sc = new Scanner(System.in);//Object of Scanner class
        PowerConsumption obj = new PowerConsumption();//Object of class PowerConsumption
        final double  surchargeRate = 0.1, cityTaxRate = 0.03, kwhRate = 0.0475;//constant values used for calculation in the program
        double totalCost, usageCost, lateCost, surchargeCost, cityTax;//intialization statements
        System.out.print("Enter KWH used ");
        int usedKWH = sc.nextInt();//inputs the kwh used for a particular month
        //the following calculations help determine Base Charge, Surcharge, City Tax, Total Amount, and Late Charge
        usageCost = obj.roundMethod(usedKWH * kwhRate);
        surchargeCost = obj.roundMethod(usageCost * surchargeRate);
        cityTax = obj.roundMethod(usageCost*cityTaxRate);
        totalCost = obj.roundMethod(usageCost + cityTax + surchargeCost);
        lateCost = obj.roundMethod(1.04*totalCost);
        //output statements
        System.out.println();
        System.out.println("             C O M P S C I  Electric            ");
        System.out.println("------------------------------------------------");
        System.out.println("Kilowatts Used             "+usedKWH+" @ $ 0.0475      ");
        System.out.println("------------------------------------------------");
        System.out.println("Base Charge                      $ "+usageCost);
        System.out.println("Surcharge                        $ "+surchargeCost);
        System.out.println("City Tax                         $ "+cityTax);
        System.out.println("                                 _____");
        System.out.println();
        System.out.println("Pay this amount                  $ "+totalCost);
        System.out.println();
        System.out.println("After May 20th Pay               $ "+lateCost);
    }
    double roundMethod(double a)//method used to round to the hundreths place
    {
        double b = (int)(a*100+0.5)/100.0;
        return b;
    }
}
/**
 Program Output:
 
 Test Case #1:
 Enter KWH used 993

             C O M P S C I  Electric            
 ------------------------------------------------
 Kilowatts Used             993 @ $ 0.0475      
 ------------------------------------------------
 Base Charge                      $ 47.17
 Surcharge                        $ 4.72
 City Tax                         $ 1.42
                                 _____

 Pay this amount                  $ 53.31

 After May 20th Pay               $ 55.44
 
 
 
 Test Case #2:
 Enter KWH used 567

              C O M P S C I  Electric            
 ------------------------------------------------
 Kilowatts Used             567 @ $ 0.0475      
 ------------------------------------------------
 Base Charge                      $ 26.93
 Surcharge                        $ 2.69
 City Tax                         $ 0.81
                                 _____

 Pay this amount                  $ 30.43

 After May 20th Pay               $ 31.65
 
 
 
 Test Case #3:
 Enter KWH used 654

              C O M P S C I  Electric            
 ------------------------------------------------
 Kilowatts Used             654 @ $ 0.0475      
 ------------------------------------------------
 Base Charge                      $ 31.07
 Surcharge                        $ 3.11
 City Tax                         $ 0.93
                                 _____

 Pay this amount                  $ 35.11

 After May 20th Pay               $ 36.51

 **/
