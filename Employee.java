package Assignment1;
import java.io.*;
public class Employee 
{
    private int yof;
    private String name, address;
    private double salary;
    
    public Employee(String n, int y, double s, String add)
    {
        name=n;
        yof=y;
        salary=s;
        address=add;
    }
    public Employee(Employee e)
    {
        this.name=e.name;
        this.yof=e.yof;
        this.salary=e.salary;
        this.address=e.address;
    }
    public Employee()
    {
        name="Unknown";
    }
    public void read()
    {
        Console con=System.console();
        name=con.readLine("Enter Employee name: ");
        yof=Integer.parseInt(con.readLine("Enter year of joining of the employee: "));
        salary = Double.parseDouble(con.readLine("Enter salary of the employee: "));
        address=con.readLine("Enter address of the Employee: ");
    }
    public void show()
    {
        System.out.println("Details of the employee are: ");
        System.out.println("Name: " + name);
        System.out.println("Year of Joining: " + yof);;
        System.out.println("Salary: " + salary);
        System.out.println("Address: "+address);
    }
}
class ApplicationOfEmployee
{
    public static void main(String args[])
    {
        int i, n;
        Console con=System.console();
        n=Integer.parseInt(con.readLine("Enter the number of employee you want to register: "));
        Employee employees[]=new Employee[n]; 
        for (i = 0; i < n; i++) 
        {
            System.out.println("\nEnter details for Employee " + (i + 1));
            employees[i] = new Employee();
            employees[i].read();           
        }
        for (int t=0; t<n; t++) 
        {
            System.out.println("\nEmployee " + (i + 1) + " ---");
            employees[t].show();
        }
        Employee e1=new Employee("RAM", 1996, 400, "B-24 Khadi Colony");
        e1.show();
    }
}
