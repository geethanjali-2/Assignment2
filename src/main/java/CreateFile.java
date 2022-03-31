import java.io.File;
import java.io.IOException;
public class CreateFile
{
    public static void main(String[] args)
    {
        File file = new File("C:\\Target\\first.txt");
        boolean result;
        try
        {
            result = file.createNewFile();
            if(result)      // test if successfully created a new file
            {
                System.out.println("file created "+file.getCanonicalPath()); //returns the path string
            }
            else
            {
                System.out.println("File already exist at location: "+file.getCanonicalPath());
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();    //prints exception if any
        }
    }
}
