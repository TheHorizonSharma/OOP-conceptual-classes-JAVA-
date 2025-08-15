package Classjava;
import java.io.*;
class Matrix 
{
    private int arr[][];
    public Matrix(int i, int j)
    {
       arr=new int[i][j];
    }
    public Matrix(Matrix m)
    {
        int r=m.arr.length;
        int c=m.arr[0].length;
        arr=new int[r][c];
        for (int i=0; i<r; i++)
            for (int j=0; j<c; j++)
                arr[i][j]=m.arr[i][j];
    }
    public Matrix()
    {
       arr=new int[3][3];
    }
    public void read()
    {
        Console con= System.console();
        int i, j;
        for(i=0; i<arr.length; i++)
            for(j=0; j<arr[i].length; j++)
                arr[i][j]=Integer.parseInt(con.readLine());
    }
    public void show()
    {
        int i, j;
        for(i=0; i<arr.length; i++)
        {
            for(j=0; j<arr[i].length; j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }
    }
}
class UseMatrix
{
    public static void main(String args[])
    {
        Matrix m1;
        m1= new Matrix();
        System.out.print("Enter 9 values: ");
        m1.read();
        Matrix m2;
        m2=new Matrix(3, 2);
        System.out.print("Enter 6 more values: ");
        m2.read();
        System.out.println("First matrix is: ");
        m1.show();
        System.out.println("Second matrix is: ");
        m2.show();
        Matrix m3=new Matrix(m2);
        System.out.println("Third matrix is: ");
        m3.show();
    }
}
