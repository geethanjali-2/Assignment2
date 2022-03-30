
    import java.util.Scanner;

    public class RemoveOccurences {
        //private static Scanner sc;
        public static void main(String[] args)
        {
            String delLastCharStr;
            char del_lch;

            Scanner sc= new Scanner(System.in);

            System.out.print("\nPlease Enter String to Delete All Characters =  ");
            delLastCharStr = sc.nextLine();

            System.out.print("\nEnter the Character to Delete =  ");
            del_lch = sc.next().charAt(0);

            String out = delLastCharStr.replace(del_lch, Character.MIN_VALUE);

            System.out.println("\nThe Final String after Deleting " +
                    del_lch + " Characters = " + out);
        }
    }

