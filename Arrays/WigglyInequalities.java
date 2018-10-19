/**
 * This is a function to solve the wiggly inequality
 * s1 <= s2 >= s3 <= s4
 */
import java.util.*;
public class WigglyInequalities {
    public static void main (String ar[]) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the length of the array: ");
        int arrLen = sc.nextInt();
        int myArray[] = new int[arrLen];
        System.out.println("Enter each element with spaces and press enter");
        for (int i = 0; i < arrLen; i++) {
            myArray[i] = sc.nextInt();
        }
    }
}