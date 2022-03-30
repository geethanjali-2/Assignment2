    import java.util.Scanner;
    public class Sequence12
    {
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of terms:");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
                else
                {
                    System.out.print(-i +" ");
                }
            }
        }
    }

