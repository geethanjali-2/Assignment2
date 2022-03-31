import java .util.*;
public class ArrayAverage {

    public static void main(String[] args) {
        int n,sum=0;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int[] array=new int[n];
        for(int i=0;i<n;i++)
        {
            array[i]=sc.nextInt();
            sum += array[i];
        }

        double average = sum / n;

        System.out.println("Average of array : "+average);

    }

}

