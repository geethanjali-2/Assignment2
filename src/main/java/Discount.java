import java.util.*;
class Discount
{
    public static void main(String args[])
    {

        double  dis,amount,costprice,s,discount;

        Scanner sc=new Scanner(System.in);

        System.out.println("enter cost price");

        costprice=sc.nextDouble();

        System.out.println("enter discount percentage ");

        dis=sc.nextDouble();

        discount=costprice*(dis/100);

        System.out.println("discount is:"+discount);
        amount=costprice-discount;
        System.out.println("amount is:"+amount);
    }
}
