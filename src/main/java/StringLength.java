import java.util.*;
import java.io.*;
import java.lang.*;

public class StringLength {
    public static void main(String[] args) {

        String str;
        int len;
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter a string : ");
        str= sc.nextLine();
        len=str.length();
        System.out.println("\nlength of the string : " + len);

    }


}