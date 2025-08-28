package AssignJava;
import java.io.*;
public class FileMerger {
    public static void main(String[] args) throws IOException 
    {
        Console con = System.console();
        String InputFile = con.readLine("Enter the filename of the original file (before split): ");
        File i = new File(InputFile);
        if(!(i.exists())) 
        {
            if(i.createNewFile()) 
            {
                System.out.println("The original file has been recreated.");
            } 
            else 
            {
                System.out.println("Error: Could not recreate the original file.");
                return;
            }
        }
        int part=1;
        FileOutputStream fos = new FileOutputStream(i);   
        File partFile = new File(InputFile + "_part" + part + ".txt");     
        while(partFile.exists()) 
        {
            FileInputStream fis = new FileInputStream(partFile);
            int b;
            while ((b = fis.read()) != -1) 
            {
                fos.write(b);
            }
            fis.close();
            System.out.println("Appended "+partFile+" to " + InputFile);
            if(partFile.delete()) 
            {
                System.out.println("Deleted "+partFile);
            } 
            else 
            {
                System.out.println("Failed to delete "+partFile);
            }
            part++;
        }
        fos.close();
        System.out.println("Merge was Successful");
    }
}