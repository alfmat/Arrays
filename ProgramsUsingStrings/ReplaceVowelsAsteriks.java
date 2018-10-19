/**
 Name: Alfred Mathew
 Platform: macOS High Sierra, BlueJ
 Date: 11/29/17
 Program: ReplaceVowelsAsteriks
 
 Description: The ReplaceVowelsAsteriksprogram accepts a name from the user. It then replaces all the vowels
 with asteriks. If the number of characters in the name is even then the space between the 
 first and last name is increased to two white spaces. The program then prints the new name
 horizontally on the screen.
 What I learned: Using the functions such as length() and charAt().
 Difficulties I faced: I was not able to print the new name on the same terminal line. 
 **/
import java.util.*;
public class ReplaceVowelsAsteriks
{
    public static void main(String ar[])
    {
        Scanner sc = new Scanner (System.in);//object of the scanner class
        System.out.print("Enter your name: ");
        String name = sc.nextLine(),//gets input from the user
        newName= "";
        int length = name.length(),control = 0;
        char c = name.charAt(0);
        c-=32;
        System.out.println(c);
        while(control<length)
        {
            char letter = name.charAt(control);
            if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'||
            letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U')
            newName+="*";
            else if(letter==' '&&length%2==0)
            newName+="  ";
            else
            newName+=letter;
            control++;
        }
        System.out.print("\t\t\t\t\t"+newName);
    }
}
/**
 Program Output:
 
Enter your name: Alfred Mathew
					*lfr*d M*th*w
					

Enter your name: Desmond Doss
					D*sm*nd  D*ss					

					
Enter your name: Ryan Pecaut
					Ry*n P*c**t					
				
 **/
