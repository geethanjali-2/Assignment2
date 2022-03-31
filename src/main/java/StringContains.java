import java.util.*;
import java.io.*;
import java.lang.*;

public class StringContains
{
    public static void main( String [] args){
        Scanner sc=new Scanner(System.in);
        String str1,str2;

        System.out.print("Enter string 1 : ");
        str1=sc.nextLine();
        System.out.print("Enter string 2 : ");
        str2=sc.nextLine();
        if(str1.contains(str2)){
            System.out.println("\n\""+str2+"\" is present in "+str1);
        }
        else{
            System.out.println("\n\""+str2+"\" is not present in "+str1);
        }


    }
}
