/* BMI - Calculates a persons body mass index.
 * 
 */
import java.util.*;

public class BMI{
    public static void main(String[] args)
    {
        Scanner console = new Scanner(System.in);
        double height;
        double feet;
        double inches;
        double meters;
        double weight;
        double BMI;
        double kilo;
        double inc;

        //Input
        System.out.print( "Enter your height: \n");
        System.out.print( "Feet: ");
        feet = console.nextDouble();
        System.out.print( "Inches: ");
        inches = console.nextDouble();
        System.out.print( "What is your weight (in pounds): ");
        weight = console.nextDouble();
        
        //Math  
        inc = (feet * 12) + inches;       //feet into inches
        meters = inc * 2.54e-2;             
        kilo = weight / 2.2;         // weight into kilograms
        BMI = kilo / (meters * meters);
        
        //Output
        System.out.printf("A %s foot %s inch adult of %.1f pounds has a Body Mass Index (BMI) of %.1f \n", feet, inches, weight, BMI);
        //Output Part 2
        if(BMI < 18.5){
           System.out.printf("Their weight category is UNDERWEIGHT.");
        }
        if(18.5 <= BMI&&BMI <= 24.9){
           System.out.printf("Their weight catergory is NORMAL.");
        }
        if(25 <= BMI&&BMI <= 29.9){
            System.out.printf("Their weight category is OVERWEIGHT.");
        }
        if(30 <= BMI){
            System.out.printf("Their weight category is OBESE.");
        }
        // COMPLETE THIS PROGRAM
        
    }
}