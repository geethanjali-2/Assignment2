import java.util.*;
class StringEmpty
{
    public static void main(String[] args)
    {
        String str;
        Scanner sc=new Scanner(System.in);

        str=sc.nextLine();
        System.out.println(str == null || str.isEmpty());
    }
}

