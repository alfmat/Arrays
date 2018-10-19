/**
 Name: Alfred Mathew
 Platform: macOS High Sierra, BlueJ
 Date: 12/05/17
 Program: IdentifyVowels
 
 Description: The program accepts a name from the user. It then replaces all the vowels
 with asteriks. If the number of characters in the name is even then the space between the 
 first and last name is increased to two white spaces. The program then prints the new name
 horizontally on the screen.
 What I learned: Using the functions such as length() and charAt().
 Difficulties I faced: I was not able to print the new name on the same terminal line. 
 **/
import java.util.*;
import java.io.*;
public class IdentifyVowels
{
    public static void main(String ar[])throws IOException
    {
        Scanner sc = null;
        EasyFormat obj = new EasyFormat();
        int control = 0,length = 0, flag = 0;
        try
        {
            sc = new Scanner (new File ("prog505c.dat"));
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
            System.exit(0);
        }
        String walrus = "walrus", dinosaur = "dinosaur", word, letter=""; 
        char array[];
        while(sc.hasNext())
        {
            word = sc.nextLine();
            array = word.toCharArray();
            length = array.length;
            letter = String.valueOf(array[control]);
            System.out.print(obj.format(word,30));
            if(walrus.compareToIgnoreCase(letter)==0||dinosaur.compareToIgnoreCase(letter)==0)
            {
                control++;
                continue;
            }
            else if(walrus.compareToIgnoreCase(letter)>0&&dinosaur.compareToIgnoreCase(letter)<0)
            System.out.println(obj.format("between",20));
            else
            System.out.println(obj.format("not between",20));
        }
    }
}
/**
 Program Output:
 
                       Vampire             between
                        Monkey             between
                      Elephant             between
                           Ape         not between
                          Lion             between
                  Hippopotamus             between
                           Ant         not between
                         Zebra         not between
                           Yak         not between
                      Antelope         not between
                         Dingo         not between
                         Whale         not between
 **/
