import java.util.*;
class ReverseNum{
    public static void main(String[] args) {

        int num , reverse = 0;
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();

        System.out.println("Original Number: " + num);

        // run loop until num becomes 0
        while(num != 0) {

            // get last digit from num
            int digit = num % 10;
            reverse= reverse * 10 + digit;

            // remove the last digit from num
            num /= 10;
        }

        System.out.println("Reversed Number: " + reverse);
    }
}