import java.util.*;
public class ContainsDigits
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str = sc.nextLine();
        boolean result = str.matches("[0-9]+");
        System.out.println("Original String : " + str);
        System.out.println("Does string contain only Digits? : " + result);
    }
}