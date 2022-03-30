import java.util.Scanner;
public class Swap3Var {
    public static void main(String args[])
    {

            int a, b, c, temp;

            System.out.println("Please enter three values");

            Scanner sc = new Scanner(System.in);

            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            System.out.println("Before swap the values are \t" + a+" "+b+" "+c);

            temp = a;

            a = b;

            b = c;

            c = temp;

            System.out.println("After swap the values are is\t" + a+" "+b+" "+c);
        }


    }
