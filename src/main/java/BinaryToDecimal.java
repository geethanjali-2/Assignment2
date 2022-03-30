import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int x=n;
        int i=0;
        int dec=0;
        while(n>0){
            int digit=n%10;
            int p=(int)Math.pow(2,i);
            dec+=digit*p;
            i++;
            n=n/10;
        }
        System.out.print("Decimal form of "+x+" is "+dec);
    }
}