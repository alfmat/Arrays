/**
 Name: Alfred Mathew
 Platform: macOS High Sierra, BlueJ
 Date: 02/21/18
 Program: Prisoners
 
 Description: This program contains a boolean array that represents the status of prisoners in their cells:
 locked or unlocked. Initially the jailer opens all the cells. Then, he turns the key of every second 
 cell starting from the second cell, and from the third cell onwards he turns the key of every third cell.
 This pattern repeats until only a few prisoners are left with their cells unlocked. The positions of these
 prisoners are printed to the user in tabular format.
 What I learned: Searching arrays
 Difficulties I faced: None Experienced.  
 **/
public class Prisoners
{
    public static void main(String ar[])
    {
        /*
         * Variable Descriptions:
         * prisoners --> this array stores the status of each individual prisoner
         * note: in this array, false means that the prisoner is locked and true means 
         *       that the prisoner is free.
         * 
         * i,j --> loop control variables
         */
        boolean prisoners[] = new boolean[1000];
        int i,j;
        
        /*
         * Object Descriptions:
         * 
         * easy --> object of the class EasyFormat used for formatting purposes
         */
        EasyFormat easy = new EasyFormat();
        
        /*
         * This first for loop represents the number of cells we will be counting by
         */
        for(i = 1; i<=1000;i++)
        {
            
            /*
             * This nested loop represents the actual position of a prisoner within the array
             */
            for(j=i-1;j<1000;j+=i)
            {
                //each move of the key causes the prisoner's position to change
                if(prisoners[j]==false)
                prisoners[j]=true;
                else
                prisoners[j]=false;
            }
        }
        
        /*
         * Output for user begins
         */
        System.out.println("The Freed prisoners are:\n");
        
        /*
         * Variable Descriptions:
         * position --> this is the array element to be printed
         * 
         * prints --> number of elements printed per line
         */
        int position = 0, prints=0;
        
        /*
         * This loop is responsible for printing the values of the freed prisoners
         */
        while(position<1000)
        {
            if(prisoners[position]==true)//if the prisoner is free
            {
                System.out.print(easy.format(position+1,5));//output
                prints++;
            }
            if(prints==5)//once five elements have been printed on a line
            {
                System.out.println();  
                prints=0;//resets prints
            }
            position++;
        }
        
        //alternative idea
        System.out.print("\nor--all the prisoners are free because they stormed the\njailer when he first unlocked the doors!");
    }
}
/**
 Program Output:
 
The Freed prisoners are:

    1    4    9   16   25
   36   49   64   81  100
  121  144  169  196  225
  256  289  324  361  400
  441  484  529  576  625
  676  729  784  841  900
  961
or--all the prisoners are free because they stormed the
jailer when he first unlocked the doors!
 
 **/
