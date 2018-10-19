/**
 Name: Alfred Mathew
 Platform: macOS Sierra, BlueJ
 Date: 09/18/17
 Program: AreaCircumCalcCircle
 
 Description: The program takes a standard value for the radius. It then calculates the
 area and the circumference and displays the results along with the radius given
 by the user.
 What I learned: Rounding and creating constants.
 Difficulties I faced: No significant challenges faced.
 **/
public class AreaCircumCalcCircle
{
    public static void main(String ar[])
    {
        double area, circ, rad = 3.712;//input
        final double pi = 3.14159;//constant pi
        AreaCircumCalcCircle obj = new AreaCircumCalcCircle();//creates object of class Prog54c
        circ = 2*pi*rad;//calculates circumference
        circ = obj.roundMethod(circ);//rounds the value of the circumference
        area = pi*(rad*rad);//calculates area
        area = obj.roundMethod(area);//rounds the value of the area
        //output statements
        System.out.println("The Radius is: "+rad);
        System.out.println("The Area is: "+area);
        System.out.println("The Circumference is: "+circ);
    }
    double roundMethod(double a)//method allows for rounding of double data type
    {
        double b = (int)((a*1000)+0.5)/1000.0;
        return b;
    }
}
/**
 Program Output:
 
 The Radius is: 3.712
 The Area is: 43.288
 The Circumference is: 23.323
 
 **/
