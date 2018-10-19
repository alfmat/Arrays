/**
 Name: Alfred Mathew
 Platform: macOS Sierra, BlueJ
 Date: 09/19/17
 Program: IslandProg
 
 Description: The program is used to calculate the area of cultivable land on an island. It takes values for pi,
 the radius of the lake, and diameter of the island. It then calculates and displays the rounded area of the island.
 What I learned: Rounding, creating constants, and calculating area.
 Difficulties I faced: No significant challenges faced.
 **/ 
 public class IslandProg
 {
     public static void main(String ar[])
     {
         IslandProg obj = new IslandProg();//object creation
         double lakeRad = 0.95, islandDia = 4.16;//lake radius and island diameter
         final double pi = 3.14;//constant value of pi
         double cultArea = obj.roundMethod(pi*(Math.pow((islandDia/2.0),2)-Math.pow(lakeRad,2)));//calculates and rounds the area of cultivable land
         //the following are output statements
         System.out.print("Donut island with a diameter of "+islandDia+" miles ");
         System.out.print("that contains a circular lake of radius "+lakeRad+" miles ");
         System.out.println("has "+cultArea);
         System.out.print("square miles of cultivatable land.");
     }
     double roundMethod(double a)//method that rounds a given number
     {
         double b = (int)(a*100+0.5)/100.0;
         return b;
     }
}
/**
 Sample Output:
 
 Donut island with a diameter of 4.16 miles that contains a circular lake of radius 0.95 miles has 10.75
 square miles of cultivatable land.
 
 **/
