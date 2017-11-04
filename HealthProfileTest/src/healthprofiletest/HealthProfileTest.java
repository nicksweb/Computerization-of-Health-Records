/*
 * This program will improve the quality of healthcare by helping to 
 * avoid drug conflicts and erroneous dug prescriptions, reduce costs and in imergencies, could save lives.
 * 
 *
 *
 *
 */
package healthprofiletest;
import java.util.Scanner;

/**
 *
 * @author Nicholas
 */
public class HealthProfileTest {
    public static void main(String[] args) {
       
      Scanner input = new Scanner( System.in );

      System.out.print( "Enter your first name: ");
      String firstName = input.nextLine();

      System.out.print( "Enter your last name: ");
      String lastName = input.nextLine();

      System.out.print( "Enter your gender: ");
      String orienation = input.nextLine();
      
      System.out.println( "Enter your date of birth in numbers.");
      System.out.print( "Enter the day of your birthday:");
      int dobDay = input.nextInt();
      System.out.print( "Enter the day of your month:");
      int dobMonth = input.nextInt();
      System.out.print( "Enter the day of your year:");
      int dobYear = input.nextInt();

      System.out.print( "Enter your height in m: ");
      float height = input.nextFloat();
      
      System.out.print( "Enter your weight: ");
      float weight = input.nextFloat();
      
      // HealthProfile (String first, String last, String orientation, int dobDay, int dobMonth, int dobYear, float  height, float weight)
      HealthProfile person1 = new HealthProfile( firstName, lastName, orienation, dobDay, dobMonth, dobYear, height, weight );

      System.out.print("\n\n\n");
      System.out.printf( "\tCalculations for %s %s:\n", 
         person1.getFirstName(), person1.getLastName());
      
      System.out.printf("Current Age: %s\n", person1.getCurrentAge()); 
      System.out.printf("Current BMI: %.2f\n", person1.getCurrentBMI()); 
      System.out.printf("Max Heart Rate: %d\n", person1.getMaxHeartRate());
      System.out.println("Target Heart Rate @ 75% of max: " + person1.getTargetHeartRate());      

      //System.out.printf( "Maximum Heart Rate: %d BPM (beats per minute)\n", person1.getMaxHeartRate() );

      //System.out.print( "Target Heart Rate Range is: ");
      //person1.displayTargetHeartRateRange();
      System.out.println();
        
    }
    
}

