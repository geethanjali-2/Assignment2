
import java.util.*;
public class Ascii {

    public static void main(String[] args) {

        char ch ;
        Scanner sc=new Scanner(System.in);
        ch=sc.next().charAt(0);
        int asciiValue = ch;
        // type casting char as int

        System.out.println("ASCII value of "+ch+" is: " + asciiValue);
    }
}
