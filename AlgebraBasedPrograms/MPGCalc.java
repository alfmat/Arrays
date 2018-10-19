/**
 Name: Alfred Mathew
 Date: 09/14/17
 Program: MPGCalc
 
 Description: The program accepts values of miles run and gallons consumed of 4 different cars.
              It then computes the miles per gallon of each car and rounds that value.
              It uses one main method and three other methods.
 Difficulties Faced: No significant difficulties faced.
 What I learned: Using expressions to round numbers and the
                 implementation of typecasting in a program.
 **/
public class MPGCalc
{
    public static void main(String args[])
    {
        /*
         * Given below are a list of variables that represent the 
         * number of miles the car ran and the number of gallons.
         * 
         * The car's name is given in the first part of the variable name
         * The second part of the name includes the quantity "Miles" or "Gallons"
         */
        double vwbugMiles = 286, vwbugGallons = 9, 
        firebirdMiles = 412, firebirdGallons = 40,
        subaruMiles = 361, subaruGallons = 18,
        cutlassMiles = 161, cutlassGallons = 11;
        MPGCalc obj = new MPGCalc();//object "obj" is created.
        /*
         * The following statements are used to compute the mileage. They utilize methods
         * contained in the class "Prog54a."
         * 
         * After the mileage is computed another method is used to calculate the rounded
         * mileage
         */
        double vwbugMPG = obj.roundingMethod(obj.mpgCalc(vwbugMiles,vwbugGallons)),
        firebirdMPG = obj.roundingMethod(obj.mpgCalc(firebirdMiles,firebirdGallons)),
        subaruMPG = obj.roundingMethod(obj.mpgCalc(subaruMiles,subaruGallons)),
        cutlassMPG = obj.roundingMethod(obj.mpgCalc(cutlassMiles,cutlassGallons));
        obj.output(vwbugMPG,firebirdMPG,subaruMPG,cutlassMPG);
    }
    /*
     * The following method is used to calculate the unrounded mileage of the car.
     * The method accepts the Miles driven and the gallons consumed to do so.
     */
    double mpgCalc(double a, double b)//accepts miles and then gallons
    {
        double c = a/b;//this statement calculates the mileage
        return c;
    }
    double roundingMethod(double a)//accepts the unrounded miles per gallon
    {
        double b = (int)(a*10+0.5)/10.0;//rounds the mileage
        return b;
    }
    /*
     * The final method of the program is used to display the calulated data.
     * It displays the miles per gallon of each car.
     */
    void output(double a, double b, double c, double d)//accepts the values of the miles per gallon
    {
        System.out.println("Kansas City Grand Prix\nMiles/Per Gallon");
        System.out.println();
        System.out.println("1970 VW Bug Averaged     "+a+" m/g");
        System.out.println("1979 Firebird Averaged   "+b+" m/g");
        System.out.println("1980 Subaru Averaged     "+c+" m/g");
        System.out.println("1975 Cutlass Averaged    "+d+" m/g");
    }
}
/**
 Program output:
 
 Kansas City Grand Prix
 Miles/Per Gallon

 1970 VW Bug Averaged     31.78 m/g
 1979 Firebird Averaged   10.3 m/g
 1980 Subaru Averaged     20.06 m/g
 1975 Cutlass Averaged    14.64 m/g

 **/
