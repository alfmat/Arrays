/**
 Name: Alfred Mathew
 Platform: macOS Sierra, BlueJ
 Date: 09/22/17
 Program: CarTravel
 
 Description: This program takes predetermined values for distance, time, and pi. It then compares the times
 taken by two cars to travel across the planet on their respective paths.
 What I learned: Rounding to the hundreths place. 
 Difficulties I faced: None Experienced.
 **/
public class CarTravel
{
    public static void main(String ar[])
    {
        CarTravel obj = new CarTravel();//object of the class is created
        final double PI = 3.14159;//constant value of pi
        //the following store the values of speed and diameter
        double redDiameter = 8000, speed = 70, blueDiameter = redDiameter + (30.0/5280.0);
        //the following calculate the circumference/distance travelled by the cars
        double circRed = 2*PI*(redDiameter/2.0), circBlue = 2*PI*(blueDiameter/2.0);
        //the following calculate the time taken for each car to cover their respective paths
        double timeRed = (circRed/speed)*(Math.pow(60.0,2.0)), 
        timeBlue = (circBlue/speed)*(Math.pow(60.0,2.0)),
        //the following calculates the difference in time between the two cars
        timeDifference = obj.roundMethod(timeBlue - timeRed);//rounds the time difference
        //output statement
        System.out.println("The Blue Car will cross the finish line "+timeDifference+" seconds after the red car.");;
    }
    double roundMethod(double a)//method that allows rounding to the hundredths place
    {
        double b = (int)(a*100+.5)/100.0;
        return b;
    }
}
/**
 Program Output:
 
 The Blue Car will cross the finish line 0.92 seconds after the red car.

 **/
