import java.io.FileOutputStream;
public class FileOutputStreamWrite
{
    public static void main(String args[])
    {
        try
        {
            FileOutputStream fout=new FileOutputStream("C:\\Target\\first.txt");
            String s="Hello World.";
            byte b[]=s.getBytes();//converting string into byte array
            fout.write(b);
            fout.close();
            System.out.println("success...");
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
