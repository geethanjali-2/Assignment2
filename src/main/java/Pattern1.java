import java.util.*;
public class Pattern1 {
        public static void main(String args[]) {
            int i, j, n;
            Scanner sc=new Scanner(System.in);
            n=sc.nextInt();
            for (i = 0; i < n; i++) {
                for (j = 0; j <= i; j++) {
                    System.out.print("* ");
                }
                System.out.println();

            }
        }
    }



