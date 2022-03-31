import java.util.*;
class LargestTernary
{
    public static void main(String args[])
    {
        int num1,num2,num3,result;
        Scanner sc=new Scanner(System.in);
        num1=sc.nextInt();
        num2=sc.nextInt();
        num3=sc.nextInt();

        result=num3>(num1>num2?num1:num2)?num3:((num1>num2)? num1:num2);
        System.out.println("Largest number is: "+result);
    }
}

