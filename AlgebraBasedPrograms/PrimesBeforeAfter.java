/**
 Name: Alfred Mathew
 Platform: macOS High Sierra, BlueJ
 Date: 12/19/17
 Program: PrimesBeforeAfter
 
 Description: This program inputs a number and finds the first prime number before
 and after it. It then displays this information to the user.
 What I learned: Using methods.
 Difficulties I faced: None Experienced.
 **/
import java.util.*;
public class PrimesBeforeAfter 
{
    static Scanner sc = new Scanner(System.in);//object of the Scanner class
    static char choice;//this is the user's decision
    public static void main(String[] args) 
    {
        do
        {
            // asks for user input
            System.out.print("Enter an integer greater than or equal to 2: ");
            int num = sc.nextInt();//accepts the integer from the user
            isPrime(num);//calls prime function
            System.out.print("Would you like to check another number?(y/n): ");
            choice = sc.next().charAt(0);//accepts a character from the user
            System.out.println();//formatting
        }while(choice=='y'||choice=='Y');//loop runs while the user wants it to
    }
    /**
     * This function is used for finding prime numbers
     * pre: none
     * post: prime number after and before the number is displayed to the user
     */
    public static void isPrime(int num)
    {
        int flag = 0,primeCurrent=0,primeBefore=0,primeAfter=0;
        /*
         * Variable Descriptions:
         * flag --> this is an indicator of whether a number is prime or not;
         * in this program 1 - not prime, 0 - prime
         * 
         * primeCurrent --> this is a variable common to both for loops. It stores
         * the most recently found prime number
         * 
         * primeBefore --> stores the prime number before the number inputted by the user
         * 
         * primeAfter --> stores the prime number after the number inputted by the user
         */
        for(int i =1;i<num;i++)//represents the number to be checked
        {
            for(int j=2;j<=(i/2);j++)//this divides the number to see if it is prime
            {
                if(i%j==0)//if it is perfectly divisible
                flag = 1;//the number is not prime
            }
            if(flag==0)//if it is not divisible
            primeCurrent=i;//it is a prime number
            flag=0;//resets the flag for further testing
        }
        primeBefore=primeCurrent;//assigns the latest prime number to this variable
        flag=0;primeCurrent=0;
        for(int i = num+1;;i++)//represents the number to be tested
        {
            for(int j=2;j<=(i/2);j++)//represents the number by which we are dividing
            {
                if(i%j==0)//if divisible
                flag = 1;//not a prime number
            }
            if(flag==0)
            {
                primeCurrent=i;//prime number is assigned
                break;//exits loop immediately after finding first prime number
            }
            flag=0;//resets flag for further testing
        }
        primeAfter=primeCurrent;//assigns the latest prime number to this variable
        System.out.println("N is between "+primeBefore+" and "+primeAfter+"\n");
    }
}
/**

 
Output:
Enter an integer greater than or equal to 2: 91
N is between 89 and 97

Would you like to check another number?(y/n): y

Enter an integer greater than or equal to 2: 23
N is between 19 and 29

Would you like to check another number?(y/n): y

Enter an integer greater than or equal to 2: 25
N is between 23 and 29

Would you like to check another number?(y/n): n


 **/
