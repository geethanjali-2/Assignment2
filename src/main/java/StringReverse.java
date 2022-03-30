import java.util.*;
public class StringReverse
{
    public static void main(String[] args)
    {
        System.out.println("Enter string to reverse:");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for(int i = str.length() - 1; i >= 0; i--)
        {
            sb.append(str.charAt(i));
        }

        System.out.println("Reversed string is:");
        System.out.println(sb.toString());
    }
}