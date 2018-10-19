/**
 Name: Alfred Mathew
 Platform: macOS High Sierra, BlueJ
 Date: 12/19/17
 Program: TimeConversion
 
 Description: This program is used to find multiple time-related calculations. It Converts:
 1. Hours to minutes
 2. Days to hours
 3. Minutes to hours
 4. Hours to days
 It also calculates the difference between two different times.
 What I learned: Using methods.
 Difficulties I faced: None Experienced.
 **/
import java.util.*;
public class TimeConversion
{
    static Scanner sc = new Scanner (System.in);//object of the Scanner class
    public static void main(String ar[])//main method
    {
        //displays the menu choices
        System.out.println("Conversion Tasks");
        System.out.print("1.Hours --> Minutes\n2.Days --> Hours\n");
        System.out.print("3.Minutes --> Hours\n4.Hours --> Days\n");
        System.out.print("5.Elapsed Time between two times\n\nEnter a number:");
        int choice = sc.nextInt();//collects the user's choice
        System.out.println("\nElapsed Time Conversion\n");
        switch(choice)//decision-making
        {
            /*
             * In the following switch statement, multiple method calls occur
             * based on the user's selection.
             */
            case 1:
            hoursToMinutes();//calls the hoursToMinutes method
            break;
            case 2: 
            daysToHours();//calls the daysToHours method
            break;
            case 3:
            minutesToHours();//calls the minutesToHours method
            break;
            case 4:
            hoursToDays();//calls the hoursToDays method
            break;
            case 5:
            twoTimeDifference();//calls the twoTimeDifference method
            break;
            default://if the user makes a bad input
            System.out.println("Wrong Input!");
        }
    }
    /**
     * Converts hours to minutes
     * pre: number of hours
     * post: converted number of minutes is displayed
     */
    static void hoursToMinutes()
    {
        System.out.print("Enter the number of hours: ");
        int hours = sc.nextInt();//accepts the number of hours
        int minutes = hours*60;//converts the hours to minutes
        System.out.println("The number of minutes is "+minutes);
    }
    /**
     * Converts days to hours
     * pre: number of days
     * post: converted number of hours is displayed
     */
    static void daysToHours()
    {
        System.out.print("Enter the number of days: ");
        int days = sc.nextInt();//accepts the number of days from the user
        int hours = days*24;//converts the days to hours
        System.out.println("The number of hours is "+hours);
        //displays the number of hours to the user
    }
    /**
     * Converts minutes to hours
     * pre: number of minutes
     * post: converted number of hours is displayed
     */
    static void minutesToHours()
    {
        System.out.print("Enter the number of minutes: ");
        int minutes = sc.nextInt();//accepts the number of minutes from the user
        int hours = minutes/60;//converts the number of minutes to hours
        System.out.println("The number of hours is "+hours+" & "+minutes%60+" minutes");
        //displays the hours and the minutes
    }
    /**
     * Converts hours to days
     * pre: number of hours
     * post: converted number of days is displayed
     */
    static void hoursToDays()
    {
        System.out.print("Enter the number of hours: ");
        int hours = sc.nextInt();//accepts the number of hours from the user
        int days = hours/24;//converts the number of hours to days
        System.out.println("The number of days is "+days+" & "+hours%24+" hours");
        //displays the number of days and hours
    }
    /**
     * Calculates the difference between two times
     * pre: two times are sent to the method
     * post: the difference between the two times is displayed to the user
     */
    static void twoTimeDifference()
    {
        int bHour,eHour,bMin,eMin,dayTimeDifference=0;
        String eStatus,bStatus;
        /*
         * Variable descriptions:
         * bHour --> Beginning Hour
         * eHour --> Ending Hour
         * bMin --> Beginning Minutes
         * eMin --> Ending Minutes
         * bStatus --> am/pm
         * eStatus --> am/pm
         * dayTimeDifference --> The difference of times, stored in minutes
         */
        System.out.print("Enter the beginning hour: ");
        bHour = sc.nextInt();//accepts the beginning hour
        System.out.print("Enter the beginning minutes: ");
        bMin = sc.nextInt();//accepts the beginning minutes
        System.out.print("Enter am/pm: ");
        bStatus = sc.next();//accepts time of day
        System.out.print("Enter the ending hour: ");
        eHour = sc.nextInt();//accepts the ending hour
        System.out.print("Enter the ending minutes: ");
        eMin = sc.nextInt();//accepts the ending minutes
        System.out.print("Enter am/pm: ");
        eStatus = sc.next();//accpets the ending time of day
        //the following if-else if statments check the time of day and use formulas
        //to calculate the time difference based on this
        if(bStatus.equalsIgnoreCase("am")&&eStatus.equalsIgnoreCase("pm")||
        bStatus.equalsIgnoreCase("pm")&&eStatus.equalsIgnoreCase("am"))
        dayTimeDifference = ((12*60)-(bHour*60+bMin))+(eHour*60+eMin);
        //time difference is stored in minutes
        else if(bStatus.equalsIgnoreCase("am")&&eStatus.equalsIgnoreCase("am")||
        bStatus.equalsIgnoreCase("pm")&&eStatus.equalsIgnoreCase("pm"))
        dayTimeDifference = (eHour*60+eMin)-(bHour*60+bMin);
        System.out.println("The time difference is "+dayTimeDifference/60+" hours and "
        +dayTimeDifference%60+" mins ");
        //time difference is displayed in hours and minutes
    }
}
/**

Output #1:

Conversion Tasks
1.Hours --> Minutes
2.Days --> Hours
3.Minutes --> Hours
4.Hours --> Days
5.Elapsed Time between two times

Enter a number:1

Elapsed Time Conversion

Enter the number of hours: 7
The number of minutes is 420



Output #2:
Conversion Tasks
1.Hours --> Minutes
2.Days --> Hours
3.Minutes --> Hours
4.Hours --> Days
5.Elapsed Time between two times

Enter a number:2

Elapsed Time Conversion

Enter the number of days: 2
The number of hours is 48




Output #3:
Conversion Tasks
1.Hours --> Minutes
2.Days --> Hours
3.Minutes --> Hours
4.Hours --> Days
5.Elapsed Time between two times

Enter a number:3

Elapsed Time Conversion

Enter the number of minutes: 180
The number of hours is 3 & 0 minutes




Output #4:
Conversion Tasks
1.Hours --> Minutes
2.Days --> Hours
3.Minutes --> Hours
4.Hours --> Days
5.Elapsed Time between two times

Enter a number:4

Elapsed Time Conversion

Enter the number of hours: 28
The number of days is 1 & 4 hours




Output #5:
Conversion Tasks
1.Hours --> Minutes
2.Days --> Hours
3.Minutes --> Hours
4.Hours --> Days
5.Elapsed Time between two times

Enter a number:5

Elapsed Time Conversion

Enter the beginning hour: 8
Enter the beginning minutes: 14
Enter am/pm: am
Enter the ending hour: 2
Enter the ending minutes: 47
Enter am/pm: am
The time difference is 2 hours and 30 mins 



 **/
