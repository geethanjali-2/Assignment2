import java.util.*;
import java.lang.Math;

public class Sequence13
{
    public static void main(String args[])
    {
        int n,c;
        double i;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        System.out.println("Series is : ");
        for (i=1;i<=n;i++) {

            c = (int) Math.pow(i, i);
            System.out.print(c+" ");

        }
    }

}