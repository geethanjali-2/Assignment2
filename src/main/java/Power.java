import java.util.*;
import java.lang.Math;

public class Power
{
    public static void main(String args[])
    {
        double power,base;
        int c;
        Scanner sc=new Scanner(System.in);
        power=sc.nextDouble();
        base=sc.nextDouble();

        c=(int)Math.pow(base,power);
        System.out.println(c);

    }

}

