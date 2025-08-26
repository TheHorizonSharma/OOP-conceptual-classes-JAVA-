package Assignment1;
public class DateOfBirth 
{
    private int day;
    private int month;
    private int year;
    public DateOfBirth(int d, int m, int y) 
    {
        setMonth(m);  // month first so day validation works
        setDay(d);
        setYear(y);
    }
    public void setDay(int d) 
    {
        try 
        {
            if (d < 1 || d > 31) {
                throw new IllegalArgumentException("Day must be between 1 and 31");
            }
            if ((month == 4 || month == 6 || month == 9 || this.month == 11) && d > 30) {
                throw new IllegalArgumentException("This month has max 30 days");
            }
            if (month == 2 && d > 29) {
                throw new IllegalArgumentException("February can have max 29 days");
            }
            day = d;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public void setMonth(int m) 
    {
        try
        {
            if (m < 1 || m > 12) {
                throw new IllegalArgumentException("Month must be between 1 and 12");
            }
            month = m;
            if ((m == 4 || m == 6 || m == 9 || m == 11) && day > 30) {
                System.out.println("Adjusting day to 30 for this month");
                this.day = 30;
            }
            if (m == 2 && day > 29) {
                System.out.println("Adjusting day to 29 for February");
                day = 29;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public void setYear(int y) 
    {
        try 
        {
            if (y < 1900 || y > 2100) {
                throw new IllegalArgumentException("Year must be between 1900 and 2100");
            }
            year = y;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public int getDay() 
    {
        return day;
    }
    public int getMonth() 
    {
        return month;
    }
    public int getYear() 
    {
        return year;
    }
    public String Combine() 
    {
        return day + "/" + month + "/" + year;
    }
}
