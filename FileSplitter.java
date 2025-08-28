package AssignJava;
import java.io.*;
public class FileSplitter 
{
    public static void main(String args[])throws IOException
    {
        long k;
        Console con=System.console();
        String InputFile=con.readLine("Enter the Filename of the file you want to split: ");
        int o=Integer.parseInt(con.readLine("Enter the destination file size: "));
        File i=new File(InputFile);
        if (!i.exists()) 
        {
            System.out.println("The input file does not exist!");
            return;
        }
        k=i.length();
        int parts=(int)Math.ceil((double) k/o);
        FileInputStream fis=new FileInputStream(InputFile);
        byte arr[]=new byte[o];
        int filenum=1;
        while((fis.read(arr))!=-1)
        {
            String newF=InputFile+"_part"+filenum+".txt";
            File n=new File(newF);
            FileOutputStream fos= new FileOutputStream(n);
            fos.write(arr);
            System.out.println("Part " + filenum + " written to " + newF);
            fos.close();
            filenum++;
        }
        fis.close();
        if(i.delete()) 
        {
            System.out.println("The original file has been deleted");
        } 
        else 
        {
            System.out.println("Failed to delete ");
        }
    }
}
