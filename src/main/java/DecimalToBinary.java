import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int x=n;
        String str="";
        String str1;
        while(n>0){
            str1=String.valueOf(n%2);
            str=str1.concat(str);
            n=n/2;
        }
        System.out.print("Decimal form of "+x+" is "+str);
    }
}