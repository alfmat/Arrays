/**
 Name: Alfred Mathew
 Platform: macOS High Sierra, BlueJ
 Date: 12/13/17
 Program: ThreeLetterWordsPoem
 
 Description: This program finds the number of three letter words in a poem. It finds
 finds the percentage of occurence of these words.
 What I learned: Using the length() function in java.
 Difficulties I faced: None Experienced. 
 **/
import java.io.*;
import java.util.*;
import java.text.DecimalFormat;
public class ThreeLetterWordsPoem
{
    public static void main(String ar[])
    {
        Scanner sc = null;//object of the scanner class
        String word = "", line = "";
        /*
         * Varaible descriptions:
         * word --> this each individual word in the poem
         * line --> this is the line of the poem
         */
        DecimalFormat obj = new DecimalFormat("##.##");//object of class Decimal Format
        int length=0, lengthOfThree=0, totalWords=0;
        double percentage = 0;
        /*
         * Variable Descriptions:
         * length --> this stores the length of the word
         * lengthOfThree --> stores the total number of three letter words
         * percentage --> this stores the percent of three letter words among the total
         * totalWords --> this is a count of the total number of words in the poem
         */
        try
        {
            sc = new Scanner(new File("poem.dat"));//imports the file
        }
        catch(FileNotFoundException e)//if the file is not found
        {
            System.out.print("File not Found!");
            System.exit(0);//exits the program
        }
        while(sc.hasNext())
        {
            System.out.println(sc.nextLine());//prints each line of the poem
        }
        System.out.println();//leaves a line
        sc = null;//sets the object equal to null
        //the following try-catch statement is used to reset the object of the scanner class
        try
        {
            sc = new Scanner(new File("ThreeLetterWordsPoem.dat"));//file import
        }   
        catch(FileNotFoundException e)//if file is not found
        {
            System.out.println("File Not found!");
            System.exit(0);//exits program 
        }
        while(sc.hasNext())
        {
            word = sc.next();//acquires each individual word
            length = word.length();//finds the length of the word
            if(length==3)
            lengthOfThree++;//increments the variable that stores the number of words with 
            //a length of three letters
            totalWords++;//increments the total number of words
        }
        //output statements
        System.out.println("Total Words: "+totalWords);
        System.out.println("Three Letter Words: "+lengthOfThree);
        percentage = ((double)lengthOfThree/totalWords)*100;
        System.out.println("Percentage of Occurence: "+obj.format(percentage));
    }
}
/**
 Program Output:
 
Good morning life and all
Things glad and beautiful
My pockets nothing hold
But he that owns the gold
The sun is my great friend
His spending has no end
Hail to the morning sky
Which bright clouds measure high
Hail to you birds whose throats
Would number leaves by notes
Hail to you shady bowers
And you green fields of flowers
Hail to you women fair
That make a show so rare
In cloth as white as milk
Be it calico or silk
Good morning life and all
Things glad and beautiful

Total Words: 93
Three Letter Words: 20
Percentage of Occurence: 21.51

 **/
