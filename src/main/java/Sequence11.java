import java.util.Scanner;
public class Sequence11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of terms:");
        int n=sc.nextInt();
        int num;
        int i=2;
        int count=1;
        while(count<=n){
            num=i*i;
            System.out.print(num + " ");
            count++;
            i+=2;
        }
    }
}