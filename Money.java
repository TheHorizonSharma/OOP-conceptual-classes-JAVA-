package Classjava;

class Money 
{
    private int rs;
    private int paisa;
    public Money()
    {
        rs=paisa=0;
    }
    public Money(int r, int p)
    {
        rs=r;
        paisa=p;
    }
    public Money(Money m)
    {
        rs=m.rs;
        paisa=m.paisa;
    }
    public Money add(Money m)
    {
        Money temp=new Money();
        temp.rs=rs+m.rs;
        temp.paisa=paisa+m.paisa;
        if(temp.paisa>=100)
        {
            temp.rs++;
            temp.paisa%=100;
        }
        return temp;
    }
    public Money less(Money m)
    {
        Money temp=new Money();
        int n1, n2, n3;
        n1=rs*100+paisa;
        n2=m.rs*100+m.paisa;
        n3=n1-n2;
        temp.rs=n3/100;
        temp.paisa=n3%100;
        return temp;
    }
    public Money Multiple(int n)
    {
        Money temp=new Money();
        temp.rs=rs*n;
        temp.paisa=paisa*n;
        if(temp.paisa>=100)
        {
            temp.rs+=(temp.paisa/100);
            temp.paisa%=100;
        }
        return temp;
    }
    public void set(int r, int p)
    {
        rs=r;
        paisa=p;
    }
    public void show()
    {
        System.out.println(rs+"."+paisa);
    }
}
class UseMoney
{
    public static void main(String args[])
    {
        Money m1;
        m1= new Money(20, 60);
    //    m1.set(10, 20);
        System.out.println("First amount is: ");
        m1.show();
        Money m2;
        m2= new Money(20, 60);
      //  m2.set(50, 60);
        System.out.println("Second amount is: ");
        m2.show();
        Money m3, m4, m5;
        m3=m1.add(m2);
        System.out.print("Sum of amount is: ");
        m3.show();
        m4=m1.less(m2);
        System.out.print("Difference of amount is: ");
        m4.show();
        m5=m1.Multiple(6);
        System.out.print("Multiple of amount is: ");
        m5.show();
    }
}
