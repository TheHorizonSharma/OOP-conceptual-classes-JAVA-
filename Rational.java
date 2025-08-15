package Classjava;
import java.io.*;
class Rational 
{
    private int num, den;
    public Rational()
    {
        num=0;
        den=0;
    }
    public Rational(int n, int d)
    {
        num=n;
        den=d;
    }
    public Rational(Rational r)
    {
        this.num=r.num;
        this.den=r.den;
    }
    public Rational add(Rational r)
    {
        Rational temp=new Rational();
        if(den==r.den)
        {
            temp.num=num+r.num;
            temp.den=den;
        }
        else
        {
            temp.den=den*r.den;
            temp.num=(num*r.den)+(r.num*den);
        }
        return temp;
    }
    public Rational subtract(Rational r)
    {
        Rational temp = new Rational();
        if (den == r.den)
        {
            temp.num=num-r.num;
            temp.den=den;
        }
        else
        {
            temp.den=den*r.den;
            temp.num=(num*r.den)-(r.num*den);
        }
        return temp;
    }
    public Rational multiply(Rational r) 
    {
        Rational temp = new Rational();
        temp.num=num*r.num;
        temp.den=den*r.den;
        return temp;
    }
    public Rational divide(Rational r) 
    {
        Rational temp = new Rational();
        temp.num=num*r.den;
        temp.den=den*r.num;
        return temp;
    }
    public void set(int num, int den)
    {
        this.num=num;
        this.den=den;
    }
    public void show()
    {
        System.out.println(+num+ "/" +den);
    }
}
class UseRational
{
    public static void main(String args[])
    {
        Console con=System.console();
        int num, den;
        Rational r1;
        r1= new Rational(20,30);
        System.out.println("The first fraction formed is: ");
        r1.show();
        num=Integer.parseInt(con.readLine("Enter the numerator: "));
        den=Integer.parseInt(con.readLine("Enter the denominator: "));
        Rational r2= new Rational(num, den);
        System.out.println("The second fraction formed is: ");
        r2.show();
        Rational r3, r4, r5, r6;
        r3=r1.add(r2);
        System.out.print("Sum of fraction is: ");
        r3.show();
        r4=r1.subtract(r2);
        System.out.print("Difference of fraction is: ");
        r4.show();
        r5=r1.multiply(r2);
        System.out.print("Multiplication of fraction is: ");
        r5.show();
        r6=r1.divide(r2);
        System.out.print("Division of fraction is: ");
        r6.show();
    }
}
