    import java.util.*;
    class Swap2var{
        public static void main(String[] args) {
            int a, b, temp;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the value of X and Y");
            a= sc.nextInt();
            b= sc.nextInt();
            System.out.println("before swapping numbers: "+a +"  "+ b);
            temp= a;
            a = b;
            b = temp;
            System.out.println("After swapping: "+a+"   " + b);
            System.out.println( );
        }
    }

