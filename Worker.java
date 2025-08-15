package Classjava;
import java.io.*;
class Worker 
{
    private int age, salary;
    private String name;

    public Worker()
    {
        name="Unknown";
    }
    public Worker(String n, int a, int s)
    {
        name=n;
        age=a;
        salary=s;
    }
    public Worker(Worker e)
    {
        this.name=e.name;
        this.age=e.age;
        this.salary=e.salary;
    }
    public void read()
    {
        Console con=System.console();
        age = Integer.parseInt(con.readLine("Enter age of the employee: "));
        salary = Integer.parseInt(con.readLine("Enter salary of the employee: "));
    }
    public void show()
    {
        System.out.println("Details of the employee are: ");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);;
        System.out.println("Salary: " + salary);

    }
}
class Work
{
    public static void main(String args[])
    {
        String name;
        int age, salary;
        Console con=System.console();
        Worker e1;
        e1= new Worker();
        //age=Integer.parseInt(con.readLine("Enter age of the employee: "));
        //salary=Integer.parseInt(con.readLine("Enter salary of the employee: "));
        e1.read();
        e1.show();
        name=con.readLine("Enter Employee name: ");
        age=Integer.parseInt(con.readLine("Enter age of the employee: "));
        salary=Integer.parseInt(con.readLine("Enter salary of the employee: "));
        Worker e2=new Worker(name, age, salary);
        e2.show();
        Worker e3=new Worker(e2);
        e3.show();
    }
}
