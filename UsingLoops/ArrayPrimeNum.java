/**
 Name: Alfred Mathew
 Platform: macOS High Sierra, BlueJ
 Date: 02/11/18
 Program: ArrayPrimeNum
 
 Description: This program stores the numbers from 1-1000 in an array. It then searches
 the array for all the prime numbers contained in it. It sets the other numbers to a 
 default value of 1. Once the prime numbers have been identified, they are printed using
 a for loop.
 What I learned: Searching and printing in arrays.
 Difficulties I faced: None Experienced.  
 **/
public class ArrayPrimeNum
{
    public static void main(String ar[])
    {
        /*
         * Variable Descriptions:
         * numbers --> this stores the array of 1000 numbers
         * 
         * position --> this is the position of an element within the array
         * 
         * divisor --> this is the number that will divide each element of the array
         * to check if it is prime or not
         * 
         * number --> this is the element of the array that we will be testing
         */
        int numbers[] = new int[1000],position=0,divisor,number;
        
        /*
         * Object Descriptions:
         * easy --> Object of the EasyFormat class
         */
        EasyFormat easy = new EasyFormat();
        
        /*
         * This for loop is used to assign the numbers from 1-1000 to the array
         */
        for(position=0;position<1000;position++)
        numbers[position] = position+1;
        
        /*
         * This is some extra code I used to test if all the elements had been assigned
         * correctly
        for(int i=0;i<1000;i++)
        {
            System.out.print(numbers[i]+"\t");
            if((i+1)%5==0)
            System.out.println();
        }
        System.out.println("\n\n\n\n");
        */
        
        
        position=1;//resets the position variable to 1, we are going to start checking
        //from 2
        
        /*
         * The first loop uses the numbers 1-500 to divide the elements of the array
         */
        while(position<500)
        {
            divisor = position+1;
            /*
             * This inner loop is where the division takes place
             */
            for(int i=position+1;i<1000;i++)
            {
                number = numbers[i];
                
                //if the number is not prime, it is set to 1
                if(number%divisor==0)
                numbers[i]=1;
            }
            position++;
        }
        
        //counts the number data that has been printed
        int prints=0;
        
        /*
         * This loop prints all the prime numbers
         */
        for(int i=0;i<1000;i++)
        {
            number = numbers[i];
            //if the number is not equal to the default value
            if(number!=1)
            {
                System.out.print(easy.format(number,5));
                prints++;
            }
            //once fifteen numbers have been printed on a line
            if(prints==15)
            {
                System.out.println();
                prints=0;
            }
        }
    }
}
/**
 * 
 * Program Output:
 
    2    3    5    7   11   13   17   19   23   29   31   37   41   43   47
   53   59   61   67   71   73   79   83   89   97  101  103  107  109  113
  127  131  137  139  149  151  157  163  167  173  179  181  191  193  197
  199  211  223  227  229  233  239  241  251  257  263  269  271  277  281
  283  293  307  311  313  317  331  337  347  349  353  359  367  373  379
  383  389  397  401  409  419  421  431  433  439  443  449  457  461  463
  467  479  487  491  499  503  509  521  523  541  547  557  563  569  571
  577  587  593  599  601  607  613  617  619  631  641  643  647  653  659
  661  673  677  683  691  701  709  719  727  733  739  743  751  757  761
  769  773  787  797  809  811  821  823  827  829  839  853  857  859  863
  877  881  883  887  907  911  919  929  937  941  947  953  967  971  977
  983  991  997 
  
 
 **/
