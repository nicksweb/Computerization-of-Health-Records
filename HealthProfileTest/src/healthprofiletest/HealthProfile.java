package healthprofiletest;

// Time import statements for DOB and current age
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.text.DecimalFormat;

/**
 * @author Nicholas
 */
public class HealthProfile {
    
    private String firstName;
    private String lastName;
    private int age; 
    private int dateOfBirthDay; 
    private int dateOfBirthMonth; 
    private int dateOfBirthYear; 
    private String gender; 
    private float personHeight;
    private float personWeight;
    
    // Constructor 
    public HealthProfile (String first, String last, String orientation, int dobDay, int dobMonth, int dobYear, float  height, float weight) {
    
        firstName = first;
        lastName = last;
        gender = orientation;
        dateOfBirthDay = dobDay; 
        dateOfBirthMonth = dobMonth; 
        dateOfBirthYear = dobYear; 
        personHeight = height;
        personWeight = weight; 
        
    }

    
// Setters
   public void setFirstName( String first )
   {
      firstName = first;
   }
    
   public void setLastName( String last )
   {
      lastName = last;
   }
   
   public void setGender( String orientation )
   {
      gender = orientation;
   }
   
   public void setDOB( int day, int month, int year )
   {
      dateOfBirthDay = day; 
      dateOfBirthMonth = month;
      dateOfBirthYear = year;
   }
   
   public void setHeight ( Float height )
   {
      personHeight = height;
   }
   
   public void setWeight ( float weight )
   {
      personWeight = weight;
   }
   
   // Getters? 
   public String getFirstName() {
    return firstName;    
   } 
   
   public String getLastName() { 
    return lastName;
   }
   
   public int getCurrentAge() {
    LocalDate birthday = LocalDate.of(dateOfBirthYear, Month.of(dateOfBirthMonth), dateOfBirthDay);
    LocalDate today = LocalDate.now();
    
    // using period
    Period period = Period.between(birthday, today);
    return period.getYears();
   }
   
   public float getCurrentBMI() {
       if (personHeight > 3) {
        personHeight = personHeight / 100;
        setHeight(personHeight);
       }
       
       float bmi = personWeight / (personHeight*personHeight);     
       return bmi;
   }
   
   public int getMaxHeartRate() {
       int maxHeartRate = 220 - getCurrentAge();
       return maxHeartRate;
   }
   
   public int getTargetHeartRate() {
       double targetHeartRate = getMaxHeartRate() * 0.75; 
       int a = (int) Math.round(targetHeartRate);
       return a;
   }
   
}   