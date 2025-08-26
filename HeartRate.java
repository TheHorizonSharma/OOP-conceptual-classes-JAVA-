package Assignment1;
import java.io.*;
public class HeartRate 
{
    private String Name;
    private String LName;
    private DateOfBirth dob;
    public HeartRate(String n, String Ln, DateOfBirth dob) {
        Name = n;
        LName = Ln;
        this.dob = dob;
    }
    public int calculateAge(int currentYear)
    {
        return currentYear - dob.getYear();
    }
    public int calculateMaxHeartRate(int currentYear) 
    {
        return 220 - calculateAge(currentYear);
    }
    public String calculateTargetHeartRate(int currentYear) 
    {
        int max = calculateMaxHeartRate(currentYear);
        return (int)(max * 0.5) + " - " + (int)(max * 0.85);
    }
}
class HeartRateApplication
{
    public static void main(String args[])
    {
        Console con=System.console();
        String firstName = con.readLine("Enter First Name: ");
        String lastName = con.readLine("Enter Last Name: ");
        int day = Integer.parseInt(con.readLine("Enter Birth Day: "));
        int month = Integer.parseInt(con.readLine("Enter Birth Month: "));
        int year = Integer.parseInt(con.readLine("Enter Birth Year: "));
        DateOfBirth dob = new DateOfBirth(day, month, year);
        int currentYear = Integer.parseInt(con.readLine("Enter Current Year: "));
        HeartRate hr = new HeartRate(firstName, lastName, dob);
        System.out.println("\nHeart Rate Information: ");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Date of Birth: " + dob.Combine());
        System.out.println("Age: " + hr.calculateAge(currentYear));
        System.out.println("Max Heart Rate: " + hr.calculateMaxHeartRate(currentYear));
        System.out.println("Target Heart Rate Range: " + hr.calculateTargetHeartRate(currentYear));
    }
}